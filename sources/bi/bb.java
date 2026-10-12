package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ck0;
public final class bb extends AnimatorListenerAdapter {
    public final int f2879a;
    public final sb f2880b;

    public bb(sb sbVar, int i10) {
        this.f2879a = i10;
        this.f2880b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q5 t10;
        ck0 ck0Var;
        switch (this.f2879a) {
            case 0:
                super.onAnimationEnd(animator);
                sb sbVar = this.f2880b;
                pb pbVar = sbVar.f3701s0;
                hb hbVar = sbVar.v;
                if (hbVar != null) {
                    hbVar.a(true);
                }
                sbVar.o();
                sbVar.J0.unlock();
                b9 b9Var = sbVar.f3706u1;
                if (b9Var != null) {
                    b9Var.b();
                    AndroidUtilities.removeFromParent(sbVar.f3706u1);
                    sbVar.f3706u1 = null;
                }
                ImageReceiver imageReceiver = pbVar.f3481b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    pbVar.f3481b = null;
                }
                ImageReceiver imageReceiver2 = pbVar.f3482c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    pbVar.f3482c.setVisible(true, true);
                }
                if (pbVar.d != null && (t10 = sbVar.t()) != null && (ck0Var = t10.f3548o1.d) != null) {
                    ck0 ck0Var2 = pbVar.d;
                    ck0Var2.getClass();
                    ck0Var2.f24093c = ck0Var.f24093c;
                    ck0Var2.f24094f = ck0Var.f24094f;
                    ck0Var2.f24092b = ck0Var.f24092b;
                    ck0Var2.f24091a = System.currentTimeMillis();
                    ck0Var2.c();
                }
                p5 p5Var = sbVar.G0;
                if (p5Var != null) {
                    p5Var.b();
                }
                SurfaceView surfaceView = sbVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                sbVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new la(this, 3));
                } catch (Exception unused) {
                }
                sbVar.m0 = false;
                sbVar.d = false;
                r4 r4Var = sbVar.f3692o1;
                if (r4Var != null) {
                    r4Var.run();
                    sbVar.f3692o1 = null;
                    return;
                }
                return;
            case 1:
                sb sbVar2 = this.f2880b;
                q5 q5Var = null;
                sbVar2.H = null;
                sbVar2.Z = 0.0f;
                sbVar2.f3669d0 = 0.0f;
                ib ibVar = sbVar2.f3689n0;
                if (ibVar != null) {
                    q5Var = ibVar.getCurrentPeerView();
                }
                if (q5Var != null) {
                    q5Var.invalidate();
                    return;
                }
                return;
            default:
                sb sbVar3 = this.f2880b;
                pb pbVar2 = sbVar3.f3701s0;
                sbVar3.U = 1.0f;
                sbVar3.o();
                sb.f3657x1 = false;
                hb hbVar2 = sbVar3.v;
                if (hbVar2 != null) {
                    hbVar2.a(true);
                }
                gb gbVar = sbVar3.f3700s;
                if (gbVar != null) {
                    gbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = pbVar2.f3481b;
                if (imageReceiver3 != null && !sbVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    pbVar2.f3481b = null;
                }
                ImageReceiver imageReceiver4 = pbVar2.f3482c;
                if (imageReceiver4 != null && !sbVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    pbVar2.f3482c.setVisible(true, true);
                    pbVar2.f3482c = null;
                }
                q5 t11 = sbVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t1 t1Var = sbVar3.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - sbVar3.V) * sbVar3.U);
                }
                if (sbVar3.f3711w1) {
                    sbVar3.f3711w1 = false;
                    sbVar3.p();
                    AndroidUtilities.runOnUIThread(new r4(sbVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (sbVar3.f3706u1 == null && sbVar3.v != null) {
                        b9 b9Var2 = new b9(sbVar3.v.getContext(), sbVar3.f3700s);
                        sbVar3.f3706u1 = b9Var2;
                        b9Var2.setAlpha(0.0f);
                        sbVar3.v.addView(sbVar3.f3706u1);
                    }
                    b9 b9Var3 = sbVar3.f3706u1;
                    if (b9Var3 != null) {
                        b9Var3.setOnClickListener(new ah.g0(this, 6));
                        sbVar3.f3706u1.animate().alpha(1.0f).setDuration(150L).setListener(new lb(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                sbVar3.P();
                sbVar3.J0.unlock();
                return;
        }
    }
}
