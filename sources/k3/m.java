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
        for (int i10 = 0; i10 < this.availableInputBufferCount; i10++) {
            this.availableInputBuffers[i10] = createInputBuffer();
        }
        this.availableOutputBuffers = kVarArr;
        this.availableOutputBufferCount = kVarArr.length;
        for (int i11 = 0; i11 < this.availableOutputBufferCount; i11++) {
            this.availableOutputBuffers[i11] = createOutputBuffer();
        }
        bg.h hVar = new bg.h(this);
        this.decodeThread = hVar;
        hVar.start();
    }

    public static void access$000(m mVar) {
        mVar.getClass();
        do {
            try {
            } catch (InterruptedException e9) {
                throw new IllegalStateException(e9);
            }
        } while (mVar.b());
    }

    public final boolean b() {
        g gVarCreateUnexpectedDecodeException;
        synchronized (this.lock) {
            while (!this.released) {
                try {
                    if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                        break;
                    }
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.released) {
                return false;
            }
            i iVarRemoveFirst = this.queuedInputBuffers.removeFirst();
            k[] kVarArr = this.availableOutputBuffers;
            int i10 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i10;
            k kVar = kVarArr[i10];
            boolean z10 = this.flushed;
            this.flushed = false;
            if (iVarRemoveFirst.isEndOfStream()) {
                kVar.addFlag(4);
            } else {
                if (iVarRemoveFirst.isDecodeOnly()) {
                    kVar.addFlag(Integer.MIN_VALUE);
                }
                if (iVarRemoveFirst.isFirstSample()) {
                    kVar.addFlag(134217728);
                }
                try {
                    gVarCreateUnexpectedDecodeException = decode(iVarRemoveFirst, kVar, z10);
                } catch (OutOfMemoryError e9) {
                    gVarCreateUnexpectedDecodeException = createUnexpectedDecodeException(e9);
                } catch (RuntimeException e10) {
                    gVarCreateUnexpectedDecodeException = createUnexpectedDecodeException(e10);
                }
                if (gVarCreateUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = gVarCreateUnexpectedDecodeException;
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
                    iVarRemoveFirst.clear();
                    i[] iVarArr = this.availableInputBuffers;
                    int i11 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i11 + 1;
                    iVarArr[i11] = iVarRemoveFirst;
                } catch (Throwable th2) {
                    throw th2;
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
                    int i10 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i10 + 1;
                    iVarArr[i10] = iVar;
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    i iVarRemoveFirst = this.queuedInputBuffers.removeFirst();
                    iVarRemoveFirst.clear();
                    i[] iVarArr2 = this.availableInputBuffers;
                    int i11 = this.availableInputBufferCount;
                    this.availableInputBufferCount = i11 + 1;
                    iVarArr2[i11] = iVarRemoveFirst;
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
            int i10 = this.availableOutputBufferCount;
            this.availableOutputBufferCount = i10 + 1;
            kVarArr[i10] = kVar;
            if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                this.lock.notify();
            }
        }
    }

    public final void setInitialInputBufferSize(int i10) {
        d5.a.i(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (i iVar : this.availableInputBuffers) {
            iVar.b(i10);
        }
    }

    @Override
    public final i dequeueInputBuffer() {
        i iVar;
        synchronized (this.lock) {
            try {
                g gVar = this.exception;
                if (gVar != null) {
                    throw gVar;
                }
                d5.a.i(this.dequeuedInputBuffer == null);
                int i10 = this.availableInputBufferCount;
                if (i10 == 0) {
                    iVar = null;
                } else {
                    i[] iVarArr = this.availableInputBuffers;
                    int i11 = i10 - 1;
                    this.availableInputBufferCount = i11;
                    iVar = iVarArr[i11];
                }
                this.dequeuedInputBuffer = iVar;
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
                if (gVar != null) {
                    throw gVar;
                }
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
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
                if (gVar != null) {
                    throw gVar;
                }
                d5.a.f(iVar == this.dequeuedInputBuffer);
                this.queuedInputBuffers.addLast(iVar);
                if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
                    this.lock.notify();
                }
                this.dequeuedInputBuffer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
