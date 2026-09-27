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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f01;
public final class b extends AnimatorListenerAdapter {
    public final int f545a;
    public final Object f546b;

    public b(Object obj, int i10) {
        this.f545a = i10;
        this.f546b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f545a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f546b;
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
        int i10 = this.f545a;
        Object obj = this.f546b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f671p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1228a) {
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
                ((m2) obj).I = null;
                return;
            case 4:
                a4 a4Var = (a4) obj;
                a4Var.f516s5.invalidate();
                a4Var.setAnimatedTop(0);
                a4Var.f516s5.V2 = true;
                View view = a4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var.G1.setTranslationY(((1.0f - a4Var.getTopViewEnterProgress()) * a4Var.G1.getLayoutParams().height) + a4Var.T1);
                }
                a4Var.f516s5.f788e2 = null;
                return;
            case 5:
                a6 a6Var = (a6) obj;
                a6Var.f525c[1].setVisibility(8);
                a6Var.f525c[0].setAlpha(1.0f);
                a6Var.f525c[0].setTranslationY(0.0f);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                f01 f01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                f01Var.R = 1.0f;
                f01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 7:
                ((m6) obj).M = null;
                return;
            case 8:
                y6 y6Var = (y6) obj;
                y6Var.f1757w = null;
                y6Var.f1755r = 1.0f;
                y6Var.invalidate();
                return;
            case 9:
            default:
                super.onAnimationEnd(animator);
                return;
            case 10:
                wa waVar = (wa) obj;
                waVar.H = false;
                waVar.G = 0.0f;
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
                return;
            case 11:
                ci.m mVar = ((ci.g) obj).f4723c0;
                if (mVar.f5124g0 == animator) {
                    mVar.f5124g0 = null;
                    mVar.f5122f.getEditText().setScrollY(mVar.f5117b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4513l = 1.0f;
                ci.e0 e0Var = d0Var.f4517p;
                if (e0Var.f4586n.contains(d0Var)) {
                    d0Var.f4507c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
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
                    d0Var.f4508f = false;
                    e0Var.f4586n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 13:
                ci.w3 w3Var = ((ci.d3) obj).h;
                w3Var.F.setVisibility(8);
                w3Var.d.setVisibility(8);
                return;
            case 14:
                ci.e4 e4Var = (ci.e4) obj;
                e4Var.f4628o0 = 1.0f;
                e4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.f5209c;
                n6Var.f5209c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).f5561w = null;
                return;
            case 17:
                ci.o7 o7Var = (ci.o7) obj;
                if (o7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o7Var.getParent()).removeView(o7Var);
                    return;
                }
                return;
            case 18:
                ((ci.x9) obj).N = false;
                return;
            case 19:
                ci.v9 v9Var = (ci.v9) obj;
                v9Var.setTranslationY(0.0f);
                v9Var.d = null;
                return;
            case 20:
                ei.y yVar = (ei.y) obj;
                yVar.setVisibility(8);
                yVar.f8723a = null;
                return;
            case 21:
                ((ei.k3) obj).f8442y.setVisibility(8);
                return;
            case 22:
                ((ei.q4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f11141i1) {
                    gVar.f11156u0 = false;
                    gVar.f11155t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f11134f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f22233c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj;
                Runnable runnable = j4Var.f34607a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.f34607a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.w3 w3Var2 = (org.telegram.ui.w3) obj;
                w3Var2.f38800w = 1.0f;
                w3Var2.n();
                w3Var2.i();
                w3Var2.h();
                w3Var2.f38793a.unlock();
                return;
            case 29:
                org.telegram.ui.s4 s4Var = (org.telegram.ui.s4) obj;
                s4Var.getClass();
                s4Var.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f545a) {
            case 9:
                super.onAnimationStart(animator);
                p9 p9Var = (p9) this.f546b;
                kj0 kj0Var = ((o9) p9Var.f1399a.get(p9Var.d)).f1361c;
                kj0Var.L = 2;
                kj0Var.start();
                return;
            case 29:
                ((org.telegram.ui.s4) this.f546b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
