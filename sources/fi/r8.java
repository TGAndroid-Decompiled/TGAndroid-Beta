package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.gh0;
public final class r8 extends AnimatorListenerAdapter {
    public final int f12288a;
    public final i9 f12289b;

    public r8(i9 i9Var, int i7) {
        this.f12288a = i7;
        this.f12289b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        b4 z10;
        gh0 gh0Var;
        switch (this.f12288a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f12289b;
                f9 f9Var = i9Var.f11873t0;
                x8 x8Var = i9Var.f11879w;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.q();
                i9Var.J0.e();
                w6 w6Var = i9Var.f11876u1;
                if (w6Var != null) {
                    w6Var.b();
                    org.telegram.messenger.g0.E2(i9Var.f11876u1);
                    i9Var.f11876u1 = null;
                }
                ImageReceiver imageReceiver = f9Var.f11711b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    f9Var.f11711b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.f11712c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.f11712c.O0(true, true);
                }
                if (f9Var.d != null && (z10 = i9Var.z()) != null && (gh0Var = z10.Y0.d) != null) {
                    gh0 gh0Var2 = f9Var.d;
                    gh0Var2.getClass();
                    gh0Var2.f34970c = gh0Var.f34970c;
                    gh0Var2.f34972f = gh0Var.f34972f;
                    gh0Var2.f34969b = gh0Var.f34969b;
                    gh0Var2.f34968a = System.currentTimeMillis();
                    gh0Var2.c();
                }
                a4 a4Var = i9Var.G0;
                if (a4Var != null) {
                    a4Var.b();
                }
                SurfaceView surfaceView = i9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new c1(this, 18));
                } catch (Exception unused) {
                }
                i9Var.f11860n0 = false;
                i9Var.d = false;
                g3 g3Var = i9Var.f11862o1;
                if (g3Var != null) {
                    g3Var.run();
                    i9Var.f11862o1 = null;
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f12289b;
                b4 b4Var = null;
                i9Var2.I = null;
                i9Var2.f11831a0 = 0.0f;
                i9Var2.f11842e0 = 0.0f;
                y8 y8Var = i9Var2.f11861o0;
                if (y8Var != null) {
                    b4Var = y8Var.getCurrentPeerView();
                }
                if (b4Var != null) {
                    b4Var.invalidate();
                    return;
                }
                return;
            default:
                i9 i9Var3 = this.f12289b;
                f9 f9Var2 = i9Var3.f11873t0;
                i9Var3.V = 1.0f;
                i9Var3.q();
                i9.f11827x1 = false;
                x8 x8Var2 = i9Var3.f11879w;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.f11870s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.f11711b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.O0(true, true);
                    f9Var2.f11711b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.f11712c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.f11712c.O0(true, true);
                    f9Var2.f11712c = null;
                }
                b4 z11 = i9Var3.z();
                if (z11 != null) {
                    z11.d1(false);
                }
                e1 e1Var = i9Var3.B0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var3.W) * i9Var3.V);
                }
                if (i9Var3.f11881w1) {
                    i9Var3.f11881w1 = false;
                    i9Var3.r();
                    org.telegram.messenger.g0.i3(new g3(i9Var3, 1), 30L);
                } else if (!gz.U) {
                    if (i9Var3.f11876u1 == null && i9Var3.f11879w != null) {
                        w6 w6Var2 = new w6(i9Var3.f11879w.getContext(), i9Var3.f11870s);
                        i9Var3.f11876u1 = w6Var2;
                        w6Var2.setAlpha(0.0f);
                        i9Var3.f11879w.addView(i9Var3.f11876u1);
                    }
                    w6 w6Var3 = i9Var3.f11876u1;
                    if (w6Var3 != null) {
                        w6Var3.setOnClickListener(new ah.d(this, 24));
                        i9Var3.f11876u1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    gz.G(true);
                }
                i9Var3.V();
                i9Var3.J0.e();
                return;
        }
    }
}
