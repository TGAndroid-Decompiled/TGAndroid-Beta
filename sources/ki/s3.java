package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.du;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.dw0;
import org.telegram.ui.f8;
import org.telegram.ui.i8;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.t5;
import org.telegram.ui.t9;
public final class s3 extends AnimatorListenerAdapter {
    public final int f18549a;
    public final Object f18550b;

    public s3(Object obj, int i7) {
        this.f18549a = i7;
        this.f18550b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18549a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18550b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1879w = false;
                return;
            case 28:
                l7 l7Var = (l7) this.f18550b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
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
        float f10;
        float f11;
        switch (this.f18549a) {
            case 0:
                ((y3) this.f18550b).J.setVisibility(8);
                return;
            case 1:
                super.onAnimationEnd(animator);
                lg.g gVar = (lg.g) this.f18550b;
                if (!gVar.f19442j1) {
                    gVar.f19457v0 = false;
                    gVar.f19456u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f19435g0 = false;
                return;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18550b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1879w = false;
                return;
            case 3:
                ((ng.e) this.f18550b).h.setVisibility(8);
                return;
            case 4:
                ((CropAreaView) this.f18550b).f32482d0 = null;
                return;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.f23602l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f18550b);
                    return;
                }
                return;
            case 6:
                u51 u51Var = ((MediaController) this.f18550b).f22353j0;
                if (u51Var != null) {
                    u51Var.g0();
                    return;
                }
                return;
            case 7:
                try {
                    ((u51) this.f18550b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((du) this.f18550b).f23153w = null;
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18550b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f28386n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(f10);
                    }
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f18550b;
                if (!i1Var.f28648e) {
                    i1Var.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f18550b;
                if (c3Var.G == animator) {
                    c3Var.H = c3Var.I;
                    Iterator it = c3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f18550b;
                org.telegram.ui.ActionBar.c3 c3Var2 = j3Var.f28725a;
                if (c3Var2 != null) {
                    c3Var2.f28481b = true;
                    c3Var2.invalidate();
                }
                if (j3Var.V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                j3Var.W = f11;
                j3Var.invalidate();
                if (!j3Var.V) {
                    j3Var.S.clear();
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                Runnable runnable = (Runnable) this.f18550b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f18550b;
                Runnable runnable2 = g4Var.f47315b0;
                if (runnable2 != null) {
                    runnable2.run();
                    g4Var.f47315b0 = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) this.f18550b;
                t3Var.f51341x = 1.0f;
                t3Var.A();
                t3Var.u();
                t3Var.r();
                t3Var.f51332a.e();
                return;
            case 16:
                q4 q4Var = (q4) this.f18550b;
                q4Var.getClass();
                q4Var.setVisibility(8);
                return;
            case 17:
                t4 t4Var = (t4) this.f18550b;
                t4Var.f51349c = false;
                t4Var.invalidate();
                return;
            case 18:
                ((t5) this.f18550b).f51366i0.setVisibility(8);
                return;
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((t9) this.f18550b).f51507w = null;
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f18550b;
                ((dw0) jVar).f46496f0.f48138e.f43078c.f58492r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f18550b;
                Button button = vVar.f31777n;
                dg0 dg0Var = vVar.f31776f;
                if (button == dg0Var) {
                    vVar.f31775e.setVisibility(4);
                    return;
                } else {
                    dg0Var.setVisibility(4);
                    return;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f18550b).f30082x = null;
                return;
            case 24:
                ((org.telegram.ui.Cells.h4) this.f18550b).H = null;
                return;
            case 25:
                q5 q5Var = (q5) this.f18550b;
                if (animator.equals(q5Var.f31287n)) {
                    q5Var.f31287n = null;
                    return;
                }
                return;
            case 26:
                j6.o oVar = (j6.o) this.f18550b;
                if (animator.equals(((s5) oVar.f16886b).d)) {
                    ((s5) oVar.f16886b).d = null;
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.i3(((s5) this.f18550b).f31416e, 1000L);
                return;
            case 28:
                l7 l7Var = (l7) this.f18550b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    return;
                }
                return;
            case 29:
                n7 n7Var = (n7) this.f18550b;
                n7Var.f30757n.P0 = true;
                n7Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18549a) {
            case 16:
                ((q4) this.f18550b).setVisibility(0);
                return;
            case 19:
                i8 i8Var = (i8) this.f18550b;
                for (int i7 = 0; i7 < i8Var.f47940b.getChildCount(); i7++) {
                    f8.a((f8) i8Var.f47940b.getChildAt(i7), i8Var.Q, i8Var.R);
                }
                return;
            case 21:
                ((dw0) ((org.telegram.ui.Cells.j) this.f18550b)).f46496f0.f48138e.f43078c.f58492r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
