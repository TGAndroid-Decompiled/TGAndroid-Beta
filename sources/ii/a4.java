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
import org.telegram.ui.Components.b80;
public final class a4 implements View.OnClickListener {
    public final int f12226a;
    public final c4 f12227b;
    public final int f12228c;

    public a4(c4 c4Var, int i10, int i11) {
        this.f12226a = i11;
        this.f12227b = c4Var;
        this.f12228c = i10;
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
        q5 T2;
        t5 o9;
        String str;
        switch (this.f12226a) {
            case 0:
                this.f12227b.f12264a.f12516a.f12603r.a4(this.f12228c);
                return;
            default:
                final r rVar = this.f12227b.f12264a.f12516a;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.f29647a;
                x3 x3Var = rVar.f12603r;
                a S2 = x3Var.S2();
                int i10 = this.f12228c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    x3Var.v3();
                                    return;
                                }
                                return;
                            }
                            if (S2 != null) {
                                TL_iv.PageBlock pageBlock = S2.f12187b;
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
                            r.S(context, str, new ai.g3(19, rVar, pageblockmath), d6Var);
                            return;
                        }
                        q5 q5Var = x3Var.f12773p4;
                        if (q5Var == null && (T2 = x3Var.T2()) != null && T2.getModel() != null) {
                            View findFocus = x3Var.findFocus();
                            if ((findFocus instanceof i1) && (o9 = T2.o((i1) findFocus)) != null) {
                                pagetablecell = o9.f12662b;
                            }
                            if (pagetablecell != null) {
                                x3Var.i2(T2);
                                if (T2.H.add(pagetablecell)) {
                                    T2.v.invalidate();
                                    T2.t();
                                }
                                q5Var = T2;
                            }
                        }
                        if (q5Var != null && q5Var.getModel() != null && !q5Var.H.isEmpty()) {
                            x3Var.H4(q5Var);
                            return;
                        } else {
                            x3Var.T1(f6.u(2, 2));
                            return;
                        }
                    }
                    b80 b80Var = rVar.H;
                    if (b80Var != null) {
                        b80Var.u();
                    }
                    final b80 F = b80.F(rVar, d6Var, view);
                    F.Q = true;
                    if (S2 != null && S2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, S2, 1));
                    if (S2 != null && S2.b() && !S2.a() && !S2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, S2, 2));
                    if (S2 != null && S2.b() && !S2.a() && S2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, S2, 3));
                    if (S2 != null && S2.b() && S2.a() && !S2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, S2, 4));
                    if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(x3Var, 1));
                    boolean o22 = x3Var.o2();
                    boolean r22 = x3Var.r2();
                    if (o22 || r22) {
                        F.k();
                        if (o22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f12603r.t3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f12603r.t3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (r22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            rVar.f12603r.t3(false);
                                            F.u();
                                            return;
                                        default:
                                            rVar.f12603r.t3(true);
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
                int i11 = rVar.f12602n;
                b80 b80Var2 = rVar.H;
                if (b80Var2 != null) {
                    b80Var2.u();
                }
                b80 G = b80.G(rVar, d6Var, view, true);
                G.Q = true;
                b80 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                J.k();
                rVar.N(J, S2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                rVar.N(J, S2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                rVar.N(J, S2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                rVar.N(J, S2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                rVar.N(J, S2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                rVar.N(J, S2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (S2 != null && x3.E3(S2.f12187b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c2 c2Var = new c2(rVar.getContext(), R.drawable.iv_h1);
                c2Var.a(z10);
                G.j(z11, 0, c2Var, LocaleController.getString(R.string.ArticleHeading), new ei.n2(G, J, 1));
                if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, S2, 5));
                if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, S2, 6));
                if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c2 c2Var2 = new c2(rVar.getContext(), R.drawable.iv_pullquote);
                c2Var2.a(z10);
                G.j(z14, 0, c2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, S2, 7));
                if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, S2, 8));
                if (S2 != null && (S2.f12187b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c2 c2Var3 = new c2(rVar.getContext(), R.drawable.iv_footer);
                c2Var3.a(z10);
                G.j(z16, 0, c2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, S2, 9));
                G.Z();
                rVar.H = G;
                return;
        }
    }
}
