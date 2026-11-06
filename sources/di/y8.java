package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.dh0;
public final class y8 extends AnimatorListenerAdapter {
    public final int f9991a;
    public final p9 f9992b;

    public y8(p9 p9Var, int i7) {
        this.f9991a = i7;
        this.f9992b = p9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 z9;
        dh0 dh0Var;
        switch (this.f9991a) {
            case 0:
                super.onAnimationEnd(animator);
                p9 p9Var = this.f9992b;
                m9 m9Var = p9Var.f9570s0;
                e9 e9Var = p9Var.f9578w;
                if (e9Var != null) {
                    e9Var.a(true);
                }
                p9Var.q();
                p9Var.I0.e();
                c7 c7Var = p9Var.f9573t1;
                if (c7Var != null) {
                    c7Var.b();
                    org.telegram.messenger.g0.E2(p9Var.f9573t1);
                    p9Var.f9573t1 = null;
                }
                ImageReceiver imageReceiver = m9Var.f9363b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    m9Var.f9363b = null;
                }
                ImageReceiver imageReceiver2 = m9Var.f9364c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    m9Var.f9364c.O0(true, true);
                }
                if (m9Var.d != null && (z9 = p9Var.z()) != null && (dh0Var = z9.X0.d) != null) {
                    dh0 dh0Var2 = m9Var.d;
                    dh0Var2.getClass();
                    dh0Var2.f32874c = dh0Var.f32874c;
                    dh0Var2.f32876f = dh0Var.f32876f;
                    dh0Var2.f32873b = dh0Var.f32873b;
                    dh0Var2.f32872a = System.currentTimeMillis();
                    dh0Var2.c();
                }
                h4 h4Var = p9Var.F0;
                if (h4Var != null) {
                    h4Var.b();
                }
                SurfaceView surfaceView = p9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                p9Var.O();
                try {
                    org.telegram.messenger.g0.h3(new s7(this, 5));
                } catch (Exception unused) {
                }
                p9Var.m0 = false;
                p9Var.d = false;
                l3 l3Var = p9Var.n1;
                if (l3Var != null) {
                    l3Var.run();
                    p9Var.n1 = null;
                    return;
                }
                return;
            case 1:
                p9 p9Var2 = this.f9992b;
                i4 i4Var = null;
                p9Var2.H = null;
                p9Var2.Z = 0.0f;
                p9Var2.f9538d0 = 0.0f;
                f9 f9Var = p9Var2.f9559n0;
                if (f9Var != null) {
                    i4Var = f9Var.getCurrentPeerView();
                }
                if (i4Var != null) {
                    i4Var.invalidate();
                    return;
                }
                return;
            default:
                p9 p9Var3 = this.f9992b;
                m9 m9Var2 = p9Var3.f9570s0;
                p9Var3.U = 1.0f;
                p9Var3.q();
                p9.f9525w1 = false;
                e9 e9Var2 = p9Var3.f9578w;
                if (e9Var2 != null) {
                    e9Var2.a(true);
                }
                d9 d9Var = p9Var3.f9569s;
                if (d9Var != null) {
                    d9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = m9Var2.f9363b;
                if (imageReceiver3 != null && !p9Var3.d) {
                    imageReceiver3.O0(true, true);
                    m9Var2.f9363b = null;
                }
                ImageReceiver imageReceiver4 = m9Var2.f9364c;
                if (imageReceiver4 != null && !p9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    m9Var2.f9364c.O0(true, true);
                    m9Var2.f9364c = null;
                }
                i4 z10 = p9Var3.z();
                if (z10 != null) {
                    z10.d1(false);
                }
                g1 g1Var = p9Var3.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - p9Var3.V) * p9Var3.U);
                }
                if (p9Var3.f9577v1) {
                    p9Var3.f9577v1 = false;
                    p9Var3.r();
                    org.telegram.messenger.g0.i3(new l3(p9Var3, 1), 30L);
                } else if (!iz.U) {
                    if (p9Var3.f9573t1 == null && p9Var3.f9578w != null) {
                        c7 c7Var2 = new c7(p9Var3.f9578w.getContext(), p9Var3.f9569s);
                        p9Var3.f9573t1 = c7Var2;
                        c7Var2.setAlpha(0.0f);
                        p9Var3.f9578w.addView(p9Var3.f9573t1);
                    }
                    c7 c7Var3 = p9Var3.f9573t1;
                    if (c7Var3 != null) {
                        c7Var3.setOnClickListener(new ah.d(this, 18));
                        p9Var3.f9573t1.animate().alpha(1.0f).setDuration(150L).setListener(new i9(this, 1)).start();
                    }
                    iz.G(true);
                }
                p9Var3.V();
                p9Var3.I0.e();
                return;
        }
    }
}
