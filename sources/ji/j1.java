package ji;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zg;
import org.telegram.ui.hj0;
public final class j1 implements View.OnClickListener {
    public final int f13346a;
    public final d2 f13347b;

    public j1(d2 d2Var, int i10) {
        this.f13346a = i10;
        this.f13347b = d2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        u5 S2;
        x5 o10;
        String str;
        switch (this.f13346a) {
            case 0:
                this.f13347b.r0();
                return;
            case 1:
                d2 d2Var = this.f13347b;
                if (!d2Var.P.G2()) {
                    d2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                h2 h2Var = this.f13347b.P.H3;
                if (h2Var != null) {
                    h2Var.k();
                    return;
                }
                return;
            case 3:
                h2 h2Var2 = this.f13347b.P.H3;
                if (h2Var2 != null) {
                    h2Var2.i();
                    return;
                }
                return;
            case 4:
                d2.U(this.f13347b);
                return;
            case 5:
                d2 d2Var2 = this.f13347b;
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
                    wz wzVar = new wz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                    d2Var2.A0 = wzVar;
                    wzVar.setVisibility(8);
                    wz wzVar2 = d2Var2.A0;
                    wzVar2.f31078w2 = false;
                    wzVar2.setDelegate(new u1(d2Var2));
                    int indexOfChild = d2Var2.O.indexOfChild(d2Var2.f13197a0);
                    if (indexOfChild < 0) {
                        indexOfChild = d2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e = w7.a6.e(-1, d2Var2.j0(), 87);
                    e.bottomMargin = d2Var2.T0;
                    d2Var2.O.addView(d2Var2.A0, indexOfChild, e);
                }
                int j02 = d2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.a6.e(-1, j02, 87);
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
                d2Var2.f13199b0.j(zg.d, true);
                return;
            case 6:
                final d2 d2Var3 = this.f13347b;
                m80 m80Var = d2Var3.f13227x0;
                if (m80Var != null) {
                    m80Var.u();
                    d2Var3.f13227x0 = null;
                }
                final m80 H = m80.H(d2Var3, view);
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
                if (R2 != null && (R2.f13103b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = d2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z14, i10, null, string, new b(x3Var, 1));
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
                d2Var3.f13227x0 = H;
                return;
            case 7:
                d2 d2Var4 = this.f13347b;
                m80 m80Var2 = d2Var4.f13227x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (m80Var2 != null) {
                    m80Var2.u();
                    d2Var4.f13227x0 = null;
                }
                x3 x3Var2 = d2Var4.P;
                u5 u5Var = x3Var2.f13630g4;
                if (u5Var == null && (S2 = x3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (o10 = S2.o((h1) findFocus)) != null) {
                        pagetablecell = o10.f13659b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.h2(S2);
                        if (S2.H.add(pagetablecell)) {
                            S2.v.invalidate();
                            S2.t();
                        }
                        u5Var = S2;
                    }
                }
                if (u5Var != null && u5Var.getModel() != null && !u5Var.H.isEmpty()) {
                    d2Var4.P.G4(u5Var);
                    return;
                } else {
                    d2Var4.P.S1(i6.u(2, 2));
                    return;
                }
            case 8:
                d2 d2Var5 = this.f13347b;
                m80 m80Var3 = d2Var5.f13227x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (m80Var3 != null) {
                    m80Var3.u();
                    d2Var5.f13227x0 = null;
                }
                a R22 = d2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.f13103b;
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
                r.X(parentActivity, str, new bi.v2(21, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                return;
            case 9:
                d2 d2Var6 = this.f13347b;
                d2Var6.P.Z3 = null;
                d2Var6.o0(90, 0);
                return;
            case 10:
                d2 d2Var7 = this.f13347b;
                d2Var7.r0();
                hj0 hj0Var = d2Var7.O0;
                if (hj0Var != null) {
                    hj0Var.h(true);
                    d2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                d2 d2Var8 = this.f13347b;
                d2Var8.P.R4();
                d2Var8.y0();
                return;
            case 12:
                this.f13347b.P.a4(view);
                return;
            case 13:
                this.f13347b.P.b4();
                return;
            case 14:
                this.f13347b.P.Y3();
                return;
            case 15:
                this.f13347b.P.c4();
                return;
            default:
                this.f13347b.n0();
                return;
        }
    }
}
