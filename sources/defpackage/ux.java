package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
public final class ux implements lm6 {
    public static final ArrayDeque h = new ArrayDeque();
    public static final Object n = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public d1 c;
    public final AtomicReference d;
    public final or2 e;
    public boolean f;

    public ux(MediaCodec mediaCodec, HandlerThread handlerThread) {
        or2 or2Var = new or2();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = or2Var;
        this.d = new AtomicReference();
    }

    public static tx d() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new tx();
            }
            return (tx) arrayDeque.removeFirst();
        }
    }

    public static void e(tx txVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(txVar);
        }
    }

    @Override
    public final void a(int i, g43 g43Var, long j, int i2) {
        c();
        tx d = d();
        d.a = i;
        d.b = 0;
        d.d = j;
        d.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = d.c;
        cryptoInfo.numSubSamples = g43Var.f;
        int[] iArr = g43Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = g43Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = g43Var.b;
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
        byte[] bArr3 = g43Var.a;
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
        cryptoInfo.mode = g43Var.c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(g43Var.g, g43Var.h));
        }
        d1 d1Var = this.c;
        String str = gcc.a;
        d1Var.obtainMessage(2, d).sendToTarget();
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        c();
        tx d = d();
        d.a = i;
        d.b = i2;
        d.d = j;
        d.e = i3;
        d1 d1Var = this.c;
        String str = gcc.a;
        d1Var.obtainMessage(1, d).sendToTarget();
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
                d1 d1Var = this.c;
                d1Var.getClass();
                d1Var.removeCallbacksAndMessages(null);
                or2 or2Var = this.e;
                synchronized (or2Var) {
                    or2Var.b = false;
                }
                d1 d1Var2 = this.c;
                d1Var2.getClass();
                d1Var2.obtainMessage(3).sendToTarget();
                or2Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                vr9.l(e);
            }
        }
    }

    @Override
    public final void setParameters(Bundle bundle) {
        c();
        d1 d1Var = this.c;
        String str = gcc.a;
        d1Var.obtainMessage(4, bundle).sendToTarget();
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
            this.c = new d1(this, handlerThread.getLooper(), (byte) 1);
            this.f = true;
        }
    }
}
