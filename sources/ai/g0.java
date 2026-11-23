package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import di.db;
import di.eb;
import di.u4;
import di.v4;
import fi.f4;
import fi.r4;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.b3;
import hi.d9;
import hi.f9;
import hi.m3;
import hi.s5;
import hi.s6;
import hi.u3;
import hi.y5;
import ki.t2;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tl;
import org.telegram.ui.vv0;
public final class g0 extends AnimatorListenerAdapter {
    public final int f1203a;
    public final Object f1204b;

    public g0(Object obj, int i7) {
        this.f1203a = i7;
        this.f1204b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        tl tlVar;
        boolean z10;
        int i7 = this.f1203a;
        Object obj = this.f1204b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj;
                if (l0Var.F0 <= 0.0f && (tlVar = l0Var.E0) != null && l0Var.G0 == animator) {
                    tlVar.q0(l0Var.H0);
                    l0Var.E0 = null;
                    return;
                }
                return;
            case 1:
                ((bi.g1) obj).f3601b.f3744w1.setVisibility(8);
                return;
            case 2:
                ((c1.a) obj).run();
                return;
            case 3:
                ((ch.p) obj).f5463w.setVisibility(4);
                return;
            case 4:
                ch.s sVar = (ch.s) obj;
                sVar.setVisibility(8);
                ch.r rVar = sVar.f5502b;
                if (rVar != null) {
                    sVar.removeView(rVar);
                    sVar.f5502b = null;
                }
                sVar.f5504e = null;
                return;
            case 5:
                ((ch.i0) obj).f5378y.c();
                return;
            case 6:
                v4 v4Var = (v4) obj;
                v4Var.F = 1.0f;
                v4Var.G = -1;
                u4 u4Var = v4Var.I;
                if (u4Var != null && (z10 = u4Var.f9857l) && z10) {
                    u4Var.f9857l = false;
                    u4Var.b();
                }
                v4Var.H = null;
                return;
            case 7:
                db dbVar = ((eb) obj).f8714c;
                dbVar.setScaleX(1.0f);
                dbVar.setScaleY(1.0f);
                return;
            case 8:
                fi.a aVar = (fi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 9:
                super.onAnimationEnd(animator);
                ((fi.p) obj).P.f11909p = false;
                return;
            case 10:
                fi.m0 m0Var = (fi.m0) obj;
                fi.r0 r0Var = m0Var.L;
                if (r0Var != null && m0Var.J == r0Var.f12479a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(this, 17));
                    m0Var.K.setStartDelay(3000L);
                    m0Var.K.setDuration(550L);
                    m0Var.K.setInterpolator(new LinearInterpolator());
                    m0Var.K.start();
                    return;
                }
                return;
            case 11:
                fi.i2 i2Var = (fi.i2) obj;
                i2Var.f12095x7.invalidate();
                i2Var.setAnimatedTop(0);
                i2Var.f12095x7.F2 = true;
                View view = i2Var.f32807w2;
                if (view != null && view.getVisibility() == 0) {
                    i2Var.f32807w2.setTranslationY(((1.0f - i2Var.getTopViewEnterProgress()) * i2Var.f32807w2.getLayoutParams().height) + i2Var.J2);
                }
                i2Var.f12095x7.O1 = null;
                return;
            case 12:
                v3 v3Var = (v3) obj;
                v3Var.f12648c[1].setVisibility(8);
                v3Var.f12648c[0].setAlpha(1.0f);
                v3Var.f12648c[0].setTranslationY(0.0f);
                return;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                vv0 vv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                vv0Var.S = 1.0f;
                vv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 14:
                ((f4) obj).N = null;
                return;
            case 15:
                r4 r4Var = (r4) obj;
                r4Var.f12504x = null;
                r4Var.f12501r = 1.0f;
                r4Var.invalidate();
                return;
            case 16:
            default:
                super.onAnimationEnd(animator);
                return;
            case 17:
                w7 w7Var = (w7) obj;
                w7Var.I = false;
                w7Var.H = 0.0f;
                w7Var.invalidate();
                w7Var.requestLayout();
                w7Var.K.requestLayout();
                return;
            case 18:
                hi.n nVar = ((hi.h) obj).f14566d0;
                if (nVar.f14938g0 == animator) {
                    nVar.f14938g0 = null;
                    nVar.f14936f.getEditText().setScrollY(nVar.f14932c0);
                    return;
                }
                return;
            case 19:
                hi.m0 m0Var2 = (hi.m0) obj;
                m0Var2.f14873l = 1.0f;
                hi.n0 n0Var = m0Var2.f14877p;
                if (n0Var.f14981n.contains(m0Var2)) {
                    m0Var2.f14866c.S();
                    hi.l0 l0Var2 = m0Var2.d;
                    if (l0Var2 != null) {
                        l0Var2.pause();
                        m0Var2.d.release(null);
                        m0Var2.d = null;
                    }
                    TextureView textureView = m0Var2.f14867e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        m0Var2.f14867e = null;
                    }
                    m0Var2.f14868f = false;
                    n0Var.f14981n.remove(m0Var2);
                }
                n0Var.invalidate();
                return;
            case 20:
                m3 m3Var = (m3) ((b3) obj).f14223c;
                m3Var.G.setVisibility(8);
                m3Var.d.setVisibility(8);
                return;
            case 21:
                u3 u3Var = (u3) obj;
                u3Var.A0 = 1.0f;
                u3Var.invalidate();
                return;
            case 22:
                org.telegram.messenger.g0.E2((xi0) obj);
                return;
            case 23:
                super.onAnimationEnd(animator);
                s5 s5Var = (s5) obj;
                ImageView imageView = s5Var.f15381c;
                s5Var.f15381c = s5Var.d;
                s5Var.d = imageView;
                imageView.bringToFront();
                s5Var.d.setVisibility(8);
                s5Var.h = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((y5) obj).f15874x = null;
                return;
            case 25:
                s6 s6Var = (s6) obj;
                if (s6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s6Var.getParent()).removeView(s6Var);
                    return;
                }
                return;
            case 26:
                ((f9) obj).O = false;
                return;
            case 27:
                d9 d9Var = (d9) obj;
                d9Var.setTranslationY(0.0f);
                d9Var.d = null;
                return;
            case 28:
                ki.u uVar = (ki.u) obj;
                uVar.setVisibility(8);
                uVar.f19059a = null;
                return;
            case 29:
                ((t2) obj).F.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1203a) {
            case 16:
                super.onAnimationStart(animator);
                t6 t6Var = (t6) this.f1204b;
                nh0 nh0Var = ((fi.s6) t6Var.f12588a.get(t6Var.d)).f12531c;
                nh0Var.M = 2;
                nh0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
