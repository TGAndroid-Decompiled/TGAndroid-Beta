package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import di.ab;
import di.r4;
import di.s4;
import di.za;
import fi.h4;
import fi.v6;
import fi.w6;
import fi.x3;
import fi.z7;
import hi.d3;
import hi.j5;
import hi.j8;
import hi.k6;
import hi.l3;
import hi.l8;
import hi.q5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.sl;
import org.telegram.ui.vv0;
public final class j0 extends AnimatorListenerAdapter {
    public final int f1258a;
    public final Object f1259b;

    public j0(Object obj, int i7) {
        this.f1258a = i7;
        this.f1259b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        sl slVar;
        boolean z10;
        int i7 = this.f1258a;
        Object obj = this.f1259b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj;
                if (n0Var.E0 <= 0.0f && (slVar = n0Var.D0) != null && n0Var.F0 == animator) {
                    slVar.q0(n0Var.G0);
                    n0Var.D0 = null;
                    return;
                }
                return;
            case 1:
                ((bi.c1) obj).f3408b.f3508w1.setVisibility(8);
                return;
            case 2:
                ((c1.c) obj).run();
                return;
            case 3:
                ((ch.o) obj).f5181w.setVisibility(4);
                return;
            case 4:
                ch.r rVar = (ch.r) obj;
                rVar.setVisibility(8);
                ch.q qVar = rVar.f5218b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.f5218b = null;
                }
                rVar.f5220e = null;
                return;
            case 5:
                ((ch.i0) obj).f5100y.c();
                return;
            case 6:
                s4 s4Var = (s4) obj;
                s4Var.F = 1.0f;
                s4Var.G = -1;
                r4 r4Var = s4Var.I;
                if (r4Var != null && (z10 = r4Var.f9324l) && z10) {
                    r4Var.f9324l = false;
                    r4Var.b();
                }
                s4Var.H = null;
                return;
            case 7:
                za zaVar = ((ab) obj).f8214c;
                zaVar.setScaleX(1.0f);
                zaVar.setScaleY(1.0f);
                return;
            case 8:
                fi.a aVar = (fi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 9:
                super.onAnimationEnd(animator);
                ((fi.p) obj).P.f11791p = false;
                return;
            case 10:
                fi.n0 n0Var2 = (fi.n0) obj;
                fi.s0 s0Var = n0Var2.L;
                if (s0Var != null && n0Var2.J == s0Var.f12297a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var2.K = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, 17));
                    n0Var2.K.setStartDelay(3000L);
                    n0Var2.K.setDuration(550L);
                    n0Var2.K.setInterpolator(new LinearInterpolator());
                    n0Var2.K.start();
                    return;
                }
                return;
            case 11:
                fi.k2 k2Var = (fi.k2) obj;
                k2Var.S6.invalidate();
                k2Var.setAnimatedTop(0);
                k2Var.S6.F2 = true;
                View view = k2Var.f32254o2;
                if (view != null && view.getVisibility() == 0) {
                    k2Var.f32254o2.setTranslationY(((1.0f - k2Var.getTopViewEnterProgress()) * k2Var.f32254o2.getLayoutParams().height) + k2Var.B2);
                }
                k2Var.S6.O1 = null;
                return;
            case 12:
                x3 x3Var = (x3) obj;
                x3Var.f12495c[1].setVisibility(8);
                x3Var.f12495c[0].setAlpha(1.0f);
                x3Var.f12495c[0].setTranslationY(0.0f);
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
                ((h4) obj).N = null;
                return;
            case 15:
                fi.s4 s4Var2 = (fi.s4) obj;
                s4Var2.f12314x = null;
                s4Var2.f12311r = 1.0f;
                s4Var2.invalidate();
                return;
            case 16:
            default:
                super.onAnimationEnd(animator);
                return;
            case 17:
                z7 z7Var = (z7) obj;
                z7Var.I = false;
                z7Var.H = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.K.requestLayout();
                return;
            case 18:
                hi.m mVar = ((hi.g) obj).f14330d0;
                if (mVar.f14625g0 == animator) {
                    mVar.f14625g0 = null;
                    mVar.f14623f.getEditText().setScrollY(mVar.f14619c0);
                    return;
                }
                return;
            case 19:
                hi.d0 d0Var = (hi.d0) obj;
                d0Var.f14081l = 1.0f;
                hi.e0 e0Var = d0Var.f14085p;
                if (e0Var.f14209n.contains(d0Var)) {
                    d0Var.f14074c.R();
                    hi.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f14075e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        d0Var.f14075e = null;
                    }
                    d0Var.f14076f = false;
                    e0Var.f14209n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 20:
                d3 d3Var = (d3) ((hi.s2) obj).f15018c;
                d3Var.G.setVisibility(8);
                d3Var.d.setVisibility(8);
                return;
            case 21:
                l3 l3Var = (l3) obj;
                l3Var.A0 = 1.0f;
                l3Var.invalidate();
                return;
            case 22:
                org.telegram.messenger.g0.E2((mi0) obj);
                return;
            case 23:
                super.onAnimationEnd(animator);
                j5 j5Var = (j5) obj;
                ImageView imageView = j5Var.f14464c;
                j5Var.f14464c = j5Var.d;
                j5Var.d = imageView;
                imageView.bringToFront();
                j5Var.d.setVisibility(8);
                j5Var.h = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((q5) obj).f14911x = null;
                return;
            case 25:
                k6 k6Var = (k6) obj;
                if (k6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) k6Var.getParent()).removeView(k6Var);
                    return;
                }
                return;
            case 26:
                ((l8) obj).O = false;
                return;
            case 27:
                j8 j8Var = (j8) obj;
                j8Var.setTranslationY(0.0f);
                j8Var.d = null;
                return;
            case 28:
                ki.w wVar = (ki.w) obj;
                wVar.setVisibility(8);
                wVar.f18607a = null;
                return;
            case 29:
                ((ki.x2) obj).F.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1258a) {
            case 16:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.f1259b;
                ch0 ch0Var = ((v6) w6Var.f12466a.get(w6Var.d)).f12422c;
                ch0Var.M = 2;
                ch0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
