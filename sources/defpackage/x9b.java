package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
public final class x9b extends AnimatorListenerAdapter {
    public final byte a;
    public final oab b;

    public x9b(oab oabVar, byte b) {
        this.a = b;
        this.b = oabVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a58 w;
        u09 u09Var;
        byte b = this.a;
        oab oabVar = this.b;
        a58 a58Var = null;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                lab labVar = oabVar.t0;
                dab dabVar = oabVar.w;
                if (dabVar != null) {
                    dabVar.a(true);
                }
                oabVar.l();
                oabVar.J0.e();
                l4b l4bVar = oabVar.u1;
                if (l4bVar != null) {
                    l4bVar.b();
                    gm.B2(oabVar.u1);
                    oabVar.u1 = null;
                }
                ImageReceiver imageReceiver = labVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(true, true);
                    labVar.b = null;
                }
                ImageReceiver imageReceiver2 = labVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    labVar.c.v0(true, true);
                }
                if (labVar.d != null && (w = oabVar.w()) != null && (u09Var = w.e1.d) != null) {
                    u09 u09Var2 = labVar.d;
                    u09Var2.getClass();
                    u09Var2.c = u09Var.c;
                    u09Var2.f = u09Var.f;
                    u09Var2.b = u09Var.b;
                    u09Var2.a = System.currentTimeMillis();
                    u09Var2.c();
                }
                c40 c40Var = oabVar.G0;
                if (c40Var != null) {
                    c40Var.m();
                }
                SurfaceView surfaceView = oabVar.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                oabVar.M();
                try {
                    gm.c3(new nsa(this, (byte) 28));
                } catch (Exception unused) {
                }
                oabVar.n0 = false;
                oabVar.d = false;
                j48 j48Var = oabVar.o1;
                if (j48Var != null) {
                    j48Var.run();
                    oabVar.o1 = null;
                    return;
                }
                return;
            case 1:
                oabVar.I = null;
                oabVar.a0 = 0.0f;
                oabVar.e0 = 0.0f;
                eab eabVar = oabVar.o0;
                if (eabVar != null) {
                    a58Var = eabVar.getCurrentPeerView();
                }
                if (a58Var != null) {
                    a58Var.invalidate();
                    return;
                }
                return;
            default:
                lab labVar2 = oabVar.t0;
                oabVar.V = 1.0f;
                oabVar.l();
                oab.x1 = false;
                dab dabVar2 = oabVar.w;
                if (dabVar2 != null) {
                    dabVar2.a(true);
                }
                cab cabVar = oabVar.s;
                if (cabVar != null) {
                    cabVar.invalidate();
                }
                ImageReceiver imageReceiver3 = labVar2.b;
                if (imageReceiver3 != null && !oabVar.d) {
                    imageReceiver3.v0(true, true);
                    labVar2.b = null;
                }
                ImageReceiver imageReceiver4 = labVar2.c;
                if (imageReceiver4 != null && !oabVar.d) {
                    imageReceiver4.setAlpha(1.0f);
                    labVar2.c.v0(true, true);
                    labVar2.c = null;
                }
                a58 w2 = oabVar.w();
                if (w2 != null) {
                    w2.c1(false);
                }
                s96 s96Var = oabVar.B0;
                if (s96Var != null) {
                    s96Var.F((1.0f - oabVar.W) * oabVar.V);
                }
                if (oabVar.w1) {
                    oabVar.w1 = false;
                    oabVar.m();
                    gm.d3(new j48(oabVar, (byte) 1), 30L);
                } else if (!gda.T) {
                    if (oabVar.u1 == null && oabVar.w != null) {
                        l4b l4bVar2 = new l4b(oabVar.w.getContext(), oabVar.s);
                        oabVar.u1 = l4bVar2;
                        l4bVar2.setAlpha(0.0f);
                        oabVar.w.addView(oabVar.u1);
                    }
                    l4b l4bVar3 = oabVar.u1;
                    if (l4bVar3 != null) {
                        l4bVar3.setOnClickListener(new oha(this, (byte) 18));
                        oabVar.u1.animate().alpha(1.0f).setDuration(150L).setListener(new hab(this, (byte) 1)).start();
                    }
                    gda.F(true);
                }
                oabVar.U();
                oabVar.J0.e();
                return;
        }
    }
}
