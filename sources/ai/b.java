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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d01;
public final class b extends AnimatorListenerAdapter {
    public final int f542a;
    public final Object f543b;

    public b(Object obj, int i10) {
        this.f542a = i10;
        this.f543b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f542a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f543b;
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
        int i10 = this.f542a;
        Object obj = this.f543b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f668p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1226a) {
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
                a4Var.f513s5.invalidate();
                a4Var.setAnimatedTop(0);
                a4Var.f513s5.V2 = true;
                View view = a4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var.G1.setTranslationY(((1.0f - a4Var.getTopViewEnterProgress()) * a4Var.G1.getLayoutParams().height) + a4Var.T1);
                }
                a4Var.f513s5.f785e2 = null;
                return;
            case 5:
                a6 a6Var = (a6) obj;
                a6Var.f522c[1].setVisibility(8);
                a6Var.f522c[0].setAlpha(1.0f);
                a6Var.f522c[0].setTranslationY(0.0f);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                d01 d01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                d01Var.R = 1.0f;
                d01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 7:
                ((m6) obj).M = null;
                return;
            case 8:
                y6 y6Var = (y6) obj;
                y6Var.f1755w = null;
                y6Var.f1753r = 1.0f;
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
                ci.m mVar = ((ci.g) obj).f4716c0;
                if (mVar.f5123g0 == animator) {
                    mVar.f5123g0 = null;
                    mVar.f5121f.getEditText().setScrollY(mVar.f5116b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4486l = 1.0f;
                ci.e0 e0Var = d0Var.f4490p;
                if (e0Var.f4576n.contains(d0Var)) {
                    d0Var.f4480c.onDetachedFromWindow();
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
                    d0Var.f4481f = false;
                    e0Var.f4576n.remove(d0Var);
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
                e4Var.f4618o0 = 1.0f;
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
                ((ci.t6) obj).f5554w = null;
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
                yVar.f8720a = null;
                return;
            case 21:
                ((ei.k3) obj).f8440y.setVisibility(8);
                return;
            case 22:
                ((ei.q4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f11138i1) {
                    gVar.f11153u0 = false;
                    gVar.f11152t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f11131f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f22230c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj;
                Runnable runnable = i4Var.f34387a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.f34387a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                v3Var.f38625w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.f38618a.unlock();
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
        switch (this.f542a) {
            case 9:
                super.onAnimationStart(animator);
                p9 p9Var = (p9) this.f543b;
                ij0 ij0Var = ((o9) p9Var.f1397a.get(p9Var.d)).f1359c;
                ij0Var.L = 2;
                ij0Var.start();
                return;
            case 29:
                ((org.telegram.ui.q4) this.f543b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
