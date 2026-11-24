package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class tx implements gk6 {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public c1 c;
    public final AtomicReference d;
    public final vq2 e;
    public boolean f;

    public tx(MediaCodec mediaCodec, HandlerThread handlerThread) {
        vq2 vq2Var = new vq2();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = vq2Var;
        this.d = new AtomicReference();
    }

    public static sx d() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new sx();
            }
            return (sx) arrayDeque.removeFirst();
        }
    }

    public static void e(sx sxVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(sxVar);
        }
    }

    @Override
    public final void a(int i, o33 o33Var, long j, int i2) {
        c();
        sx d = d();
        d.a = i;
        d.b = 0;
        d.d = j;
        d.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = d.c;
        cryptoInfo.numSubSamples = o33Var.f;
        int[] iArr = o33Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = o33Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = o33Var.b;
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
        byte[] bArr3 = o33Var.a;
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
        cryptoInfo.mode = o33Var.c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(o33Var.g, o33Var.h));
        }
        c1 c1Var = this.c;
        String str = g8c.a;
        c1Var.obtainMessage(2, d).sendToTarget();
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        c();
        sx d = d();
        d.a = i;
        d.b = i2;
        d.d = j;
        d.e = i3;
        c1 c1Var = this.c;
        String str = g8c.a;
        c1Var.obtainMessage(1, d).sendToTarget();
    }

    @Override
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void flush() {
        if (this.f) {
            try {
                c1 c1Var = this.c;
                c1Var.getClass();
                c1Var.removeCallbacksAndMessages(null);
                vq2 vq2Var = this.e;
                synchronized (vq2Var) {
                    vq2Var.b = false;
                }
                c1 c1Var2 = this.c;
                c1Var2.getClass();
                c1Var2.obtainMessage(3).sendToTarget();
                vq2Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ho9.n(e);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        c();
        c1 c1Var = this.c;
        String str = g8c.a;
        c1Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override
    public final void start() {
        if (!this.f) {
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            this.c = new c1(this, handlerThread.getLooper(), (byte) 1);
            this.f = true;
        }
    }
}
