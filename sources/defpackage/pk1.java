package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;
public final class pk1 implements Runnable {
    public final byte a;
    public final oy8 b;

    public pk1(oy8 oy8Var, byte b) {
        this.a = b;
        this.b = oy8Var;
    }

    @Override
    public final void run() {
        int i;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z;
        byte b = this.a;
        oy8 oy8Var = this.b;
        switch (b) {
            case 0:
                oy8Var.C(false);
                return;
            case 1:
                oy8Var.getClass();
                try {
                    dk0 dk0Var = oy8Var.C0;
                    if (dk0Var != null) {
                        dk0Var.b();
                    }
                } catch (Throwable unused) {
                }
                gl.c3(oy8Var.A0);
                return;
            case 2:
                oy8Var.Q = null;
                oy8Var.k();
                return;
            case 3:
                oy8Var.Y = true;
                if ((!oy8Var.l0 && oy8Var.X) || (oy8Var.R == null && oy8Var.S != null)) {
                    oy8Var.s();
                }
                oy8Var.k();
                return;
            case 4:
                if (!oy8Var.m0 && !oy8Var.W && oy8Var.f() && oy8Var.P == null) {
                    oy8Var.y0 = true;
                    if (oy8.U0 == null) {
                        oy8.U0 = new do3("cache generator queue", true);
                    }
                    dk0.A++;
                    do3 do3Var = oy8.U0;
                    pk1 pk1Var = new pk1(oy8Var, (byte) 1);
                    oy8Var.P = pk1Var;
                    do3Var.postRunnable(pk1Var);
                    return;
                }
                return;
            case 5:
                if (oy8Var.P != null) {
                    dk0.c();
                    oy8Var.P = null;
                }
                oy8Var.y0 = false;
                oy8Var.k();
                Runnable runnable = oy8Var.B0;
                if (runnable != null) {
                    runnable.run();
                    oy8Var.B0 = null;
                    return;
                }
                return;
            case 6:
                try {
                    i = oy8Var.e();
                    if (i == 1) {
                        if (oy8Var.T != null) {
                            createBitmap = oy8Var.T;
                            z = true;
                        } else {
                            if (oy8Var.H) {
                                config = Bitmap.Config.ALPHA_8;
                            } else {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(oy8Var.b, oy8Var.c, config);
                            oy8Var.T = createBitmap;
                            z = false;
                        }
                        int w = oy8Var.w(createBitmap, z);
                        if (w == 1) {
                            oy8Var.S = createBitmap;
                            oy8Var.d();
                        }
                        i = w;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    i = 2;
                }
                if (i == 1) {
                    oy8Var.H0 = 0;
                    gl.c3(oy8Var.x0);
                } else if (i == 2) {
                    gl.d3(oy8Var.w0, oy8Var.H0);
                    oy8Var.H0 = Math.min((Math.max(oy8Var.H0, 2) * 3) / 2, 2000);
                } else if (i == 3) {
                    gl.c3(oy8Var.w0);
                }
                CountDownLatch countDownLatch = oy8Var.V;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 7:
                oy8Var.h();
                return;
            default:
                oy8Var.start();
                return;
        }
    }
}
