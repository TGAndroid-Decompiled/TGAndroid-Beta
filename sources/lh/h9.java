package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.ck;
import org.telegram.ui.dm;
import org.telegram.ui.ni;
import org.telegram.ui.ql;
import org.telegram.ui.qz0;
import org.telegram.ui.wk;
import org.telegram.ui.xc;

public final class h9 extends AnimatorListenerAdapter {

    public final int f16077a;

    public final Object f16078b;

    public h9(Object obj, int i10) {
        this.f16077a = i10;
        this.f16078b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16077a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16078b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            case 19:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.f16078b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f16077a) {
            case 0:
                i9 i9Var = (i9) this.f16078b;
                i9Var.setTranslationY(0.0f);
                i9Var.d = null;
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16078b;
                actionBarOverlayLayout.I = null;
                actionBarOverlayLayout.v = false;
                break;
            case 2:
                nh.w wVar = (nh.w) this.f16078b;
                wVar.setVisibility(8);
                wVar.f19008a = null;
                break;
            case 3:
                ((nh.b3) this.f16078b).f18601y.setVisibility(8);
                break;
            case 4:
                ((nh.e4) this.f16078b).E.setVisibility(8);
                break;
            case 5:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f16078b;
                Runnable runnable = m4Var.W;
                if (runnable != null) {
                    runnable.run();
                    m4Var.W = null;
                }
                break;
            case 6:
                org.telegram.ui.z3 z3Var = (org.telegram.ui.z3) this.f16078b;
                z3Var.f45011w = 1.0f;
                z3Var.n();
                z3Var.i();
                z3Var.h();
                z3Var.f45003a.unlock();
                break;
            case 7:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.f16078b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                break;
            case 8:
                org.telegram.ui.u4 u4Var = (org.telegram.ui.u4) this.f16078b;
                u4Var.f43106c = false;
                u4Var.invalidate();
                break;
            case 9:
                ((org.telegram.ui.v5) this.f16078b).f43356b0.setVisibility(8);
                break;
            case 10:
            default:
                super.onAnimationEnd(animator);
                break;
            case 11:
                ((org.telegram.ui.t9) this.f16078b).f42826s = null;
                break;
            case 12:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16078b;
                ((qz0) jVar).V.f43554e.f35935c.f5723r = false;
                FrameLayout frameLayout = jVar.F;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                }
                break;
            case 13:
                org.telegram.ui.Cells.w wVar2 = (org.telegram.ui.Cells.w) this.f16078b;
                Button button = wVar2.f25838n;
                lh0 lh0Var = wVar2.f25837f;
                if (button != lh0Var) {
                    lh0Var.setVisibility(4);
                } else {
                    wVar2.f25836e.setVisibility(4);
                }
                break;
            case 14:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f16078b).f24251x = null;
                break;
            case 15:
                ((org.telegram.ui.Cells.d4) this.f16078b).C = null;
                break;
            case 16:
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.f16078b;
                if (animator.equals(q5Var.f25058n)) {
                    q5Var.f25058n = null;
                }
                break;
            case 17:
                m.i3 i3Var = (m.i3) this.f16078b;
                if (animator.equals(((org.telegram.ui.Cells.s5) i3Var.f17352b).d)) {
                    ((org.telegram.ui.Cells.s5) i3Var.f17352b).d = null;
                }
                break;
            case 18:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.s5) this.f16078b).f25636e, 1000L);
                break;
            case 19:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.f16078b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f16078b;
                o7Var.f24799n.isMediaSpoilersRevealedInSharedMedia = true;
                o7Var.invalidate();
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) this.f16078b;
                ((org.telegram.ui.Cells.z9) y9Var.f26013b).f26051a.getTransitionParams().j();
                ((org.telegram.ui.Cells.z9) y9Var.f26013b).f26051a.getTransitionParams().f25118g = false;
                ((org.telegram.ui.Cells.z9) y9Var.f26013b).f26051a.getTransitionParams().K1 = 1.0f;
                break;
            case 22:
                org.telegram.ui.m3 m3Var = (org.telegram.ui.m3) this.f16078b;
                if (animator.equals(((org.telegram.ui.qb) m3Var.f40305b).R)) {
                    ((org.telegram.ui.qb) m3Var.f40305b).R = null;
                }
                break;
            case 23:
                org.telegram.ui.qb qbVar = (org.telegram.ui.qb) this.f16078b;
                if (animator.equals(qbVar.R)) {
                    qbVar.R = null;
                }
                break;
            case 24:
                ((org.telegram.ui.yb) this.f16078b).E.setVisibility(8);
                break;
            case 25:
                xc xcVar = (xc) this.f16078b;
                org.telegram.ui.hc hcVar = xcVar.f44393i0;
                if (hcVar != null) {
                    if (hcVar.getParent() != null) {
                        ((ViewGroup) xcVar.f44393i0.getParent()).removeView(xcVar.f44393i0);
                    }
                    xcVar.f44393i0 = null;
                }
                xcVar.f44395k0 = null;
                super.onAnimationEnd(animator);
                break;
            case 26:
                ck ckVar = (ck) this.f16078b;
                ckVar.setAnimatedTop(0);
                View view = ckVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    ckVar.B1.setTranslationY(((1.0f - ckVar.getTopViewEnterProgress()) * ckVar.B1.getLayoutParams().height) + ckVar.O1);
                }
                ckVar.f37107m5.f42123l9 = null;
                break;
            case 27:
                x30 x30Var = ((ni) this.f16078b).f40839b.a2;
                if (x30Var != null) {
                    x30Var.setVisibility(8);
                }
                break;
            case 28:
                ql qlVar = (ql) this.f16078b;
                if (qlVar.f41698a) {
                    qlVar.d.setTranslationY(0.0f);
                }
                if (qlVar.f41699b) {
                    qlVar.f41701e.setTranslationY(0.0f);
                }
                if (qlVar.f41702f) {
                    qlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.n9 n9Var = qlVar.f41700c;
                if (n9Var != null) {
                    n9Var.setTranslationY(0.0f);
                }
                qlVar.f41703n.D2[1] = null;
                break;
            case 29:
                dh.f fVar = (dh.f) ((ag.x1) this.f16078b).f699c;
                wk wkVar = ((dm) fVar.f4997c).M.X2;
                if (wkVar != null) {
                    wkVar.setIsMessageTransition(false);
                    ((dm) fVar.f4997c).M.X2.h(true);
                    ((dm) fVar.f4997c).M.X2.setVisibility(4);
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16077a) {
            case 7:
                ((org.telegram.ui.r4) this.f16078b).setVisibility(0);
                break;
            case 10:
                org.telegram.ui.h8 h8Var = (org.telegram.ui.h8) this.f16078b;
                for (int i10 = 0; i10 < h8Var.f38700b.getChildCount(); i10++) {
                    org.telegram.ui.e8.a((org.telegram.ui.e8) h8Var.f38700b.getChildAt(i10), h8Var.L, h8Var.M);
                }
                break;
            case 12:
                ((qz0) ((org.telegram.ui.Cells.j) this.f16078b)).V.f43554e.f35935c.f5723r = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
