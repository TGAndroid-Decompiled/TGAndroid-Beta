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
import org.telegram.ui.Components.ui0;
import org.telegram.ui.bd;
import org.telegram.ui.bq;
import org.telegram.ui.cc;
import org.telegram.ui.cm;
import org.telegram.ui.dm;
import org.telegram.ui.fk;
import org.telegram.ui.h8;
import org.telegram.ui.k8;
import org.telegram.ui.l4;
import org.telegram.ui.lc;
import org.telegram.ui.lp;
import org.telegram.ui.oi;
import org.telegram.ui.th;
import org.telegram.ui.ti;
import org.telegram.ui.vb;
import org.telegram.ui.w4;
import org.telegram.ui.w9;
import org.telegram.ui.wz0;
import org.telegram.ui.x3;
import org.telegram.ui.xl;
import org.telegram.ui.z4;
import org.telegram.ui.z5;
public final class a extends AnimatorListenerAdapter {
    public final int f16145a;
    public final Object f16146b;

    public a(Object obj, int i10) {
        this.f16145a = i10;
        this.f16146b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f16145a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16146b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 16:
                p7 p7Var = (p7) this.f16146b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 29:
                bq bqVar = (bq) this.f16146b;
                as asVar = bqVar.h;
                if (bqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                asVar.b(f7);
                bqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f16145a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f16146b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                return;
            case 1:
                ((CropAreaView) this.f16146b).f24187c0 = null;
                return;
            case 2:
                l4 l4Var = (l4) this.f16146b;
                Runnable runnable = l4Var.f38759a0;
                if (runnable != null) {
                    runnable.run();
                    l4Var.f38759a0 = null;
                    return;
                }
                return;
            case 3:
                x3 x3Var = (x3) this.f16146b;
                x3Var.f43016w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.f43009a.unlock();
                return;
            case 4:
                w4 w4Var = (w4) this.f16146b;
                w4Var.getClass();
                w4Var.setVisibility(8);
                return;
            case 5:
                z4 z4Var = (z4) this.f16146b;
                z4Var.f43624c = false;
                z4Var.invalidate();
                return;
            case 6:
                ((z5) this.f16146b).f43636f0.setVisibility(8);
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                ((w9) this.f16146b).v = null;
                return;
            case 9:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f16146b;
                ((wz0) jVar).f42980c0.e.f33596c.f45908r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f16146b;
                Button button = wVar.f23676n;
                ui0 ui0Var = wVar.f23675f;
                if (button == ui0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ui0Var.setVisibility(4);
                    return;
                }
            case 11:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f16146b).f22175x = null;
                return;
            case 12:
                ((f4) this.f16146b).G = null;
                return;
            case 13:
                s5 s5Var = (s5) this.f16146b;
                if (animator.equals(s5Var.f23007n)) {
                    s5Var.f23007n = null;
                    return;
                }
                return;
            case 14:
                androidx.activity.i iVar = (androidx.activity.i) this.f16146b;
                if (animator.equals(((u5) iVar.f2650b).d)) {
                    ((u5) iVar.f2650b).d = null;
                    return;
                }
                return;
            case 15:
                AndroidUtilities.runOnUIThread(((u5) this.f16146b).e, 1000L);
                return;
            case 16:
                p7 p7Var = (p7) this.f16146b;
                AnimatorSet animatorSet = p7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p7Var.h = null;
                    return;
                }
                return;
            case 17:
                s7 s7Var = (s7) this.f16146b;
                s7Var.f23039n.isMediaSpoilersRevealedInSharedMedia = true;
                s7Var.invalidate();
                return;
            case 18:
                super.onAnimationEnd(animator);
                ca caVar = (ca) this.f16146b;
                ((da) caVar.f22112b).f22154a.getTransitionParams().j();
                ((da) caVar.f22112b).f22154a.getTransitionParams().f23091g = false;
                ((da) caVar.f22112b).f22154a.getTransitionParams().K1 = 1.0f;
                return;
            case 19:
                org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f16146b;
                if (animator.equals(((vb) k3Var.f38406b).R)) {
                    ((vb) k3Var.f38406b).R = null;
                    return;
                }
                return;
            case 20:
                vb vbVar = (vb) this.f16146b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 21:
                ((cc) this.f16146b).I.setVisibility(8);
                return;
            case 22:
                bd bdVar = (bd) this.f16146b;
                lc lcVar = bdVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f35591o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 23:
                th thVar = (th) this.f16146b;
                if (thVar.f41674a) {
                    thVar.d.setTranslationY(0.0f);
                }
                if (thVar.f41675b) {
                    thVar.e.setTranslationY(0.0f);
                }
                if (thVar.f41677f) {
                    thVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = thVar.f41676c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                thVar.f41678n.H2[1] = null;
                return;
            case 24:
                fk fkVar = (fk) this.f16146b;
                fkVar.setAnimatedTop(0);
                View view = fkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    fkVar.G1.setTranslationY(((1.0f - fkVar.getTopViewEnterProgress()) * fkVar.G1.getLayoutParams().height) + fkVar.T1);
                }
                fkVar.f37025r5.p9 = null;
                return;
            case 25:
                r40 r40Var = ((oi) this.f16146b).f39902b.f40666e2;
                if (r40Var != null) {
                    r40Var.setVisibility(8);
                    return;
                }
                return;
            case 26:
                me meVar = (me) this.f16146b;
                r60 r60Var = ((dm) ((xl) meVar.f1858c).f43233c).Q.f40628b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    ((dm) ((xl) meVar.f1858c).f43233c).Q.f40628b3.c(true);
                    ((dm) ((xl) meVar.f1858c).f43233c).Q.f40628b3.setVisibility(4);
                    return;
                }
                return;
            case 27:
                cm cmVar = (cm) this.f16146b;
                dm dmVar = cmVar.f36009b;
                ArrayList arrayList = dmVar.Q.f40780n6;
                org.telegram.ui.Cells.u1 u1Var = cmVar.f36008a;
                arrayList.remove(u1Var);
                View view2 = dmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    dmVar.Q.f40901x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23163x0 = false;
                return;
            case 28:
                lp lpVar = (lp) this.f16146b;
                lpVar.L = 0.0f;
                lpVar.K = 1.0f;
                View view3 = lpVar.f38961a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                lpVar.T.invalidate();
                ti tiVar = lpVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    lpVar.Y = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16145a) {
            case 4:
                ((w4) this.f16146b).setVisibility(0);
                return;
            case 7:
                k8 k8Var = (k8) this.f16146b;
                for (int i10 = 0; i10 < k8Var.f38442b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f38442b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 9:
                ((wz0) ((org.telegram.ui.Cells.j) this.f16146b)).f42980c0.e.f33596c.f45908r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
