package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class vn9 implements Runnable {
    public final byte a;
    public final xn9 b;
    public final Size c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f;
    public final CountDownLatch h;

    public vn9(xn9 xn9Var, Size size, int i, boolean z, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = xn9Var;
        this.c = size;
        this.d = i;
        this.e = z;
        this.f = runtimeExceptionArr;
        this.h = countDownLatch;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = "LINEAR";
        CountDownLatch countDownLatch = this.h;
        RuntimeException[] runtimeExceptionArr = this.f;
        boolean z = this.e;
        int i = this.d;
        Size size = this.c;
        xn9 xn9Var = this.b;
        switch (b) {
            case 0:
                xn9Var.getClass();
                try {
                    try {
                        xn9Var.c = size;
                        xn9Var.l = i;
                        xn9Var.o = z;
                        SurfaceTexture surfaceTexture = xn9Var.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i2 = xn9Var.E;
                        if (i2 != 0) {
                            xn9Var.k(i2, i);
                        }
                        sn9 sn9Var = xn9Var.i;
                        StringBuilder sb = new StringBuilder("GL secondary input configured: input=");
                        sb.append(size);
                        sb.append(", crop=");
                        sb.append(i);
                        sb.append(", filter=");
                        if (i == xn9Var.g) {
                            str = "NEAREST";
                        }
                        sb.append(str);
                        sb.append(", timestampRealtime=");
                        sb.append(z);
                        sn9Var.b(sb.toString());
                    } finally {
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr[0] = e;
                }
                return;
            default:
                try {
                    try {
                        xn9Var.a = size;
                        xn9Var.b = size;
                        xn9Var.c = size;
                        xn9Var.j = i;
                        xn9Var.k = i;
                        xn9Var.l = i;
                        xn9Var.m = z;
                        xn9Var.n = z;
                        xn9Var.o = z;
                        SurfaceTexture surfaceTexture2 = xn9Var.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = xn9Var.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        xn9Var.k(xn9Var.D, xn9Var.k);
                        int i3 = xn9Var.E;
                        if (i3 != 0) {
                            xn9Var.k(i3, xn9Var.l);
                        }
                        ho9 ho9Var = xn9Var.N;
                        if (ho9Var != null) {
                            ho9Var.c = size;
                            ho9Var.d = i;
                            ho9Var.v();
                            ho9Var.B = false;
                            ho9Var.A = 0L;
                        }
                        sn9 sn9Var2 = xn9Var.i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i);
                        sb2.append(", filter=");
                        if (xn9Var.j == xn9Var.g) {
                            str = "NEAREST";
                        }
                        sb2.append(str);
                        sn9Var2.b(sb2.toString());
                    } catch (RuntimeException e2) {
                        runtimeExceptionArr[0] = e2;
                    }
                    return;
                } finally {
                }
        }
    }
}
