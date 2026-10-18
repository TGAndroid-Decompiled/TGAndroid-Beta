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
    public final int f16146a;
    public final Object f16147b;

    public a(Object obj, int i10) {
        this.f16146a = i10;
        this.f16147b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f16146a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16147b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 16:
                p7 p7Var = (p7) this.f16147b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 29:
                dq dqVar = (dq) this.f16147b;
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
        switch (this.f16146a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16147b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 1:
                ((CropAreaView) this.f16147b).f24190c0 = null;
                return;
            case 2:
                l4 l4Var = (l4) this.f16147b;
                Runnable runnable = l4Var.f38750a0;
                if (runnable != null) {
                    runnable.run();
                    l4Var.f38750a0 = null;
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.f16147b;
                x3Var.f43012w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.f43005a.unlock();
                return;
            case 4:
                w4 w4Var = (w4) this.f16147b;
                w4Var.getClass();
                w4Var.setVisibility(8);
                return;
            case 5:
                z4 z4Var = (z4) this.f16147b;
                z4Var.f43583c = false;
                z4Var.invalidate();
                return;
            case 6:
                ((z5) this.f16147b).f43593f0.setVisibility(8);
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                ((y9) this.f16147b).f43388w = null;
                return;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16147b;
                ((yz0) jVar).f43532c0.e.f33590c.f45949r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f16147b;
                Button button = wVar.f23679n;
                ti0 ti0Var = wVar.f23678f;
                if (button == ti0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ti0Var.setVisibility(4);
                    return;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f16147b).f22178x = null;
                return;
            case 12:
                ((f4) this.f16147b).G = null;
                return;
            case 13:
                s5 s5Var = (s5) this.f16147b;
                if (animator.equals(s5Var.f23010n)) {
                    s5Var.f23010n = null;
                    return;
                }
                return;
            case 14:
                androidx.activity.i iVar = (androidx.activity.i) this.f16147b;
                if (animator.equals(((u5) iVar.f2654b).d)) {
                    ((u5) iVar.f2654b).d = null;
                    return;
                }
                return;
            case 15:
                AndroidUtilities.runOnUIThread(((u5) this.f16147b).e, 1000L);
                return;
            case 16:
                p7 p7Var = (p7) this.f16147b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 17:
                s7 s7Var = (s7) this.f16147b;
                s7Var.f23042n.isMediaSpoilersRevealedInSharedMedia = true;
                s7Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                ca caVar = (ca) this.f16147b;
                ((da) caVar.f22115b).f22157a.getTransitionParams().j();
                ((da) caVar.f22115b).f22157a.getTransitionParams().f23094g = false;
                ((da) caVar.f22115b).f22157a.getTransitionParams().K1 = 1.0f;
                return;
            case 19:
                org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f16147b;
                if (animator.equals(((xb) k3Var.f38401b).R)) {
                    ((xb) k3Var.f38401b).R = null;
                    return;
                }
                return;
            case 20:
                xb xbVar = (xb) this.f16147b;
                if (animator.equals(xbVar.R)) {
                    xbVar.R = null;
                    return;
                }
                return;
            case 21:
                ((ec) this.f16147b).I.setVisibility(8);
                return;
            case 22:
                dd ddVar = (dd) this.f16147b;
                nc ncVar = ddVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) ddVar.m0.getParent()).removeView(ddVar.m0);
                    }
                    ddVar.m0 = null;
                }
                ddVar.f36175o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 23:
                vh vhVar = (vh) this.f16147b;
                if (vhVar.f42224a) {
                    vhVar.d.setTranslationY(0.0f);
                }
                if (vhVar.f42225b) {
                    vhVar.e.setTranslationY(0.0f);
                }
                if (vhVar.f42227f) {
                    vhVar.h.setTranslationY(0.0f);
                }
                w9 w9Var = vhVar.f42226c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                vhVar.f42228n.H2[1] = null;
                return;
            case 24:
                hk hkVar = (hk) this.f16147b;
                hkVar.setAnimatedTop(0);
                View view = hkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    hkVar.G1.setTranslationY(((1.0f - hkVar.getTopViewEnterProgress()) * hkVar.G1.getLayoutParams().height) + hkVar.T1);
                }
                hkVar.f37589r5.p9 = null;
                return;
            case 25:
                r40 r40Var = ((qi) this.f16147b).f40447b.f41219e2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    return;
                }
                return;
            case 26:
                me meVar = (me) this.f16147b;
                r60 r60Var = ((fm) ((zl) meVar.f1875c).f43788c).Q.f41181b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    ((fm) ((zl) meVar.f1875c).f43788c).Q.f41181b3.c(true);
                    ((fm) ((zl) meVar.f1875c).f43788c).Q.f41181b3.setVisibility(4);
                    return;
                }
                return;
            case 27:
                em emVar = (em) this.f16147b;
                fm fmVar = emVar.f36571b;
                ArrayList arrayList = fmVar.Q.f41333n6;
                org.telegram.ui.Cells.u1 u1Var = emVar.f36570a;
                arrayList.remove(u1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.f41454x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23166x0 = false;
                return;
            case 28:
                np npVar = (np) this.f16147b;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                View view3 = npVar.f39515a0;
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
        switch (this.f16146a) {
            case 4:
                ((w4) this.f16147b).setVisibility(0);
                return;
            case 7:
                k8 k8Var = (k8) this.f16147b;
                for (int i10 = 0; i10 < k8Var.f38424b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f38424b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 9:
                ((yz0) ((org.telegram.ui.Cells.j) this.f16147b)).f43532c0.e.f33590c.f45949r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
