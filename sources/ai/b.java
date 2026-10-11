package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.k01;
public final class b extends AnimatorListenerAdapter {
    public final int f658a;
    public final Object f659b;

    public b(Object obj, int i10) {
        this.f658a = i10;
        this.f659b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f658a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f659b;
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
        int i10 = this.f658a;
        Object obj = this.f659b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f851p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1380a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    h1Var.J = ofFloat;
                    ofFloat.addUpdateListener(new a(this, 5));
                    h1Var.J.setStartDelay(3000L);
                    h1Var.J.setDuration(550L);
                    h1Var.J.setInterpolator(new LinearInterpolator());
                    h1Var.J.start();
                    return;
                }
                return;
            case 3:
                ((n2) obj).I = null;
                return;
            case 4:
                b4 b4Var = (b4) obj;
                b4Var.f703s5.invalidate();
                b4Var.setAnimatedTop(0);
                b4Var.f703s5.V2 = true;
                View view = b4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    b4Var.G1.setTranslationY(((1.0f - b4Var.getTopViewEnterProgress()) * b4Var.G1.getLayoutParams().height) + b4Var.T1);
                }
                b4Var.f703s5.f964e2 = null;
                return;
            case 5:
                b6 b6Var = (b6) obj;
                b6Var.f713c[1].setVisibility(8);
                b6Var.f713c[0].setAlpha(1.0f);
                b6Var.f713c[0].setTranslationY(0.0f);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                k01 k01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                k01Var.R = 1.0f;
                k01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 7:
                ((n6) obj).M = null;
                return;
            case 8:
                z6 z6Var = (z6) obj;
                z6Var.f2015w = null;
                z6Var.f2013r = 1.0f;
                z6Var.invalidate();
                return;
            case 9:
            default:
                super.onAnimationEnd(animator);
                return;
            case 10:
                xa xaVar = (xa) obj;
                xaVar.H = false;
                xaVar.G = 0.0f;
                xaVar.invalidate();
                xaVar.requestLayout();
                xaVar.J.requestLayout();
                return;
            case 11:
                ci.m mVar = ((ci.g) obj).f5113c0;
                if (mVar.f5556g0 == animator) {
                    mVar.f5556g0 = null;
                    mVar.f5554f.getEditText().setScrollY(mVar.f5548b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4887l = 1.0f;
                ci.e0 e0Var = d0Var.f4891p;
                if (e0Var.f5005n.contains(d0Var)) {
                    d0Var.f4880c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f4881e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f4881e = null;
                    }
                    d0Var.f4882f = false;
                    e0Var.f5005n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 13:
                ci.v3 v3Var = ((ci.c3) obj).h;
                v3Var.F.setVisibility(8);
                v3Var.d.setVisibility(8);
                return;
            case 14:
                ci.d4 d4Var = (ci.d4) obj;
                d4Var.f4920o0 = 1.0f;
                d4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.f5638c;
                n6Var.f5638c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).f6007w = null;
                return;
            case 17:
                ci.o7 o7Var = (ci.o7) obj;
                if (o7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o7Var.getParent()).removeView(o7Var);
                    return;
                }
                return;
            case 18:
                ((ci.y9) obj).N = false;
                return;
            case 19:
                ci.w9 w9Var = (ci.w9) obj;
                w9Var.setTranslationY(0.0f);
                w9Var.d = null;
                return;
            case 20:
                ei.y yVar = (ei.y) obj;
                yVar.setVisibility(8);
                yVar.f9492a = null;
                return;
            case 21:
                ((ei.k3) obj).f9184y.setVisibility(8);
                return;
            case 22:
                ((ei.p4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f12177i1) {
                    gVar.f12192u0 = false;
                    gVar.f12191t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f12170f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f24164c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj;
                Runnable runnable = h4Var.f38299a0;
                if (runnable != null) {
                    runnable.run();
                    h4Var.f38299a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                u3Var.f42376w = 1.0f;
                u3Var.n();
                u3Var.i();
                u3Var.h();
                u3Var.f42368a.unlock();
                return;
            case 29:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) obj;
                p4Var.getClass();
                p4Var.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f658a) {
            case 9:
                super.onAnimationStart(animator);
                q9 q9Var = (q9) this.f659b;
                dk0 dk0Var = ((p9) q9Var.f1625a.get(q9Var.d)).f1581c;
                dk0Var.L = 2;
                dk0Var.start();
                return;
            case 29:
                ((org.telegram.ui.p4) this.f659b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
