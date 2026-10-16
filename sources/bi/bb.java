package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ck0;
public final class bb extends AnimatorListenerAdapter {
    public final int f2883a;
    public final sb f2884b;

    public bb(sb sbVar, int i10) {
        this.f2883a = i10;
        this.f2884b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q5 t10;
        ck0 ck0Var;
        switch (this.f2883a) {
            case 0:
                super.onAnimationEnd(animator);
                sb sbVar = this.f2884b;
                pb pbVar = sbVar.f3705s0;
                hb hbVar = sbVar.v;
                if (hbVar != null) {
                    hbVar.a(true);
                }
                sbVar.o();
                sbVar.J0.unlock();
                b9 b9Var = sbVar.f3710u1;
                if (b9Var != null) {
                    b9Var.b();
                    AndroidUtilities.removeFromParent(sbVar.f3710u1);
                    sbVar.f3710u1 = null;
                }
                ImageReceiver imageReceiver = pbVar.f3485b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    pbVar.f3485b = null;
                }
                ImageReceiver imageReceiver2 = pbVar.f3486c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    pbVar.f3486c.setVisible(true, true);
                }
                if (pbVar.d != null && (t10 = sbVar.t()) != null && (ck0Var = t10.f3552o1.d) != null) {
                    ck0 ck0Var2 = pbVar.d;
                    ck0Var2.getClass();
                    ck0Var2.f23750c = ck0Var.f23750c;
                    ck0Var2.f23751f = ck0Var.f23751f;
                    ck0Var2.f23749b = ck0Var.f23749b;
                    ck0Var2.f23748a = System.currentTimeMillis();
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
                r4 r4Var = sbVar.f3696o1;
                if (r4Var != null) {
                    r4Var.run();
                    sbVar.f3696o1 = null;
                    return;
                }
                return;
            case 1:
                sb sbVar2 = this.f2884b;
                q5 q5Var = null;
                sbVar2.H = null;
                sbVar2.Z = 0.0f;
                sbVar2.f3673d0 = 0.0f;
                ib ibVar = sbVar2.f3693n0;
                if (ibVar != null) {
                    q5Var = ibVar.getCurrentPeerView();
                }
                if (q5Var != null) {
                    q5Var.invalidate();
                    return;
                }
                return;
            default:
                sb sbVar3 = this.f2884b;
                pb pbVar2 = sbVar3.f3705s0;
                sbVar3.U = 1.0f;
                sbVar3.o();
                sb.f3661x1 = false;
                hb hbVar2 = sbVar3.v;
                if (hbVar2 != null) {
                    hbVar2.a(true);
                }
                gb gbVar = sbVar3.f3704s;
                if (gbVar != null) {
                    gbVar.invalidate();
                }
                ImageReceiver imageReceiver3 = pbVar2.f3485b;
                if (imageReceiver3 != null && !sbVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    pbVar2.f3485b = null;
                }
                ImageReceiver imageReceiver4 = pbVar2.f3486c;
                if (imageReceiver4 != null && !sbVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    pbVar2.f3486c.setVisible(true, true);
                    pbVar2.f3486c = null;
                }
                q5 t11 = sbVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t1 t1Var = sbVar3.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - sbVar3.V) * sbVar3.U);
                }
                if (sbVar3.f3715w1) {
                    sbVar3.f3715w1 = false;
                    sbVar3.p();
                    AndroidUtilities.runOnUIThread(new r4(sbVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (sbVar3.f3710u1 == null && sbVar3.v != null) {
                        b9 b9Var2 = new b9(sbVar3.v.getContext(), sbVar3.f3704s);
                        sbVar3.f3710u1 = b9Var2;
                        b9Var2.setAlpha(0.0f);
                        sbVar3.v.addView(sbVar3.f3710u1);
                    }
                    b9 b9Var3 = sbVar3.f3710u1;
                    if (b9Var3 != null) {
                        b9Var3.setOnClickListener(new ah.g0(this, 6));
                        sbVar3.f3710u1.animate().alpha(1.0f).setDuration(150L).setListener(new lb(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                sbVar3.P();
                sbVar3.J0.unlock();
                return;
        }
    }
}
