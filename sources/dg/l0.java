package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import eg.m2;
import fg.s2;
import fg.t2;
import java.util.Iterator;
import mh.x3;
import mh.x9;
import mh.y3;
import mh.y9;
import oh.b4;
import oh.k4;
import oh.p2;
import oh.u4;
import oh.w6;
import oh.x6;
import oh.z7;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l4;
import org.telegram.ui.t4;
import org.telegram.ui.vz0;
import org.telegram.ui.w4;
public final class l0 extends AnimatorListenerAdapter {
    public final int f4577a;
    public final Object f4578b;

    public l0(Object obj, int i10) {
        this.f4577a = i10;
        this.f4578b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f4577a) {
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4578b;
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
        int i10 = this.f4577a;
        float f10 = 0.0f;
        Object obj = this.f4578b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.f4582a.getPainting().c(null, m0Var.f4582a.getCurrentColor(), true, null);
                m0Var.f4597r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                eg.a1 a1Var = (eg.a1) obj;
                ImageView imageView = a1Var.f5059c;
                a1Var.f5059c = a1Var.d;
                a1Var.d = imageView;
                imageView.bringToFront();
                a1Var.d.setVisibility(8);
                a1Var.h = null;
                return;
            case 2:
                m2 m2Var = (m2) obj;
                if (animator == m2Var.f5355r) {
                    m2Var.f5353f = m2Var.h;
                    m2Var.h = -1;
                    m2Var.f5355r = null;
                    return;
                }
                return;
            case 3:
                fg.b1 b1Var = (fg.b1) obj;
                if (b1Var.h) {
                    f10 = 1.0f;
                }
                b1Var.f6249n = f10;
                b1Var.e();
                return;
            case 4:
                t2 t2Var = (t2) ((s2) obj).f6550b;
                t2Var.C = true;
                t2Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                gg.i iVar = (gg.i) ((gg.e) obj).f7079b;
                iVar.f7087b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                return;
            case 6:
                hg.b bVar = (hg.b) obj;
                bVar.f7396b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                jh.k kVar = (jh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    jh.e eVar = (jh.e) it.next();
                    if (kVar.f10135c.size() < kVar.d) {
                        kVar.f10135c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.f10147q;
                if (runnable != null) {
                    runnable.run();
                    kVar.f10147q = null;
                }
                kVar.f10148r = null;
                kVar.invalidateSelf();
                return;
            case 8:
                ((lh.r0) obj).f12918b.f12989w.setVisibility(8);
                return;
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.J = null;
                actionBarOverlayLayout.v = false;
                return;
            case 10:
                y3 y3Var = (y3) obj;
                y3Var.B = 1.0f;
                y3Var.C = -1;
                x3 x3Var = y3Var.E;
                if (x3Var != null && (z4 = x3Var.f15044l) && z4) {
                    x3Var.f15044l = false;
                    x3Var.b();
                }
                y3Var.D = null;
                return;
            case 11:
                x9 x9Var = ((y9) obj).f15112c;
                x9Var.setScaleX(1.0f);
                x9Var.setScaleY(1.0f);
                return;
            case 12:
                ((mh.m2) obj).run();
                return;
            case 13:
                ng.v vVar = (ng.v) obj;
                vVar.setVisibility(8);
                ng.u uVar = vVar.f16224b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f16224b = null;
                }
                vVar.f16226e = null;
                return;
            case 14:
                ((ng.j0) obj).f16099x.c();
                return;
            case 15:
                oh.a aVar = (oh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((oh.o) obj).L.f17236p = false;
                return;
            case 17:
                oh.o0 o0Var = (oh.o0) obj;
                oh.t0 t0Var = o0Var.H;
                if (t0Var != null && o0Var.F == t0Var.f17755a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    o0Var.G = ofFloat;
                    ofFloat.addUpdateListener(new eg.m1(this, 24));
                    o0Var.G.setStartDelay(3000L);
                    o0Var.G.setDuration(550L);
                    o0Var.G.setInterpolator(new LinearInterpolator());
                    o0Var.G.start();
                    return;
                }
                return;
            case 18:
                ((oh.j1) obj).F = null;
                return;
            case 19:
                p2 p2Var = (p2) obj;
                p2Var.f17621o5.invalidate();
                p2Var.setAnimatedTop(0);
                p2Var.f17621o5.S2 = true;
                View view = p2Var.C1;
                if (view != null && view.getVisibility() == 0) {
                    p2Var.C1.setTranslationY(((1.0f - p2Var.getTopViewEnterProgress()) * p2Var.C1.getLayoutParams().height) + p2Var.P1);
                }
                p2Var.f17621o5.f17056b2 = null;
                return;
            case 20:
                b4 b4Var = (b4) obj;
                b4Var.f16888c[1].setVisibility(8);
                b4Var.f16888c[0].setAlpha(1.0f);
                b4Var.f16888c[0].setTranslationY(0.0f);
                return;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                vz0 vz0Var = profileStoriesView.h;
                profileStoriesView.D = 1.0f;
                vz0Var.O = 1.0f;
                vz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 22:
                ((k4) obj).J = null;
                return;
            case 23:
                u4 u4Var = (u4) obj;
                u4Var.f17817w = null;
                u4Var.f17815r = 1.0f;
                u4Var.invalidate();
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
                l4 l4Var = (l4) obj;
                Runnable runnable2 = l4Var.X;
                if (runnable2 != null) {
                    runnable2.run();
                    l4Var.X = null;
                    return;
                }
                return;
            case 27:
                org.telegram.ui.y3 y3Var2 = (org.telegram.ui.y3) obj;
                y3Var2.f43538w = 1.0f;
                y3Var2.n();
                y3Var2.i();
                y3Var2.h();
                y3Var2.f43530a.unlock();
                return;
            case 28:
                t4 t4Var = (t4) obj;
                t4Var.getClass();
                t4Var.setVisibility(8);
                return;
            case 29:
                w4 w4Var = (w4) obj;
                w4Var.f42373c = false;
                w4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f4577a) {
            case 24:
                super.onAnimationStart(animator);
                x6 x6Var = (x6) this.f4578b;
                ij0 ij0Var = ((w6) x6Var.f17928a.get(x6Var.d)).f17901c;
                ij0Var.J = 2;
                ij0Var.start();
                return;
            case 28:
                ((t4) this.f4578b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
