package ii;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.xg;
import org.telegram.ui.bj0;
public final class k1 implements View.OnClickListener {
    public final int f11465a;
    public final d2 f11466b;

    public k1(d2 d2Var, int i10) {
        this.f11465a = i10;
        this.f11466b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o5 R2;
        r5 o9;
        String str;
        switch (this.f11465a) {
            case 0:
                this.f11466b.r0();
                return;
            case 1:
                d2 d2Var = this.f11466b;
                if (!d2Var.P.F2()) {
                    d2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                h2 h2Var = this.f11466b.P.J3;
                if (h2Var != null) {
                    h2Var.k();
                    return;
                }
                return;
            case 3:
                h2 h2Var2 = this.f11466b.P.J3;
                if (h2Var2 != null) {
                    h2Var2.i();
                    return;
                }
                return;
            case 4:
                d2.U(this.f11466b);
                return;
            case 5:
                d2 d2Var2 = this.f11466b;
                if (d2Var2.B0) {
                    d2Var2.k0(true);
                    i1 P2 = d2Var2.P.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (d2Var2.A0 == null) {
                    kz kzVar = new kz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                    d2Var2.A0 = kzVar;
                    kzVar.setVisibility(8);
                    kz kzVar2 = d2Var2.A0;
                    kzVar2.f25767w2 = false;
                    kzVar2.setDelegate(new u1(d2Var2));
                    int indexOfChild = d2Var2.O.indexOfChild(d2Var2.f11296a0);
                    if (indexOfChild < 0) {
                        indexOfChild = d2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.x5.e(-1, d2Var2.j0(), 87);
                    e.bottomMargin = d2Var2.T0;
                    d2Var2.O.addView(d2Var2.A0, indexOfChild, e);
                }
                int j02 = d2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.x5.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = d2Var2.T0;
                d2Var2.A0.setLayoutParams(layoutParams);
                d2Var2.A0.setVisibility(0);
                d2Var2.B0 = true;
                d2Var2.D0 = j02 + d2Var2.T0;
                i1 P22 = d2Var2.P.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                d2Var2.h0();
                d2Var2.f11298b0.j(xg.d, true);
                return;
            case 6:
                final d2 d2Var3 = this.f11466b;
                n70 n70Var = d2Var3.f11326x0;
                if (n70Var != null) {
                    n70Var.u();
                    d2Var3.f11326x0 = null;
                }
                final n70 H = n70.H(d2Var3, view);
                H.Q = true;
                a Q2 = d2Var3.P.Q2();
                if (Q2 != null && Q2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(d2Var3, Q2, 5));
                if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(d2Var3, Q2, 6));
                if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(d2Var3, Q2, 7));
                if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(d2Var3, Q2, 8));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z14, i10, null, string, new b(w3Var, 1));
                boolean m22 = d2Var3.P.m2();
                boolean p22 = d2Var3.P.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d2Var3.P.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (p22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d2Var3.P.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                d2Var3.f11326x0 = H;
                return;
            case 7:
                d2 d2Var4 = this.f11466b;
                n70 n70Var2 = d2Var4.f11326x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (n70Var2 != null) {
                    n70Var2.u();
                    d2Var4.f11326x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.f11714i4;
                if (o5Var == null && (R2 = w3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.f11604b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.g2(R2);
                        if (R2.H.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        o5Var = R2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.F4(o5Var);
                    return;
                } else {
                    d2Var4.P.R1(d6.u(2, 2));
                    return;
                }
            case 8:
                d2 d2Var5 = this.f11466b;
                n70 n70Var3 = d2Var5.f11326x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (n70Var3 != null) {
                    n70Var3.u();
                    d2Var5.f11326x0 = null;
                }
                a Q22 = d2Var5.P.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f11201b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = d2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                r.U(parentActivity, str, new ci.m2(20, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                return;
            case 9:
                d2 d2Var6 = this.f11466b;
                d2Var6.P.f11703b4 = null;
                d2Var6.o0(90, 0);
                return;
            case 10:
                d2 d2Var7 = this.f11466b;
                d2Var7.r0();
                bj0 bj0Var = d2Var7.O0;
                if (bj0Var != null) {
                    bj0Var.h(true);
                    d2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                d2 d2Var8 = this.f11466b;
                d2Var8.P.Q4();
                d2Var8.y0();
                return;
            case 12:
                this.f11466b.P.Z3(view);
                return;
            case 13:
                this.f11466b.P.a4();
                return;
            case 14:
                this.f11466b.P.X3();
                return;
            case 15:
                this.f11466b.P.b4();
                return;
            default:
                this.f11466b.n0();
                return;
        }
    }
}
