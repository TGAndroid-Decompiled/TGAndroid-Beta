package ah;

import ai.u1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ei.b2;
import ig.c2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.wa1;
public final class d0 extends s4.r0 {
    public final int f686a;
    public final Object f687b;

    public d0(Object obj, int i10) {
        this.f686a = i10;
        this.f687b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        vl0 vl0Var;
        int i11;
        vl0 vl0Var2;
        vl0 vl0Var3;
        int top;
        int i12;
        vl0 vl0Var4;
        vl0 vl0Var5;
        int top2;
        switch (this.f686a) {
            case 7:
                b2 b2Var = (b2) this.f687b;
                if (i10 == 0 && b2Var.f8781n >= 0.0f && !b2Var.f8778b.canScrollVertically(-1)) {
                    b2Var.f8781n = -1.0f;
                    return;
                }
                return;
            case 11:
                hi.h0 h0Var = (hi.h0) this.f687b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c2) this.f687b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                ((ni.e) this.f687b).f17548f++;
                return;
            case 19:
                i8 i8Var = (i8) this.f687b;
                t7 t7Var = i8Var.f27340n;
                if (i10 == 0) {
                    if (i8.m0(i8Var) + ((i8Var.f27358z0 - i8.l0(i8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && t7Var.canScrollVertically(1) && (vl0Var = (vl0) t7Var.K(i8Var.f27350u0 ? 1 : 0)) != null) {
                        View view = vl0Var.f46342a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            t7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(i8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 22:
                gj gjVar = (gj) this.f687b;
                u1 u1Var = gjVar.f26698n;
                ri riVar = gjVar.f27704b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = riVar.f30140d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = riVar.getBackgroundPaddingTop();
                    if (((riVar.f30144e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var2 = (vl0) u1Var.K(0)) != null) {
                        View view2 = vl0Var2.f46342a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            u1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                lk lkVar = (lk) this.f687b;
                ak akVar = lkVar.f28358r;
                ri riVar2 = lkVar.f27704b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = riVar2.getBackgroundPaddingTop();
                    if (((riVar2.f30144e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var3 = (vl0) akVar.K(0)) != null && (top = (vl0Var3.f46342a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        akVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && lkVar.f28352b0 && akVar.getAdapter() == lkVar.f28362y) {
                    AndroidUtilities.hideKeyboard(riVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                lkVar.U = z10;
                return;
            case 25:
                mk mkVar = (mk) this.f687b;
                lm0 lm0Var = mkVar.f28617r;
                ri riVar3 = mkVar.f27704b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = riVar3.f30140d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = riVar3.getBackgroundPaddingTop();
                    if (((riVar3.f30144e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var4 = (vl0) lm0Var.K(0)) != null) {
                        View view3 = vl0Var4.f46342a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            lm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if (i10 == 1) {
                    pl plVar = (pl) this.f687b;
                    if (plVar.f29596i0 && plVar.f29597j0) {
                        AndroidUtilities.hideKeyboard(plVar.f27704b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 27:
                co coVar = (co) this.f687b;
                wa1 wa1Var = coVar.f25392s;
                ri riVar4 = coVar.f27704b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = riVar4.getBackgroundPaddingTop();
                    if (((riVar4.f30144e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var5 = (vl0) wa1Var.K(1)) != null && (top2 = (vl0Var5.f46342a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wa1Var.v0(0, top2, null);
                    }
                    int i15 = coVar.W0;
                    if (i15 >= 0) {
                        co.N(coVar, i15);
                        coVar.W0 = -1;
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
        throw new UnsupportedOperationException("Method not decompiled: ah.d0.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
