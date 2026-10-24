package ki;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wg;
import org.telegram.ui.pi0;
public final class j1 implements View.OnClickListener {
    public final int f15399a;
    public final d2 f15400b;

    public j1(d2 d2Var, int i10) {
        this.f15399a = i10;
        this.f15400b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o5 X2;
        r5 n10;
        String str;
        switch (this.f15399a) {
            case 0:
                this.f15400b.r0();
                return;
            case 1:
                d2 d2Var = this.f15400b;
                if (!d2Var.P.L2()) {
                    d2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                h2 h2Var = this.f15400b.P.K3;
                if (h2Var != null) {
                    h2Var.k();
                    return;
                }
                return;
            case 3:
                h2 h2Var2 = this.f15400b.P.K3;
                if (h2Var2 != null) {
                    h2Var2.i();
                    return;
                }
                return;
            case 4:
                d2.U(this.f15400b);
                return;
            case 5:
                d2 d2Var2 = this.f15400b;
                if (d2Var2.B0) {
                    d2Var2.k0(true);
                    h1 V2 = d2Var2.P.V2();
                    if (V2 != null) {
                        V2.r();
                        AndroidUtilities.showKeyboard(V2);
                        return;
                    }
                    return;
                }
                if (d2Var2.A0 == null) {
                    rz rzVar = new rz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                    d2Var2.A0 = rzVar;
                    rzVar.setVisibility(8);
                    rz rzVar2 = d2Var2.A0;
                    rzVar2.f30378x2 = false;
                    rzVar2.setDelegate(new u1(d2Var2));
                    int indexOfChild = d2Var2.O.indexOfChild(d2Var2.f15255a0);
                    if (indexOfChild < 0) {
                        indexOfChild = d2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.z5.e(-1, d2Var2.j0(), 87);
                    e.bottomMargin = d2Var2.T0;
                    d2Var2.O.addView(d2Var2.A0, indexOfChild, e);
                }
                int j02 = d2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.z5.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = d2Var2.T0;
                d2Var2.A0.setLayoutParams(layoutParams);
                d2Var2.A0.setVisibility(0);
                d2Var2.B0 = true;
                d2Var2.D0 = j02 + d2Var2.T0;
                h1 V22 = d2Var2.P.V2();
                if (V22 != null) {
                    AndroidUtilities.hideKeyboard(V22);
                }
                d2Var2.h0();
                d2Var2.f15257b0.j(wg.d, true);
                return;
            case 6:
                final d2 d2Var3 = this.f15400b;
                h80 h80Var = d2Var3.f15285x0;
                if (h80Var != null) {
                    h80Var.u();
                    d2Var3.f15285x0 = null;
                }
                final h80 H = h80.H(d2Var3, view);
                H.Q = true;
                a W2 = d2Var3.P.W2();
                if (W2 != null && W2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(d2Var3, W2, 5));
                if (W2 != null && W2.b() && !W2.a() && !W2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(d2Var3, W2, 6));
                if (W2 != null && W2.b() && !W2.a() && W2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(d2Var3, W2, 7));
                if (W2 != null && W2.b() && W2.a() && !W2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(d2Var3, W2, 8));
                if (W2 != null && (W2.f15141b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z14, i10, null, string, new b(w3Var, 1));
                boolean s22 = d2Var3.P.s2();
                boolean v22 = d2Var3.P.v2();
                if (s22 || v22) {
                    H.k();
                    if (s22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d2Var3.P.x3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.x3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (v22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d2Var3.P.x3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.x3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                d2Var3.f15285x0 = H;
                return;
            case 7:
                d2 d2Var4 = this.f15400b;
                h80 h80Var2 = d2Var4.f15285x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (h80Var2 != null) {
                    h80Var2.u();
                    d2Var4.f15285x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.f15659j4;
                if (o5Var == null && (X2 = w3Var2.X2()) != null && X2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (n10 = X2.n((h1) findFocus)) != null) {
                        pagetablecell = n10.f15552b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.m2(X2);
                        if (X2.H.add(pagetablecell)) {
                            X2.v.invalidate();
                            X2.s();
                        }
                        o5Var = X2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.L4(o5Var);
                    return;
                } else {
                    d2Var4.P.X1(c6.t(2, 2));
                    return;
                }
            case 8:
                d2 d2Var5 = this.f15400b;
                h80 h80Var3 = d2Var5.f15285x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (h80Var3 != null) {
                    h80Var3.u();
                    d2Var5.f15285x0 = null;
                }
                a W22 = d2Var5.P.W2();
                if (W22 != null) {
                    TL_iv.PageBlock pageBlock = W22.f15141b;
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
                q.X(parentActivity, str, new ai.o2(27, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                return;
            case 9:
                d2 d2Var6 = this.f15400b;
                d2Var6.P.f15648c4 = null;
                d2Var6.o0(90, 0);
                return;
            case 10:
                d2 d2Var7 = this.f15400b;
                d2Var7.r0();
                pi0 pi0Var = d2Var7.O0;
                if (pi0Var != null) {
                    pi0Var.g(true);
                    d2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                d2 d2Var8 = this.f15400b;
                d2Var8.P.W4();
                d2Var8.y0();
                return;
            case 12:
                this.f15400b.P.f4(view);
                return;
            case 13:
                this.f15400b.P.g4();
                return;
            case 14:
                this.f15400b.P.d4();
                return;
            case 15:
                this.f15400b.P.h4();
                return;
            default:
                this.f15400b.n0();
                return;
        }
    }
}
