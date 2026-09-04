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
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cj0;
public final class j1 implements View.OnClickListener {
    public final int f13986a;
    public final c2 f13987b;

    public j1(c2 c2Var, int i10) {
        this.f13986a = i10;
        this.f13987b = c2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        s5 Q2;
        v5 o9;
        String str;
        switch (this.f13986a) {
            case 0:
                this.f13987b.r0();
                return;
            case 1:
                c2 c2Var = this.f13987b;
                if (!c2Var.P.E2()) {
                    c2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                g2 g2Var = this.f13987b.P.J3;
                if (g2Var != null) {
                    g2Var.k();
                    return;
                }
                return;
            case 3:
                g2 g2Var2 = this.f13987b.P.J3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    return;
                }
                return;
            case 4:
                c2.U(this.f13987b);
                return;
            case 5:
                c2 c2Var2 = this.f13987b;
                if (c2Var2.B0) {
                    c2Var2.k0(true);
                    h1 O2 = c2Var2.P.O2();
                    if (O2 != null) {
                        O2.r();
                        AndroidUtilities.showKeyboard(O2);
                        return;
                    }
                    return;
                }
                if (c2Var2.A0 == null) {
                    kz kzVar = new kz(c2Var2, true, false, false, c2Var2.getParentActivity(), true, null, c2Var2.O, true, c2Var2.getResourceProvider(), false, false);
                    c2Var2.A0 = kzVar;
                    kzVar.setVisibility(8);
                    kz kzVar2 = c2Var2.A0;
                    kzVar2.f28001x2 = false;
                    kzVar2.setDelegate(new t1(c2Var2));
                    int indexOfChild = c2Var2.O.indexOfChild(c2Var2.f13807a0);
                    if (indexOfChild < 0) {
                        indexOfChild = c2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e7 = w7.x5.e(-1, c2Var2.j0(), 87);
                    e7.bottomMargin = c2Var2.T0;
                    c2Var2.O.addView(c2Var2.A0, indexOfChild, e7);
                }
                int j02 = c2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.x5.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = c2Var2.T0;
                c2Var2.A0.setLayoutParams(layoutParams);
                c2Var2.A0.setVisibility(0);
                c2Var2.B0 = true;
                c2Var2.D0 = j02 + c2Var2.T0;
                h1 O22 = c2Var2.P.O2();
                if (O22 != null) {
                    AndroidUtilities.hideKeyboard(O22);
                }
                c2Var2.h0();
                c2Var2.f13809b0.j(zg.d, true);
                return;
            case 6:
                final c2 c2Var3 = this.f13987b;
                n70 n70Var = c2Var3.f13838x0;
                if (n70Var != null) {
                    n70Var.u();
                    c2Var3.f13838x0 = null;
                }
                final n70 H = n70.H(c2Var3, view);
                H.Q = true;
                a P2 = c2Var3.P.P2();
                if (P2 != null && P2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(c2Var3, P2, 5));
                if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(c2Var3, P2, 6));
                if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(c2Var3, P2, 7));
                if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(c2Var3, P2, 8));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                v3 v3Var = c2Var3.P;
                Objects.requireNonNull(v3Var);
                H.j(z14, i10, null, string, new b(v3Var, 1));
                boolean l22 = c2Var3.P.l2();
                boolean o22 = c2Var3.P.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        c2Var3.P.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        c2Var3.P.q3(true);
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
                                        c2Var3.P.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        c2Var3.P.q3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                c2Var3.f13838x0 = H;
                return;
            case 7:
                c2 c2Var4 = this.f13987b;
                n70 n70Var2 = c2Var4.f13838x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (n70Var2 != null) {
                    n70Var2.u();
                    c2Var4.f13838x0 = null;
                }
                v3 v3Var2 = c2Var4.P;
                s5 s5Var = v3Var2.f14252i4;
                if (s5Var == null && (Q2 = v3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = c2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (o9 = Q2.o((h1) findFocus)) != null) {
                        pagetablecell = o9.f14278b;
                    }
                    if (pagetablecell != null) {
                        c2Var4.P.f2(Q2);
                        if (Q2.H.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        s5Var = Q2;
                    }
                }
                if (s5Var != null && s5Var.getModel() != null && !s5Var.H.isEmpty()) {
                    c2Var4.P.E4(s5Var);
                    return;
                } else {
                    c2Var4.P.Q1(g6.u(2, 2));
                    return;
                }
            case 8:
                c2 c2Var5 = this.f13987b;
                n70 n70Var3 = c2Var5.f13838x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (n70Var3 != null) {
                    n70Var3.u();
                    c2Var5.f13838x0 = null;
                }
                a P22 = c2Var5.P.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.f13732b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = c2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                r.U(parentActivity, str, new di.m2(20, c2Var5, pageblockmath), c2Var5.getResourceProvider());
                return;
            case 9:
                c2 c2Var6 = this.f13987b;
                c2Var6.P.f14241b4 = null;
                c2Var6.o0(90, 0);
                return;
            case 10:
                c2 c2Var7 = this.f13987b;
                c2Var7.r0();
                cj0 cj0Var = c2Var7.O0;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    c2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                c2 c2Var8 = this.f13987b;
                c2Var8.P.P4();
                c2Var8.y0();
                return;
            case 12:
                this.f13987b.P.Y3(view);
                return;
            case 13:
                this.f13987b.P.Z3();
                return;
            case 14:
                this.f13987b.P.W3();
                return;
            case 15:
                this.f13987b.P.a4();
                return;
            default:
                this.f13987b.n0();
                return;
        }
    }
}
