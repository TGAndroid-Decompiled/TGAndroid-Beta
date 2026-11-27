package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.o;
public final class h0 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public h0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        float f2 = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                i0 i0Var = (i0) obj;
                i0Var.O = null;
                i0Var.M = i0Var.N;
                i0Var.requestLayout();
                return;
            case 1:
                t1 t1Var = (t1) obj;
                ((qr8) t1Var).f0.e.c.r = false;
                FrameLayout frameLayout = t1Var.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(t1Var.L);
                    return;
                }
                return;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                return;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof k8)) {
                        childAt.setTranslationY(0.0f);
                        if (childAt.isEnabled()) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        childAt.setAlpha(f);
                    }
                }
                return;
            case 4:
                ((bv2) obj).run();
                return;
            case 5:
                hb hbVar = (hb) obj;
                if (!hbVar.e) {
                    hbVar.j();
                    return;
                }
                return;
            case 6:
                HashMap hashMap = hl.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) obj);
                    return;
                }
                return;
            case 7:
                rm rmVar = (rm) obj;
                rmVar.d = null;
                rmVar.b.clear();
                return;
            case 8:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) obj;
                animatedPhoneNumberEditText.T1 = null;
                animatedPhoneNumberEditText.R1.clear();
                return;
            case 9:
                super.onAnimationEnd(animator);
                hn hnVar = (hn) obj;
                hnVar.b();
                hnVar.o = null;
                hnVar.j = 0.0f;
                hnVar.m = 0.0f;
                hnVar.l = 0.0f;
                hnVar.k = 0.0f;
                hnVar.r = 0.0f;
                hnVar.q = 0.0f;
                hnVar.invalidateSelf();
                Runnable runnable = hnVar.c0;
                if (runnable != null) {
                    runnable.run();
                }
                hnVar.t = null;
                CharSequence charSequence = hnVar.u;
                if (charSequence != null) {
                    hnVar.t(charSequence, true, hnVar.v);
                    hnVar.u = null;
                    hnVar.v = false;
                    return;
                }
                c1 c1Var = hnVar.J;
                if (c1Var != null) {
                    c1Var.run();
                    return;
                }
                return;
            case 10:
                fs fsVar = (fs) obj;
                Button button = fsVar.n;
                uv8 uv8Var = fsVar.f;
                if (button == uv8Var) {
                    fsVar.e.setVisibility(4);
                    return;
                } else {
                    uv8Var.setVisibility(4);
                    return;
                }
            case 11:
                super.onAnimationEnd(animator);
                dt dtVar = (dt) obj;
                if (dtVar != null) {
                    dtVar.run();
                    return;
                }
                return;
            case 12:
                o oVar = (o) obj;
                Runnable runnable2 = oVar.b0;
                if (runnable2 != null) {
                    runnable2.run();
                    oVar.b0 = null;
                    return;
                }
                return;
            case 13:
                tw twVar = (tw) obj;
                twVar.x = 1.0f;
                twVar.A();
                twVar.t();
                twVar.r();
                twVar.a.e();
                return;
            case 14:
                de0 de0Var = (de0) obj;
                de0Var.setVisibility(8);
                de0Var.setImageDrawable(null);
                de0Var.setAlpha(1.0f);
                return;
            case 15:
                ob0 ob0Var = (ob0) ((ab0) obj).m1;
                ob0Var.f = false;
                ob0Var.e.setVisibility(8);
                return;
            case 16:
                ((sb0) obj).setVisibility(8);
                return;
            case 17:
                vb0 vb0Var = (vb0) obj;
                vb0Var.c = false;
                vb0Var.invalidate();
                return;
            case 18:
                ic0 ic0Var = (ic0) obj;
                if (ic0Var.f != null) {
                    ic0Var.e = 1.0f;
                    ic0Var.k();
                    if (ic0Var.g) {
                        ic0Var.g = false;
                        Runnable runnable3 = ic0Var.j;
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                    ic0Var.d();
                }
                ic0Var.f = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                pf0 pf0Var = (pf0) obj;
                if (!pf0Var.j1) {
                    pf0Var.v0 = false;
                    pf0Var.u0.setVisibility(8);
                    pf0Var.invalidate();
                }
                pf0Var.g0 = false;
                return;
            case 20:
                mm0 mm0Var = (mm0) obj;
                mm0Var.b = 1.0f;
                mm0Var.invalidate();
                return;
            case 21:
                ((lo0) obj).i0.setVisibility(8);
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((wo0) obj).x = null;
                return;
            case 23:
                ap0 ap0Var = (ap0) obj;
                ap0Var.setVisibility(8);
                ap0Var.a = null;
                return;
            case 24:
                ((rv0) obj).s.setVisibility(8);
                return;
            case 25:
                ((xw0) obj).F.setVisibility(8);
                return;
            case 26:
                yx0 yx0Var = (yx0) obj;
                if (yx0Var.G == animator) {
                    yx0Var.H = yx0Var.I;
                    Iterator it = yx0Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                return;
            case 27:
                gy0 gy0Var = (gy0) obj;
                yx0 yx0Var2 = gy0Var.a;
                if (yx0Var2 != null) {
                    yx0Var2.b = true;
                    yx0Var2.invalidate();
                }
                if (gy0Var.V) {
                    f2 = 1.0f;
                }
                gy0Var.W = f2;
                gy0Var.invalidate();
                if (!gy0Var.V) {
                    gy0Var.S.clear();
                    return;
                }
                return;
            case 28:
            default:
                super.onAnimationEnd(animator);
                return;
            case 29:
                ((la1) obj).w = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((qr8) ((t1) obj)).f0.e.c.r = true;
                return;
            case 16:
                ((sb0) obj).setVisibility(0);
                return;
            case 28:
                j81 j81Var = (j81) obj;
                for (int i = 0; i < j81Var.b.getChildCount(); i++) {
                    int i2 = j81Var.Q;
                    int i3 = j81Var.R;
                    int i4 = g81.E;
                    ((g81) j81Var.b.getChildAt(i)).c(i2, i3);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
