package m;

import ai.me;
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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.u5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dd;
import org.telegram.ui.dq;
import org.telegram.ui.ec;
import org.telegram.ui.em;
import org.telegram.ui.fm;
import org.telegram.ui.h8;
import org.telegram.ui.hk;
import org.telegram.ui.k8;
import org.telegram.ui.l4;
import org.telegram.ui.nc;
import org.telegram.ui.np;
import org.telegram.ui.qi;
import org.telegram.ui.vh;
import org.telegram.ui.vi;
import org.telegram.ui.w4;
import org.telegram.ui.x3;
import org.telegram.ui.xb;
import org.telegram.ui.y9;
import org.telegram.ui.yz0;
import org.telegram.ui.z4;
import org.telegram.ui.z5;
import org.telegram.ui.zl;
public final class a extends AnimatorListenerAdapter {
    public final int f16144a;
    public final Object f16145b;

    public a(Object obj, int i10) {
        this.f16144a = i10;
        this.f16145b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f16144a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16145b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 16:
                p7 p7Var = (p7) this.f16145b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 29:
                dq dqVar = (dq) this.f16145b;
                as asVar = dqVar.h;
                if (dqVar.H) {
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
        switch (this.f16144a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16145b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 1:
                ((CropAreaView) this.f16145b).f24183c0 = null;
                return;
            case 2:
                l4 l4Var = (l4) this.f16145b;
                Runnable runnable = l4Var.f38705a0;
                if (runnable != null) {
                    runnable.run();
                    l4Var.f38705a0 = null;
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.f16145b;
                x3Var.f42976w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.f42969a.unlock();
                return;
            case 4:
                w4 w4Var = (w4) this.f16145b;
                w4Var.getClass();
                w4Var.setVisibility(8);
                return;
            case 5:
                z4 z4Var = (z4) this.f16145b;
                z4Var.f43547c = false;
                z4Var.invalidate();
                return;
            case 6:
                ((z5) this.f16145b).f43557f0.setVisibility(8);
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                ((y9) this.f16145b).f43350w = null;
                return;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16145b;
                ((yz0) jVar).f43496c0.e.f33583c.f45901r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f16145b;
                Button button = wVar.f23672n;
                ti0 ti0Var = wVar.f23671f;
                if (button == ti0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ti0Var.setVisibility(4);
                    return;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f16145b).f22171x = null;
                return;
            case 12:
                ((f4) this.f16145b).G = null;
                return;
            case 13:
                s5 s5Var = (s5) this.f16145b;
                if (animator.equals(s5Var.f23003n)) {
                    s5Var.f23003n = null;
                    return;
                }
                return;
            case 14:
                androidx.activity.i iVar = (androidx.activity.i) this.f16145b;
                if (animator.equals(((u5) iVar.f2654b).d)) {
                    ((u5) iVar.f2654b).d = null;
                    return;
                }
                return;
            case 15:
                AndroidUtilities.runOnUIThread(((u5) this.f16145b).e, 1000L);
                return;
            case 16:
                p7 p7Var = (p7) this.f16145b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 17:
                s7 s7Var = (s7) this.f16145b;
                s7Var.f23035n.isMediaSpoilersRevealedInSharedMedia = true;
                s7Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                ca caVar = (ca) this.f16145b;
                ((da) caVar.f22108b).f22150a.getTransitionParams().j();
                ((da) caVar.f22108b).f22150a.getTransitionParams().f23087g = false;
                ((da) caVar.f22108b).f22150a.getTransitionParams().K1 = 1.0f;
                return;
            case 19:
                org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f16145b;
                if (animator.equals(((xb) k3Var.f38386b).R)) {
                    ((xb) k3Var.f38386b).R = null;
                    return;
                }
                return;
            case 20:
                xb xbVar = (xb) this.f16145b;
                if (animator.equals(xbVar.R)) {
                    xbVar.R = null;
                    return;
                }
                return;
            case 21:
                ((ec) this.f16145b).I.setVisibility(8);
                return;
            case 22:
                dd ddVar = (dd) this.f16145b;
                nc ncVar = ddVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) ddVar.m0.getParent()).removeView(ddVar.m0);
                    }
                    ddVar.m0 = null;
                }
                ddVar.f36147o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 23:
                vh vhVar = (vh) this.f16145b;
                if (vhVar.f42185a) {
                    vhVar.d.setTranslationY(0.0f);
                }
                if (vhVar.f42186b) {
                    vhVar.e.setTranslationY(0.0f);
                }
                if (vhVar.f42188f) {
                    vhVar.h.setTranslationY(0.0f);
                }
                w9 w9Var = vhVar.f42187c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                vhVar.f42189n.H2[1] = null;
                return;
            case 24:
                hk hkVar = (hk) this.f16145b;
                hkVar.setAnimatedTop(0);
                View view = hkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + hkVar.T1);
                }
                hkVar.f37551r5.p9 = null;
                return;
            case 25:
                r40 r40Var = ((qi) this.f16145b).f40412b.f41184e2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    return;
                }
                return;
            case 26:
                me meVar = (me) this.f16145b;
                r60 r60Var = ((fm) ((zl) meVar.f1871c).f43748c).Q.f41146b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    ((fm) ((zl) meVar.f1871c).f43748c).Q.f41146b3.c(true);
                    ((fm) ((zl) meVar.f1871c).f43748c).Q.f41146b3.setVisibility(4);
                    return;
                }
                return;
            case 27:
                em emVar = (em) this.f16145b;
                fm fmVar = emVar.f36555b;
                ArrayList arrayList = fmVar.Q.f41298n6;
                org.telegram.ui.Cells.u1 u1Var = emVar.f36554a;
                arrayList.remove(u1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.f41419x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23159x0 = false;
                return;
            case 28:
                np npVar = (np) this.f16145b;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                View view3 = npVar.f39507a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                npVar.T.invalidate();
                vi viVar = npVar.Y;
                if (viVar != null) {
                    viVar.run();
                    npVar.Y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16144a) {
            case 4:
                ((w4) this.f16145b).setVisibility(0);
                return;
            case 7:
                k8 k8Var = (k8) this.f16145b;
                for (int i10 = 0; i10 < k8Var.f38409b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f38409b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 9:
                ((yz0) ((org.telegram.ui.Cells.j) this.f16145b)).f43496c0.e.f33583c.f45901r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
