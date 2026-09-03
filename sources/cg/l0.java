package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import dg.o2;
import eg.t2;
import eg.u2;
import java.util.Iterator;
import lh.n2;
import lh.x3;
import lh.x9;
import lh.y3;
import lh.y9;
import nh.i4;
import nh.t4;
import nh.w6;
import nh.x6;
import nh.z3;
import nh.z7;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.a4;
import org.telegram.ui.n4;
import org.telegram.ui.v4;
import org.telegram.ui.y4;
public final class l0 extends AnimatorListenerAdapter {
    public final int f2426a;
    public final Object f2427b;

    public l0(Object obj, int i10) {
        this.f2426a = i10;
        this.f2427b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2426a) {
            case 11:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2427b;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10 = this.f2426a;
        float f10 = 0.0f;
        Object obj = this.f2427b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.f2431a.getPainting().c(null, m0Var.f2431a.getCurrentColor(), true, null);
                m0Var.f2445r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                dg.c1 c1Var = (dg.c1) obj;
                ImageView imageView = c1Var.f4428c;
                c1Var.f4428c = c1Var.d;
                c1Var.d = imageView;
                imageView.bringToFront();
                c1Var.d.setVisibility(8);
                c1Var.h = null;
                return;
            case 2:
                o2 o2Var = (o2) obj;
                if (animator == o2Var.f4702r) {
                    o2Var.f4700f = o2Var.h;
                    o2Var.h = -1;
                    o2Var.f4702r = null;
                    return;
                }
                return;
            case 3:
                eg.c1 c1Var2 = (eg.c1) obj;
                if (c1Var2.h) {
                    f10 = 1.0f;
                }
                c1Var2.f5220n = f10;
                c1Var2.e();
                return;
            case 4:
                u2 u2Var = (u2) ((t2) obj).f5500b;
                u2Var.C = true;
                u2Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                fg.i iVar = (fg.i) ((fg.e) obj).f6148b;
                iVar.f6156b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                return;
            case 6:
                gg.b bVar = (gg.b) obj;
                bVar.f6545b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                ih.k kVar = (ih.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    ih.e eVar = (ih.e) it.next();
                    if (kVar.f7587c.size() < kVar.d) {
                        kVar.f7587c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.f7598q;
                if (runnable != null) {
                    runnable.run();
                    kVar.f7598q = null;
                }
                kVar.f7599r = null;
                kVar.invalidateSelf();
                return;
            case 8:
                ((kh.r0) obj).f10889b.f10949w.setVisibility(8);
                return;
            case 9:
                y3 y3Var = (y3) obj;
                y3Var.B = 1.0f;
                y3Var.C = -1;
                x3 x3Var = y3Var.E;
                if (x3Var != null && (z4 = x3Var.f13329l) && z4) {
                    x3Var.f13329l = false;
                    x3Var.b();
                }
                y3Var.D = null;
                return;
            case 10:
                x9 x9Var = ((y9) obj).f13392c;
                x9Var.setScaleX(1.0f);
                x9Var.setScaleY(1.0f);
                return;
            case 11:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                return;
            case 12:
                ((n2) obj).run();
                return;
            case 13:
                mg.v vVar = (mg.v) obj;
                vVar.setVisibility(8);
                mg.u uVar = vVar.f14139b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f14139b = null;
                }
                vVar.e = null;
                return;
            case 14:
                ((mg.j0) obj).f14020x.c();
                return;
            case 15:
                nh.a aVar = (nh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((nh.p) obj).L.f15412p = false;
                return;
            case 17:
                nh.o0 o0Var = (nh.o0) obj;
                nh.t0 t0Var = o0Var.H;
                if (t0Var != null && o0Var.F == t0Var.f15876a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    o0Var.G = ofFloat;
                    ofFloat.addUpdateListener(new dg.o1(this, 24));
                    o0Var.G.setStartDelay(3000L);
                    o0Var.G.setDuration(550L);
                    o0Var.G.setInterpolator(new LinearInterpolator());
                    o0Var.G.start();
                    return;
                }
                return;
            case 18:
                ((nh.j1) obj).F = null;
                return;
            case 19:
                nh.o2 o2Var2 = (nh.o2) obj;
                o2Var2.f15682o5.invalidate();
                o2Var2.setAnimatedTop(0);
                o2Var2.f15682o5.S2 = true;
                View view = o2Var2.C1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var2.C1.setTranslationY(((1.0f - o2Var2.getTopViewEnterProgress()) * o2Var2.C1.getLayoutParams().height) + o2Var2.P1);
                }
                o2Var2.f15682o5.f15166b2 = null;
                return;
            case 20:
                z3 z3Var = (z3) obj;
                z3Var.f16094c[1].setVisibility(8);
                z3Var.f16094c[0].setAlpha(1.0f);
                z3Var.f16094c[0].setTranslationY(0.0f);
                return;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                a01 a01Var = profileStoriesView.h;
                profileStoriesView.D = 1.0f;
                a01Var.O = 1.0f;
                a01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 22:
                ((i4) obj).J = null;
                return;
            case 23:
                t4 t4Var = (t4) obj;
                t4Var.f15892w = null;
                t4Var.f15890r = 1.0f;
                t4Var.invalidate();
                return;
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 25:
                z7 z7Var = (z7) obj;
                z7Var.E = false;
                z7Var.D = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                return;
            case 26:
                n4 n4Var = (n4) obj;
                Runnable runnable2 = n4Var.X;
                if (runnable2 != null) {
                    runnable2.run();
                    n4Var.X = null;
                    return;
                }
                return;
            case 27:
                a4 a4Var = (a4) obj;
                a4Var.f32447w = 1.0f;
                a4Var.n();
                a4Var.i();
                a4Var.h();
                a4Var.f32440a.unlock();
                return;
            case 28:
                v4 v4Var = (v4) obj;
                v4Var.getClass();
                v4Var.setVisibility(8);
                return;
            case 29:
                y4 y4Var = (y4) obj;
                y4Var.f40136c = false;
                y4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2426a) {
            case 24:
                super.onAnimationStart(animator);
                x6 x6Var = (x6) this.f2427b;
                gj0 gj0Var = ((w6) x6Var.f16039a.get(x6Var.d)).f16014c;
                gj0Var.J = 2;
                gj0Var.start();
                return;
            case 28:
                ((v4) this.f2427b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
