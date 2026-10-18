package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.yj0;
public final class i9 extends AnimatorListenerAdapter {
    public final int f5455a;
    public final z9 f5456b;

    public i9(z9 z9Var, int i10) {
        this.f5455a = i10;
        this.f5456b = z9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p4 t10;
        yj0 yj0Var;
        switch (this.f5455a) {
            case 0:
                super.onAnimationEnd(animator);
                z9 z9Var = this.f5456b;
                w9 w9Var = z9Var.f6250s0;
                o9 o9Var = z9Var.v;
                if (o9Var != null) {
                    o9Var.a(true);
                }
                z9Var.o();
                z9Var.J0.unlock();
                l7 l7Var = z9Var.f6255u1;
                if (l7Var != null) {
                    l7Var.b();
                    AndroidUtilities.removeFromParent(z9Var.f6255u1);
                    z9Var.f6255u1 = null;
                }
                ImageReceiver imageReceiver = w9Var.f6061b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    w9Var.f6061b = null;
                }
                ImageReceiver imageReceiver2 = w9Var.f6062c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    w9Var.f6062c.setVisible(true, true);
                }
                if (w9Var.d != null && (t10 = z9Var.t()) != null && (yj0Var = t10.f5689o1.d) != null) {
                    yj0 yj0Var2 = w9Var.d;
                    yj0Var2.getClass();
                    yj0Var2.f32654c = yj0Var.f32654c;
                    yj0Var2.f32655f = yj0Var.f32655f;
                    yj0Var2.f32653b = yj0Var.f32653b;
                    yj0Var2.f32652a = System.currentTimeMillis();
                    yj0Var2.c();
                }
                o4 o4Var = z9Var.G0;
                if (o4Var != null) {
                    o4Var.b();
                }
                SurfaceView surfaceView = z9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                z9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 26));
                } catch (Exception unused) {
                }
                z9Var.m0 = false;
                z9Var.d = false;
                s3 s3Var = z9Var.f6241o1;
                if (s3Var != null) {
                    s3Var.run();
                    z9Var.f6241o1 = null;
                    return;
                }
                return;
            case 1:
                z9 z9Var2 = this.f5456b;
                p4 p4Var = null;
                z9Var2.H = null;
                z9Var2.Z = 0.0f;
                z9Var2.f6218d0 = 0.0f;
                p9 p9Var = z9Var2.f6238n0;
                if (p9Var != null) {
                    p4Var = p9Var.getCurrentPeerView();
                }
                if (p4Var != null) {
                    p4Var.invalidate();
                    return;
                }
                return;
            default:
                z9 z9Var3 = this.f5456b;
                w9 w9Var2 = z9Var3.f6250s0;
                z9Var3.U = 1.0f;
                z9Var3.o();
                z9.f6206x1 = false;
                o9 o9Var2 = z9Var3.v;
                if (o9Var2 != null) {
                    o9Var2.a(true);
                }
                n9 n9Var = z9Var3.f6249s;
                if (n9Var != null) {
                    n9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = w9Var2.f6061b;
                if (imageReceiver3 != null && !z9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    w9Var2.f6061b = null;
                }
                ImageReceiver imageReceiver4 = w9Var2.f6062c;
                if (imageReceiver4 != null && !z9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    w9Var2.f6062c.setVisible(true, true);
                    w9Var2.f6062c = null;
                }
                p4 t11 = z9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                h1 h1Var = z9Var3.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - z9Var3.V) * z9Var3.U);
                }
                if (z9Var3.f6260w1) {
                    z9Var3.f6260w1 = false;
                    z9Var3.p();
                    AndroidUtilities.runOnUIThread(new s3(z9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (z9Var3.f6255u1 == null && z9Var3.v != null) {
                        l7 l7Var2 = new l7(z9Var3.v.getContext(), z9Var3.f6249s);
                        z9Var3.f6255u1 = l7Var2;
                        l7Var2.setAlpha(0.0f);
                        z9Var3.v.addView(z9Var3.f6255u1);
                    }
                    l7 l7Var3 = z9Var3.f6255u1;
                    if (l7Var3 != null) {
                        l7Var3.setOnClickListener(new ah.g0(this, 16));
                        z9Var3.f6255u1.animate().alpha(1.0f).setDuration(150L).setListener(new s9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                z9Var3.P();
                z9Var3.J0.unlock();
                return;
        }
    }
}
