package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.kj0;
public final class r8 extends AnimatorListenerAdapter {
    public final int f15832a;
    public final i9 f15833b;

    public r8(i9 i9Var, int i10) {
        this.f15832a = i10;
        this.f15833b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d4 t6;
        kj0 kj0Var;
        switch (this.f15832a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f15833b;
                f9 f9Var = i9Var.f15461p0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.G0.unlock();
                x6 x6Var = i9Var.f15467r1;
                if (x6Var != null) {
                    x6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.f15467r1);
                    i9Var.f15467r1 = null;
                }
                ImageReceiver imageReceiver = f9Var.f15313b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.f15313b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.f15314c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.f15314c.setVisible(true, true);
                }
                if (f9Var.d != null && (t6 = i9Var.t()) != null && (kj0Var = t6.l1.d) != null) {
                    kj0 kj0Var2 = f9Var.d;
                    kj0Var2.getClass();
                    kj0Var2.f26303c = kj0Var.f26303c;
                    kj0Var2.f26304f = kj0Var.f26304f;
                    kj0Var2.f26302b = kj0Var.f26302b;
                    kj0Var2.f26301a = System.currentTimeMillis();
                    kj0Var2.c();
                }
                c4 c4Var = i9Var.D0;
                if (c4Var != null) {
                    c4Var.a();
                }
                SurfaceView surfaceView = i9Var.f15481z0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new n5(this, 11));
                } catch (Exception unused) {
                }
                i9Var.f15450j0 = false;
                i9Var.d = false;
                k3 k3Var = i9Var.l1;
                if (k3Var != null) {
                    k3Var.run();
                    i9Var.l1 = null;
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f15833b;
                d4 d4Var = null;
                i9Var2.E = null;
                i9Var2.W = 0.0f;
                i9Var2.f15429a0 = 0.0f;
                y8 y8Var = i9Var2.f15452k0;
                if (y8Var != null) {
                    d4Var = y8Var.getCurrentPeerView();
                }
                if (d4Var != null) {
                    d4Var.invalidate();
                    return;
                }
                return;
            default:
                i9 i9Var3 = this.f15833b;
                f9 f9Var2 = i9Var3.f15461p0;
                i9Var3.R = 1.0f;
                i9Var3.o();
                i9.f15422u1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.f15468s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.f15313b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.f15313b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.f15314c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.f15314c.setVisible(true, true);
                    f9Var2.f15314c = null;
                }
                d4 t9 = i9Var3.t();
                if (t9 != null) {
                    t9.f1(false);
                }
                e1 e1Var = i9Var3.f15478x0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var3.S) * i9Var3.R);
                }
                if (i9Var3.f15472t1) {
                    i9Var3.f15472t1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new k3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.f15467r1 == null && i9Var3.v != null) {
                        x6 x6Var2 = new x6(i9Var3.v.getContext(), i9Var3.f15468s);
                        i9Var3.f15467r1 = x6Var2;
                        x6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.f15467r1);
                    }
                    x6 x6Var3 = i9Var3.f15467r1;
                    if (x6Var3 != null) {
                        x6Var3.setOnClickListener(new androidx.mediarouter.app.c(this, 29));
                        i9Var3.f15467r1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.G0.unlock();
                return;
        }
    }
}
