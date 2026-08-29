package cg;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.wa1;
public final class g2 extends f2.a1 {
    public final int f3150a;
    public final Object f3151b;

    public g2(Object obj, int i10) {
        this.f3150a = i10;
        this.f3151b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        int i11;
        vk0 vk0Var2;
        vk0 vk0Var3;
        int top;
        int i12;
        vk0 vk0Var4;
        vk0 vk0Var5;
        int top2;
        switch (this.f3150a) {
            case 0:
                h1 h1Var = (h1) this.f3151b;
                if (i10 == 1) {
                    h1Var.Z2 = true;
                }
                if (i10 == 0) {
                    j2 j2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        j2 j2Var2 = (j2) h1Var.getChildAt(i13);
                        if (j2Var == null || j2Var2.f3169a > j2Var.f3169a) {
                            j2Var = j2Var2;
                        }
                    }
                    if (j2Var != null) {
                        h1Var.w1(j2Var, true);
                        h1Var.Z2 = false;
                        h1Var.v0(0, j2Var.getTop() - ((h1Var.getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    h1Var.x1();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(h1Var.f3184a3);
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((eg.g2) this.f3151b).U.getEditText());
                    return;
                }
                return;
            case 12:
                c5 c5Var = (c5) this.f3151b;
                if (i10 == 0) {
                    c5Var.R = true;
                    c5Var.invalidate();
                }
                if (i10 == 1) {
                    c5Var.R = false;
                    ag.j2 j2Var3 = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) j2Var3.f559c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) j2Var3.f559c).cancel();
                        j2Var3.f559c = null;
                    }
                    AndroidUtilities.hideKeyboard(c5Var);
                    return;
                }
                return;
            case 14:
                nh.y1 y1Var = (nh.y1) this.f3151b;
                if (i10 == 0 && y1Var.f18857n >= 0.0f && !y1Var.f18853b.canScrollVertically(-1)) {
                    y1Var.f18857n = -1.0f;
                    return;
                }
                return;
            case 17:
                g8 g8Var = (g8) this.f3151b;
                s7 s7Var = g8Var.f28792n;
                if (i10 == 0) {
                    if (g8.j0(g8Var) + ((g8Var.f28805w0 - g8.i0(g8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && s7Var.canScrollVertically(1) && (vk0Var = (vk0) s7Var.K(g8Var.f28798r0 ? 1 : 0)) != null) {
                        View view = vk0Var.f6432a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            s7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(g8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 20:
                bj bjVar = (bj) this.f3151b;
                jh.e1 e1Var = bjVar.f27120n;
                ni niVar = bjVar.f28403b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i14 = dp + i11;
                    int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
                    if (((niVar.X1[0] - backgroundPaddingTop) - i14) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var2 = (vk0) e1Var.K(0)) != null) {
                        View view2 = vk0Var2.f6432a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            e1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                jk jkVar = (jk) this.f3151b;
                xj xjVar = jkVar.f29678r;
                ni niVar2 = jkVar.f28403b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = niVar2.getBackgroundPaddingTop();
                    if (((niVar2.X1[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var3 = (vk0) xjVar.K(0)) != null && (top = (vk0Var3.f6432a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        xjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && jkVar.U && xjVar.getAdapter() == jkVar.f29682y) {
                    AndroidUtilities.hideKeyboard(niVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                jkVar.Q = z10;
                return;
            case 23:
                kk kkVar = (kk) this.f3151b;
                jl0 jl0Var = kkVar.f30084r;
                ni niVar3 = kkVar.f28403b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = niVar3.W0;
                    if (w0Var2 != null) {
                        i12 = AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i15 = dp3 + i12;
                    int backgroundPaddingTop3 = niVar3.getBackgroundPaddingTop();
                    if (((niVar3.X1[0] - backgroundPaddingTop3) - i15) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var4 = (vk0) jl0Var.K(0)) != null) {
                        View view3 = vk0Var4.f6432a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            jl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                if (i10 == 1) {
                    bl blVar = (bl) this.f3151b;
                    if (blVar.f27159h0 && blVar.f27160i0) {
                        AndroidUtilities.hideKeyboard(blVar.f28403b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 25:
                on onVar = (on) this.f3151b;
                wa1 wa1Var = onVar.f31427s;
                ni niVar4 = onVar.f28403b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = niVar4.getBackgroundPaddingTop();
                    if (((niVar4.X1[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var5 = (vk0) wa1Var.K(1)) != null && (top2 = (vk0Var5.f6432a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wa1Var.v0(0, top2, null);
                    }
                    int i16 = onVar.S0;
                    if (i16 >= 0) {
                        on.J(onVar, i16);
                        onVar.S0 = -1;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: cg.g2.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
