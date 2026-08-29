package a4;

import android.media.MediaCodec;
import android.os.HandlerThread;
import f5.d0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class f {
    public static final ArrayDeque f70g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec f71a;
    public final HandlerThread f72b;
    public d f73c;
    public final AtomicReference d;
    public final f5.c f74e;
    public boolean f75f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f71a = mediaCodec;
        this.f72b = handlerThread;
        this.f74e = obj;
        this.d = new AtomicReference();
    }

    public static e b() {
        ArrayDeque arrayDeque = f70g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(e eVar) {
        ArrayDeque arrayDeque = f70g;
        synchronized (arrayDeque) {
            arrayDeque.add(eVar);
        }
    }

    public final void a() {
        if (this.f75f) {
            try {
                d dVar = this.f73c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                f5.c cVar = this.f74e;
                cVar.b();
                d dVar2 = this.f73c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                synchronized (cVar) {
                    while (!cVar.f6575a) {
                        cVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void c(int i10, m3.d dVar, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            e b10 = b();
            b10.f66a = i10;
            b10.f67b = 0;
            b10.d = j10;
            b10.f69e = 0;
            MediaCodec.CryptoInfo cryptoInfo = b10.f68c;
            cryptoInfo.numSubSamples = dVar.f16813f;
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
            int[] iArr3 = dVar.f16812e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = dVar.f16810b;
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
            byte[] bArr3 = dVar.f16809a;
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
            cryptoInfo.mode = dVar.f16811c;
            if (d0.f6579a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f16814g, dVar.h));
            }
            this.f73c.obtainMessage(1, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }
}
