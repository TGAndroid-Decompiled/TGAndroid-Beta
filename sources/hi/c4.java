package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;
public final class c4 implements View.OnClickListener {
    public final int f9501a;
    public final e4 f9502b;
    public final int f9503c;

    public c4(e4 e4Var, int i10, int i11) {
        this.f9501a = i11;
        this.f9502b = e4Var;
        this.f9503c = i10;
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
        r5 Q2;
        u5 o9;
        String str;
        switch (this.f9501a) {
            case 0:
                this.f9502b.f9543a.f9749a.f9835r.X3(this.f9503c);
                return;
            default:
                final s sVar = this.f9502b.f9543a.f9749a;
                org.telegram.ui.ActionBar.f6 f6Var = sVar.f26421a;
                z3 z3Var = sVar.f9835r;
                a P2 = z3Var.P2();
                int i10 = this.f9503c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    z3Var.s3();
                                    return;
                                }
                                return;
                            }
                            if (P2 != null) {
                                TL_iv.PageBlock pageBlock = P2.f9421b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = sVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            s.U(context, str, new bi.y2(18, sVar, pageblockmath), f6Var);
                            return;
                        }
                        r5 r5Var = z3Var.f10004i4;
                        if (r5Var == null && (Q2 = z3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = z3Var.findFocus();
                            if ((findFocus instanceof k1) && (o9 = Q2.o((k1) findFocus)) != null) {
                                pagetablecell = o9.f9893b;
                            }
                            if (pagetablecell != null) {
                                z3Var.f2(Q2);
                                if (Q2.H.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                r5Var = Q2;
                            }
                        }
                        if (r5Var != null && r5Var.getModel() != null && !r5Var.H.isEmpty()) {
                            z3Var.E4(r5Var);
                            return;
                        } else {
                            z3Var.Q1(g6.u(2, 2));
                            return;
                        }
                    }
                    w70 w70Var = sVar.H;
                    if (w70Var != null) {
                        w70Var.u();
                    }
                    final w70 F = w70.F(sVar, f6Var, view);
                    F.Q = true;
                    if (P2 != null && P2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(sVar, P2, 1));
                    if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(sVar, P2, 2));
                    if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(sVar, P2, 3));
                    if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(sVar, P2, 4));
                    if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(z3Var, 1));
                    boolean l22 = z3Var.l2();
                    boolean o22 = z3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            sVar.f9835r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            sVar.f9835r.q3(true);
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
                                            sVar.f9835r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            sVar.f9835r.q3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    sVar.H = F;
                    return;
                }
                int i11 = sVar.f9834n;
                w70 w70Var2 = sVar.H;
                if (w70Var2 != null) {
                    w70Var2.u();
                }
                w70 G = w70.G(sVar, f6Var, view, true);
                G.Q = true;
                w70 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new i(G, 0), false);
                J.k();
                sVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                sVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                sVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                sVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                sVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                sVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (P2 != null && z3.B3(P2.f9421b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2 e2Var = new e2(sVar.getContext(), R.drawable.iv_h1);
                e2Var.a(z10);
                G.j(z11, 0, e2Var, LocaleController.getString(R.string.ArticleHeading), new di.p2(G, J, 1));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(sVar, P2, 5));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(sVar, P2, 6));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2 e2Var2 = new e2(sVar.getContext(), R.drawable.iv_pullquote);
                e2Var2.a(z10);
                G.j(z14, 0, e2Var2, LocaleController.getString(R.string.ArticlePullquote), new g(sVar, P2, 7));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(sVar, P2, 8));
                if (P2 != null && (P2.f9421b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                e2 e2Var3 = new e2(sVar.getContext(), R.drawable.iv_footer);
                e2Var3.a(z10);
                G.j(z16, 0, e2Var3, LocaleController.getString(R.string.ArticleFooter), new g(sVar, P2, 9));
                G.Z();
                sVar.H = G;
                return;
        }
    }
}
