package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;
public final class z3 implements View.OnClickListener {
    public final int f11799a;
    public final b4 f11800b;
    public final int f11801c;

    public z3(b4 b4Var, int i10, int i11) {
        this.f11799a = i11;
        this.f11800b = b4Var;
        this.f11801c = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        o5 R2;
        r5 o9;
        String str;
        switch (this.f11799a) {
            case 0:
                this.f11800b.f11255a.f11493a.f11588r.Y3(this.f11801c);
                return;
            default:
                final r rVar = this.f11800b.f11255a.f11493a;
                org.telegram.ui.ActionBar.e6 e6Var = rVar.f26461a;
                w3 w3Var = rVar.f11588r;
                a Q2 = w3Var.Q2();
                int i10 = this.f11801c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    w3Var.t3();
                                    return;
                                }
                                return;
                            }
                            if (Q2 != null) {
                                TL_iv.PageBlock pageBlock = Q2.f11201b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = rVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            r.U(context, str, new ci.m2(18, rVar, pageblockmath), e6Var);
                            return;
                        }
                        o5 o5Var = w3Var.f11714i4;
                        if (o5Var == null && (R2 = w3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = w3Var.findFocus();
                            if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                                pagetablecell = o9.f11604b;
                            }
                            if (pagetablecell != null) {
                                w3Var.g2(R2);
                                if (R2.H.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                o5Var = R2;
                            }
                        }
                        if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                            w3Var.F4(o5Var);
                            return;
                        } else {
                            w3Var.R1(d6.u(2, 2));
                            return;
                        }
                    }
                    n70 n70Var = rVar.H;
                    if (n70Var != null) {
                        n70Var.u();
                    }
                    final n70 F = n70.F(rVar, e6Var, view);
                    F.Q = true;
                    if (Q2 != null && Q2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, Q2, 1));
                    if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, Q2, 2));
                    if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, Q2, 3));
                    if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, Q2, 4));
                    if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(w3Var, 1));
                    boolean m22 = w3Var.m2();
                    boolean p22 = w3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f11588r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f11588r.r3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (p22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f11588r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f11588r.r3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    rVar.H = F;
                    return;
                }
                int i11 = rVar.f11587n;
                n70 n70Var2 = rVar.H;
                if (n70Var2 != null) {
                    n70Var2.u();
                }
                n70 G = n70.G(rVar, e6Var, view, true);
                G.Q = true;
                n70 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                J.k();
                rVar.P(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                rVar.P(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                rVar.P(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                rVar.P(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                rVar.P(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                rVar.P(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (Q2 != null && w3.C3(Q2.f11201b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b2 b2Var = new b2(rVar.getContext(), R.drawable.iv_h1);
                b2Var.a(z10);
                G.j(z11, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new ei.m2(G, J, 1));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, Q2, 5));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, Q2, 6));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                b2 b2Var2 = new b2(rVar.getContext(), R.drawable.iv_pullquote);
                b2Var2.a(z10);
                G.j(z14, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, Q2, 7));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, Q2, 8));
                if (Q2 != null && (Q2.f11201b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                b2 b2Var3 = new b2(rVar.getContext(), R.drawable.iv_footer);
                b2Var3.a(z10);
                G.j(z16, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, Q2, 9));
                G.Z();
                rVar.H = G;
                return;
        }
    }
}
