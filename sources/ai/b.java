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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;
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
                l01 l01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                l01Var.R = 1.0f;
                l01Var.invalidate();
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
                ci.m mVar = ((ci.g) obj).f5114c0;
                if (mVar.f5557g0 == animator) {
                    mVar.f5557g0 = null;
                    mVar.f5555f.getEditText().setScrollY(mVar.f5549b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4888l = 1.0f;
                ci.e0 e0Var = d0Var.f4892p;
                if (e0Var.f5006n.contains(d0Var)) {
                    d0Var.f4881c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f4882e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f4882e = null;
                    }
                    d0Var.f4883f = false;
                    e0Var.f5006n.remove(d0Var);
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
                d4Var.f4921o0 = 1.0f;
                d4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.f5639c;
                n6Var.f5639c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).f6008w = null;
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
                yVar.f9493a = null;
                return;
            case 21:
                ((ei.k3) obj).f9185y.setVisibility(8);
                return;
            case 22:
                ((ei.p4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f12178i1) {
                    gVar.f12193u0 = false;
                    gVar.f12192t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f12171f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f24136c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj;
                Runnable runnable = i4Var.f38493a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.f38493a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.v3 v3Var2 = (org.telegram.ui.v3) obj;
                v3Var2.f42630w = 1.0f;
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                v3Var2.f42622a.unlock();
                return;
            case 29:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) obj;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f658a) {
            case 9:
                super.onAnimationStart(animator);
                q9 q9Var = (q9) this.f659b;
                ck0 ck0Var = ((p9) q9Var.f1625a.get(q9Var.d)).f1581c;
                ck0Var.L = 2;
                ck0Var.start();
                return;
            case 29:
                ((org.telegram.ui.q4) this.f659b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
