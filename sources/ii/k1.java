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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.zg;
import org.telegram.ui.yi0;
public final class k1 implements View.OnClickListener {
    public final int f11467a;
    public final e2 f11468b;

    public k1(e2 e2Var, int i10) {
        this.f11467a = i10;
        this.f11468b = e2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p5 S2;
        s5 o9;
        String str;
        switch (this.f11467a) {
            case 0:
                this.f11468b.r0();
                return;
            case 1:
                e2 e2Var = this.f11468b;
                if (!e2Var.P.G2()) {
                    e2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                i2 i2Var = this.f11468b.P.J3;
                if (i2Var != null) {
                    i2Var.k();
                    return;
                }
                return;
            case 3:
                i2 i2Var2 = this.f11468b.P.J3;
                if (i2Var2 != null) {
                    i2Var2.i();
                    return;
                }
                return;
            case 4:
                e2.U(this.f11468b);
                return;
            case 5:
                e2 e2Var2 = this.f11468b;
                if (e2Var2.B0) {
                    e2Var2.k0(true);
                    i1 Q2 = e2Var2.P.Q2();
                    if (Q2 != null) {
                        Q2.r();
                        AndroidUtilities.showKeyboard(Q2);
                        return;
                    }
                    return;
                }
                if (e2Var2.A0 == null) {
                    mz mzVar = new mz(e2Var2, true, false, false, e2Var2.getParentActivity(), true, null, e2Var2.O, true, e2Var2.getResourceProvider(), false, false);
                    e2Var2.A0 = mzVar;
                    mzVar.setVisibility(8);
                    mz mzVar2 = e2Var2.A0;
                    mzVar2.f26638w2 = false;
                    mzVar2.setDelegate(new v1(e2Var2));
                    int indexOfChild = e2Var2.O.indexOfChild(e2Var2.f11311a0);
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
                i1 Q22 = e2Var2.P.Q2();
                if (Q22 != null) {
                    AndroidUtilities.hideKeyboard(Q22);
                }
                e2Var2.h0();
                e2Var2.f11313b0.j(zg.d, true);
                return;
            case 6:
                final e2 e2Var3 = this.f11468b;
                a80 a80Var = e2Var3.f11341x0;
                if (a80Var != null) {
                    a80Var.u();
                    e2Var3.f11341x0 = null;
                }
                final a80 H = a80.H(e2Var3, view);
                H.Q = true;
                a R2 = e2Var3.P.R2();
                if (R2 != null && R2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(e2Var3, R2, 5));
                if (R2 != null && R2.b() && !R2.a() && !R2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(e2Var3, R2, 6));
                if (R2 != null && R2.b() && !R2.a() && R2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(e2Var3, R2, 7));
                if (R2 != null && R2.b() && R2.a() && !R2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(e2Var3, R2, 8));
                if (R2 != null && (R2.f11194b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = e2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z14, i10, null, string, new b(x3Var, 1));
                boolean n22 = e2Var3.P.n2();
                boolean q22 = e2Var3.P.q2();
                if (n22 || q22) {
                    H.k();
                    if (n22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e2Var3.P.s3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.s3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (q22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e2Var3.P.s3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.s3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                e2Var3.f11341x0 = H;
                return;
            case 7:
                e2 e2Var4 = this.f11468b;
                a80 a80Var2 = e2Var4.f11341x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (a80Var2 != null) {
                    a80Var2.u();
                    e2Var4.f11341x0 = null;
                }
                x3 x3Var2 = e2Var4.P;
                p5 p5Var = x3Var2.f11734i4;
                if (p5Var == null && (S2 = x3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = e2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = S2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.f11620b;
                    }
                    if (pagetablecell != null) {
                        e2Var4.P.h2(S2);
                        if (S2.H.add(pagetablecell)) {
                            S2.v.invalidate();
                            S2.t();
                        }
                        p5Var = S2;
                    }
                }
                if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                    e2Var4.P.G4(p5Var);
                    return;
                } else {
                    e2Var4.P.S1(e6.u(2, 2));
                    return;
                }
            case 8:
                e2 e2Var5 = this.f11468b;
                a80 a80Var3 = e2Var5.f11341x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (a80Var3 != null) {
                    a80Var3.u();
                    e2Var5.f11341x0 = null;
                }
                a R22 = e2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.f11194b;
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
                e2 e2Var6 = this.f11468b;
                e2Var6.P.f11723b4 = null;
                e2Var6.o0(90, 0);
                return;
            case 10:
                e2 e2Var7 = this.f11468b;
                e2Var7.r0();
                yi0 yi0Var = e2Var7.O0;
                if (yi0Var != null) {
                    yi0Var.h(true);
                    e2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                e2 e2Var8 = this.f11468b;
                e2Var8.P.R4();
                e2Var8.y0();
                return;
            case 12:
                this.f11468b.P.a4(view);
                return;
            case 13:
                this.f11468b.P.b4();
                return;
            case 14:
                this.f11468b.P.Y3();
                return;
            case 15:
                this.f11468b.P.c4();
                return;
            default:
                this.f11468b.n0();
                return;
        }
    }
}
