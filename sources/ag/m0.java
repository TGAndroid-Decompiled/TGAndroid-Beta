package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bg.r2;
import cg.v2;
import cg.w2;
import java.util.Iterator;
import jh.w9;
import jh.x9;
import jh.y3;
import jh.z3;
import lh.i4;
import lh.s4;
import lh.v6;
import lh.w6;
import lh.z7;
import nh.n3;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
public final class m0 extends AnimatorListenerAdapter {
    public final int f585a;
    public final Object f586b;

    public m0(Object obj, int i10) {
        this.f585a = i10;
        this.f586b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f585a) {
            case 25:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f586b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f585a;
        float f9 = 0.0f;
        Object obj = this.f586b;
        switch (i10) {
            case 0:
                n0 n0Var = (n0) obj;
                n0Var.f592a.getPainting().c(null, n0Var.f592a.getCurrentColor(), true, null);
                n0Var.f607r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                bg.e1 e1Var = (bg.e1) obj;
                ImageView imageView = e1Var.f2171c;
                e1Var.f2171c = e1Var.d;
                e1Var.d = imageView;
                imageView.bringToFront();
                e1Var.d.setVisibility(8);
                e1Var.h = null;
                return;
            case 2:
                r2 r2Var = (r2) obj;
                if (animator == r2Var.f2476r) {
                    r2Var.f2474f = r2Var.h;
                    r2Var.h = -1;
                    r2Var.f2476r = null;
                    return;
                }
                return;
            case 3:
                cg.d1 d1Var = (cg.d1) obj;
                if (d1Var.h) {
                    f9 = 1.0f;
                }
                d1Var.f3094n = f9;
                d1Var.e();
                return;
            case 4:
                w2 w2Var = (w2) ((v2) obj).f3429b;
                w2Var.B = true;
                w2Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                dg.i iVar = (dg.i) ((dg.e) obj).f5582b;
                iVar.f5590b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                return;
            case 6:
                eg.b bVar = (eg.b) obj;
                bVar.f5922b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                gh.k kVar = (gh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    gh.e eVar = (gh.e) it.next();
                    if (kVar.f7405c.size() < kVar.d) {
                        kVar.f7405c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.f7417q;
                if (runnable != null) {
                    runnable.run();
                    kVar.f7417q = null;
                }
                kVar.f7418r = null;
                kVar.invalidateSelf();
                return;
            case 8:
                ((ih.s0) obj).f9369b.f9431w.setVisibility(8);
                return;
            case 9:
                z3 z3Var = (z3) obj;
                z3Var.A = 1.0f;
                z3Var.B = -1;
                y3 y3Var = z3Var.D;
                if (y3Var != null && (z10 = y3Var.f13123l) && z10) {
                    y3Var.f13123l = false;
                    y3Var.b();
                }
                z3Var.C = null;
                return;
            case 10:
                w9 w9Var = ((x9) obj).f13087c;
                w9Var.setScaleX(1.0f);
                w9Var.setScaleY(1.0f);
                return;
            case 11:
                ((jh.w2) obj).run();
                return;
            case 12:
                kg.v vVar = (kg.v) obj;
                vVar.setVisibility(8);
                kg.u uVar = vVar.f13871b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f13871b = null;
                }
                vVar.f13873e = null;
                return;
            case 13:
                ((kg.j0) obj).f13747x.c();
                return;
            case 14:
                lh.a aVar = (lh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 15:
                super.onAnimationEnd(animator);
                ((lh.o) obj).K.f15678p = false;
                return;
            case 16:
                lh.n0 n0Var2 = (lh.n0) obj;
                lh.s0 s0Var = n0Var2.G;
                if (s0Var != null && n0Var2.E == s0Var.f16194a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var2.F = ofFloat;
                    ofFloat.addUpdateListener(new bg.q1(this, 24));
                    n0Var2.F.setStartDelay(3000L);
                    n0Var2.F.setDuration(550L);
                    n0Var2.F.setInterpolator(new LinearInterpolator());
                    n0Var2.F.start();
                    return;
                }
                return;
            case 17:
                ((lh.i1) obj).E = null;
                return;
            case 18:
                lh.n2 n2Var = (lh.n2) obj;
                n2Var.f15971n5.invalidate();
                n2Var.setAnimatedTop(0);
                n2Var.f15971n5.R2 = true;
                View view = n2Var.B1;
                if (view != null && view.getVisibility() == 0) {
                    n2Var.B1.setTranslationY(((1.0f - n2Var.getTopViewEnterProgress()) * n2Var.B1.getLayoutParams().height) + n2Var.O1);
                }
                n2Var.f15971n5.a2 = null;
                return;
            case 19:
                lh.z3 z3Var2 = (lh.z3) obj;
                z3Var2.f16455c[1].setVisibility(8);
                z3Var2.f16455c[0].setAlpha(1.0f);
                z3Var2.f16455c[0].setTranslationY(0.0f);
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                profileStoriesView.C = 1.0f;
                iz0Var.N = 1.0f;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 21:
                ((i4) obj).I = null;
                return;
            case 22:
                s4 s4Var = (s4) obj;
                s4Var.f16213w = null;
                s4Var.f16211r = 1.0f;
                s4Var.invalidate();
                return;
            case 23:
            default:
                super.onAnimationEnd(animator);
                return;
            case 24:
                z7 z7Var = (z7) obj;
                z7Var.D = false;
                z7Var.C = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                return;
            case 25:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                return;
            case 26:
                nh.m mVar = ((nh.g) obj).V;
                if (mVar.f18072c0 == animator) {
                    mVar.f18072c0 = null;
                    mVar.f18076f.getEditText().setScrollY(mVar.U);
                    return;
                }
                return;
            case 27:
                nh.d0 d0Var = (nh.d0) obj;
                d0Var.f17513l = 1.0f;
                nh.e0 e0Var = d0Var.f17517p;
                if (e0Var.f17573n.contains(d0Var)) {
                    d0Var.f17506c.onDetachedFromWindow();
                    v2 v2Var = d0Var.d;
                    if (v2Var != null) {
                        v2Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.f17507e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.f17507e = null;
                    }
                    d0Var.f17508f = false;
                    e0Var.f17573n.remove(d0Var);
                }
                e0Var.invalidate();
                return;
            case 28:
                n3 n3Var = ((nh.v2) obj).h;
                n3Var.B.setVisibility(8);
                n3Var.d.setVisibility(8);
                return;
            case 29:
                t3 t3Var = (t3) obj;
                t3Var.f18600k0 = 1.0f;
                t3Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f585a) {
            case 23:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.f586b;
                xi0 xi0Var = ((v6) w6Var.f16365a.get(w6Var.d)).f16317c;
                xi0Var.I = 2;
                xi0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
