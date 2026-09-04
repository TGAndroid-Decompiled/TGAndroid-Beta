package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bj0;
public final class ya extends AnimatorListenerAdapter {
    public final int f4024a;
    public final pb f4025b;

    public ya(pb pbVar, int i10) {
        this.f4024a = i10;
        this.f4025b = pbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o5 t10;
        bj0 bj0Var;
        switch (this.f4024a) {
            case 0:
                super.onAnimationEnd(animator);
                pb pbVar = this.f4025b;
                mb mbVar = pbVar.f3573s0;
                eb ebVar = pbVar.v;
                if (ebVar != null) {
                    ebVar.a(true);
                }
                pbVar.o();
                pbVar.J0.unlock();
                y8 y8Var = pbVar.f3578u1;
                if (y8Var != null) {
                    y8Var.b();
                    AndroidUtilities.removeFromParent(pbVar.f3578u1);
                    pbVar.f3578u1 = null;
                }
                ImageReceiver imageReceiver = mbVar.f3334b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    mbVar.f3334b = null;
                }
                ImageReceiver imageReceiver2 = mbVar.f3335c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    mbVar.f3335c.setVisible(true, true);
                }
                if (mbVar.d != null && (t10 = pbVar.t()) != null && (bj0Var = t10.f3445o1.d) != null) {
                    bj0 bj0Var2 = mbVar.d;
                    bj0Var2.getClass();
                    bj0Var2.f24720c = bj0Var.f24720c;
                    bj0Var2.f24722f = bj0Var.f24722f;
                    bj0Var2.f24719b = bj0Var.f24719b;
                    bj0Var2.f24718a = System.currentTimeMillis();
                    bj0Var2.c();
                }
                n5 n5Var = pbVar.G0;
                if (n5Var != null) {
                    n5Var.b();
                }
                SurfaceView surfaceView = pbVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                pbVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new oa(this, 2));
                } catch (Exception unused) {
                }
                pbVar.m0 = false;
                pbVar.d = false;
                p4 p4Var = pbVar.f3564o1;
                if (p4Var != null) {
                    p4Var.run();
                    pbVar.f3564o1 = null;
                    return;
                }
                return;
            case 1:
                pb pbVar2 = this.f4025b;
                o5 o5Var = null;
                pbVar2.H = null;
                pbVar2.Z = 0.0f;
                pbVar2.f3540d0 = 0.0f;
                fb fbVar = pbVar2.f3561n0;
                if (fbVar != null) {
                    o5Var = fbVar.getCurrentPeerView();
                }
                if (o5Var != null) {
                    o5Var.invalidate();
                    return;
                }
                return;
            default:
                pb pbVar3 = this.f4025b;
                mb mbVar2 = pbVar3.f3573s0;
                pbVar3.U = 1.0f;
                pbVar3.o();
                pb.f3528x1 = false;
                eb ebVar2 = pbVar3.v;
                if (ebVar2 != null) {
                    ebVar2.a(true);
                }
                db dbVar = pbVar3.f3572s;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = mbVar2.f3334b;
                if (imageReceiver3 != null && !pbVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    mbVar2.f3334b = null;
                }
                ImageReceiver imageReceiver4 = mbVar2.f3335c;
                if (imageReceiver4 != null && !pbVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    mbVar2.f3335c.setVisible(true, true);
                    mbVar2.f3335c = null;
                }
                o5 t11 = pbVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t1 t1Var = pbVar3.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - pbVar3.V) * pbVar3.U);
                }
                if (pbVar3.f3583w1) {
                    pbVar3.f3583w1 = false;
                    pbVar3.p();
                    AndroidUtilities.runOnUIThread(new p4(pbVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (pbVar3.f3578u1 == null && pbVar3.v != null) {
                        y8 y8Var2 = new y8(pbVar3.v.getContext(), pbVar3.f3572s);
                        pbVar3.f3578u1 = y8Var2;
                        y8Var2.setAlpha(0.0f);
                        pbVar3.v.addView(pbVar3.f3578u1);
                    }
                    y8 y8Var3 = pbVar3.f3578u1;
                    if (y8Var3 != null) {
                        y8Var3.setOnClickListener(new ah.h0(this, 6));
                        pbVar3.f3578u1.animate().alpha(1.0f).setDuration(150L).setListener(new ib(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                pbVar3.P();
                pbVar3.J0.unlock();
                return;
        }
    }
}
