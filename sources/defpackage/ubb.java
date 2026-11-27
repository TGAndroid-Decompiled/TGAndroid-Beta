package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
public final class ubb extends AnimatorListenerAdapter {
    public final byte a;
    public final lcb b;

    public ubb(lcb lcbVar, byte b) {
        this.a = b;
        this.b = lcbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o68 w;
        g29 g29Var;
        byte b = this.a;
        lcb lcbVar = this.b;
        o68 o68Var = null;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                icb icbVar = lcbVar.t0;
                acb acbVar = lcbVar.w;
                if (acbVar != null) {
                    acbVar.a(true);
                }
                lcbVar.l();
                lcbVar.J0.e();
                g6b g6bVar = lcbVar.u1;
                if (g6bVar != null) {
                    g6bVar.b();
                    hl.B2(lcbVar.u1);
                    lcbVar.u1 = null;
                }
                ImageReceiver imageReceiver = icbVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(true, true);
                    icbVar.b = null;
                }
                ImageReceiver imageReceiver2 = icbVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    icbVar.c.v0(true, true);
                }
                if (icbVar.d != null && (w = lcbVar.w()) != null && (g29Var = w.Y0.d) != null) {
                    g29 g29Var2 = icbVar.d;
                    g29Var2.getClass();
                    g29Var2.c = g29Var.c;
                    g29Var2.f = g29Var.f;
                    g29Var2.b = g29Var.b;
                    g29Var2.a = System.currentTimeMillis();
                    g29Var2.c();
                }
                d30 d30Var = lcbVar.G0;
                if (d30Var != null) {
                    d30Var.m();
                }
                SurfaceView surfaceView = lcbVar.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                lcbVar.M();
                try {
                    hl.c3(new s8b(this, (byte) 7));
                } catch (Exception unused) {
                }
                lcbVar.n0 = false;
                lcbVar.d = false;
                y58 y58Var = lcbVar.o1;
                if (y58Var != null) {
                    y58Var.run();
                    lcbVar.o1 = null;
                    return;
                }
                return;
            case 1:
                lcbVar.I = null;
                lcbVar.a0 = 0.0f;
                lcbVar.e0 = 0.0f;
                bcb bcbVar = lcbVar.o0;
                if (bcbVar != null) {
                    o68Var = bcbVar.getCurrentPeerView();
                }
                if (o68Var != null) {
                    o68Var.invalidate();
                    return;
                }
                return;
            default:
                icb icbVar2 = lcbVar.t0;
                lcbVar.V = 1.0f;
                lcbVar.l();
                lcb.x1 = false;
                acb acbVar2 = lcbVar.w;
                if (acbVar2 != null) {
                    acbVar2.a(true);
                }
                zbb zbbVar = lcbVar.s;
                if (zbbVar != null) {
                    zbbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = icbVar2.b;
                if (imageReceiver3 != null && !lcbVar.d) {
                    imageReceiver3.v0(true, true);
                    icbVar2.b = null;
                }
                ImageReceiver imageReceiver4 = icbVar2.c;
                if (imageReceiver4 != null && !lcbVar.d) {
                    imageReceiver4.setAlpha(1.0f);
                    icbVar2.c.v0(true, true);
                    icbVar2.c = null;
                }
                o68 w2 = lcbVar.w();
                if (w2 != null) {
                    w2.c1(false);
                }
                w96 w96Var = lcbVar.B0;
                if (w96Var != null) {
                    w96Var.F((1.0f - lcbVar.W) * lcbVar.V);
                }
                if (lcbVar.w1) {
                    lcbVar.w1 = false;
                    lcbVar.m();
                    hl.d3(new y58(lcbVar, (byte) 1), 30L);
                } else if (!xea.T) {
                    if (lcbVar.u1 == null && lcbVar.w != null) {
                        g6b g6bVar2 = new g6b(lcbVar.w.getContext(), lcbVar.s);
                        lcbVar.u1 = g6bVar2;
                        g6bVar2.setAlpha(0.0f);
                        lcbVar.w.addView(lcbVar.u1);
                    }
                    g6b g6bVar3 = lcbVar.u1;
                    if (g6bVar3 != null) {
                        g6bVar3.setOnClickListener(new kla(this, (byte) 16));
                        lcbVar.u1.animate().alpha(1.0f).setDuration(150L).setListener(new ecb(this, (byte) 1)).start();
                    }
                    xea.F(true);
                }
                lcbVar.U();
                lcbVar.J0.e();
                return;
        }
    }
}
