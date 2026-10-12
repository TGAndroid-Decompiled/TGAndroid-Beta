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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
public final class b extends AnimatorListenerAdapter {
    public final int f660a;
    public final Object f661b;

    public b(Object obj, int i10) {
        this.f660a = i10;
        this.f661b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f660a) {
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f661b;
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
        int i10 = this.f660a;
        Object obj = this.f661b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.f849p = false;
                return;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.f1378a) {
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
                b4Var.V5.invalidate();
                b4Var.setAnimatedTop(0);
                b4Var.V5.V2 = true;
                View view = b4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    b4Var.G1.setTranslationY(((1.0f - b4Var.getTopViewEnterProgress()) * b4Var.G1.getLayoutParams().height) + b4Var.T1);
                }
                b4Var.V5.f962e2 = null;
                return;
            case 5:
                b6 b6Var = (b6) obj;
                b6Var.f711c[1].setVisibility(8);
                b6Var.f711c[0].setAlpha(1.0f);
                b6Var.f711c[0].setTranslationY(0.0f);
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
                z6 z6Var = (z6) obj;
                z6Var.f2013w = null;
                z6Var.f2011r = 1.0f;
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
                ci.m mVar = ((ci.g) obj).f5112c0;
                if (mVar.f5555g0 == animator) {
                    mVar.f5555g0 = null;
                    mVar.f5553f.getEditText().setScrollY(mVar.f5547b0);
                    return;
                }
                return;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.f4886l = 1.0f;
                ci.e0 e0Var = d0Var.f4890p;
                if (e0Var.f5004n.contains(d0Var)) {
                    d0Var.f4879c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f4880e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f4880e = null;
                    }
                    d0Var.f4881f = false;
                    e0Var.f5004n.remove(d0Var);
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
                d4Var.f4919o0 = 1.0f;
                d4Var.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.f5637c;
                n6Var.f5637c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).f6006w = null;
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
                yVar.f9490a = null;
                return;
            case 21:
                ((ei.k3) obj).f9182y.setVisibility(8);
                return;
            case 22:
                ((ei.p4) obj).I.setVisibility(8);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.f12176i1) {
                    gVar.f12191u0 = false;
                    gVar.f12190t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f12169f0 = false;
                return;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                return;
            case 25:
                ((CropAreaView) obj).f23913c0 = null;
                return;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj;
                Runnable runnable = i4Var.f38641a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.f38641a0 = null;
                    return;
                }
                return;
            case 28:
                org.telegram.ui.v3 v3Var2 = (org.telegram.ui.v3) obj;
                v3Var2.f42659w = 1.0f;
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                v3Var2.f42651a.unlock();
                return;
            case 29:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                t4Var.getClass();
                t4Var.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f660a) {
            case 9:
                super.onAnimationStart(animator);
                q9 q9Var = (q9) this.f661b;
                fk0 fk0Var = ((p9) q9Var.f1623a.get(q9Var.d)).f1579c;
                fk0Var.L = 2;
                fk0Var.start();
                return;
            case 29:
                ((org.telegram.ui.t4) this.f661b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
