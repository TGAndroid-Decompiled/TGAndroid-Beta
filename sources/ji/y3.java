package ji;

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
public final class y3 implements View.OnClickListener {
    public final int f14348a;
    public final a4 f14349b;
    public final int f14350c;

    public y3(a4 a4Var, int i10, int i11) {
        this.f14348a = i11;
        this.f14349b = a4Var;
        this.f14350c = i10;
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
        s5 Q2;
        v5 o9;
        String str;
        switch (this.f14348a) {
            case 0:
                this.f14349b.f13762a.f14048a.f14133r.X3(this.f14350c);
                return;
            default:
                final r rVar = this.f14349b.f13762a.f14048a;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.f28752a;
                v3 v3Var = rVar.f14133r;
                a P2 = v3Var.P2();
                int i10 = this.f14350c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    v3Var.s3();
                                    return;
                                }
                                return;
                            }
                            if (P2 != null) {
                                TL_iv.PageBlock pageBlock = P2.f13732b;
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
                            r.U(context, str, new di.m2(18, rVar, pageblockmath), f6Var);
                            return;
                        }
                        s5 s5Var = v3Var.f14252i4;
                        if (s5Var == null && (Q2 = v3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = v3Var.findFocus();
                            if ((findFocus instanceof h1) && (o9 = Q2.o((h1) findFocus)) != null) {
                                pagetablecell = o9.f14278b;
                            }
                            if (pagetablecell != null) {
                                v3Var.f2(Q2);
                                if (Q2.H.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                s5Var = Q2;
                            }
                        }
                        if (s5Var != null && s5Var.getModel() != null && !s5Var.H.isEmpty()) {
                            v3Var.E4(s5Var);
                            return;
                        } else {
                            v3Var.Q1(g6.u(2, 2));
                            return;
                        }
                    }
                    n70 n70Var = rVar.H;
                    if (n70Var != null) {
                        n70Var.u();
                    }
                    final n70 F = n70.F(rVar, f6Var, view);
                    F.Q = true;
                    if (P2 != null && P2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, P2, 1));
                    if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, P2, 2));
                    if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, P2, 3));
                    if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, P2, 4));
                    if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(v3Var, 1));
                    boolean l22 = v3Var.l2();
                    boolean o22 = v3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f14133r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f14133r.q3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (o22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f14133r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f14133r.q3(true);
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
                int i11 = rVar.f14132n;
                n70 n70Var2 = rVar.H;
                if (n70Var2 != null) {
                    n70Var2.u();
                }
                n70 G = n70.G(rVar, f6Var, view, true);
                G.Q = true;
                n70 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                J.k();
                rVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                rVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                rVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                rVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                rVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                rVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (P2 != null && v3.B3(P2.f13732b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a2 a2Var = new a2(rVar.getContext(), R.drawable.iv_h1);
                a2Var.a(z10);
                G.j(z11, 0, a2Var, LocaleController.getString(R.string.ArticleHeading), new fi.m2(G, J, 1));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, P2, 5));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, P2, 6));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                a2 a2Var2 = new a2(rVar.getContext(), R.drawable.iv_pullquote);
                a2Var2.a(z10);
                G.j(z14, 0, a2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, P2, 7));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, P2, 8));
                if (P2 != null && (P2.f13732b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                a2 a2Var3 = new a2(rVar.getContext(), R.drawable.iv_footer);
                a2Var3.a(z10);
                G.j(z16, 0, a2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, P2, 9));
                G.Z();
                rVar.H = G;
                return;
        }
    }
}
