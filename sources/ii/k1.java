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
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zg;
import org.telegram.ui.vi0;
public final class k1 implements View.OnClickListener {
    public final int f11464a;
    public final e2 f11465b;

    public k1(e2 e2Var, int i10) {
        this.f11464a = i10;
        this.f11465b = e2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p5 R2;
        s5 o9;
        String str;
        switch (this.f11464a) {
            case 0:
                this.f11465b.r0();
                return;
            case 1:
                e2 e2Var = this.f11465b;
                if (!e2Var.P.F2()) {
                    e2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                i2 i2Var = this.f11465b.P.J3;
                if (i2Var != null) {
                    i2Var.k();
                    return;
                }
                return;
            case 3:
                i2 i2Var2 = this.f11465b.P.J3;
                if (i2Var2 != null) {
                    i2Var2.i();
                    return;
                }
                return;
            case 4:
                e2.U(this.f11465b);
                return;
            case 5:
                e2 e2Var2 = this.f11465b;
                if (e2Var2.B0) {
                    e2Var2.k0(true);
                    i1 P2 = e2Var2.P.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (e2Var2.A0 == null) {
                    mz mzVar = new mz(e2Var2, true, false, false, e2Var2.getParentActivity(), true, null, e2Var2.O, true, e2Var2.getResourceProvider(), false, false);
                    e2Var2.A0 = mzVar;
                    mzVar.setVisibility(8);
                    mz mzVar2 = e2Var2.A0;
                    mzVar2.f26612w2 = false;
                    mzVar2.setDelegate(new v1(e2Var2));
                    int indexOfChild = e2Var2.O.indexOfChild(e2Var2.f11308a0);
                    if (indexOfChild < 0) {
                        indexOfChild = e2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.y5.e(-1, e2Var2.j0(), 87);
                    e.bottomMargin = e2Var2.T0;
                    e2Var2.O.addView(e2Var2.A0, indexOfChild, e);
                }
                int j02 = e2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.y5.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = e2Var2.T0;
                e2Var2.A0.setLayoutParams(layoutParams);
                e2Var2.A0.setVisibility(0);
                e2Var2.B0 = true;
                e2Var2.D0 = j02 + e2Var2.T0;
                i1 P22 = e2Var2.P.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                e2Var2.h0();
                e2Var2.f11310b0.j(zg.d, true);
                return;
            case 6:
                final e2 e2Var3 = this.f11465b;
                z70 z70Var = e2Var3.f11338x0;
                if (z70Var != null) {
                    z70Var.u();
                    e2Var3.f11338x0 = null;
                }
                final z70 H = z70.H(e2Var3, view);
                H.Q = true;
                a Q2 = e2Var3.P.Q2();
                if (Q2 != null && Q2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(e2Var3, Q2, 5));
                if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(e2Var3, Q2, 6));
                if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(e2Var3, Q2, 7));
                if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(e2Var3, Q2, 8));
                if (Q2 != null && (Q2.f11191b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = e2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z14, i10, null, string, new b(x3Var, 1));
                boolean m22 = e2Var3.P.m2();
                boolean p22 = e2Var3.P.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e2Var3.P.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.r3(true);
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
                                        e2Var3.P.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                e2Var3.f11338x0 = H;
                return;
            case 7:
                e2 e2Var4 = this.f11465b;
                z70 z70Var2 = e2Var4.f11338x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (z70Var2 != null) {
                    z70Var2.u();
                    e2Var4.f11338x0 = null;
                }
                x3 x3Var2 = e2Var4.P;
                p5 p5Var = x3Var2.f11731i4;
                if (p5Var == null && (R2 = x3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = e2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.f11617b;
                    }
                    if (pagetablecell != null) {
                        e2Var4.P.g2(R2);
                        if (R2.H.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        p5Var = R2;
                    }
                }
                if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                    e2Var4.P.F4(p5Var);
                    return;
                } else {
                    e2Var4.P.R1(e6.u(2, 2));
                    return;
                }
            case 8:
                e2 e2Var5 = this.f11465b;
                z70 z70Var3 = e2Var5.f11338x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (z70Var3 != null) {
                    z70Var3.u();
                    e2Var5.f11338x0 = null;
                }
                a Q22 = e2Var5.P.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f11191b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = e2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                r.U(parentActivity, str, new ai.g3(21, e2Var5, pageblockmath), e2Var5.getResourceProvider());
                return;
            case 9:
                e2 e2Var6 = this.f11465b;
                e2Var6.P.f11720b4 = null;
                e2Var6.o0(90, 0);
                return;
            case 10:
                e2 e2Var7 = this.f11465b;
                e2Var7.r0();
                vi0 vi0Var = e2Var7.O0;
                if (vi0Var != null) {
                    vi0Var.h(true);
                    e2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                e2 e2Var8 = this.f11465b;
                e2Var8.P.Q4();
                e2Var8.y0();
                return;
            case 12:
                this.f11465b.P.Z3(view);
                return;
            case 13:
                this.f11465b.P.a4();
                return;
            case 14:
                this.f11465b.P.X3();
                return;
            case 15:
                this.f11465b.P.b4();
                return;
            default:
                this.f11465b.n0();
                return;
        }
    }
}
