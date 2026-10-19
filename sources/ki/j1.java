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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.li0;
public final class j1 implements View.OnClickListener {
    public final int f15341a;
    public final d2 f15342b;

    public j1(d2 d2Var, int i10) {
        this.f15341a = i10;
        this.f15342b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o5 S2;
        r5 o10;
        String str;
        switch (this.f15341a) {
            case 0:
                this.f15342b.r0();
                return;
            case 1:
                d2 d2Var = this.f15342b;
                if (!d2Var.P.G2()) {
                    d2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                h2 h2Var = this.f15342b.P.H3;
                if (h2Var != null) {
                    h2Var.k();
                    return;
                }
                return;
            case 3:
                h2 h2Var2 = this.f15342b.P.H3;
                if (h2Var2 != null) {
                    h2Var2.i();
                    return;
                }
                return;
            case 4:
                d2.U(this.f15342b);
                return;
            case 5:
                d2 d2Var2 = this.f15342b;
                if (d2Var2.B0) {
                    d2Var2.k0(true);
                    h1 Q2 = d2Var2.P.Q2();
                    if (Q2 != null) {
                        Q2.r();
                        AndroidUtilities.showKeyboard(Q2);
                        return;
                    }
                    return;
                }
                if (d2Var2.A0 == null) {
                    tz tzVar = new tz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                    d2Var2.A0 = tzVar;
                    tzVar.setVisibility(8);
                    tz tzVar2 = d2Var2.A0;
                    tzVar2.f30834w2 = false;
                    tzVar2.setDelegate(new u1(d2Var2));
                    int indexOfChild = d2Var2.O.indexOfChild(d2Var2.f15199a0);
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
                h1 Q22 = d2Var2.P.Q2();
                if (Q22 != null) {
                    AndroidUtilities.hideKeyboard(Q22);
                }
                d2Var2.h0();
                d2Var2.f15201b0.j(yg.d, true);
                return;
            case 6:
                final d2 d2Var3 = this.f15342b;
                i80 i80Var = d2Var3.f15229x0;
                if (i80Var != null) {
                    i80Var.u();
                    d2Var3.f15229x0 = null;
                }
                final i80 H = i80.H(d2Var3, view);
                H.Q = true;
                a R2 = d2Var3.P.R2();
                if (R2 != null && R2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(d2Var3, R2, 5));
                if (R2 != null && R2.b() && !R2.a() && !R2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(d2Var3, R2, 6));
                if (R2 != null && R2.b() && !R2.a() && R2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(d2Var3, R2, 7));
                if (R2 != null && R2.b() && R2.a() && !R2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(d2Var3, R2, 8));
                if (R2 != null && (R2.f15097b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z14, i10, null, string, new b(w3Var, 1));
                boolean n22 = d2Var3.P.n2();
                boolean q22 = d2Var3.P.q2();
                if (n22 || q22) {
                    H.k();
                    if (n22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        d2Var3.P.s3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.s3(true);
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
                                        d2Var3.P.s3(false);
                                        H.u();
                                        return;
                                    default:
                                        d2Var3.P.s3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                d2Var3.f15229x0 = H;
                return;
            case 7:
                d2 d2Var4 = this.f15342b;
                i80 i80Var2 = d2Var4.f15229x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (i80Var2 != null) {
                    i80Var2.u();
                    d2Var4.f15229x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.f15597g4;
                if (o5Var == null && (S2 = w3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (o10 = S2.o((h1) findFocus)) != null) {
                        pagetablecell = o10.f15494b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.h2(S2);
                        if (S2.H.add(pagetablecell)) {
                            S2.v.invalidate();
                            S2.t();
                        }
                        o5Var = S2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.G4(o5Var);
                    return;
                } else {
                    d2Var4.P.S1(c6.u(2, 2));
                    return;
                }
            case 8:
                d2 d2Var5 = this.f15342b;
                i80 i80Var3 = d2Var5.f15229x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (i80Var3 != null) {
                    i80Var3.u();
                    d2Var5.f15229x0 = null;
                }
                a R22 = d2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.f15097b;
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
                q.X(parentActivity, str, new ai.n2(27, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                return;
            case 9:
                d2 d2Var6 = this.f15342b;
                d2Var6.P.Z3 = null;
                d2Var6.o0(90, 0);
                return;
            case 10:
                d2 d2Var7 = this.f15342b;
                d2Var7.r0();
                li0 li0Var = d2Var7.O0;
                if (li0Var != null) {
                    li0Var.h(true);
                    d2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                d2 d2Var8 = this.f15342b;
                d2Var8.P.R4();
                d2Var8.y0();
                return;
            case 12:
                this.f15342b.P.a4(view);
                return;
            case 13:
                this.f15342b.P.b4();
                return;
            case 14:
                this.f15342b.P.Y3();
                return;
            case 15:
                this.f15342b.P.c4();
                return;
            default:
                this.f15342b.n0();
                return;
        }
    }
}
