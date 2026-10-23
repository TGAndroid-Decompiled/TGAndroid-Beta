package m;

import ai.ne;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.a01;
import org.telegram.ui.bd;
import org.telegram.ui.cc;
import org.telegram.ui.dm;
import org.telegram.ui.dq;
import org.telegram.ui.em;
import org.telegram.ui.gk;
import org.telegram.ui.h8;
import org.telegram.ui.k4;
import org.telegram.ui.k8;
import org.telegram.ui.lc;
import org.telegram.ui.np;
import org.telegram.ui.oi;
import org.telegram.ui.th;
import org.telegram.ui.ti;
import org.telegram.ui.v4;
import org.telegram.ui.vb;
import org.telegram.ui.w3;
import org.telegram.ui.w9;
import org.telegram.ui.y4;
import org.telegram.ui.y5;
import org.telegram.ui.yl;
public final class a extends AnimatorListenerAdapter {
    public final int f16208a;
    public final Object f16209b;

    public a(Object obj, int i10) {
        this.f16208a = i10;
        this.f16209b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f16208a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16209b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 16:
                p7 p7Var = (p7) this.f16209b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 29:
                dq dqVar = (dq) this.f16209b;
                as asVar = dqVar.h;
                if (dqVar.I) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                asVar.b(f7);
                dqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f16208a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16209b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 1:
                ((CropAreaView) this.f16209b).f24332c0 = null;
                return;
            case 2:
                k4 k4Var = (k4) this.f16209b;
                Runnable runnable = k4Var.f38784a0;
                if (runnable != null) {
                    runnable.run();
                    k4Var.f38784a0 = null;
                    return;
                }
                return;
            case 3:
                w3 w3Var = (w3) this.f16209b;
                w3Var.f42915w = 1.0f;
                w3Var.n();
                w3Var.i();
                w3Var.h();
                w3Var.f42908a.unlock();
                return;
            case 4:
                v4 v4Var = (v4) this.f16209b;
                v4Var.getClass();
                v4Var.setVisibility(8);
                return;
            case 5:
                y4 y4Var = (y4) this.f16209b;
                y4Var.f43710c = false;
                y4Var.invalidate();
                return;
            case 6:
                ((y5) this.f16209b).f43721h0.setVisibility(8);
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                ((w9) this.f16209b).v = null;
                return;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16209b;
                ((a01) jVar).f35543e0.e.f33897c.f46334r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f16209b;
                Button button = vVar.f23750n;
                xi0 xi0Var = vVar.f23749f;
                if (button == xi0Var) {
                    vVar.e.setVisibility(4);
                    return;
                } else {
                    xi0Var.setVisibility(4);
                    return;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.d0) this.f16209b).f22252x = null;
                return;
            case 12:
                ((f4) this.f16209b).G = null;
                return;
            case 13:
                s5 s5Var = (s5) this.f16209b;
                if (animator.equals(s5Var.f23251n)) {
                    s5Var.f23251n = null;
                    return;
                }
                return;
            case 14:
                u5 u5Var = (u5) this.f16209b;
                if (animator.equals(((v5) u5Var.f23735b).d)) {
                    ((v5) u5Var.f23735b).d = null;
                    return;
                }
                return;
            case 15:
                AndroidUtilities.runOnUIThread(((v5) this.f16209b).e, 1000L);
                return;
            case 16:
                p7 p7Var = (p7) this.f16209b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 17:
                s7 s7Var = (s7) this.f16209b;
                s7Var.f23275n.isMediaSpoilersRevealedInSharedMedia = true;
                s7Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                da daVar = (da) this.f16209b;
                ((ea) daVar.f22294b).f22345a.getTransitionParams().j();
                ((ea) daVar.f22294b).f22345a.getTransitionParams().f23155g = false;
                ((ea) daVar.f22294b).f22345a.getTransitionParams().K1 = 1.0f;
                return;
            case 19:
                org.telegram.ui.j3 j3Var = (org.telegram.ui.j3) this.f16209b;
                if (animator.equals(((vb) j3Var.f38452b).R)) {
                    ((vb) j3Var.f38452b).R = null;
                    return;
                }
                return;
            case 20:
                vb vbVar = (vb) this.f16209b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 21:
                ((cc) this.f16209b).I.setVisibility(8);
                return;
            case 22:
                bd bdVar = (bd) this.f16209b;
                lc lcVar = bdVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f36035o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 23:
                th thVar = (th) this.f16209b;
                if (thVar.f42006a) {
                    thVar.d.setTranslationY(0.0f);
                }
                if (thVar.f42007b) {
                    thVar.e.setTranslationY(0.0f);
                }
                if (thVar.f42009f) {
                    thVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = thVar.f42008c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                thVar.f42010n.T2[1] = null;
                return;
            case 24:
                gk gkVar = (gk) this.f16209b;
                gkVar.setAnimatedTop(0);
                View view = gkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    gkVar.G1.setTranslationY(((1.0f - gkVar.getTopViewEnterProgress()) * gkVar.G1.getLayoutParams().height) + gkVar.T1);
                }
                gkVar.f37625v5.B9 = null;
                return;
            case 25:
                r40 r40Var = ((oi) this.f16209b).f40211b.f41647q2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    return;
                }
                return;
            case 26:
                ne neVar = (ne) this.f16209b;
                s60 s60Var = ((em) ((yl) neVar.f1923c).f43895c).Q.f41613n3;
                if (s60Var != null) {
                    s60Var.setIsMessageTransition(false);
                    ((em) ((yl) neVar.f1923c).f43895c).Q.f41613n3.c(true);
                    ((em) ((yl) neVar.f1923c).f43895c).Q.f41613n3.setVisibility(4);
                    return;
                }
                return;
            case 27:
                dm dmVar = (dm) this.f16209b;
                em emVar = dmVar.f36656b;
                ArrayList arrayList = emVar.Q.f41768z6;
                org.telegram.ui.Cells.t1 t1Var = dmVar.f36655a;
                arrayList.remove(t1Var);
                View view2 = emVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    emVar.Q.f41737x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23227x0 = false;
                return;
            case 28:
                np npVar = (np) this.f16209b;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                View view3 = npVar.f39940a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                npVar.T.invalidate();
                ti tiVar = npVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    npVar.Y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16208a) {
            case 4:
                ((v4) this.f16209b).setVisibility(0);
                return;
            case 7:
                k8 k8Var = (k8) this.f16209b;
                for (int i10 = 0; i10 < k8Var.f38848b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f38848b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 9:
                ((a01) ((org.telegram.ui.Cells.j) this.f16209b)).f35543e0.e.f33897c.f46334r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
