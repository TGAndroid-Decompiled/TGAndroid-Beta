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
    public final int f591a;
    public final Object f592b;

    public b(Object obj, int i10) {
        this.f591a = i10;
        this.f592b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f591a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f592b;
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
        int i10 = this.f591a;
        Object obj = this.f592b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f725p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1325a) {
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
                a4Var.f560s5.invalidate();
                a4Var.setAnimatedTop(0);
                a4Var.f560s5.V2 = true;
                View view = a4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var.G1.setTranslationY(((1.0f - a4Var.getTopViewEnterProgress()) * a4Var.G1.getLayoutParams().height) + a4Var.T1);
                }
                a4Var.f560s5.f853e2 = null;
                return;
            case 5:
                a6 a6Var = (a6) obj;
                a6Var.f570c[1].setVisibility(8);
                a6Var.f570c[0].setAlpha(1.0f);
                a6Var.f570c[0].setTranslationY(0.0f);
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
                y6Var.f1909w = null;
                y6Var.f1907r = 1.0f;
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
                ci.m mVar = ((ci.g) obj).f5104c0;
                if (mVar.f5520g0 == animator) {
                    mVar.f5520g0 = null;
                    mVar.f5518f.getEditText().setScrollY(mVar.f5512b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4878l = 1.0f;
                ci.e0 e0Var = d0Var.f4882p;
                if (e0Var.f4956n.contains(d0Var)) {
                    d0Var.f4871c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f4872e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f4872e = null;
                    }
                    d0Var.f4873f = false;
                    e0Var.f4956n.remove(d0Var);
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
                e4Var.f5001o0 = 1.0f;
                e4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.f5608c;
                n6Var.f5608c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).f5985w = null;
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
                ei.z zVar = (ei.z) obj;
                zVar.setVisibility(8);
                zVar.f9495a = null;
                return;
            case 21:
                ((ei.l3) obj).f9183y.setVisibility(8);
                return;
            case 22:
                ((ei.r4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f12131i1) {
                    gVar.f12146u0 = false;
                    gVar.f12145t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f12124f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f24140c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj;
                Runnable runnable = i4Var.f37263a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.f37263a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                v3Var.f41580w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.f41572a.unlock();
                return;
            case 29:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) obj;
                r4Var.getClass();
                r4Var.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f591a) {
            case 9:
                super.onAnimationStart(animator);
                p9 p9Var = (p9) this.f592b;
                kj0 kj0Var = ((o9) p9Var.f1516a.get(p9Var.d)).f1470c;
                kj0Var.L = 2;
                kj0Var.start();
                return;
            case 29:
                ((org.telegram.ui.r4) this.f592b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
