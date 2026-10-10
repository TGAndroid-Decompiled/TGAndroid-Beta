package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.hk0;
public final class tb extends AnimatorListenerAdapter {
    public final int f1774a;
    public final kc f1775b;

    public tb(kc kcVar, int i10) {
        this.f1774a = i10;
        this.f1775b = kcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f6 t10;
        hk0 hk0Var;
        switch (this.f1774a) {
            case 0:
                super.onAnimationEnd(animator);
                kc kcVar = this.f1775b;
                hc hcVar = kcVar.f1295s0;
                zb zbVar = kcVar.v;
                if (zbVar != null) {
                    zbVar.a(true);
                }
                kcVar.o();
                kcVar.J0.unlock();
                q9 q9Var = kcVar.f1300u1;
                if (q9Var != null) {
                    q9Var.b();
                    AndroidUtilities.removeFromParent(kcVar.f1300u1);
                    kcVar.f1300u1 = null;
                }
                ImageReceiver imageReceiver = hcVar.f1106b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    hcVar.f1106b = null;
                }
                ImageReceiver imageReceiver2 = hcVar.f1107c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    hcVar.f1107c.setVisible(true, true);
                }
                if (hcVar.d != null && (t10 = kcVar.t()) != null && (hk0Var = t10.f991o1.d) != null) {
                    hk0 hk0Var2 = hcVar.d;
                    hk0Var2.getClass();
                    hk0Var2.f27053c = hk0Var.f27053c;
                    hk0Var2.f27055f = hk0Var.f27055f;
                    hk0Var2.f27052b = hk0Var.f27052b;
                    hk0Var2.f27051a = System.currentTimeMillis();
                    hk0Var2.c();
                }
                e6 e6Var = kcVar.G0;
                if (e6Var != null) {
                    e6Var.b();
                }
                SurfaceView surfaceView = kcVar.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                kcVar.I();
                try {
                    AndroidUtilities.runOnUIThread(new a3.d(this, 22));
                } catch (Exception unused) {
                }
                kcVar.m0 = false;
                kcVar.d = false;
                e5 e5Var = kcVar.f1286o1;
                if (e5Var != null) {
                    e5Var.run();
                    kcVar.f1286o1 = null;
                    return;
                }
                return;
            case 1:
                kc kcVar2 = this.f1775b;
                f6 f6Var = null;
                kcVar2.H = null;
                kcVar2.Z = 0.0f;
                kcVar2.f1262d0 = 0.0f;
                ac acVar = kcVar2.f1283n0;
                if (acVar != null) {
                    f6Var = acVar.getCurrentPeerView();
                }
                if (f6Var != null) {
                    f6Var.invalidate();
                    return;
                }
                return;
            default:
                kc kcVar3 = this.f1775b;
                hc hcVar2 = kcVar3.f1295s0;
                kcVar3.U = 1.0f;
                kcVar3.o();
                kc.f1250x1 = false;
                zb zbVar2 = kcVar3.v;
                if (zbVar2 != null) {
                    zbVar2.a(true);
                }
                yb ybVar = kcVar3.f1294s;
                if (ybVar != null) {
                    ybVar.invalidate();
                }
                ImageReceiver imageReceiver3 = hcVar2.f1106b;
                if (imageReceiver3 != null && !kcVar3.d) {
                    imageReceiver3.setVisible(true, true);
                    hcVar2.f1106b = null;
                }
                ImageReceiver imageReceiver4 = hcVar2.f1107c;
                if (imageReceiver4 != null && !kcVar3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    hcVar2.f1107c.setVisible(true, true);
                    hcVar2.f1107c = null;
                }
                f6 t11 = kcVar3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d2 d2Var = kcVar3.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - kcVar3.V) * kcVar3.U);
                }
                if (kcVar3.f1305w1) {
                    kcVar3.f1305w1 = false;
                    kcVar3.p();
                    AndroidUtilities.runOnUIThread(new e5(kcVar3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (kcVar3.f1300u1 == null && kcVar3.v != null) {
                        q9 q9Var2 = new q9(kcVar3.v.getContext(), kcVar3.f1294s);
                        kcVar3.f1300u1 = q9Var2;
                        q9Var2.setAlpha(0.0f);
                        kcVar3.v.addView(kcVar3.f1300u1);
                    }
                    q9 q9Var3 = kcVar3.f1300u1;
                    if (q9Var3 != null) {
                        q9Var3.setOnClickListener(new v0(this, 4));
                        kcVar3.f1300u1.animate().alpha(1.0f).setDuration(150L).setListener(new dc(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                kcVar3.P();
                kcVar3.J0.unlock();
                return;
        }
    }
}
