package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.v5;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.s30;
import org.telegram.ui.ak;
import org.telegram.ui.am;
import org.telegram.ui.bm;
import org.telegram.ui.d8;
import org.telegram.ui.g8;
import org.telegram.ui.gc;
import org.telegram.ui.kp;
import org.telegram.ui.li;
import org.telegram.ui.ol;
import org.telegram.ui.pb;
import org.telegram.ui.qz0;
import org.telegram.ui.ri;
import org.telegram.ui.s9;
import org.telegram.ui.t4;
import org.telegram.ui.u5;
import org.telegram.ui.uk;
import org.telegram.ui.xb;
import org.telegram.ui.xc;
public final class x extends AnimatorListenerAdapter {
    public final int f18191a;
    public final Object f18192b;

    public x(Object obj, int i9) {
        this.f18191a = i9;
        this.f18192b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18191a) {
            case 17:
                o7 o7Var = (o7) this.f18192b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
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
        switch (this.f18191a) {
            case 0:
                y yVar = (y) this.f18192b;
                yVar.setVisibility(8);
                yVar.f18204a = null;
                return;
            case 1:
                ((c3) this.f18192b).f17780y.setVisibility(8);
                return;
            case 2:
                ((g4) this.f18192b).E.setVisibility(8);
                return;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18192b;
                Runnable runnable = l4Var.W;
                if (runnable != null) {
                    runnable.run();
                    l4Var.W = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.y3 y3Var = (org.telegram.ui.y3) this.f18192b;
                y3Var.f44706w = 1.0f;
                y3Var.n();
                y3Var.i();
                y3Var.h();
                y3Var.f44698a.unlock();
                return;
            case 5:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.f18192b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 6:
                t4 t4Var = (t4) this.f18192b;
                t4Var.f42849c = false;
                t4Var.invalidate();
                return;
            case 7:
                ((u5) this.f18192b).f43129b0.setVisibility(8);
                return;
            case 8:
            default:
                super.onAnimationEnd(animator);
                return;
            case 9:
                ((s9) this.f18192b).f42601s = null;
                return;
            case 10:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18192b;
                ((qz0) jVar).V.f43616e.f35932c.f5435r = false;
                FrameLayout frameLayout = jVar.F;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.G);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f18192b;
                Button button = wVar.f25820n;
                jh0 jh0Var = wVar.f25819f;
                if (button == jh0Var) {
                    wVar.f25818e.setVisibility(4);
                    return;
                } else {
                    jh0Var.setVisibility(4);
                    return;
                }
            case 12:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f18192b).f24269x = null;
                return;
            case 13:
                ((org.telegram.ui.Cells.g4) this.f18192b).C = null;
                return;
            case 14:
                t5 t5Var = (t5) this.f18192b;
                if (animator.equals(t5Var.f25688n)) {
                    t5Var.f25688n = null;
                    return;
                }
                return;
            case 15:
                m.i3 i3Var = (m.i3) this.f18192b;
                if (animator.equals(((v5) i3Var.f16977b).d)) {
                    ((v5) i3Var.f16977b).d = null;
                    return;
                }
                return;
            case 16:
                AndroidUtilities.runOnUIThread(((v5) this.f18192b).f25795e, 1000L);
                return;
            case 17:
                o7 o7Var = (o7) this.f18192b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 18:
                r7 r7Var = (r7) this.f18192b;
                r7Var.f25107n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                return;
            case 19:
                super.onAnimationEnd(animator);
                ca caVar = (ca) this.f18192b;
                ((da) caVar.f24211b).f24247a.getTransitionParams().j();
                ((da) caVar.f24211b).f24247a.getTransitionParams().f25167g = false;
                ((da) caVar.f24211b).f24247a.getTransitionParams().K1 = 1.0f;
                return;
            case 20:
                org.telegram.ui.l3 l3Var = (org.telegram.ui.l3) this.f18192b;
                if (animator.equals(((pb) l3Var.f39985b).R)) {
                    ((pb) l3Var.f39985b).R = null;
                    return;
                }
                return;
            case 21:
                pb pbVar = (pb) this.f18192b;
                if (animator.equals(pbVar.R)) {
                    pbVar.R = null;
                    return;
                }
                return;
            case 22:
                ((xb) this.f18192b).E.setVisibility(8);
                return;
            case 23:
                xc xcVar = (xc) this.f18192b;
                gc gcVar = xcVar.f44473i0;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) xcVar.f44473i0.getParent()).removeView(xcVar.f44473i0);
                    }
                    xcVar.f44473i0 = null;
                }
                xcVar.f44475k0 = null;
                super.onAnimationEnd(animator);
                return;
            case 24:
                ak akVar = (ak) this.f18192b;
                akVar.setAnimatedTop(0);
                View view = akVar.B1;
                if (view != null && view.getVisibility() == 0) {
                    akVar.B1.setTranslationY(((1.0f - akVar.getTopViewEnterProgress()) * akVar.B1.getLayoutParams().height) + akVar.O1);
                }
                akVar.f36513m5.f41986l9 = null;
                return;
            case 25:
                s30 s30Var = ((li) this.f18192b).f40146b.a2;
                if (s30Var != null) {
                    s30Var.setVisibility(8);
                    return;
                }
                return;
            case 26:
                ol olVar = (ol) this.f18192b;
                if (olVar.f41184a) {
                    olVar.d.setTranslationY(0.0f);
                }
                if (olVar.f41185b) {
                    olVar.f41187e.setTranslationY(0.0f);
                }
                if (olVar.f41188f) {
                    olVar.h.setTranslationY(0.0f);
                }
                o9 o9Var = olVar.f41186c;
                if (o9Var != null) {
                    o9Var.setTranslationY(0.0f);
                }
                olVar.f41189n.D2[1] = null;
                return;
            case 27:
                ch.f fVar = (ch.f) ((fg.j) this.f18192b).f6299c;
                uk ukVar = ((bm) fVar.f2453c).M.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(false);
                    ((bm) fVar.f2453c).M.X2.h(true);
                    ((bm) fVar.f2453c).M.X2.setVisibility(4);
                    return;
                }
                return;
            case 28:
                am amVar = (am) this.f18192b;
                bm bmVar = amVar.f36519b;
                ArrayList arrayList = bmVar.M.f41960j6;
                org.telegram.ui.Cells.t1 t1Var = amVar.f36518a;
                arrayList.remove(t1Var);
                View view2 = bmVar.M.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    bmVar.M.f42077t0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f25239x0 = false;
                return;
            case 29:
                kp kpVar = (kp) this.f18192b;
                kpVar.H = 0.0f;
                kpVar.G = 1.0f;
                View view3 = kpVar.W;
                if (view3 != null) {
                    view3.invalidate();
                }
                kpVar.P.invalidate();
                ri riVar = kpVar.U;
                if (riVar != null) {
                    riVar.run();
                    kpVar.U = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18191a) {
            case 5:
                ((org.telegram.ui.q4) this.f18192b).setVisibility(0);
                return;
            case 8:
                g8 g8Var = (g8) this.f18192b;
                for (int i9 = 0; i9 < g8Var.f38448b.getChildCount(); i9++) {
                    d8.a((d8) g8Var.f38448b.getChildAt(i9), g8Var.L, g8Var.M);
                }
                return;
            case 10:
                ((qz0) ((org.telegram.ui.Cells.j) this.f18192b)).V.f43616e.f35932c.f5435r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
