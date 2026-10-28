package li;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.l80;
public final class y3 implements View.OnClickListener {
    public final int f17646a;
    public final a4 f17647b;
    public final int f17648c;

    public y3(a4 a4Var, int i10, int i11) {
        this.f17646a = i11;
        this.f17647b = a4Var;
        this.f17648c = i10;
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
        p5 X2;
        s5 n10;
        String str;
        switch (this.f17646a) {
            case 0:
                this.f17647b.f17080a.f17335a.f17417r.e4(this.f17648c);
                return;
            default:
                final q qVar = this.f17647b.f17080a.f17335a;
                u6 u6Var = qVar.f30253a;
                v3 v3Var = qVar.f17417r;
                a W2 = v3Var.W2();
                int i10 = this.f17648c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    v3Var.z3();
                                    return;
                                }
                                return;
                            }
                            if (W2 != null) {
                                TL_iv.PageBlock pageBlock = W2.f17053b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = qVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            q.X(context, str, new ai.n1(27, qVar, pageblockmath), u6Var);
                            return;
                        }
                        p5 p5Var = v3Var.f17559q4;
                        if (p5Var == null && (X2 = v3Var.X2()) != null && X2.getModel() != null) {
                            View findFocus = v3Var.findFocus();
                            if ((findFocus instanceof g1) && (n10 = X2.n((g1) findFocus)) != null) {
                                pagetablecell = n10.f17475b;
                            }
                            if (pagetablecell != null) {
                                v3Var.m2(X2);
                                if (X2.H.add(pagetablecell)) {
                                    X2.v.invalidate();
                                    X2.s();
                                }
                                p5Var = X2;
                            }
                        }
                        if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                            v3Var.L4(p5Var);
                            return;
                        } else {
                            v3Var.X1(d6.t(2, 2));
                            return;
                        }
                    }
                    l80 l80Var = qVar.H;
                    if (l80Var != null) {
                        l80Var.u();
                    }
                    final l80 F = l80.F(qVar, u6Var, view);
                    F.Q = true;
                    if (W2 != null && W2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(qVar, W2, 1));
                    if (W2 != null && W2.b() && !W2.a() && !W2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(qVar, W2, 2));
                    if (W2 != null && W2.b() && !W2.a() && W2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(qVar, W2, 3));
                    if (W2 != null && W2.b() && W2.a() && !W2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(qVar, W2, 4));
                    if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(v3Var, 1));
                    boolean s22 = v3Var.s2();
                    boolean v22 = v3Var.v2();
                    if (s22 || v22) {
                        F.k();
                        if (s22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f17417r.x3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f17417r.x3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (v22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f17417r.x3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f17417r.x3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    qVar.H = F;
                    return;
                }
                int i11 = qVar.f17416n;
                l80 l80Var2 = qVar.H;
                if (l80Var2 != null) {
                    l80Var2.u();
                }
                l80 G = l80.G(qVar, u6Var, view, true);
                G.Q = true;
                l80 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                J.k();
                qVar.S(J, W2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                qVar.S(J, W2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                qVar.S(J, W2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                qVar.S(J, W2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                qVar.S(J, W2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                qVar.S(J, W2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (W2 != null && v3.I3(W2.f17053b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z1 z1Var = new z1(qVar.getContext(), R.drawable.iv_h1);
                z1Var.a(z10);
                G.j(z11, 0, z1Var, LocaleController.getString(R.string.ArticleHeading), new hi.o2(G, J, 1));
                if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(qVar, W2, 5));
                if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(qVar, W2, 6));
                if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z1 z1Var2 = new z1(qVar.getContext(), R.drawable.iv_pullquote);
                z1Var2.a(z10);
                G.j(z14, 0, z1Var2, LocaleController.getString(R.string.ArticlePullquote), new f(qVar, W2, 7));
                if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(qVar, W2, 8));
                if (W2 != null && (W2.f17053b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z1 z1Var3 = new z1(qVar.getContext(), R.drawable.iv_footer);
                z1Var3.a(z10);
                G.j(z16, 0, z1Var3, LocaleController.getString(R.string.ArticleFooter), new f(qVar, W2, 9));
                G.Z();
                qVar.H = G;
                return;
        }
    }
}
