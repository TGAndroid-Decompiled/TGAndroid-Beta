package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cz;
import org.telegram.ui.Components.sh0;
public final class o8 extends AnimatorListenerAdapter {
    public final int f12339a;
    public final f9 f12340b;

    public o8(f9 f9Var, int i7) {
        this.f12339a = i7;
        this.f12340b = f9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z3 z10;
        sh0 sh0Var;
        switch (this.f12339a) {
            case 0:
                super.onAnimationEnd(animator);
                f9 f9Var = this.f12340b;
                c9 c9Var = f9Var.f11990t0;
                u8 u8Var = f9Var.f11996w;
                if (u8Var != null) {
                    u8Var.a(true);
                }
                f9Var.q();
                f9Var.J0.e();
                t6 t6Var = f9Var.f11993u1;
                if (t6Var != null) {
                    t6Var.b();
                    org.telegram.messenger.g0.E2(f9Var.f11993u1);
                    f9Var.f11993u1 = null;
                }
                ImageReceiver imageReceiver = c9Var.f11812b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    c9Var.f11812b = null;
                }
                ImageReceiver imageReceiver2 = c9Var.f11813c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    c9Var.f11813c.O0(true, true);
                }
                if (c9Var.d != null && (z10 = f9Var.z()) != null && (sh0Var = z10.Y0.d) != null) {
                    sh0 sh0Var2 = c9Var.d;
                    sh0Var2.getClass();
                    sh0Var2.f39537c = sh0Var.f39537c;
                    sh0Var2.f39539f = sh0Var.f39539f;
                    sh0Var2.f39536b = sh0Var.f39536b;
                    sh0Var2.f39535a = System.currentTimeMillis();
                    sh0Var2.c();
                }
                y3 y3Var = f9Var.G0;
                if (y3Var != null) {
                    y3Var.b();
                }
                SurfaceView surfaceView = f9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                f9Var.O();
                try {
                    org.telegram.messenger.g0.g3(new f2.a(this, 21));
                } catch (Exception unused) {
                }
                f9Var.f11977n0 = false;
                f9Var.d = false;
                e3 e3Var = f9Var.f11979o1;
                if (e3Var != null) {
                    e3Var.run();
                    f9Var.f11979o1 = null;
                    return;
                }
                return;
            case 1:
                f9 f9Var2 = this.f12340b;
                z3 z3Var = null;
                f9Var2.I = null;
                f9Var2.f11948a0 = 0.0f;
                f9Var2.f11959e0 = 0.0f;
                v8 v8Var = f9Var2.f11978o0;
                if (v8Var != null) {
                    z3Var = v8Var.getCurrentPeerView();
                }
                if (z3Var != null) {
                    z3Var.invalidate();
                    return;
                }
                return;
            default:
                f9 f9Var3 = this.f12340b;
                c9 c9Var2 = f9Var3.f11990t0;
                f9Var3.V = 1.0f;
                f9Var3.q();
                f9.f11944x1 = false;
                u8 u8Var2 = f9Var3.f11996w;
                if (u8Var2 != null) {
                    u8Var2.a(true);
                }
                t8 t8Var = f9Var3.f11987s;
                if (t8Var != null) {
                    t8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = c9Var2.f11812b;
                if (imageReceiver3 != null && !f9Var3.d) {
                    imageReceiver3.O0(true, true);
                    c9Var2.f11812b = null;
                }
                ImageReceiver imageReceiver4 = c9Var2.f11813c;
                if (imageReceiver4 != null && !f9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    c9Var2.f11813c.O0(true, true);
                    c9Var2.f11813c = null;
                }
                z3 z11 = f9Var3.z();
                if (z11 != null) {
                    z11.d1(false);
                }
                c1 c1Var = f9Var3.B0;
                if (c1Var != null) {
                    c1Var.v((1.0f - f9Var3.W) * f9Var3.V);
                }
                if (f9Var3.f11998w1) {
                    f9Var3.f11998w1 = false;
                    f9Var3.r();
                    org.telegram.messenger.g0.h3(new e3(f9Var3, 1), 30L);
                } else if (!cz.U) {
                    if (f9Var3.f11993u1 == null && f9Var3.f11996w != null) {
                        t6 t6Var2 = new t6(f9Var3.f11996w.getContext(), f9Var3.f11987s);
                        f9Var3.f11993u1 = t6Var2;
                        t6Var2.setAlpha(0.0f);
                        f9Var3.f11996w.addView(f9Var3.f11993u1);
                    }
                    t6 t6Var3 = f9Var3.f11993u1;
                    if (t6Var3 != null) {
                        t6Var3.setOnClickListener(new ah.d(this, 25));
                        f9Var3.f11993u1.animate().alpha(1.0f).setDuration(150L).setListener(new y8(this, 1)).start();
                    }
                    cz.G(true);
                }
                f9Var3.V();
                f9Var3.J0.e();
                return;
        }
    }
}
