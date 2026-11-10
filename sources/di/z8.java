package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.dh0;
public final class z8 extends AnimatorListenerAdapter {
    public final int f10023a;
    public final q9 f10024b;

    public z8(q9 q9Var, int i7) {
        this.f10023a = i7;
        this.f10024b = q9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 z9;
        dh0 dh0Var;
        switch (this.f10023a) {
            case 0:
                super.onAnimationEnd(animator);
                q9 q9Var = this.f10024b;
                n9 n9Var = q9Var.f9640s0;
                f9 f9Var = q9Var.f9648w;
                if (f9Var != null) {
                    f9Var.a(true);
                }
                q9Var.q();
                q9Var.I0.e();
                d7 d7Var = q9Var.f9643t1;
                if (d7Var != null) {
                    d7Var.b();
                    org.telegram.messenger.g0.E2(q9Var.f9643t1);
                    q9Var.f9643t1 = null;
                }
                ImageReceiver imageReceiver = n9Var.f9409b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    n9Var.f9409b = null;
                }
                ImageReceiver imageReceiver2 = n9Var.f9410c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    n9Var.f9410c.O0(true, true);
                }
                if (n9Var.d != null && (z9 = q9Var.z()) != null && (dh0Var = z9.X0.d) != null) {
                    dh0 dh0Var2 = n9Var.d;
                    dh0Var2.getClass();
                    dh0Var2.f32976c = dh0Var.f32976c;
                    dh0Var2.f32978f = dh0Var.f32978f;
                    dh0Var2.f32975b = dh0Var.f32975b;
                    dh0Var2.f32974a = System.currentTimeMillis();
                    dh0Var2.c();
                }
                i4 i4Var = q9Var.F0;
                if (i4Var != null) {
                    i4Var.b();
                }
                SurfaceView surfaceView = q9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                q9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new f8(this, 4));
                } catch (Exception unused) {
                }
                q9Var.m0 = false;
                q9Var.d = false;
                l3 l3Var = q9Var.n1;
                if (l3Var != null) {
                    l3Var.run();
                    q9Var.n1 = null;
                    return;
                }
                return;
            case 1:
                q9 q9Var2 = this.f10024b;
                j4 j4Var = null;
                q9Var2.H = null;
                q9Var2.Z = 0.0f;
                q9Var2.f9608d0 = 0.0f;
                g9 g9Var = q9Var2.f9629n0;
                if (g9Var != null) {
                    j4Var = g9Var.getCurrentPeerView();
                }
                if (j4Var != null) {
                    j4Var.invalidate();
                    return;
                }
                return;
            default:
                q9 q9Var3 = this.f10024b;
                n9 n9Var2 = q9Var3.f9640s0;
                q9Var3.U = 1.0f;
                q9Var3.q();
                q9.f9595w1 = false;
                f9 f9Var2 = q9Var3.f9648w;
                if (f9Var2 != null) {
                    f9Var2.a(true);
                }
                e9 e9Var = q9Var3.f9639s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = n9Var2.f9409b;
                if (imageReceiver3 != null && !q9Var3.d) {
                    imageReceiver3.O0(true, true);
                    n9Var2.f9409b = null;
                }
                ImageReceiver imageReceiver4 = n9Var2.f9410c;
                if (imageReceiver4 != null && !q9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    n9Var2.f9410c.O0(true, true);
                    n9Var2.f9410c = null;
                }
                j4 z10 = q9Var3.z();
                if (z10 != null) {
                    z10.d1(false);
                }
                g1 g1Var = q9Var3.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - q9Var3.V) * q9Var3.U);
                }
                if (q9Var3.f9647v1) {
                    q9Var3.f9647v1 = false;
                    q9Var3.r();
                    org.telegram.messenger.g0.i3(new l3(q9Var3, 1), 30L);
                } else if (!iz.U) {
                    if (q9Var3.f9643t1 == null && q9Var3.f9648w != null) {
                        d7 d7Var2 = new d7(q9Var3.f9648w.getContext(), q9Var3.f9639s);
                        q9Var3.f9643t1 = d7Var2;
                        d7Var2.setAlpha(0.0f);
                        q9Var3.f9648w.addView(q9Var3.f9643t1);
                    }
                    d7 d7Var3 = q9Var3.f9643t1;
                    if (d7Var3 != null) {
                        d7Var3.setOnClickListener(new ah.d(this, 18));
                        q9Var3.f9643t1.animate().alpha(1.0f).setDuration(150L).setListener(new j9(this, 1)).start();
                    }
                    iz.G(true);
                }
                q9Var3.V();
                q9Var3.I0.e();
                return;
        }
    }
}
