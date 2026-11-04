package ii;

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
import org.telegram.messenger.ti;
import org.telegram.messenger.yt;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.f8;
import org.telegram.ui.i8;
import org.telegram.ui.s4;
import org.telegram.ui.s9;
import org.telegram.ui.v4;
import org.telegram.ui.v5;
import org.telegram.ui.wv0;
public final class v3 extends AnimatorListenerAdapter {
    public final int f15275a;
    public final Object f15276b;

    public v3(Object obj, int i3) {
        this.f15275a = i3;
        this.f15276b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15275a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f15276b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1358w = false;
                return;
            case 28:
                l7 l7Var = (l7) this.f15276b;
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
        switch (this.f15275a) {
            case 0:
                ((d4) this.f15276b).J.setVisibility(8);
                return;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f15276b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.f1358w = false;
                return;
            case 2:
                super.onAnimationEnd(animator);
                mg.g gVar = (mg.g) this.f15276b;
                if (!gVar.f19349j1) {
                    gVar.f19363v0 = false;
                    gVar.f19362u0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f19342g0 = false;
                return;
            case 3:
                ti tiVar = (ti) this.f15276b;
                tiVar.f25534j = false;
                tiVar.f25533i = false;
                return;
            case 4:
                ((og.e) this.f15276b).h.setVisibility(8);
                return;
            case 5:
                HashMap hashMap = org.telegram.messenger.g0.f22601l0;
                if (hashMap != null) {
                    hashMap.remove((Window) this.f15276b);
                    return;
                }
                return;
            case 6:
                m51 m51Var = ((MediaController) this.f15276b).f21324j0;
                if (m51Var != null) {
                    m51Var.g0();
                    return;
                }
                return;
            case 7:
                try {
                    ((m51) this.f15276b).m0();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                super.onAnimationEnd(animator);
                ((yt) this.f15276b).f26652w = null;
                return;
            case 9:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15276b;
                actionBarPopupWindow$ActionBarPopupWindowLayout.f27337n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.c1)) {
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
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f15276b;
                if (!h1Var.f27555e) {
                    h1Var.j();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.f15276b;
                if (b3Var.G == animator) {
                    b3Var.H = b3Var.I;
                    Iterator it = b3Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f15276b;
                org.telegram.ui.ActionBar.b3 b3Var2 = j3Var.f27653a;
                if (b3Var2 != null) {
                    b3Var2.f27400b = true;
                    b3Var2.invalidate();
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
                Runnable runnable = (Runnable) this.f15276b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f15276b;
                Runnable runnable2 = i4Var.f46079b0;
                if (runnable2 != null) {
                    runnable2.run();
                    i4Var.f46079b0 = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) this.f15276b;
                u3Var.f49958x = 1.0f;
                u3Var.A();
                u3Var.u();
                u3Var.r();
                u3Var.f49949a.e();
                return;
            case 16:
                s4 s4Var = (s4) this.f15276b;
                s4Var.getClass();
                s4Var.setVisibility(8);
                return;
            case 17:
                v4 v4Var = (v4) this.f15276b;
                v4Var.f50376c = false;
                v4Var.invalidate();
                return;
            case 18:
                ((v5) this.f15276b).f50390i0.setVisibility(8);
                return;
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((s9) this.f15276b).f49437w = null;
                return;
            case 21:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f15276b;
                ((wv0) jVar).f51611f0.f44157e.f41735c.f55512r = false;
                FrameLayout frameLayout = jVar.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.L);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f15276b;
                Button button = vVar.f30701n;
                dg0 dg0Var = vVar.f30700f;
                if (button == dg0Var) {
                    vVar.f30699e.setVisibility(4);
                    return;
                } else {
                    dg0Var.setVisibility(4);
                    return;
                }
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f15276b).f29029x = null;
                return;
            case 24:
                ((org.telegram.ui.Cells.h4) this.f15276b).H = null;
                return;
            case 25:
                q5 q5Var = (q5) this.f15276b;
                if (animator.equals(q5Var.f30211n)) {
                    q5Var.f30211n = null;
                    return;
                }
                return;
            case 26:
                mi.b0 b0Var = (mi.b0) this.f15276b;
                if (animator.equals(((s5) b0Var.f19470b).d)) {
                    ((s5) b0Var.f19470b).d = null;
                    return;
                }
                return;
            case 27:
                org.telegram.messenger.g0.i3(((s5) this.f15276b).f30340e, 1000L);
                return;
            case 28:
                l7 l7Var = (l7) this.f15276b;
                AnimatorSet animatorSet = l7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l7Var.h = null;
                    return;
                }
                return;
            case 29:
                n7 n7Var = (n7) this.f15276b;
                n7Var.f29696n.N0 = true;
                n7Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15275a) {
            case 16:
                ((s4) this.f15276b).setVisibility(0);
                return;
            case 19:
                i8 i8Var = (i8) this.f15276b;
                for (int i3 = 0; i3 < i8Var.f46165b.getChildCount(); i3++) {
                    f8.a((f8) i8Var.f46165b.getChildAt(i3), i8Var.Q, i8Var.R);
                }
                return;
            case 21:
                ((wv0) ((org.telegram.ui.Cells.j) this.f15276b)).f51611f0.f44157e.f41735c.f55512r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
