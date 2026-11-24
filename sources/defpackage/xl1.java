package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;
public final class xl1 implements Runnable {
    public final byte a;
    public final p09 b;

    public xl1(p09 p09Var, byte b) {
        this.a = b;
        this.b = p09Var;
    }

    @Override
    public final void run() {
        int i;
        Bitmap.Config config;
        Bitmap createBitmap;
        boolean z;
        byte b = this.a;
        p09 p09Var = this.b;
        switch (b) {
            case 0:
                p09Var.C(false);
                return;
            case 1:
                p09Var.getClass();
                try {
                    dl0 dl0Var = p09Var.C0;
                    if (dl0Var != null) {
                        dl0Var.b();
                    }
                } catch (Throwable unused) {
                }
                gm.c3(p09Var.A0);
                return;
            case 2:
                p09Var.Q = null;
                p09Var.k();
                return;
            case 3:
                p09Var.Y = true;
                if ((!p09Var.l0 && p09Var.X) || (p09Var.R == null && p09Var.S != null)) {
                    p09Var.s();
                }
                p09Var.k();
                return;
            case 4:
                if (!p09Var.m0 && !p09Var.W && p09Var.f() && p09Var.P == null) {
                    p09Var.y0 = true;
                    if (p09.U0 == null) {
                        p09.U0 = new np3("cache generator queue", true);
                    }
                    dl0.A++;
                    np3 np3Var = p09.U0;
                    xl1 xl1Var = new xl1(p09Var, (byte) 1);
                    p09Var.P = xl1Var;
                    np3Var.postRunnable(xl1Var);
                    return;
                }
                return;
            case 5:
                if (p09Var.P != null) {
                    dl0.c();
                    p09Var.P = null;
                }
                p09Var.y0 = false;
                p09Var.k();
                Runnable runnable = p09Var.B0;
                if (runnable != null) {
                    runnable.run();
                    p09Var.B0 = null;
                    return;
                }
                return;
            case 6:
                try {
                    i = p09Var.e();
                    if (i == 1) {
                        if (p09Var.T != null) {
                            createBitmap = p09Var.T;
                            z = true;
                        } else {
                            if (p09Var.H) {
                                config = Bitmap.Config.ALPHA_8;
                            } else {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(p09Var.b, p09Var.c, config);
                            p09Var.T = createBitmap;
                            z = false;
                        }
                        int w = p09Var.w(createBitmap, z);
                        if (w == 1) {
                            p09Var.S = createBitmap;
                            p09Var.d();
                        }
                        i = w;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    i = 2;
                }
                if (i == 1) {
                    p09Var.H0 = 0;
                    gm.c3(p09Var.x0);
                } else if (i == 2) {
                    gm.d3(p09Var.w0, p09Var.H0);
                    p09Var.H0 = Math.min((Math.max(p09Var.H0, 2) * 3) / 2, 2000);
                } else if (i == 3) {
                    gm.c3(p09Var.w0);
                }
                CountDownLatch countDownLatch = p09Var.V;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    return;
                }
                return;
            case 7:
                p09Var.h();
                return;
            default:
                p09Var.start();
                return;
        }
    }
}
