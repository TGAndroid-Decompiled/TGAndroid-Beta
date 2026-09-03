package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.lj0;
public final class r8 extends AnimatorListenerAdapter {
    public final int f17702a;
    public final i9 f17703b;

    public r8(i9 i9Var, int i10) {
        this.f17702a = i10;
        this.f17703b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f4 t6;
        lj0 lj0Var;
        switch (this.f17702a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f17703b;
                f9 f9Var = i9Var.f17288p0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.G0.unlock();
                x6 x6Var = i9Var.f17294r1;
                if (x6Var != null) {
                    x6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.f17294r1);
                    i9Var.f17294r1 = null;
                }
                ImageReceiver imageReceiver = f9Var.f17147b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.f17147b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.f17148c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.f17148c.setVisible(true, true);
                }
                if (f9Var.d != null && (t6 = i9Var.t()) != null && (lj0Var = t6.l1.d) != null) {
                    lj0 lj0Var2 = f9Var.d;
                    lj0Var2.getClass();
                    lj0Var2.f28778c = lj0Var.f28778c;
                    lj0Var2.f28780f = lj0Var.f28780f;
                    lj0Var2.f28777b = lj0Var.f28777b;
                    lj0Var2.f28776a = System.currentTimeMillis();
                    lj0Var2.c();
                }
                e4 e4Var = i9Var.D0;
                if (e4Var != null) {
                    e4Var.a();
                }
                SurfaceView surfaceView = i9Var.f17308z0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new t3(this, 14));
                } catch (Exception unused) {
                }
                i9Var.f17277j0 = false;
                i9Var.d = false;
                l3 l3Var = i9Var.l1;
                if (l3Var != null) {
                    l3Var.run();
                    i9Var.l1 = null;
                    return;
                }
                return;
            case 1:
                i9 i9Var2 = this.f17703b;
                f4 f4Var = null;
                i9Var2.E = null;
                i9Var2.W = 0.0f;
                i9Var2.f17255a0 = 0.0f;
                y8 y8Var = i9Var2.f17279k0;
                if (y8Var != null) {
                    f4Var = y8Var.getCurrentPeerView();
                }
                if (f4Var != null) {
                    f4Var.invalidate();
                    return;
                }
                return;
            default:
                i9 i9Var3 = this.f17703b;
                f9 f9Var2 = i9Var3.f17288p0;
                i9Var3.R = 1.0f;
                i9Var3.o();
                i9.f17248u1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.f17295s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.f17147b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.f17147b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.f17148c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.f17148c.setVisible(true, true);
                    f9Var2.f17148c = null;
                }
                f4 t9 = i9Var3.t();
                if (t9 != null) {
                    t9.f1(false);
                }
                e1 e1Var = i9Var3.f17305x0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var3.S) * i9Var3.R);
                }
                if (i9Var3.f17299t1) {
                    i9Var3.f17299t1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new l3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.f17294r1 == null && i9Var3.v != null) {
                        x6 x6Var2 = new x6(i9Var3.v.getContext(), i9Var3.f17295s);
                        i9Var3.f17294r1 = x6Var2;
                        x6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.f17294r1);
                    }
                    x6 x6Var3 = i9Var3.f17294r1;
                    if (x6Var3 != null) {
                        x6Var3.setOnClickListener(new androidx.mediarouter.app.c(this, 29));
                        i9Var3.f17294r1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.G0.unlock();
                return;
        }
    }
}
