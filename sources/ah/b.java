package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bi.a9;
import bi.b2;
import bi.b9;
import bi.ga;
import bi.k6;
import bi.m5;
import bi.q3;
import bi.y5;
import di.c3;
import di.d4;
import di.l6;
import di.n7;
import di.r6;
import di.v3;
import di.v9;
import di.x9;
import fi.k3;
import fi.q4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
public final class b extends AnimatorListenerAdapter {
    public final int f654a;
    public final Object f655b;

    public b(Object obj, int i10) {
        this.f654a = i10;
        this.f655b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f654a) {
            case 28:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f655b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        int i10 = this.f654a;
        Object obj = this.f655b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                return;
            case 1:
                f0 f0Var = (f0) obj;
                f0Var.setVisibility(8);
                e0 e0Var = f0Var.f720b;
                if (e0Var != null) {
                    f0Var.removeView(e0Var);
                    f0Var.f720b = null;
                }
                f0Var.e = null;
                return;
            case 2:
                ((a1) obj).f653x.c();
                return;
            case 3:
                bi.a aVar = (bi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((bi.u) obj).O.f3336p = false;
                return;
            case 5:
                bi.z0 z0Var = (bi.z0) obj;
                bi.e1 e1Var = z0Var.K;
                if (e1Var != null && z0Var.I == e1Var.f2970a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    z0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new c0(this, 6));
                    z0Var.J.setStartDelay(3000L);
                    z0Var.J.setDuration(550L);
                    z0Var.J.setInterpolator(new LinearInterpolator());
                    z0Var.J.start();
                    return;
                }
                return;
            case 6:
                ((b2) obj).I = null;
                return;
            case 7:
                q3 q3Var = (q3) obj;
                q3Var.f3500s5.invalidate();
                q3Var.setAnimatedTop(0);
                q3Var.f3500s5.V2 = true;
                View view = q3Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    q3Var.G1.setTranslationY(((1.0f - q3Var.getTopViewEnterProgress()) * q3Var.G1.getLayoutParams().height) + q3Var.T1);
                }
                q3Var.f3500s5.f3520e2 = null;
                return;
            case 8:
                m5 m5Var = (m5) obj;
                m5Var.f3311c[1].setVisibility(8);
                m5Var.f3311c[0].setAlpha(1.0f);
                m5Var.f3311c[0].setTranslationY(0.0f);
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                s01 s01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                s01Var.R = 1.0f;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                ((y5) obj).M = null;
                return;
            case 11:
                k6 k6Var = (k6) obj;
                k6Var.f3243w = null;
                k6Var.f3241r = 1.0f;
                k6Var.invalidate();
                return;
            case 12:
            default:
                super.onAnimationEnd(animator);
                return;
            case 13:
                ga gaVar = (ga) obj;
                gaVar.H = false;
                gaVar.G = 0.0f;
                gaVar.invalidate();
                gaVar.requestLayout();
                gaVar.J.requestLayout();
                return;
            case 14:
                di.m mVar = ((di.g) obj).f6965c0;
                if (mVar.f7384g0 == animator) {
                    mVar.f7384g0 = null;
                    mVar.f7382f.getEditText().setScrollY(mVar.f7377b0);
                    return;
                }
                return;
            case 15:
                di.d0 d0Var = (di.d0) obj;
                d0Var.f6773l = 1.0f;
                di.e0 e0Var2 = d0Var.f6777p;
                if (e0Var2.f6870n.contains(d0Var)) {
                    d0Var.f6767c.onDetachedFromWindow();
                    di.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f6768f = false;
                    e0Var2.f6870n.remove(d0Var);
                }
                e0Var2.invalidate();
                return;
            case 16:
                v3 v3Var = ((c3) obj).h;
                v3Var.F.setVisibility(8);
                v3Var.d.setVisibility(8);
                return;
            case 17:
                d4 d4Var = (d4) obj;
                d4Var.f6804o0 = 1.0f;
                d4Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                l6 l6Var = (l6) obj;
                ImageView imageView = l6Var.f7355c;
                l6Var.f7355c = l6Var.d;
                l6Var.d = imageView;
                imageView.bringToFront();
                l6Var.d.setVisibility(8);
                l6Var.h = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((r6) obj).f7717w = null;
                return;
            case 20:
                n7 n7Var = (n7) obj;
                if (n7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n7Var.getParent()).removeView(n7Var);
                    return;
                }
                return;
            case 21:
                ((x9) obj).N = false;
                return;
            case 22:
                v9 v9Var = (v9) obj;
                v9Var.setTranslationY(0.0f);
                v9Var.d = null;
                return;
            case 23:
                fi.x xVar = (fi.x) obj;
                xVar.setVisibility(8);
                xVar.f9650a = null;
                return;
            case 24:
                ((k3) obj).f9383y.setVisibility(8);
                return;
            case 25:
                ((q4) obj).I.setVisibility(8);
                return;
            case 26:
                super.onAnimationEnd(animator);
                jg.g gVar = (jg.g) obj;
                if (!gVar.f13050i1) {
                    gVar.f13065u0 = false;
                    gVar.f13064t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f13043f0 = false;
                return;
            case 27:
                ((lg.e) obj).h.setVisibility(8);
                return;
            case 28:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 29:
                ((CropAreaView) obj).f23128c0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f654a) {
            case 12:
                super.onAnimationStart(animator);
                b9 b9Var = (b9) this.f655b;
                yj0 yj0Var = ((a9) b9Var.f2876a.get(b9Var.d)).f2832c;
                yj0Var.L = 2;
                yj0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
