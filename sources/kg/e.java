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
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.bd;
import org.telegram.ui.dc;
import org.telegram.ui.e01;
import org.telegram.ui.em;
import org.telegram.ui.fm;
import org.telegram.ui.hk;
import org.telegram.ui.i3;
import org.telegram.ui.j4;
import org.telegram.ui.k8;
import org.telegram.ui.mc;
import org.telegram.ui.n8;
import org.telegram.ui.pi;
import org.telegram.ui.u4;
import org.telegram.ui.v3;
import org.telegram.ui.vh;
import org.telegram.ui.wb;
import org.telegram.ui.x4;
import org.telegram.ui.x5;
import org.telegram.ui.y9;
import org.telegram.ui.zl;
public final class e extends AnimatorListenerAdapter {
    public final int f16561a;
    public final Object f16562b;

    public e(Object obj, int i10) {
        this.f16561a = i10;
        this.f16562b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16561a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16562b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 18:
                t7 t7Var = (t7) this.f16562b;
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
        switch (this.f16561a) {
            case 0:
                super.onAnimationEnd(animator);
                h hVar = (h) this.f16562b;
                if (!hVar.f16604i1) {
                    hVar.f16619u0 = false;
                    hVar.f16618t0.setVisibility(8);
                    hVar.invalidate();
                }
                hVar.f16597f0 = false;
                return;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16562b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 2:
                ((mg.e) this.f16562b).h.setVisibility(8);
                return;
            case 3:
                ((CropAreaView) this.f16562b).f26125c0 = null;
                return;
            case 4:
                j4 j4Var = (j4) this.f16562b;
                Runnable runnable = j4Var.f40428a0;
                if (runnable != null) {
                    runnable.run();
                    j4Var.f40428a0 = null;
                    return;
                }
                return;
            case 5:
                v3 v3Var = (v3) this.f16562b;
                v3Var.f44591w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.f44584a.unlock();
                return;
            case 6:
                u4 u4Var = (u4) this.f16562b;
                u4Var.getClass();
                u4Var.setVisibility(8);
                return;
            case 7:
                x4 x4Var = (x4) this.f16562b;
                x4Var.f45635c = false;
                x4Var.invalidate();
                return;
            case 8:
                ((x5) this.f16562b).f45650h0.setVisibility(8);
                return;
            case 9:
            default:
                super.onAnimationEnd(animator);
                return;
            case 10:
                ((y9) this.f16562b).v = null;
                return;
            case 11:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16562b;
                ((e01) jVar).f38963e0.e.f35963c.f47711r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 12:
                v vVar = (v) this.f16562b;
                Button button = vVar.f25495n;
                wi0 wi0Var = vVar.f25494f;
                if (button == wi0Var) {
                    vVar.e.setVisibility(4);
                    return;
                } else {
                    wi0Var.setVisibility(4);
                    return;
                }
            case 13:
                super.onAnimationEnd(animator);
                ((d0) this.f16562b).f23981x = null;
                return;
            case 14:
                ((k4) this.f16562b).G = null;
                return;
            case 15:
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) this.f16562b;
                if (animator.equals(x5Var.f25703n)) {
                    x5Var.f25703n = null;
                    return;
                }
                return;
            case 16:
                g3 g3Var = (g3) this.f16562b;
                if (animator.equals(((z5) g3Var.f17725b).d)) {
                    ((z5) g3Var.f17725b).d = null;
                    return;
                }
                return;
            case 17:
                AndroidUtilities.runOnUIThread(((z5) this.f16562b).e, 1000L);
                return;
            case 18:
                t7 t7Var = (t7) this.f16562b;
                AnimatorSet animatorSet = t7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t7Var.h = null;
                    return;
                }
                return;
            case 19:
                w7 w7Var = (w7) this.f16562b;
                w7Var.f25650n.isMediaSpoilersRevealedInSharedMedia = true;
                w7Var.invalidate();
                return;
            case 20:
                super.onAnimationEnd(animator);
                ha haVar = (ha) this.f16562b;
                ((ia) haVar.f24214b).f24260a.getTransitionParams().j();
                ((ia) haVar.f24214b).f24260a.getTransitionParams().f24872g = false;
                ((ia) haVar.f24214b).f24260a.getTransitionParams().K1 = 1.0f;
                return;
            case 21:
                i3 i3Var = (i3) this.f16562b;
                if (animator.equals(((wb) i3Var.f40130b).R)) {
                    ((wb) i3Var.f40130b).R = null;
                    return;
                }
                return;
            case 22:
                wb wbVar = (wb) this.f16562b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    return;
                }
                return;
            case 23:
                ((dc) this.f16562b).H.setVisibility(8);
                return;
            case 24:
                bd bdVar = (bd) this.f16562b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f38053o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 25:
                vh vhVar = (vh) this.f16562b;
                if (vhVar.f44809a) {
                    vhVar.d.setTranslationY(0.0f);
                }
                if (vhVar.f44810b) {
                    vhVar.e.setTranslationY(0.0f);
                }
                if (vhVar.f44812f) {
                    vhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = vhVar.f44811c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                vhVar.f44813n.T2[1] = null;
                return;
            case 26:
                hk hkVar = (hk) this.f16562b;
                hkVar.setAnimatedTop(0);
                View view = hkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + hkVar.T1);
                }
                hkVar.f40031v5.B9 = null;
                return;
            case 27:
                t40 t40Var = ((pi) this.f16562b).f42558b.f44382q2;
                if (t40Var != null) {
                    t40Var.setVisibility(8);
                    return;
                }
                return;
            case 28:
                ce ceVar = (ce) this.f16562b;
                t60 t60Var = ((fm) ((zl) ceVar.f4473c).f46322c).Q.f44346n3;
                if (t60Var != null) {
                    t60Var.setIsMessageTransition(false);
                    ((fm) ((zl) ceVar.f4473c).f46322c).Q.f44346n3.c(true);
                    ((fm) ((zl) ceVar.f4473c).f46322c).Q.f44346n3.setVisibility(4);
                    return;
                }
                return;
            case 29:
                em emVar = (em) this.f16562b;
                fm fmVar = emVar.f39137b;
                ArrayList arrayList = fmVar.Q.f44502z6;
                s1 s1Var = emVar.f39136a;
                arrayList.remove(s1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.f44471x0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f24945x0 = false;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16561a) {
            case 6:
                ((u4) this.f16562b).setVisibility(0);
                return;
            case 9:
                n8 n8Var = (n8) this.f16562b;
                for (int i10 = 0; i10 < n8Var.f41779b.getChildCount(); i10++) {
                    k8.a((k8) n8Var.f41779b.getChildAt(i10), n8Var.P, n8Var.Q);
                }
                return;
            case 11:
                ((e01) ((org.telegram.ui.Cells.j) this.f16562b)).f38963e0.e.f35963c.f47711r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
