package ah;

import ai.u1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ei.b2;
import ig.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v7;
import org.telegram.ui.ua1;
public final class d0 extends s4.r0 {
    public final int f688a;
    public final Object f689b;

    public d0(Object obj, int i10) {
        this.f688a = i10;
        this.f689b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        sl0 sl0Var;
        int i11;
        sl0 sl0Var2;
        sl0 sl0Var3;
        int top;
        int i12;
        sl0 sl0Var4;
        sl0 sl0Var5;
        int top2;
        switch (this.f688a) {
            case 7:
                b2 b2Var = (b2) this.f689b;
                if (i10 == 0 && b2Var.f8775n >= 0.0f && !b2Var.f8772b.canScrollVertically(-1)) {
                    b2Var.f8775n = -1.0f;
                    return;
                }
                return;
            case 11:
                hi.h0 h0Var = (hi.h0) this.f689b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((d2) this.f689b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 16:
                ((ni.e) this.f689b).f17488f++;
                return;
            case 19:
                k8 k8Var = (k8) this.f689b;
                v7 v7Var = k8Var.f27786n;
                if (i10 == 0) {
                    if (k8.k0(k8Var) + ((k8Var.A0 - k8.j0(k8Var)) - AndroidUtilities.dp(13.0f)) < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && v7Var.canScrollVertically(1) && (sl0Var = (sl0) v7Var.K(k8Var.f27797v0 ? 1 : 0)) != null) {
                        View view = sl0Var.f45958a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            v7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(k8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 22:
                ij ijVar = (ij) this.f689b;
                u1 u1Var = ijVar.f27246n;
                ti tiVar = ijVar.f28245b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30575d1;
                    if (u0Var != null) {
                        i11 = AndroidUtilities.dp(u0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = dp + i11;
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.f30579e2[0] - backgroundPaddingTop) - i13) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var2 = (sl0) u1Var.K(0)) != null) {
                        View view2 = sl0Var2.f45958a;
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
                nk nkVar = (nk) this.f689b;
                ck ckVar = nkVar.f28781r;
                ti tiVar2 = nkVar.f28245b;
                boolean z10 = false;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = tiVar2.getBackgroundPaddingTop();
                    if (((tiVar2.f30579e2[0] - backgroundPaddingTop2) - dp2) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var3 = (sl0) ckVar.K(0)) != null && (top = (sl0Var3.f45958a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ckVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && nkVar.f28775b0 && ckVar.getAdapter() == nkVar.f28785y) {
                    AndroidUtilities.hideKeyboard(tiVar2.getCurrentFocus());
                }
                if (i10 != 0) {
                    z10 = true;
                }
                nkVar.U = z10;
                return;
            case 25:
                ok okVar = (ok) this.f689b;
                im0 im0Var = okVar.f28993r;
                ti tiVar3 = okVar.f28245b;
                if (i10 == 0) {
                    int dp3 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = tiVar3.f30575d1;
                    if (u0Var2 != null) {
                        i12 = AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f);
                    } else {
                        i12 = 0;
                    }
                    int i14 = dp3 + i12;
                    int backgroundPaddingTop3 = tiVar3.getBackgroundPaddingTop();
                    if (((tiVar3.f30579e2[0] - backgroundPaddingTop3) - i14) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var4 = (sl0) im0Var.K(0)) != null) {
                        View view3 = sl0Var4.f45958a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            im0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                if (i10 == 1) {
                    rl rlVar = (rl) this.f689b;
                    if (rlVar.f29980l0 && rlVar.m0) {
                        AndroidUtilities.hideKeyboard(rlVar.f28245b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
            case 27:
                fo foVar = (fo) this.f689b;
                ua1 ua1Var = foVar.f26315s;
                ti tiVar4 = foVar.f28245b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = tiVar4.getBackgroundPaddingTop();
                    if (((tiVar4.f30579e2[0] - backgroundPaddingTop4) - dp4) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var5 = (sl0) ua1Var.K(1)) != null && (top2 = (sl0Var5.f45958a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ua1Var.v0(0, top2, null);
                    }
                    int i15 = foVar.W0;
                    if (i15 >= 0) {
                        fo.N(foVar, i15);
                        foVar.W0 = -1;
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
