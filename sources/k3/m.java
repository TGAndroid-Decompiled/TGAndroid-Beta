package k3;

import java.util.ArrayDeque;
public abstract class m implements e {
    private int availableInputBufferCount;
    private final i[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final k[] availableOutputBuffers;
    private final Thread decodeThread;
    private i dequeuedInputBuffer;
    private g exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<i> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<k> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public m(i[] iVarArr, k[] kVarArr) {
        this.availableInputBuffers = iVarArr;
        this.availableInputBufferCount = iVarArr.length;
        for (int i9 = 0; i9 < this.availableInputBufferCount; i9++) {
            this.availableInputBuffers[i9] = createInputBuffer();
        }
        this.availableOutputBuffers = kVarArr;
        this.availableOutputBufferCount = kVarArr.length;
        for (int i10 = 0; i10 < this.availableOutputBufferCount; i10++) {
            this.availableOutputBuffers[i10] = createOutputBuffer();
        }
        ag.i iVar = new ag.i(this);
        this.decodeThread = iVar;
        iVar.start();
    }

    public static void access$000(m mVar) {
        mVar.getClass();
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (mVar.b());
    }

    public final boolean b() {
        g createUnexpectedDecodeException;
        boolean z10;
        synchronized (this.lock) {
            while (!this.released) {
                try {
                    if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        break;
                    }
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            i removeFirst = this.queuedInputBuffers.removeFirst();
            k[] kVarArr = this.availableOutputBuffers;
            int i9 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i9;
            k kVar = kVarArr[i9];
            boolean z11 = this.flushed;
            this.flushed = false;
            if (removeFirst.isEndOfStream()) {
                kVar.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    kVar.addFlag(Integer.MIN_VALUE);
                }
                if (removeFirst.isFirstSample()) {
                    kVar.addFlag(134217728);
                }
                try {
                    createUnexpectedDecodeException = decode(removeFirst, kVar, z11);
                } catch (OutOfMemoryError e10) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e10);
                } catch (RuntimeException e11) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e11);
                }
                if (createUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = createUnexpectedDecodeException;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        kVar.release();
                    } else if (kVar.isDecodeOnly()) {
                        this.skippedOutputBufferCount++;
                        kVar.release();
                    } else {
                        kVar.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(kVar);
                    }
                    removeFirst.clear();
                    i[] iVarArr = this.availableInputBuffers;
                    int i10 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i10 + 1;
                    iVarArr[i10] = removeFirst;
                } finally {
                }
            }
            return true;
        }
    }

    public abstract i createInputBuffer();

    public abstract k createOutputBuffer();

    public abstract g createUnexpectedDecodeException(Throwable th);

    public abstract g decode(i iVar, k kVar, boolean z10);

    @Override
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                i iVar = this.dequeuedInputBuffer;
                if (iVar != null) {
                    iVar.clear();
                    i[] iVarArr = this.availableInputBuffers;
                    int i9 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i9 + 1;
                    iVarArr[i9] = iVar;
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    i removeFirst = this.queuedInputBuffers.removeFirst();
                    removeFirst.clear();
                    i[] iVarArr2 = this.availableInputBuffers;
                    int i10 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i10 + 1;
                    iVarArr2[i10] = removeFirst;
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(k kVar) {
        synchronized (this.lock) {
            kVar.clear();
            k[] kVarArr = this.availableOutputBuffers;
            int i9 = this.availableOutputBufferCount;
            this.availableOutputBufferCount = i9 + 1;
            kVarArr[i9] = kVar;
            if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                this.lock.notify();
            }
        }
    }

    public final void setInitialInputBufferSize(int i9) {
        boolean z10;
        if (this.availableInputBufferCount == this.availableInputBuffers.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        for (i iVar : this.availableInputBuffers) {
            iVar.c(i9);
        }
    }

    @Override
    public final i dequeueInputBuffer() {
        i iVar;
        synchronized (this.lock) {
            try {
                g gVar = this.exception;
                if (gVar == null) {
                    d5.a.i(this.dequeuedInputBuffer == null);
                    int i9 = this.availableInputBufferCount;
                    if (i9 == 0) {
                        iVar = null;
                    } else {
                        i[] iVarArr = this.availableInputBuffers;
                        int i10 = i9 - 1;
                        this.availableInputBufferCount = i10;
                        iVar = iVarArr[i10];
                    }
                    this.dequeuedInputBuffer = iVar;
                } else {
                    throw gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override
    public final k dequeueOutputBuffer() {
        synchronized (this.lock) {
            try {
                g gVar = this.exception;
                if (gVar == null) {
                    if (this.queuedOutputBuffers.isEmpty()) {
                        return null;
                    }
                    return this.queuedOutputBuffers.removeFirst();
                }
                throw gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void queueInputBuffer(i iVar) {
        synchronized (this.lock) {
            try {
                g gVar = this.exception;
                if (gVar == null) {
                    d5.a.f(iVar == this.dequeuedInputBuffer);
                    this.queuedInputBuffers.addLast(iVar);
                    if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                        this.lock.notify();
                    }
                    this.dequeuedInputBuffer = null;
                } else {
                    throw gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
