package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bj0;
public final class r8 extends AnimatorListenerAdapter {
    public final int f16186a;
    public final i9 f16187b;

    public r8(i9 i9Var, int i10) {
        this.f16186a = i10;
        this.f16187b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d4 t10;
        bj0 bj0Var;
        switch (this.f16186a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f16187b;
                f9 f9Var = i9Var.f15774o0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.F0.unlock();
                w6 w6Var = i9Var.f15779q1;
                if (w6Var != null) {
                    w6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.f15779q1);
                    i9Var.f15779q1 = null;
                }
                ImageReceiver imageReceiver = f9Var.f15602b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.f15602b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.f15603c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.f15603c.setVisible(true, true);
                }
                if (f9Var.d != null && (t10 = i9Var.t()) != null && (bj0Var = t10.f15496k1.d) != null) {
                    bj0 bj0Var2 = f9Var.d;
                    bj0Var2.getClass();
                    bj0Var2.f27127c = bj0Var.f27127c;
                    bj0Var2.f27129f = bj0Var.f27129f;
                    bj0Var2.f27126b = bj0Var.f27126b;
                    bj0Var2.f27125a = System.currentTimeMillis();
                    bj0Var2.c();
                }
                c4 c4Var = i9Var.C0;
                if (c4Var != null) {
                    c4Var.a();
                }
                SurfaceView surfaceView = i9Var.f15794y0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new m5(this, 11));
                } catch (Exception unused) {
                }
                i9Var.f15763i0 = false;
                i9Var.d = false;
                j3 j3Var = i9Var.f15768k1;
                if (j3Var != null) {
                    j3Var.run();
                    i9Var.f15768k1 = null;
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f16187b;
                d4 d4Var = null;
                i9Var2.D = null;
                i9Var2.V = 0.0f;
                i9Var2.Z = 0.0f;
                y8 y8Var = i9Var2.f15765j0;
                if (y8Var != null) {
                    d4Var = y8Var.getCurrentPeerView();
                }
                if (d4Var != null) {
                    d4Var.invalidate();
                    return;
                }
                return;
            default:
                i9 i9Var3 = this.f16187b;
                f9 f9Var2 = i9Var3.f15774o0;
                i9Var3.Q = 1.0f;
                i9Var3.o();
                i9.f15735t1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.f15783s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.f15602b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.f15602b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.f15603c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.f15603c.setVisible(true, true);
                    f9Var2.f15603c = null;
                }
                d4 t11 = i9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                d1 d1Var = i9Var3.f15790w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var3.R) * i9Var3.Q);
                }
                if (i9Var3.f15785s1) {
                    i9Var3.f15785s1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new j3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.f15779q1 == null && i9Var3.v != null) {
                        w6 w6Var2 = new w6(i9Var3.v.getContext(), i9Var3.f15783s);
                        i9Var3.f15779q1 = w6Var2;
                        w6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.f15779q1);
                    }
                    w6 w6Var3 = i9Var3.f15779q1;
                    if (w6Var3 != null) {
                        w6Var3.setOnClickListener(new ag.o(this, 29));
                        i9Var3.f15779q1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.F0.unlock();
                return;
        }
    }
}
