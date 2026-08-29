package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.th0;
import org.telegram.ui.dk;
import org.telegram.ui.em;
import org.telegram.ui.fc;
import org.telegram.ui.oi;
import org.telegram.ui.qz0;
import org.telegram.ui.rl;
import org.telegram.ui.vc;
import org.telegram.ui.xk;
public final class q5 extends AnimatorListenerAdapter {
    public final int f18399a;
    public final Object f18400b;

    public q5(Object obj, int i10) {
        this.f18399a = i10;
        this.f18400b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18399a) {
            case 19:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.f18400b;
                AnimatorSet animatorSet = m7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var.h = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f18399a) {
            case 0:
                super.onAnimationEnd(animator);
                r5 r5Var = (r5) this.f18400b;
                ImageView imageView = r5Var.f18517c;
                r5Var.f18517c = r5Var.d;
                r5Var.d = imageView;
                imageView.bringToFront();
                r5Var.d.setVisibility(8);
                r5Var.h = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((v5) this.f18400b).f18757w = null;
                return;
            case 2:
                t6 t6Var = (t6) this.f18400b;
                if (t6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t6Var.getParent()).removeView(t6Var);
                    return;
                }
                return;
            case 3:
                ((y8) this.f18400b).J = false;
                return;
            case 4:
                w8 w8Var = (w8) this.f18400b;
                w8Var.setTranslationY(0.0f);
                w8Var.d = null;
                return;
            case 5:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f18400b;
                Runnable runnable = m4Var.W;
                if (runnable != null) {
                    runnable.run();
                    m4Var.W = null;
                    return;
                }
                return;
            case 6:
                org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) this.f18400b;
                z3Var.f45052w = 1.0f;
                z3Var.n();
                z3Var.i();
                z3Var.h();
                z3Var.f45044a.unlock();
                return;
            case 7:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.f18400b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                return;
            case 8:
                org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) this.f18400b;
                u4Var.f43175c = false;
                u4Var.invalidate();
                return;
            case 9:
                ((org.telegram.ui.v5) this.f18400b).f43427b0.setVisibility(8);
                return;
            case 10:
            default:
                super.onAnimationEnd(animator);
                return;
            case 11:
                ((org.telegram.ui.r9) this.f18400b).f42008s = null;
                return;
            case 12:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18400b;
                ((qz0) jVar).V.f43803e.f35999c.f6365r = false;
                FrameLayout frameLayout = jVar.F;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f18400b;
                Button button = wVar.f25854n;
                th0 th0Var = wVar.f25853f;
                if (button == th0Var) {
                    wVar.f25852e.setVisibility(4);
                    return;
                } else {
                    th0Var.setVisibility(4);
                    return;
                }
            case 14:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f18400b).f24268x = null;
                return;
            case 15:
                ((org.telegram.ui.Cells.e4) this.f18400b).C = null;
                return;
            case 16:
                org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) this.f18400b;
                if (animator.equals(r5Var2.f25220n)) {
                    r5Var2.f25220n = null;
                    return;
                }
                return;
            case 17:
                lh.m7 m7Var = (lh.m7) this.f18400b;
                if (animator.equals(((org.telegram.ui.Cells.t5) m7Var.f15932b).d)) {
                    ((org.telegram.ui.Cells.t5) m7Var.f15932b).d = null;
                    return;
                }
                return;
            case 18:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.t5) this.f18400b).f25703e, 1000L);
                return;
            case 19:
                org.telegram.ui.Cells.m7 m7Var2 = (org.telegram.ui.Cells.m7) this.f18400b;
                AnimatorSet animatorSet = m7Var2.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    m7Var2.h = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f18400b;
                p7Var.f24991n.isMediaSpoilersRevealedInSharedMedia = true;
                p7Var.invalidate();
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.f18400b;
                ((org.telegram.ui.Cells.aa) z9Var.f26066b).f24101a.getTransitionParams().j();
                ((org.telegram.ui.Cells.aa) z9Var.f26066b).f24101a.getTransitionParams().f25123g = false;
                ((org.telegram.ui.Cells.aa) z9Var.f26066b).f24101a.getTransitionParams().K1 = 1.0f;
                return;
            case 22:
                org.telegram.ui.m3 m3Var = (org.telegram.ui.m3) this.f18400b;
                if (animator.equals(((org.telegram.ui.ob) m3Var.f40360b).R)) {
                    ((org.telegram.ui.ob) m3Var.f40360b).R = null;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.ob obVar = (org.telegram.ui.ob) this.f18400b;
                if (animator.equals(obVar.R)) {
                    obVar.R = null;
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.wb) this.f18400b).E.setVisibility(8);
                return;
            case 25:
                vc vcVar = (vc) this.f18400b;
                fc fcVar = vcVar.f43515i0;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) vcVar.f43515i0.getParent()).removeView(vcVar.f43515i0);
                    }
                    vcVar.f43515i0 = null;
                }
                vcVar.f43517k0 = null;
                super.onAnimationEnd(animator);
                return;
            case 26:
                dk dkVar = (dk) this.f18400b;
                dkVar.setAnimatedTop(0);
                View view = dkVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    dkVar.B1.setTranslationY(((1.0f - dkVar.getTopViewEnterProgress()) * dkVar.B1.getLayoutParams().height) + dkVar.O1);
                }
                dkVar.f37555m5.f42884l9 = null;
                return;
            case 27:
                g40 g40Var = ((oi) this.f18400b).f41182b.a2;
                if (g40Var != null) {
                    g40Var.setVisibility(8);
                    return;
                }
                return;
            case 28:
                rl rlVar = (rl) this.f18400b;
                if (rlVar.f42129a) {
                    rlVar.d.setTranslationY(0.0f);
                }
                if (rlVar.f42130b) {
                    rlVar.f42132e.setTranslationY(0.0f);
                }
                if (rlVar.f42133f) {
                    rlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.t9 t9Var = rlVar.f42131c;
                if (t9Var != null) {
                    t9Var.setTranslationY(0.0f);
                }
                rlVar.f42134n.D2[1] = null;
                return;
            case 29:
                fh.f fVar = (fh.f) ((bg.c3) this.f18400b).f2125c;
                xk xkVar = ((em) fVar.f6792c).M.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(false);
                    ((em) fVar.f6792c).M.X2.h(true);
                    ((em) fVar.f6792c).M.X2.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18399a) {
            case 7:
                ((org.telegram.ui.r4) this.f18400b).setVisibility(0);
                return;
            case 10:
                org.telegram.ui.f8 f8Var = (org.telegram.ui.f8) this.f18400b;
                for (int i10 = 0; i10 < f8Var.f38021b.getChildCount(); i10++) {
                    org.telegram.ui.c8.a((org.telegram.ui.c8) f8Var.f38021b.getChildAt(i10), f8Var.L, f8Var.M);
                }
                return;
            case 12:
                ((qz0) ((org.telegram.ui.Cells.j) this.f18400b)).V.f43803e.f35999c.f6365r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
