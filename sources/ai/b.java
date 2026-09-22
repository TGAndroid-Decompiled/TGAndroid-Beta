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
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
public final class b extends AnimatorListenerAdapter {
    public final int f535a;
    public final Object f536b;

    public b(Object obj, int i10) {
        this.f535a = i10;
        this.f536b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f535a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f536b;
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
        int i10 = this.f535a;
        Object obj = this.f536b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f659p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1224a) {
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
                View view = a4Var.F1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var.F1.setTranslationY(((1.0f - a4Var.getTopViewEnterProgress()) * a4Var.F1.getLayoutParams().height) + a4Var.S1);
                }
                a4Var.f513s5.f809e2 = null;
                return;
            case 5:
                b6 b6Var = (b6) obj;
                b6Var.f581c[1].setVisibility(8);
                b6Var.f581c[0].setAlpha(1.0f);
                b6Var.f581c[0].setTranslationY(0.0f);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                n01 n01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                n01Var.R = 1.0f;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 7:
                ((n6) obj).M = null;
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
                ci.m mVar = ((ci.g) obj).f4682c0;
                if (mVar.f4994g0 == animator) {
                    mVar.f4994g0 = null;
                    mVar.f4992f.getEditText().setScrollY(mVar.f4987b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4469l = 1.0f;
                ci.e0 e0Var = d0Var.f4473p;
                if (e0Var.f4567n.contains(d0Var)) {
                    d0Var.f4463c.onDetachedFromWindow();
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
                    d0Var.f4464f = false;
                    e0Var.f4567n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 13:
                ci.x3 x3Var = ((ci.e3) obj).h;
                x3Var.F.setVisibility(8);
                x3Var.d.setVisibility(8);
                return;
            case 14:
                ci.f4 f4Var = (ci.f4) obj;
                f4Var.f4638o0 = 1.0f;
                f4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.o6 o6Var = (ci.o6) obj;
                ImageView imageView = o6Var.f5131c;
                o6Var.f5131c = o6Var.d;
                o6Var.d = imageView;
                imageView.bringToFront();
                o6Var.d.setVisibility(8);
                o6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.u6) obj).f5627w = null;
                return;
            case 17:
                ci.q7 q7Var = (ci.q7) obj;
                if (q7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) q7Var.getParent()).removeView(q7Var);
                    return;
                }
                return;
            case 18:
                ((ci.ba) obj).N = false;
                return;
            case 19:
                ci.z9 z9Var = (ci.z9) obj;
                z9Var.setTranslationY(0.0f);
                z9Var.d = null;
                return;
            case 20:
                ei.y yVar = (ei.y) obj;
                yVar.setVisibility(8);
                yVar.f8735a = null;
                return;
            case 21:
                ((ei.k3) obj).f8455y.setVisibility(8);
                return;
            case 22:
                ((ei.q4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f11150i1) {
                    gVar.f11165u0 = false;
                    gVar.f11164t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f11143f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f22005c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj;
                Runnable runnable = h4Var.f34070a0;
                if (runnable != null) {
                    runnable.run();
                    h4Var.f34070a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) obj;
                u3Var.f37793w = 1.0f;
                u3Var.n();
                u3Var.i();
                u3Var.h();
                u3Var.f37786a.unlock();
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
        switch (this.f535a) {
            case 9:
                super.onAnimationStart(animator);
                p9 p9Var = (p9) this.f536b;
                xi0 xi0Var = ((o9) p9Var.f1396a.get(p9Var.d)).f1358c;
                xi0Var.L = 2;
                xi0Var.start();
                return;
            case 29:
                ((org.telegram.ui.q4) this.f536b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
