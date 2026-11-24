package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class uy implements jm6 {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public c1 c;
    public final AtomicReference d;
    public final gs2 e;
    public boolean f;

    public uy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        gs2 gs2Var = new gs2();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = gs2Var;
        this.d = new AtomicReference();
    }

    public static ty c() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new ty();
            }
            return (ty) arrayDeque.removeFirst();
        }
    }

    public static void e(ty tyVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(tyVar);
        }
    }

    @Override
    public final void a(int i, z43 z43Var, long j, int i2) {
        d();
        ty c = c();
        c.a = i;
        c.b = 0;
        c.d = j;
        c.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = c.c;
        cryptoInfo.numSubSamples = z43Var.f;
        int[] iArr = z43Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = z43Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = z43Var.b;
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
        byte[] bArr3 = z43Var.a;
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
        cryptoInfo.mode = z43Var.c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(z43Var.g, z43Var.h));
        }
        c1 c1Var = this.c;
        String str = hac.a;
        c1Var.obtainMessage(2, c).sendToTarget();
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        d();
        ty c = c();
        c.a = i;
        c.b = i2;
        c.d = j;
        c.e = i3;
        c1 c1Var = this.c;
        String str = hac.a;
        c1Var.obtainMessage(1, c).sendToTarget();
    }

    @Override
    public final void d() {
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
                gs2 gs2Var = this.e;
                synchronized (gs2Var) {
                    gs2Var.b = false;
                }
                c1 c1Var2 = this.c;
                c1Var2.getClass();
                c1Var2.obtainMessage(3).sendToTarget();
                gs2Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                dq9.o(e);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        d();
        c1 c1Var = this.c;
        String str = hac.a;
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
