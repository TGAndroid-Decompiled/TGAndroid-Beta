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
import fi.s6;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.d3;
import hi.h5;
import hi.i6;
import hi.i8;
import hi.k8;
import hi.l3;
import hi.n5;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tl;
import org.telegram.ui.wv0;
public final class k0 extends AnimatorListenerAdapter {
    public final int f1263a;
    public final Object f1264b;

    public k0(Object obj, int i7) {
        this.f1263a = i7;
        this.f1264b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        tl tlVar;
        boolean z10;
        int i7 = this.f1263a;
        Object obj = this.f1264b;
        switch (i7) {
            case 0:
                p0 p0Var = (p0) obj;
                if (p0Var.F0 <= 0.0f && (tlVar = p0Var.E0) != null && p0Var.G0 == animator) {
                    tlVar.q0(p0Var.H0);
                    p0Var.E0 = null;
                    return;
                }
                return;
            case 1:
                ((bi.g1) obj).f3633b.f3771w1.setVisibility(8);
                return;
            case 2:
                ((c1.a) obj).run();
                return;
            case 3:
                ((ch.p) obj).f5497w.setVisibility(4);
                return;
            case 4:
                ch.s sVar = (ch.s) obj;
                sVar.setVisibility(8);
                ch.r rVar = sVar.f5536b;
                if (rVar != null) {
                    sVar.removeView(rVar);
                    sVar.f5536b = null;
                }
                sVar.f5538e = null;
                return;
            case 5:
                ((ch.i0) obj).f5412y.c();
                return;
            case 6:
                v4 v4Var = (v4) obj;
                v4Var.F = 1.0f;
                v4Var.G = -1;
                u4 u4Var = v4Var.I;
                if (u4Var != null && (z10 = u4Var.f9893l) && z10) {
                    u4Var.f9893l = false;
                    u4Var.b();
                }
                v4Var.H = null;
                return;
            case 7:
                db dbVar = ((eb) obj).f8750c;
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
                ((fi.p) obj).P.f11944p = false;
                return;
            case 10:
                fi.m0 m0Var = (fi.m0) obj;
                fi.r0 r0Var = m0Var.L;
                if (r0Var != null && m0Var.J == r0Var.f12514a) {
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
                i2Var.f12130x7.invalidate();
                i2Var.setAnimatedTop(0);
                i2Var.f12130x7.F2 = true;
                View view = i2Var.f32740w2;
                if (view != null && view.getVisibility() == 0) {
                    i2Var.f32740w2.setTranslationY(((1.0f - i2Var.getTopViewEnterProgress()) * i2Var.f32740w2.getLayoutParams().height) + i2Var.J2);
                }
                i2Var.f12130x7.O1 = null;
                return;
            case 12:
                v3 v3Var = (v3) obj;
                v3Var.f12683c[1].setVisibility(8);
                v3Var.f12683c[0].setAlpha(1.0f);
                v3Var.f12683c[0].setTranslationY(0.0f);
                return;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                wv0 wv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                wv0Var.S = 1.0f;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 14:
                ((f4) obj).N = null;
                return;
            case 15:
                r4 r4Var = (r4) obj;
                r4Var.f12539x = null;
                r4Var.f12536r = 1.0f;
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
                hi.o oVar = ((hi.h) obj).f14727d0;
                if (oVar.f15150g0 == animator) {
                    oVar.f15150g0 = null;
                    oVar.f15148f.getEditText().setScrollY(oVar.f15144c0);
                    return;
                }
                return;
            case 19:
                hi.f0 f0Var = (hi.f0) obj;
                f0Var.f14621l = 1.0f;
                hi.g0 g0Var = f0Var.f14625p;
                if (g0Var.f14679n.contains(f0Var)) {
                    f0Var.f14614c.R();
                    hi.e0 e0Var = f0Var.d;
                    if (e0Var != null) {
                        e0Var.pause();
                        f0Var.d.release(null);
                        f0Var.d = null;
                    }
                    TextureView textureView = f0Var.f14615e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        f0Var.f14615e = null;
                    }
                    f0Var.f14616f = false;
                    g0Var.f14679n.remove(f0Var);
                }
                g0Var.invalidate();
                return;
            case 20:
                d3 d3Var = (d3) ((hi.s2) obj).f15366c;
                d3Var.G.setVisibility(8);
                d3Var.d.setVisibility(8);
                return;
            case 21:
                l3 l3Var = (l3) obj;
                l3Var.A0 = 1.0f;
                l3Var.invalidate();
                return;
            case 22:
                org.telegram.messenger.g0.E2((xi0) obj);
                return;
            case 23:
                super.onAnimationEnd(animator);
                h5 h5Var = (h5) obj;
                ImageView imageView = h5Var.f14749c;
                h5Var.f14749c = h5Var.d;
                h5Var.d = imageView;
                imageView.bringToFront();
                h5Var.d.setVisibility(8);
                h5Var.h = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((n5) obj).f15101x = null;
                return;
            case 25:
                i6 i6Var = (i6) obj;
                if (i6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) i6Var.getParent()).removeView(i6Var);
                    return;
                }
                return;
            case 26:
                ((k8) obj).O = false;
                return;
            case 27:
                i8 i8Var = (i8) obj;
                i8Var.setTranslationY(0.0f);
                i8Var.d = null;
                return;
            case 28:
                ki.u uVar = (ki.u) obj;
                uVar.setVisibility(8);
                uVar.f18988a = null;
                return;
            case 29:
                ((ki.s2) obj).F.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f1263a) {
            case 16:
                super.onAnimationStart(animator);
                t6 t6Var = (t6) this.f1264b;
                oh0 oh0Var = ((s6) t6Var.f12623a.get(t6Var.d)).f12566c;
                oh0Var.M = 2;
                oh0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
