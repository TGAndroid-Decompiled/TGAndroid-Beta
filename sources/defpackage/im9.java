package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import java.util.concurrent.CountDownLatch;
public final class im9 implements Runnable {
    public final byte a;
    public final km9 b;
    public final Size c;
    public final int d;
    public final boolean e;
    public final RuntimeException[] f;
    public final CountDownLatch h;

    public im9(km9 km9Var, Size size, int i, boolean z, RuntimeException[] runtimeExceptionArr, CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = km9Var;
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
        km9 km9Var = this.b;
        switch (b) {
            case 0:
                km9Var.getClass();
                try {
                    try {
                        km9Var.c = size;
                        km9Var.l = i;
                        km9Var.o = z;
                        SurfaceTexture surfaceTexture = km9Var.x;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        int i2 = km9Var.E;
                        if (i2 != 0) {
                            km9Var.k(i2, i);
                        }
                        fm9 fm9Var = km9Var.i;
                        StringBuilder sb = new StringBuilder("GL secondary input configured: input=");
                        sb.append(size);
                        sb.append(", crop=");
                        sb.append(i);
                        sb.append(", filter=");
                        if (i == km9Var.g) {
                            str = "NEAREST";
                        }
                        sb.append(str);
                        sb.append(", timestampRealtime=");
                        sb.append(z);
                        fm9Var.b(sb.toString());
                    } finally {
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr[0] = e;
                }
                return;
            default:
                try {
                    try {
                        km9Var.a = size;
                        km9Var.b = size;
                        km9Var.c = size;
                        km9Var.j = i;
                        km9Var.k = i;
                        km9Var.l = i;
                        km9Var.m = z;
                        km9Var.n = z;
                        km9Var.o = z;
                        SurfaceTexture surfaceTexture2 = km9Var.v;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        SurfaceTexture surfaceTexture3 = km9Var.x;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.setDefaultBufferSize(size.getWidth(), size.getHeight());
                        }
                        km9Var.k(km9Var.D, km9Var.k);
                        int i3 = km9Var.E;
                        if (i3 != 0) {
                            km9Var.k(i3, km9Var.l);
                        }
                        um9 um9Var = km9Var.N;
                        if (um9Var != null) {
                            um9Var.c = size;
                            um9Var.d = i;
                            um9Var.v();
                            um9Var.B = false;
                            um9Var.A = 0L;
                        }
                        fm9 fm9Var2 = km9Var.i;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size);
                        sb2.append(", crop=");
                        sb2.append(i);
                        sb2.append(", filter=");
                        if (km9Var.j == km9Var.g) {
                            str = "NEAREST";
                        }
                        sb2.append(str);
                        fm9Var2.b(sb2.toString());
                    } catch (RuntimeException e2) {
                        runtimeExceptionArr[0] = e2;
                    }
                    return;
                } finally {
                }
        }
    }
}
