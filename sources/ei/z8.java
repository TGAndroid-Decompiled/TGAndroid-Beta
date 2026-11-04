package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.az;
import org.telegram.ui.Components.gh0;
public final class z8 extends AnimatorListenerAdapter {
    public final int f11300a;
    public final r9 f11301b;

    public z8(r9 r9Var, int i3) {
        this.f11300a = i3;
        this.f11301b = r9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 H;
        gh0 gh0Var;
        switch (this.f11300a) {
            case 0:
                super.onAnimationEnd(animator);
                r9 r9Var = this.f11301b;
                o9 o9Var = r9Var.f10951t0;
                f9 f9Var = r9Var.f10957w;
                if (f9Var != null) {
                    f9Var.a(true);
                }
                r9Var.B();
                r9Var.K0.e();
                d7 d7Var = r9Var.f10956v1;
                if (d7Var != null) {
                    d7Var.b();
                    org.telegram.messenger.g0.E2(r9Var.f10956v1);
                    r9Var.f10956v1 = null;
                }
                ImageReceiver imageReceiver = o9Var.f10727b;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    o9Var.f10727b = null;
                }
                ImageReceiver imageReceiver2 = o9Var.f10728c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    o9Var.f10728c.O0(true, true);
                }
                if (o9Var.d != null && (H = r9Var.H()) != null && (gh0Var = H.Y0.d) != null) {
                    gh0 gh0Var2 = o9Var.d;
                    gh0Var2.getClass();
                    gh0Var2.f34098c = gh0Var.f34098c;
                    gh0Var2.f34100f = gh0Var.f34100f;
                    gh0Var2.f34097b = gh0Var.f34097b;
                    gh0Var2.f34096a = System.currentTimeMillis();
                    gh0Var2.c();
                }
                i4 i4Var = r9Var.H0;
                if (i4Var != null) {
                    i4Var.b();
                }
                SurfaceView surfaceView = r9Var.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                r9Var.W();
                try {
                    org.telegram.messenger.g0.h3(new z5(this, 10));
                } catch (Exception unused) {
                }
                r9Var.f10937n0 = false;
                r9Var.d = false;
                o3 o3Var = r9Var.f10942p1;
                if (o3Var != null) {
                    o3Var.run();
                    r9Var.f10942p1 = null;
                    return;
                }
                return;
            case 1:
                r9 r9Var2 = this.f11301b;
                j4 j4Var = null;
                r9Var2.I = null;
                r9Var2.f10909a0 = 0.0f;
                r9Var2.f10920e0 = 0.0f;
                g9 g9Var = r9Var2.f10939o0;
                if (g9Var != null) {
                    j4Var = g9Var.getCurrentPeerView();
                }
                if (j4Var != null) {
                    j4Var.invalidate();
                    return;
                }
                return;
            default:
                r9 r9Var3 = this.f11301b;
                o9 o9Var2 = r9Var3.f10951t0;
                r9Var3.V = 1.0f;
                r9Var3.B();
                r9.f10906y1 = false;
                f9 f9Var2 = r9Var3.f10957w;
                if (f9Var2 != null) {
                    f9Var2.a(true);
                }
                e9 e9Var = r9Var3.f10948s;
                if (e9Var != null) {
                    e9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = o9Var2.f10727b;
                if (imageReceiver3 != null && !r9Var3.d) {
                    imageReceiver3.O0(true, true);
                    o9Var2.f10727b = null;
                }
                ImageReceiver imageReceiver4 = o9Var2.f10728c;
                if (imageReceiver4 != null && !r9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    o9Var2.f10728c.O0(true, true);
                    o9Var2.f10728c = null;
                }
                j4 H2 = r9Var3.H();
                if (H2 != null) {
                    H2.d1(false);
                }
                g1 g1Var = r9Var3.B0;
                if (g1Var != null) {
                    g1Var.v((1.0f - r9Var3.W) * r9Var3.V);
                }
                if (r9Var3.f10962x1) {
                    r9Var3.f10962x1 = false;
                    r9Var3.C();
                    org.telegram.messenger.g0.i3(new o3(r9Var3, 1), 30L);
                } else if (!az.U) {
                    if (r9Var3.f10956v1 == null && r9Var3.f10957w != null) {
                        d7 d7Var2 = new d7(r9Var3.f10957w.getContext(), r9Var3.f10948s);
                        r9Var3.f10956v1 = d7Var2;
                        d7Var2.setAlpha(0.0f);
                        r9Var3.f10957w.addView(r9Var3.f10956v1);
                    }
                    d7 d7Var3 = r9Var3.f10956v1;
                    if (d7Var3 != null) {
                        d7Var3.setOnClickListener(new ai.b(this, 21));
                        r9Var3.f10956v1.animate().alpha(1.0f).setDuration(150L).setListener(new k9(this, 1)).start();
                    }
                    az.G(true);
                }
                r9Var3.d0();
                r9Var3.K0.e();
                return;
        }
    }
}
