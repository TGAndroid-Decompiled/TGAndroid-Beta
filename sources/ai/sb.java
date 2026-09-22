package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.oj0;
public final class sb extends AnimatorListenerAdapter {
    public final int f1530a;
    public final jc f1531b;

    public sb(jc jcVar, int i10) {
        this.f1530a = i10;
        this.f1531b = jcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f6 t10;
        oj0 oj0Var;
        switch (this.f1530a) {
            case 0:
                super.onAnimationEnd(animator);
                jc jcVar = this.f1531b;
                gc gcVar = jcVar.f1105s0;
                yb ybVar = jcVar.v;
                if (ybVar != null) {
                    ybVar.a(true);
                }
                jcVar.o();
                jcVar.J0.unlock();
                p9 p9Var = jcVar.f1110u1;
                if (p9Var != null) {
                    p9Var.b();
                    AndroidUtilities.removeFromParent(jcVar.f1110u1);
                    jcVar.f1110u1 = null;
                }
                ImageReceiver imageReceiver = gcVar.f913b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    gcVar.f913b = null;
                }
                ImageReceiver imageReceiver2 = gcVar.f914c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    gcVar.f914c.setVisible(true, true);
                }
                if (gcVar.d != null && (t10 = jcVar.t()) != null && (oj0Var = t10.f836o1.d) != null) {
                    oj0 oj0Var2 = gcVar.d;
                    oj0Var2.getClass();
                    oj0Var2.f27089c = oj0Var.f27089c;
                    oj0Var2.f27090f = oj0Var.f27090f;
                    oj0Var2.f27088b = oj0Var.f27088b;
                    oj0Var2.f27087a = System.currentTimeMillis();
                    oj0Var2.c();
                }
                e6 e6Var = jcVar.G0;
                if (e6Var != null) {
                    e6Var.b();
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
                e5 e5Var = jcVar.f1096o1;
                if (e5Var != null) {
                    e5Var.run();
                    jcVar.f1096o1 = null;
                    return;
                }
                return;
            case 1:
                jc jcVar2 = this.f1531b;
                f6 f6Var = null;
                jcVar2.H = null;
                jcVar2.Z = 0.0f;
                jcVar2.f1073d0 = 0.0f;
                zb zbVar = jcVar2.f1093n0;
                if (zbVar != null) {
                    f6Var = zbVar.getCurrentPeerView();
                }
                if (f6Var != null) {
                    f6Var.invalidate();
                    return;
                }
                return;
            default:
                jc jcVar3 = this.f1531b;
                gc gcVar2 = jcVar3.f1105s0;
                jcVar3.U = 1.0f;
                jcVar3.o();
                jc.f1061x1 = false;
                yb ybVar2 = jcVar3.v;
                if (ybVar2 != null) {
                    ybVar2.a(true);
                }
                xb xbVar = jcVar3.f1104s;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = gcVar2.f913b;
                if (imageReceiver3 != null && !jcVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    gcVar2.f913b = null;
                }
                ImageReceiver imageReceiver4 = gcVar2.f914c;
                if (imageReceiver4 != null && !jcVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    gcVar2.f914c.setVisible(true, true);
                    gcVar2.f914c = null;
                }
                f6 t11 = jcVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d2 d2Var = jcVar3.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - jcVar3.V) * jcVar3.U);
                }
                if (jcVar3.f1115w1) {
                    jcVar3.f1115w1 = false;
                    jcVar3.p();
                    AndroidUtilities.runOnUIThread(new e5(jcVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (jcVar3.f1110u1 == null && jcVar3.v != null) {
                        p9 p9Var2 = new p9(jcVar3.v.getContext(), jcVar3.f1104s);
                        jcVar3.f1110u1 = p9Var2;
                        p9Var2.setAlpha(0.0f);
                        jcVar3.v.addView(jcVar3.f1110u1);
                    }
                    p9 p9Var3 = jcVar3.f1110u1;
                    if (p9Var3 != null) {
                        p9Var3.setOnClickListener(new v0(this, 4));
                        jcVar3.f1110u1.animate().alpha(1.0f).setDuration(150L).setListener(new cc(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                jcVar3.P();
                jcVar3.J0.unlock();
                return;
        }
    }
}
