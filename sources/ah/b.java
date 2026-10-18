package ah;

import ai.ad;
import ai.v5;
import ai.w5;
import ai.zc;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ci.i5;
import ci.k7;
import ci.l4;
import ci.l7;
import ci.o1;
import ci.q8;
import ci.u2;
import ci.w4;
import ei.c6;
import ei.e7;
import ei.i9;
import ei.j6;
import ei.k9;
import ei.q3;
import ei.x3;
import ei.y2;
import gi.d3;
import gi.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qz0;
public final class b extends AnimatorListenerAdapter {
    public final int f660a;
    public final Object f661b;

    public b(Object obj, int i10) {
        this.f660a = i10;
        this.f661b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f660a;
        Object obj = this.f661b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                return;
            case 1:
                f0 f0Var = (f0) obj;
                f0Var.setVisibility(8);
                e0 e0Var = f0Var.f726b;
                if (e0Var != null) {
                    f0Var.removeView(e0Var);
                    f0Var.f726b = null;
                }
                f0Var.e = null;
                return;
            case 2:
                ((a1) obj).f659x.c();
                return;
            case 3:
                w5 w5Var = (w5) obj;
                w5Var.E = 1.0f;
                w5Var.F = -1;
                v5 v5Var = w5Var.H;
                if (v5Var != null && (z10 = v5Var.f2305l) && z10) {
                    v5Var.f2305l = false;
                    v5Var.b();
                }
                w5Var.G = null;
                return;
            case 4:
                zc zcVar = ((ad) obj).f982c;
                zcVar.setScaleX(1.0f);
                zcVar.setScaleY(1.0f);
                return;
            case 5:
                ci.a aVar = (ci.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                ((ci.q) obj).O.f6124p = false;
                return;
            case 7:
                ci.q0 q0Var = (ci.q0) obj;
                ci.v0 v0Var = q0Var.K;
                if (v0Var != null && q0Var.I == v0Var.f5994a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    q0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new c0(this, 13));
                    q0Var.J.setStartDelay(3000L);
                    q0Var.J.setDuration(550L);
                    q0Var.J.setInterpolator(new LinearInterpolator());
                    q0Var.J.start();
                    return;
                }
                return;
            case 8:
                ((o1) obj).I = null;
                return;
            case 9:
                u2 u2Var = (u2) obj;
                u2Var.f5974s5.invalidate();
                u2Var.setAnimatedTop(0);
                u2Var.f5974s5.V2 = true;
                View view = u2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var.G1.setTranslationY(((1.0f - u2Var.getTopViewEnterProgress()) * u2Var.G1.getLayoutParams().height) + u2Var.T1);
                }
                u2Var.f5974s5.f5661e2 = null;
                return;
            case 10:
                l4 l4Var = (l4) obj;
                l4Var.f5512c[1].setVisibility(8);
                l4Var.f5512c[0].setAlpha(1.0f);
                l4Var.f5512c[0].setTranslationY(0.0f);
                return;
            case 11:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                qz0 qz0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                qz0Var.R = 1.0f;
                qz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 12:
                ((w4) obj).M = null;
                return;
            case 13:
                i5 i5Var = (i5) obj;
                i5Var.f5443w = null;
                i5Var.f5441r = 1.0f;
                i5Var.invalidate();
                return;
            case 14:
            default:
                super.onAnimationEnd(animator);
                return;
            case 15:
                q8 q8Var = (q8) obj;
                q8Var.H = false;
                q8Var.G = 0.0f;
                q8Var.invalidate();
                q8Var.requestLayout();
                q8Var.J.requestLayout();
                return;
            case 16:
                ei.m mVar = ((ei.g) obj).f9063c0;
                if (mVar.f9402g0 == animator) {
                    mVar.f9402g0 = null;
                    mVar.f9400f.getEditText().setScrollY(mVar.f9395b0);
                    return;
                }
                return;
            case 17:
                ei.d0 d0Var = (ei.d0) obj;
                d0Var.f8874l = 1.0f;
                ei.e0 e0Var2 = d0Var.f8878p;
                if (e0Var2.f8933n.contains(d0Var)) {
                    d0Var.f8868c.onDetachedFromWindow();
                    ei.c0 c0Var = d0Var.d;
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
                    d0Var.f8869f = false;
                    e0Var2.f8933n.remove(d0Var);
                }
                e0Var2.invalidate();
                return;
            case 18:
                q3 q3Var = ((y2) obj).f10129s;
                q3Var.F.setVisibility(8);
                q3Var.d.setVisibility(8);
                return;
            case 19:
                x3 x3Var = (x3) obj;
                x3Var.f10084o0 = 1.0f;
                x3Var.invalidate();
                return;
            case 20:
                super.onAnimationEnd(animator);
                c6 c6Var = (c6) obj;
                ImageView imageView = c6Var.f8827c;
                c6Var.f8827c = c6Var.d;
                c6Var.d = imageView;
                imageView.bringToFront();
                c6Var.d.setVisibility(8);
                c6Var.h = null;
                return;
            case 21:
                super.onAnimationEnd(animator);
                ((j6) obj).f9256w = null;
                return;
            case 22:
                e7 e7Var = (e7) obj;
                if (e7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) e7Var.getParent()).removeView(e7Var);
                    return;
                }
                return;
            case 23:
                ((k9) obj).N = false;
                return;
            case 24:
                i9 i9Var = (i9) obj;
                i9Var.setTranslationY(0.0f);
                i9Var.d = null;
                return;
            case 25:
                gi.x xVar = (gi.x) obj;
                xVar.setVisibility(8);
                xVar.f11533a = null;
                return;
            case 26:
                ((d3) obj).f11167y.setVisibility(8);
                return;
            case 27:
                ((f4) obj).I.setVisibility(8);
                return;
            case 28:
                super.onAnimationEnd(animator);
                jg.g gVar = (jg.g) obj;
                if (!gVar.f14466i1) {
                    gVar.f14481u0 = false;
                    gVar.f14480t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f14459f0 = false;
                return;
            case 29:
                ((lg.e) obj).h.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f660a) {
            case 14:
                super.onAnimationStart(animator);
                l7 l7Var = (l7) this.f661b;
                uj0 uj0Var = ((k7) l7Var.f5522a.get(l7Var.d)).f5494c;
                uj0Var.L = 2;
                uj0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
