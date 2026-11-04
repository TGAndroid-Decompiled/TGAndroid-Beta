package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ci.kb;
import ci.lb;
import ei.g8;
import gi.m8;
import gi.o8;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nv0;
public final class e1 extends AnimatorListenerAdapter {
    public final int f614a;
    public final Object f615b;

    public e1(Object obj, int i3) {
        this.f614a = i3;
        this.f615b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i3 = this.f614a;
        Object obj = this.f615b;
        switch (i3) {
            case 0:
                ((f1) obj).f641b.f701t1.setVisibility(8);
                return;
            case 1:
                ci.b5 b5Var = (ci.b5) obj;
                b5Var.F = 1.0f;
                b5Var.G = -1;
                ci.a5 a5Var = b5Var.I;
                if (a5Var != null && (z10 = a5Var.f4825l) && z10) {
                    a5Var.f4825l = false;
                    a5Var.b();
                }
                b5Var.H = null;
                return;
            case 2:
                kb kbVar = ((lb) obj).f5508c;
                kbVar.setScaleX(1.0f);
                kbVar.setScaleY(1.0f);
                return;
            case 3:
                ((ci.e0) obj).run();
                return;
            case 4:
                ((dh.o) obj).f9109w.setVisibility(4);
                return;
            case 5:
                dh.r rVar = (dh.r) obj;
                rVar.setVisibility(8);
                dh.q qVar = rVar.f9141b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.f9141b = null;
                }
                rVar.f9143e = null;
                return;
            case 6:
                ((dh.g0) obj).f9017y.c();
                return;
            case 7:
                ei.a aVar = (ei.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((ei.q) obj).P.f10709p = false;
                return;
            case 9:
                ei.p0 p0Var = (ei.p0) obj;
                ei.u0 u0Var = p0Var.L;
                if (u0Var != null && p0Var.J == u0Var.f11069a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    p0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new bh.f(this, 16));
                    p0Var.K.setStartDelay(3000L);
                    p0Var.K.setDuration(550L);
                    p0Var.K.setInterpolator(new LinearInterpolator());
                    p0Var.K.start();
                    return;
                }
                return;
            case 10:
                ((ei.n1) obj).J = null;
                return;
            case 11:
                ei.s2 s2Var = (ei.s2) obj;
                s2Var.f10988y5.invalidate();
                s2Var.setAnimatedTop(0);
                s2Var.f10988y5.F2 = true;
                View view = s2Var.H1;
                if (view != null && view.getVisibility() == 0) {
                    s2Var.H1.setTranslationY(((1.0f - s2Var.getTopViewEnterProgress()) * s2Var.H1.getLayoutParams().height) + s2Var.U1);
                }
                s2Var.f10988y5.O1 = null;
                return;
            case 12:
                ei.f4 f4Var = (ei.f4) obj;
                f4Var.f10265c[1].setVisibility(8);
                f4Var.f10265c[0].setAlpha(1.0f);
                f4Var.f10265c[0].setTranslationY(0.0f);
                return;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                nv0 nv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                nv0Var.S = 1.0f;
                nv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 14:
                ((ei.p4) obj).N = null;
                return;
            case 15:
                ei.a5 a5Var2 = (ei.a5) obj;
                a5Var2.f10088x = null;
                a5Var2.f10085r = 1.0f;
                a5Var2.invalidate();
                return;
            case 16:
            default:
                super.onAnimationEnd(animator);
                return;
            case 17:
                g8 g8Var = (g8) obj;
                g8Var.I = false;
                g8Var.H = 0.0f;
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.K.requestLayout();
                return;
            case 18:
                gi.m mVar = ((gi.g) obj).f12821d0;
                if (mVar.f13146g0 == animator) {
                    mVar.f13146g0 = null;
                    mVar.f13144f.getEditText().setScrollY(mVar.f13140c0);
                    return;
                }
                return;
            case 19:
                gi.d0 d0Var = (gi.d0) obj;
                d0Var.f12542l = 1.0f;
                gi.e0 e0Var = d0Var.f12546p;
                if (e0Var.f12634n.contains(d0Var)) {
                    d0Var.f12535c.R();
                    gi.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f12536e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        d0Var.f12536e = null;
                    }
                    d0Var.f12537f = false;
                    e0Var.f12634n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 20:
                gi.d3 d3Var = (gi.d3) ((gi.s2) obj).f13553c;
                d3Var.G.setVisibility(8);
                d3Var.d.setVisibility(8);
                return;
            case 21:
                gi.l3 l3Var = (gi.l3) obj;
                l3Var.A0 = 1.0f;
                l3Var.invalidate();
                return;
            case 22:
                org.telegram.messenger.g0.E2((li0) obj);
                return;
            case 23:
                super.onAnimationEnd(animator);
                gi.j5 j5Var = (gi.j5) obj;
                ImageView imageView = j5Var.f13010c;
                j5Var.f13010c = j5Var.d;
                j5Var.d = imageView;
                imageView.bringToFront();
                j5Var.d.setVisibility(8);
                j5Var.h = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((gi.p5) obj).f13379x = null;
                return;
            case 25:
                gi.m6 m6Var = (gi.m6) obj;
                if (m6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m6Var.getParent()).removeView(m6Var);
                    return;
                }
                return;
            case 26:
                ((o8) obj).O = false;
                return;
            case 27:
                m8 m8Var = (m8) obj;
                m8Var.setTranslationY(0.0f);
                m8Var.d = null;
                return;
            case 28:
                ii.w wVar = (ii.w) obj;
                wVar.setVisibility(8);
                wVar.f15277a = null;
                return;
            case 29:
                ((ii.a3) obj).F.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f614a) {
            case 16:
                super.onAnimationStart(animator);
                ei.d7 d7Var = (ei.d7) this.f615b;
                ch0 ch0Var = ((ei.c7) d7Var.f10202a.get(d7Var.d)).f10155c;
                ch0Var.M = 2;
                ch0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
