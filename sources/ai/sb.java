package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.mj0;
public final class sb extends AnimatorListenerAdapter {
    public final int f1532a;
    public final jc f1533b;

    public sb(jc jcVar, int i10) {
        this.f1532a = i10;
        this.f1533b = jcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e6 t10;
        mj0 mj0Var;
        switch (this.f1532a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f1533b;
                gc gcVar = jcVar.f1099s0;
                yb ybVar = jcVar.v;
                if (ybVar != null) {
                    ybVar.a(true);
                }
                jcVar.o();
                jcVar.J0.unlock();
                p9 p9Var = jcVar.f1104u1;
                if (p9Var != null) {
                    p9Var.b();
                    AndroidUtilities.removeFromParent(jcVar.f1104u1);
                    jcVar.f1104u1 = null;
                }
                ImageReceiver imageReceiver = gcVar.f914b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    gcVar.f914b = null;
                }
                ImageReceiver imageReceiver2 = gcVar.f915c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    gcVar.f915c.setVisible(true, true);
                }
                if (gcVar.d != null && (t10 = jcVar.t()) != null && (mj0Var = t10.f812o1.d) != null) {
                    mj0 mj0Var2 = gcVar.d;
                    mj0Var2.getClass();
                    mj0Var2.f26515c = mj0Var.f26515c;
                    mj0Var2.f26516f = mj0Var.f26516f;
                    mj0Var2.f26514b = mj0Var.f26514b;
                    mj0Var2.f26513a = System.currentTimeMillis();
                    mj0Var2.c();
                }
                d6 d6Var = jcVar.G0;
                if (d6Var != null) {
                    d6Var.b();
                }
                SurfaceView surfaceView = jcVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                jcVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new a3.d(this, 22));
                } catch (Exception unused) {
                }
                jcVar.m0 = false;
                jcVar.d = false;
                d5 d5Var = jcVar.f1090o1;
                if (d5Var != null) {
                    d5Var.run();
                    jcVar.f1090o1 = null;
                    return;
                }
                return;
            case 1:
                jc jcVar2 = this.f1533b;
                e6 e6Var = null;
                jcVar2.H = null;
                jcVar2.Z = 0.0f;
                jcVar2.f1067d0 = 0.0f;
                zb zbVar = jcVar2.f1087n0;
                if (zbVar != null) {
                    e6Var = zbVar.getCurrentPeerView();
                }
                if (e6Var != null) {
                    e6Var.invalidate();
                    return;
                }
                return;
            default:
                jc jcVar3 = this.f1533b;
                gc gcVar2 = jcVar3.f1099s0;
                jcVar3.U = 1.0f;
                jcVar3.o();
                jc.f1055x1 = false;
                yb ybVar2 = jcVar3.v;
                if (ybVar2 != null) {
                    ybVar2.a(true);
                }
                xb xbVar = jcVar3.f1098s;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = gcVar2.f914b;
                if (imageReceiver3 != null && !jcVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    gcVar2.f914b = null;
                }
                ImageReceiver imageReceiver4 = gcVar2.f915c;
                if (imageReceiver4 != null && !jcVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    gcVar2.f915c.setVisible(true, true);
                    gcVar2.f915c = null;
                }
                e6 t11 = jcVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d2 d2Var = jcVar3.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - jcVar3.V) * jcVar3.U);
                }
                if (jcVar3.f1109w1) {
                    jcVar3.f1109w1 = false;
                    jcVar3.p();
                    AndroidUtilities.runOnUIThread(new d5(jcVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (jcVar3.f1104u1 == null && jcVar3.v != null) {
                        p9 p9Var2 = new p9(jcVar3.v.getContext(), jcVar3.f1098s);
                        jcVar3.f1104u1 = p9Var2;
                        p9Var2.setAlpha(0.0f);
                        jcVar3.v.addView(jcVar3.f1104u1);
                    }
                    p9 p9Var3 = jcVar3.f1104u1;
                    if (p9Var3 != null) {
                        p9Var3.setOnClickListener(new v0(this, 4));
                        jcVar3.f1104u1.animate().alpha(1.0f).setDuration(150L).setListener(new cc(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                jcVar3.P();
                jcVar3.J0.unlock();
                return;
        }
    }
}
