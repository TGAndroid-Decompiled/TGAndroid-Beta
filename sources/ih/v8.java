package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.qi0;
public final class v8 extends AnimatorListenerAdapter {
    public final int f12264a;
    public final m9 f12265b;

    public v8(m9 m9Var, int i9) {
        this.f12264a = i9;
        this.f12265b = m9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 t10;
        qi0 qi0Var;
        switch (this.f12264a) {
            case 0:
                super.onAnimationEnd(animator);
                m9 m9Var = this.f12265b;
                j9 j9Var = m9Var.f11815o0;
                b9 b9Var = m9Var.v;
                if (b9Var != null) {
                    b9Var.a(true);
                }
                m9Var.o();
                m9Var.F0.unlock();
                z6 z6Var = m9Var.f11820q1;
                if (z6Var != null) {
                    z6Var.b();
                    AndroidUtilities.removeFromParent(m9Var.f11820q1);
                    m9Var.f11820q1 = null;
                }
                ImageReceiver imageReceiver = j9Var.f11643b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    j9Var.f11643b = null;
                }
                ImageReceiver imageReceiver2 = j9Var.f11644c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    j9Var.f11644c.setVisible(true, true);
                }
                if (j9Var.d != null && (t10 = m9Var.t()) != null && (qi0Var = t10.f11560k1.d) != null) {
                    qi0 qi0Var2 = j9Var.d;
                    qi0Var2.getClass();
                    qi0Var2.f31956c = qi0Var.f31956c;
                    qi0Var2.f31958f = qi0Var.f31958f;
                    qi0Var2.f31955b = qi0Var.f31955b;
                    qi0Var2.f31954a = System.currentTimeMillis();
                    qi0Var2.c();
                }
                h4 h4Var = m9Var.C0;
                if (h4Var != null) {
                    h4Var.a();
                }
                SurfaceView surfaceView = m9Var.f11835y0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                m9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new g(this, 20));
                } catch (Exception unused) {
                }
                m9Var.f11804i0 = false;
                m9Var.d = false;
                n3 n3Var = m9Var.f11809k1;
                if (n3Var != null) {
                    n3Var.run();
                    m9Var.f11809k1 = null;
                    return;
                }
                return;
            case 1:
                m9 m9Var2 = this.f12265b;
                i4 i4Var = null;
                m9Var2.D = null;
                m9Var2.V = 0.0f;
                m9Var2.Z = 0.0f;
                c9 c9Var = m9Var2.f11806j0;
                if (c9Var != null) {
                    i4Var = c9Var.getCurrentPeerView();
                }
                if (i4Var != null) {
                    i4Var.invalidate();
                    return;
                }
                return;
            default:
                m9 m9Var3 = this.f12265b;
                j9 j9Var2 = m9Var3.f11815o0;
                m9Var3.Q = 1.0f;
                m9Var3.o();
                m9.f11776t1 = false;
                b9 b9Var2 = m9Var3.v;
                if (b9Var2 != null) {
                    b9Var2.a(true);
                }
                a9 a9Var = m9Var3.f11824s;
                if (a9Var != null) {
                    a9Var.invalidate();
                }
                ImageReceiver imageReceiver3 = j9Var2.f11643b;
                if (imageReceiver3 != null && !m9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    j9Var2.f11643b = null;
                }
                ImageReceiver imageReceiver4 = j9Var2.f11644c;
                if (imageReceiver4 != null && !m9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    j9Var2.f11644c.setVisible(true, true);
                    j9Var2.f11644c = null;
                }
                i4 t11 = m9Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                f1 f1Var = m9Var3.f11831w0;
                if (f1Var != null) {
                    f1Var.v((1.0f - m9Var3.R) * m9Var3.Q);
                }
                if (m9Var3.f11826s1) {
                    m9Var3.f11826s1 = false;
                    m9Var3.p();
                    AndroidUtilities.runOnUIThread(new n3(m9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (m9Var3.f11820q1 == null && m9Var3.v != null) {
                        z6 z6Var2 = new z6(m9Var3.v.getContext(), m9Var3.f11824s);
                        m9Var3.f11820q1 = z6Var2;
                        z6Var2.setAlpha(0.0f);
                        m9Var3.v.addView(m9Var3.f11820q1);
                    }
                    z6 z6Var3 = m9Var3.f11820q1;
                    if (z6Var3 != null) {
                        z6Var3.setOnClickListener(new androidx.mediarouter.app.c(this, 23));
                        m9Var3.f11820q1.animate().alpha(1.0f).setDuration(150L).setListener(new f9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                m9Var3.P();
                m9Var3.F0.unlock();
                return;
        }
    }
}
