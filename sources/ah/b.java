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
import bi.a2;
import bi.da;
import bi.h6;
import bi.k5;
import bi.n3;
import bi.w5;
import bi.x8;
import bi.y8;
import di.ba;
import di.e3;
import di.f4;
import di.n6;
import di.q7;
import di.t6;
import di.x3;
import di.z9;
import fi.k3;
import fi.r4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
public final class b extends AnimatorListenerAdapter {
    public final int f441a;
    public final Object f442b;

    public b(Object obj, int i10) {
        this.f441a = i10;
        this.f442b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f441a) {
            case 28:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f442b;
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
        int i10 = this.f441a;
        Object obj = this.f442b;
        switch (i10) {
            case 0:
                ((a1.e) obj).run();
                return;
            case 1:
                g0 g0Var = (g0) obj;
                g0Var.setVisibility(8);
                f0 f0Var = g0Var.f536b;
                if (f0Var != null) {
                    g0Var.removeView(f0Var);
                    g0Var.f536b = null;
                }
                g0Var.f538e = null;
                return;
            case 2:
                ((b1) obj).f463x.c();
                return;
            case 3:
                bi.a aVar = (bi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((bi.u) obj).O.f3160p = false;
                return;
            case 5:
                bi.z0 z0Var = (bi.z0) obj;
                bi.e1 e1Var = z0Var.K;
                if (e1Var != null && z0Var.I == e1Var.f2898a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    z0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new d0(this, 6));
                    z0Var.J.setStartDelay(3000L);
                    z0Var.J.setDuration(550L);
                    z0Var.J.setInterpolator(new LinearInterpolator());
                    z0Var.J.start();
                    return;
                }
                return;
            case 6:
                ((a2) obj).I = null;
                return;
            case 7:
                n3 n3Var = (n3) obj;
                n3Var.f3359r5.invalidate();
                n3Var.setAnimatedTop(0);
                n3Var.f3359r5.V2 = true;
                View view = n3Var.F1;
                if (view != null && view.getVisibility() == 0) {
                    n3Var.F1.setTranslationY(((1.0f - n3Var.getTopViewEnterProgress()) * n3Var.F1.getLayoutParams().height) + n3Var.S1);
                }
                n3Var.f3359r5.f3418e2 = null;
                return;
            case 8:
                k5 k5Var = (k5) obj;
                k5Var.f3197c[1].setVisibility(8);
                k5Var.f3197c[0].setAlpha(1.0f);
                k5Var.f3197c[0].setTranslationY(0.0f);
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                n01 n01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                n01Var.R = 1.0f;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                ((w5) obj).M = null;
                return;
            case 11:
                h6 h6Var = (h6) obj;
                h6Var.f3063w = null;
                h6Var.f3061r = 1.0f;
                h6Var.invalidate();
                return;
            case 12:
            default:
                super.onAnimationEnd(animator);
                return;
            case 13:
                da daVar = (da) obj;
                daVar.H = false;
                daVar.G = 0.0f;
                daVar.invalidate();
                daVar.requestLayout();
                daVar.J.requestLayout();
                return;
            case 14:
                di.m mVar = ((di.g) obj).f7257c0;
                if (mVar.f7595g0 == animator) {
                    mVar.f7595g0 = null;
                    mVar.f7593f.getEditText().setScrollY(mVar.f7587b0);
                    return;
                }
                return;
            case 15:
                di.d0 d0Var = (di.d0) obj;
                d0Var.f7034l = 1.0f;
                di.e0 e0Var = d0Var.f7038p;
                if (e0Var.f7136n.contains(d0Var)) {
                    d0Var.f7027c.onDetachedFromWindow();
                    di.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f7028e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f7028e = null;
                    }
                    d0Var.f7029f = false;
                    e0Var.f7136n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 16:
                x3 x3Var = ((e3) obj).h;
                x3Var.F.setVisibility(8);
                x3Var.d.setVisibility(8);
                return;
            case 17:
                f4 f4Var = (f4) obj;
                f4Var.f7213o0 = 1.0f;
                f4Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                n6 n6Var = (n6) obj;
                ImageView imageView = n6Var.f7684c;
                n6Var.f7684c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((t6) obj).f8199w = null;
                return;
            case 20:
                q7 q7Var = (q7) obj;
                if (q7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) q7Var.getParent()).removeView(q7Var);
                    return;
                }
                return;
            case 21:
                ((ba) obj).N = false;
                return;
            case 22:
                z9 z9Var = (z9) obj;
                z9Var.setTranslationY(0.0f);
                z9Var.d = null;
                return;
            case 23:
                fi.y yVar = (fi.y) obj;
                yVar.setVisibility(8);
                yVar.f10098a = null;
                return;
            case 24:
                ((k3) obj).f9791y.setVisibility(8);
                return;
            case 25:
                ((r4) obj).I.setVisibility(8);
                return;
            case 26:
                super.onAnimationEnd(animator);
                jg.g gVar = (jg.g) obj;
                if (!gVar.f13676i1) {
                    gVar.f13691u0 = false;
                    gVar.f13690t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f13669f0 = false;
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
                ((CropAreaView) obj).f23946c0 = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f441a) {
            case 12:
                super.onAnimationStart(animator);
                y8 y8Var = (y8) this.f442b;
                xi0 xi0Var = ((x8) y8Var.f4020a.get(y8Var.d)).f3992c;
                xi0Var.M = 2;
                xi0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
