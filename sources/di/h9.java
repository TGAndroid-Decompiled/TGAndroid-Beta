package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bk0;
public final class h9 extends AnimatorListenerAdapter {
    public final int f8655a;
    public final y9 f8656b;

    public h9(y9 y9Var, int i10) {
        this.f8655a = i10;
        this.f8656b = y9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q4 t10;
        bk0 bk0Var;
        switch (this.f8655a) {
            case 0:
                super.onAnimationEnd(animator);
                y9 y9Var = this.f8656b;
                v9 v9Var = y9Var.f9457s0;
                n9 n9Var = y9Var.v;
                if (n9Var != null) {
                    n9Var.a(true);
                }
                y9Var.o();
                y9Var.J0.unlock();
                l7 l7Var = y9Var.f9462u1;
                if (l7Var != null) {
                    l7Var.b();
                    AndroidUtilities.removeFromParent(y9Var.f9462u1);
                    y9Var.f9462u1 = null;
                }
                ImageReceiver imageReceiver = v9Var.f9270b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    v9Var.f9270b = null;
                }
                ImageReceiver imageReceiver2 = v9Var.f9271c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    v9Var.f9271c.setVisible(true, true);
                }
                if (v9Var.d != null && (t10 = y9Var.t()) != null && (bk0Var = t10.f8973d1.d) != null) {
                    bk0 bk0Var2 = v9Var.d;
                    bk0Var2.getClass();
                    bk0Var2.f26878c = bk0Var.f26878c;
                    bk0Var2.f26879f = bk0Var.f26879f;
                    bk0Var2.f26877b = bk0Var.f26877b;
                    bk0Var2.f26876a = System.currentTimeMillis();
                    bk0Var2.c();
                }
                p4 p4Var = y9Var.G0;
                if (p4Var != null) {
                    p4Var.b();
                }
                SurfaceView surfaceView = y9Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                y9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new s8(this, 3));
                } catch (Exception unused) {
                }
                y9Var.m0 = false;
                y9Var.d = false;
                s3 s3Var = y9Var.f9448o1;
                if (s3Var != null) {
                    s3Var.run();
                    y9Var.f9448o1 = null;
                    return;
                }
                return;
            case 1:
                y9 y9Var2 = this.f8656b;
                q4 q4Var = null;
                y9Var2.H = null;
                y9Var2.Z = 0.0f;
                y9Var2.f9425d0 = 0.0f;
                o9 o9Var = y9Var2.f9445n0;
                if (o9Var != null) {
                    q4Var = o9Var.getCurrentPeerView();
                }
                if (q4Var != null) {
                    q4Var.invalidate();
                    return;
                }
                return;
            default:
                y9 y9Var3 = this.f8656b;
                v9 v9Var2 = y9Var3.f9457s0;
                y9Var3.U = 1.0f;
                y9Var3.o();
                y9.f9413x1 = false;
                n9 n9Var2 = y9Var3.v;
                if (n9Var2 != null) {
                    n9Var2.a(true);
                }
                m9 m9Var = y9Var3.f9456s;
                if (m9Var != null) {
                    m9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = v9Var2.f9270b;
                if (imageReceiver3 != null && !y9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    v9Var2.f9270b = null;
                }
                ImageReceiver imageReceiver4 = v9Var2.f9271c;
                if (imageReceiver4 != null && !y9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    v9Var2.f9271c.setVisible(true, true);
                    v9Var2.f9271c = null;
                }
                q4 t11 = y9Var3.t();
                if (t11 != null) {
                    t11.d1(false);
                }
                h1 h1Var = y9Var3.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - y9Var3.V) * y9Var3.U);
                }
                if (y9Var3.f9467w1) {
                    y9Var3.f9467w1 = false;
                    y9Var3.p();
                    AndroidUtilities.runOnUIThread(new s3(y9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (y9Var3.f9462u1 == null && y9Var3.v != null) {
                        l7 l7Var2 = new l7(y9Var3.v.getContext(), y9Var3.f9456s);
                        y9Var3.f9462u1 = l7Var2;
                        l7Var2.setAlpha(0.0f);
                        y9Var3.v.addView(y9Var3.f9462u1);
                    }
                    l7 l7Var3 = y9Var3.f9462u1;
                    if (l7Var3 != null) {
                        l7Var3.setOnClickListener(new ai.s(this, 17));
                        y9Var3.f9462u1.animate().alpha(1.0f).setDuration(150L).setListener(new r9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                y9Var3.P();
                y9Var3.J0.unlock();
                return;
        }
    }
}
