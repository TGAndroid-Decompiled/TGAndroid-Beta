package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i80;
public final class z3 implements View.OnClickListener {
    public final int f15690a;
    public final b4 f15691b;
    public final int f15692c;

    public z3(b4 b4Var, int i10, int i11) {
        this.f15690a = i11;
        this.f15691b = b4Var;
        this.f15692c = i10;
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
        o5 S2;
        r5 o10;
        String str;
        switch (this.f15690a) {
            case 0:
                this.f15691b.f15145a.f15368a.f15448r.Z3(this.f15692c);
                return;
            default:
                final q qVar = this.f15691b.f15145a.f15368a;
                org.telegram.ui.ActionBar.d6 d6Var = qVar.f28172a;
                w3 w3Var = qVar.f15448r;
                a R2 = w3Var.R2();
                int i10 = this.f15692c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    w3Var.u3();
                                    return;
                                }
                                return;
                            }
                            if (R2 != null) {
                                TL_iv.PageBlock pageBlock = R2.f15095b;
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
                            q.X(context, str, new ai.o2(25, qVar, pageblockmath), d6Var);
                            return;
                        }
                        o5 o5Var = w3Var.f15595g4;
                        if (o5Var == null && (S2 = w3Var.S2()) != null && S2.getModel() != null) {
                            View findFocus = w3Var.findFocus();
                            if ((findFocus instanceof h1) && (o10 = S2.o((h1) findFocus)) != null) {
                                pagetablecell = o10.f15492b;
                            }
                            if (pagetablecell != null) {
                                w3Var.h2(S2);
                                if (S2.H.add(pagetablecell)) {
                                    S2.v.invalidate();
                                    S2.t();
                                }
                                o5Var = S2;
                            }
                        }
                        if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                            w3Var.G4(o5Var);
                            return;
                        } else {
                            w3Var.S1(c6.u(2, 2));
                            return;
                        }
                    }
                    i80 i80Var = qVar.H;
                    if (i80Var != null) {
                        i80Var.u();
                    }
                    final i80 F = i80.F(qVar, d6Var, view);
                    F.Q = true;
                    if (R2 != null && R2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(qVar, R2, 1));
                    if (R2 != null && R2.b() && !R2.a() && !R2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(qVar, R2, 2));
                    if (R2 != null && R2.b() && !R2.a() && R2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(qVar, R2, 3));
                    if (R2 != null && R2.b() && R2.a() && !R2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(qVar, R2, 4));
                    if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(w3Var, 1));
                    boolean n22 = w3Var.n2();
                    boolean q22 = w3Var.q2();
                    if (n22 || q22) {
                        F.k();
                        if (n22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f15448r.s3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f15448r.s3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (q22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f15448r.s3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f15448r.s3(true);
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
                int i11 = qVar.f15447n;
                i80 i80Var2 = qVar.H;
                if (i80Var2 != null) {
                    i80Var2.u();
                }
                i80 G = i80.G(qVar, d6Var, view, true);
                G.Q = true;
                i80 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                J.k();
                qVar.S(J, R2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                qVar.S(J, R2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                qVar.S(J, R2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                qVar.S(J, R2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                qVar.S(J, R2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                qVar.S(J, R2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (R2 != null && w3.D3(R2.f15095b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b2 b2Var = new b2(qVar.getContext(), R.drawable.iv_h1);
                b2Var.a(z10);
                G.j(z11, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new gi.g2(G, J, 1));
                if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(qVar, R2, 5));
                if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(qVar, R2, 6));
                if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                b2 b2Var2 = new b2(qVar.getContext(), R.drawable.iv_pullquote);
                b2Var2.a(z10);
                G.j(z14, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(qVar, R2, 7));
                if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(qVar, R2, 8));
                if (R2 != null && (R2.f15095b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                b2 b2Var3 = new b2(qVar.getContext(), R.drawable.iv_footer);
                b2Var3.a(z10);
                G.j(z16, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new f(qVar, R2, 9));
                G.Z();
                qVar.H = G;
                return;
        }
    }
}
