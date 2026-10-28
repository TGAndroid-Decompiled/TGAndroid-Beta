package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bi.ce;
import java.util.ArrayList;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.d0;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.v;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bd;
import org.telegram.ui.bm;
import org.telegram.ui.dc;
import org.telegram.ui.g01;
import org.telegram.ui.gm;
import org.telegram.ui.hm;
import org.telegram.ui.i3;
import org.telegram.ui.j4;
import org.telegram.ui.jk;
import org.telegram.ui.k8;
import org.telegram.ui.mc;
import org.telegram.ui.n8;
import org.telegram.ui.si;
import org.telegram.ui.u4;
import org.telegram.ui.v3;
import org.telegram.ui.wb;
import org.telegram.ui.x4;
import org.telegram.ui.x5;
import org.telegram.ui.xh;
import org.telegram.ui.y9;
public final class e extends AnimatorListenerAdapter {
    public final int f16560a;
    public final Object f16561b;

    public e(Object obj, int i10) {
        this.f16560a = i10;
        this.f16561b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16560a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16561b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 18:
                t7 t7Var = (t7) this.f16561b;
                AnimatorSet animatorSet = t7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t7Var.h = null;
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
        switch (this.f16560a) {
            case 0:
                super.onAnimationEnd(animator);
                h hVar = (h) this.f16561b;
                if (!hVar.f16603i1) {
                    hVar.f16618u0 = false;
                    hVar.f16617t0.setVisibility(8);
                    hVar.invalidate();
                }
                hVar.f16596f0 = false;
                return;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16561b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 2:
                ((mg.e) this.f16561b).h.setVisibility(8);
                return;
            case 3:
                ((CropAreaView) this.f16561b).f26127c0 = null;
                return;
            case 4:
                j4 j4Var = (j4) this.f16561b;
                Runnable runnable = j4Var.f40393a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.f40393a0 = null;
                    return;
                }
                return;
            case 5:
                v3 v3Var = (v3) this.f16561b;
                v3Var.f44173w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.f44166a.unlock();
                return;
            case 6:
                u4 u4Var = (u4) this.f16561b;
                u4Var.getClass();
                u4Var.setVisibility(8);
                return;
            case 7:
                x4 x4Var = (x4) this.f16561b;
                x4Var.f45471c = false;
                x4Var.invalidate();
                return;
            case 8:
                ((x5) this.f16561b).f45483h0.setVisibility(8);
                return;
            case 9:
            default:
                super.onAnimationEnd(animator);
                return;
            case 10:
                ((y9) this.f16561b).v = null;
                return;
            case 11:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16561b;
                ((g01) jVar).f39469e0.e.f35987c.f47746r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 12:
                v vVar = (v) this.f16561b;
                Button button = vVar.f25497n;
                xi0 xi0Var = vVar.f25496f;
                if (button == xi0Var) {
                    vVar.e.setVisibility(4);
                    return;
                } else {
                    xi0Var.setVisibility(4);
                    return;
                }
            case 13:
                super.onAnimationEnd(animator);
                ((d0) this.f16561b).f23982x = null;
                return;
            case 14:
                ((k4) this.f16561b).G = null;
                return;
            case 15:
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) this.f16561b;
                if (animator.equals(x5Var.f25705n)) {
                    x5Var.f25705n = null;
                    return;
                }
                return;
            case 16:
                g3 g3Var = (g3) this.f16561b;
                if (animator.equals(((z5) g3Var.f17724b).d)) {
                    ((z5) g3Var.f17724b).d = null;
                    return;
                }
                return;
            case 17:
                AndroidUtilities.runOnUIThread(((z5) this.f16561b).e, 1000L);
                return;
            case 18:
                t7 t7Var = (t7) this.f16561b;
                AnimatorSet animatorSet = t7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t7Var.h = null;
                    return;
                }
                return;
            case 19:
                w7 w7Var = (w7) this.f16561b;
                w7Var.f25652n.isMediaSpoilersRevealedInSharedMedia = true;
                w7Var.invalidate();
                return;
            case 20:
                super.onAnimationEnd(animator);
                ha haVar = (ha) this.f16561b;
                ((ia) haVar.f24216b).f24262a.getTransitionParams().j();
                ((ia) haVar.f24216b).f24262a.getTransitionParams().f24874g = false;
                ((ia) haVar.f24216b).f24262a.getTransitionParams().K1 = 1.0f;
                return;
            case 21:
                i3 i3Var = (i3) this.f16561b;
                if (animator.equals(((wb) i3Var.f40034b).R)) {
                    ((wb) i3Var.f40034b).R = null;
                    return;
                }
                return;
            case 22:
                wb wbVar = (wb) this.f16561b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    return;
                }
                return;
            case 23:
                ((dc) this.f16561b).H.setVisibility(8);
                return;
            case 24:
                bd bdVar = (bd) this.f16561b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f37995o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 25:
                xh xhVar = (xh) this.f16561b;
                if (xhVar.f45684a) {
                    xhVar.d.setTranslationY(0.0f);
                }
                if (xhVar.f45685b) {
                    xhVar.e.setTranslationY(0.0f);
                }
                if (xhVar.f45687f) {
                    xhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = xhVar.f45686c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                xhVar.f45688n.T2[1] = null;
                return;
            case 26:
                jk jkVar = (jk) this.f16561b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + jkVar.T1);
                }
                jkVar.f40556v5.F9 = null;
                return;
            case 27:
                t40 t40Var = ((si) this.f16561b).f43343b.f45250q2;
                if (t40Var != null) {
                    t40Var.setVisibility(8);
                    return;
                }
                return;
            case 28:
                ce ceVar = (ce) this.f16561b;
                u60 u60Var = ((hm) ((bm) ceVar.f4473c).f38064c).Q.f45214n3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    ((hm) ((bm) ceVar.f4473c).f38064c).Q.f45214n3.c(true);
                    ((hm) ((bm) ceVar.f4473c).f38064c).Q.f45214n3.setVisibility(4);
                    return;
                }
                return;
            case 29:
                gm gmVar = (gm) this.f16561b;
                hm hmVar = gmVar.f39647b;
                ArrayList arrayList = hmVar.Q.D6;
                s1 s1Var = gmVar.f39646a;
                arrayList.remove(s1Var);
                View view2 = hmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    hmVar.Q.f45339x0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f24947x0 = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16560a) {
            case 6:
                ((u4) this.f16561b).setVisibility(0);
                return;
            case 9:
                n8 n8Var = (n8) this.f16561b;
                for (int i10 = 0; i10 < n8Var.f41651b.getChildCount(); i10++) {
                    k8.a((k8) n8Var.f41651b.getChildAt(i10), n8Var.P, n8Var.Q);
                }
                return;
            case 11:
                ((g01) ((org.telegram.ui.Cells.j) this.f16561b)).f39469e0.e.f35987c.f47746r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
