package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import bi.qc;
import bi.r5;
import bi.rc;
import bi.s5;
import di.i5;
import di.k7;
import di.l7;
import di.m4;
import di.o1;
import di.o8;
import di.u2;
import di.w4;
import fi.b6;
import fi.b7;
import fi.e9;
import fi.g9;
import fi.h6;
import fi.o3;
import fi.v3;
import fi.w2;
import hi.m3;
import hi.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.yz0;
public final class b extends AnimatorListenerAdapter {
    public final int f3989a;
    public final Object f3990b;

    public b(Object obj, int i10) {
        this.f3989a = i10;
        this.f3990b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f3989a;
        Object obj = this.f3990b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                return;
            case 1:
                ((u) obj).v.setVisibility(4);
                return;
            case 2:
                x xVar = (x) obj;
                xVar.setVisibility(8);
                w wVar = xVar.f4196b;
                if (wVar != null) {
                    xVar.removeView(wVar);
                    xVar.f4196b = null;
                }
                xVar.e = null;
                return;
            case 3:
                ((p0) obj).f4111x.c();
                return;
            case 4:
                s5 s5Var = (s5) obj;
                s5Var.E = 1.0f;
                s5Var.F = -1;
                r5 r5Var = s5Var.H;
                if (r5Var != null && (z10 = r5Var.f5335l) && z10) {
                    r5Var.f5335l = false;
                    r5Var.b();
                }
                s5Var.G = null;
                return;
            case 5:
                qc qcVar = ((rc) obj).f5373c;
                qcVar.setScaleX(1.0f);
                qcVar.setScaleY(1.0f);
                return;
            case 6:
                di.a aVar = (di.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 7:
                super.onAnimationEnd(animator);
                ((di.q) obj).O.f9323p = false;
                return;
            case 8:
                di.q0 q0Var = (di.q0) obj;
                di.v0 v0Var = q0Var.K;
                if (v0Var != null && q0Var.I == v0Var.f9237a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    q0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new ai.g0(this, 15));
                    q0Var.J.setStartDelay(3000L);
                    q0Var.J.setDuration(550L);
                    q0Var.J.setInterpolator(new LinearInterpolator());
                    q0Var.J.start();
                    return;
                }
                return;
            case 9:
                ((o1) obj).I = null;
                return;
            case 10:
                u2 u2Var = (u2) obj;
                u2Var.f9226w5.invalidate();
                u2Var.setAnimatedTop(0);
                u2Var.f9226w5.K2 = true;
                View view = u2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var.G1.setTranslationY(((1.0f - u2Var.getTopViewEnterProgress()) * u2Var.G1.getLayoutParams().height) + u2Var.T1);
                }
                u2Var.f9226w5.T1 = null;
                return;
            case 11:
                m4 m4Var = (m4) obj;
                m4Var.f8777c[1].setVisibility(8);
                m4Var.f8777c[0].setAlpha(1.0f);
                m4Var.f8777c[0].setTranslationY(0.0f);
                return;
            case 12:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                yz0 yz0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                yz0Var.R = 1.0f;
                yz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 13:
                ((w4) obj).M = null;
                return;
            case 14:
                i5 i5Var = (i5) obj;
                i5Var.f8678w = null;
                i5Var.f8676r = 1.0f;
                i5Var.invalidate();
                return;
            case 15:
            default:
                super.onAnimationEnd(animator);
                return;
            case 16:
                o8 o8Var = (o8) obj;
                o8Var.H = false;
                o8Var.G = 0.0f;
                o8Var.invalidate();
                o8Var.requestLayout();
                o8Var.J.requestLayout();
                return;
            case 17:
                fi.m mVar = ((fi.g) obj).f10890c0;
                if (mVar.f11200g0 == animator) {
                    mVar.f11200g0 = null;
                    mVar.f11198f.getEditText().setScrollY(mVar.f11193b0);
                    return;
                }
                return;
            case 18:
                fi.d0 d0Var = (fi.d0) obj;
                d0Var.f10709l = 1.0f;
                fi.e0 e0Var = d0Var.f10713p;
                if (e0Var.f10757n.contains(d0Var)) {
                    d0Var.f10703c.onDetachedFromWindow();
                    fi.c0 c0Var = d0Var.d;
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
                    d0Var.f10704f = false;
                    e0Var.f10757n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 19:
                o3 o3Var = ((w2) obj).f11846b;
                o3Var.F.setVisibility(8);
                o3Var.d.setVisibility(8);
                return;
            case 20:
                v3 v3Var = (v3) obj;
                v3Var.f11800o0 = 1.0f;
                v3Var.invalidate();
                return;
            case 21:
                super.onAnimationEnd(animator);
                b6 b6Var = (b6) obj;
                ImageView imageView = b6Var.f10561c;
                b6Var.f10561c = b6Var.d;
                b6Var.d = imageView;
                imageView.bringToFront();
                b6Var.d.setVisibility(8);
                b6Var.h = null;
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((h6) obj).f10959w = null;
                return;
            case 23:
                b7 b7Var = (b7) obj;
                if (b7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) b7Var.getParent()).removeView(b7Var);
                    return;
                }
                return;
            case 24:
                ((g9) obj).N = false;
                return;
            case 25:
                e9 e9Var = (e9) obj;
                e9Var.setTranslationY(0.0f);
                e9Var.d = null;
                return;
            case 26:
                hi.p pVar = (hi.p) obj;
                if (pVar.d == animator) {
                    pVar.d = null;
                    pVar.a();
                    return;
                }
                return;
            case 27:
                hi.e0 e0Var2 = (hi.e0) obj;
                e0Var2.setVisibility(8);
                e0Var2.f12946a = null;
                return;
            case 28:
                ((m3) obj).E.setVisibility(8);
                return;
            case 29:
                ((o4) obj).I.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f3989a) {
            case 15:
                super.onAnimationStart(animator);
                l7 l7Var = (l7) this.f3990b;
                yj0 yj0Var = ((k7) l7Var.f8761a.get(l7Var.d)).f8722c;
                yj0Var.L = 2;
                yj0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
