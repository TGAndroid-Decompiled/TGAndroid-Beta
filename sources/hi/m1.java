package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.cj0;
public final class m1 implements View.OnClickListener {
    public final int f9741a;
    public final g2 f9742b;

    public m1(g2 g2Var, int i10) {
        this.f9741a = i10;
        this.f9742b = g2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        r5 Q2;
        u5 o9;
        String str;
        switch (this.f9741a) {
            case 0:
                this.f9742b.r0();
                return;
            case 1:
                g2 g2Var = this.f9742b;
                if (!g2Var.P.E2()) {
                    g2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                k2 k2Var = this.f9742b.P.J3;
                if (k2Var != null) {
                    k2Var.k();
                    return;
                }
                return;
            case 3:
                k2 k2Var2 = this.f9742b.P.J3;
                if (k2Var2 != null) {
                    k2Var2.i();
                    return;
                }
                return;
            case 4:
                g2.U(this.f9742b);
                return;
            case 5:
                g2 g2Var2 = this.f9742b;
                if (g2Var2.B0) {
                    g2Var2.k0(true);
                    k1 O2 = g2Var2.P.O2();
                    if (O2 != null) {
                        O2.r();
                        AndroidUtilities.showKeyboard(O2);
                        return;
                    }
                    return;
                }
                if (g2Var2.A0 == null) {
                    rz rzVar = new rz(g2Var2, true, false, false, g2Var2.getParentActivity(), true, null, g2Var2.O, true, g2Var2.getResourceProvider(), false, false);
                    g2Var2.A0 = rzVar;
                    rzVar.setVisibility(8);
                    rz rzVar2 = g2Var2.A0;
                    rzVar2.f26873x2 = false;
                    rzVar2.setDelegate(new w1(g2Var2));
                    int indexOfChild = g2Var2.O.indexOfChild(g2Var2.f9580a0);
                    if (indexOfChild < 0) {
                        indexOfChild = g2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.a6.e(-1, g2Var2.j0(), 87);
                    e.bottomMargin = g2Var2.T0;
                    g2Var2.O.addView(g2Var2.A0, indexOfChild, e);
                }
                int j02 = g2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.a6.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = g2Var2.T0;
                g2Var2.A0.setLayoutParams(layoutParams);
                g2Var2.A0.setVisibility(0);
                g2Var2.B0 = true;
                g2Var2.D0 = j02 + g2Var2.T0;
                k1 O22 = g2Var2.P.O2();
                if (O22 != null) {
                    AndroidUtilities.hideKeyboard(O22);
                }
                g2Var2.h0();
                g2Var2.f9582b0.j(bh.d, true);
                return;
            case 6:
                final g2 g2Var3 = this.f9742b;
                w70 w70Var = g2Var3.f9610x0;
                if (w70Var != null) {
                    w70Var.u();
                    g2Var3.f9610x0 = null;
                }
                final w70 H = w70.H(g2Var3, view);
                H.Q = true;
                a P2 = g2Var3.P.P2();
                if (P2 != null && P2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new p1(g2Var3, P2, 5));
                if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new p1(g2Var3, P2, 6));
                if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new p1(g2Var3, P2, 7));
                if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new p1(g2Var3, P2, 8));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                z3 z3Var = g2Var3.P;
                Objects.requireNonNull(z3Var);
                H.j(z14, i10, null, string, new b(z3Var, 1));
                boolean l22 = g2Var3.P.l2();
                boolean o22 = g2Var3.P.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        g2Var3.P.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        g2Var3.P.q3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (o22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        g2Var3.P.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        g2Var3.P.q3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                g2Var3.f9610x0 = H;
                return;
            case 7:
                g2 g2Var4 = this.f9742b;
                w70 w70Var2 = g2Var4.f9610x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (w70Var2 != null) {
                    w70Var2.u();
                    g2Var4.f9610x0 = null;
                }
                z3 z3Var2 = g2Var4.P;
                r5 r5Var = z3Var2.f10004i4;
                if (r5Var == null && (Q2 = z3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = g2Var4.P.findFocus();
                    if ((findFocus instanceof k1) && (o9 = Q2.o((k1) findFocus)) != null) {
                        pagetablecell = o9.f9893b;
                    }
                    if (pagetablecell != null) {
                        g2Var4.P.f2(Q2);
                        if (Q2.H.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        r5Var = Q2;
                    }
                }
                if (r5Var != null && r5Var.getModel() != null && !r5Var.H.isEmpty()) {
                    g2Var4.P.E4(r5Var);
                    return;
                } else {
                    g2Var4.P.Q1(g6.u(2, 2));
                    return;
                }
            case 8:
                g2 g2Var5 = this.f9742b;
                w70 w70Var3 = g2Var5.f9610x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (w70Var3 != null) {
                    w70Var3.u();
                    g2Var5.f9610x0 = null;
                }
                a P22 = g2Var5.P.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.f9421b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = g2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                s.U(parentActivity, str, new bi.y2(20, g2Var5, pageblockmath), g2Var5.getResourceProvider());
                return;
            case 9:
                g2 g2Var6 = this.f9742b;
                g2Var6.P.f9993b4 = null;
                g2Var6.o0(90, 0);
                return;
            case 10:
                g2 g2Var7 = this.f9742b;
                g2Var7.r0();
                cj0 cj0Var = g2Var7.O0;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    g2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                g2 g2Var8 = this.f9742b;
                g2Var8.P.P4();
                g2Var8.y0();
                return;
            case 12:
                this.f9742b.P.Y3(view);
                return;
            case 13:
                this.f9742b.P.Z3();
                return;
            case 14:
                this.f9742b.P.W3();
                return;
            case 15:
                this.f9742b.P.a4();
                return;
            default:
                this.f9742b.n0();
                return;
        }
    }
}
