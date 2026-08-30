package d4;

import android.media.MediaCodec;
import android.os.HandlerThread;
import h5.d0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class e {
    public static final ArrayDeque f4140g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec f4141a;
    public final HandlerThread f4142b;
    public androidx.mediarouter.app.d f4143c;
    public final AtomicReference d;
    public final h5.c e;
    public boolean f4144f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f4141a = mediaCodec;
        this.f4142b = handlerThread;
        this.e = obj;
        this.d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f4140g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(d dVar) {
        ArrayDeque arrayDeque = f4140g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f4144f) {
            try {
                androidx.mediarouter.app.d dVar = this.f4143c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                h5.c cVar = this.e;
                cVar.b();
                androidx.mediarouter.app.d dVar2 = this.f4143c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                synchronized (cVar) {
                    while (!cVar.f6933a) {
                        cVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void c(int i10, n3.d dVar, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = b();
            b10.f4137a = i10;
            b10.f4138b = 0;
            b10.d = j10;
            b10.e = 0;
            MediaCodec.CryptoInfo cryptoInfo = b10.f4139c;
            cryptoInfo.numSubSamples = dVar.f14228f;
            int[] iArr = dVar.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = dVar.e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = dVar.f14226b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = dVar.f14225a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = dVar.f14227c;
            if (d0.f6937a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f14229g, dVar.h));
            }
            this.f4143c.obtainMessage(1, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }
}
