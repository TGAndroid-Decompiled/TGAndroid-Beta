package mi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f60;
public final class w3 implements View.OnClickListener {
    public final int f20002a;
    public final y3 f20003b;
    public final int f20004c;

    public w3(y3 y3Var, int i3, int i10) {
        this.f20002a = i10;
        this.f20003b = y3Var;
        this.f20004c = i3;
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
        n5 U2;
        q5 q10;
        String str;
        int i3 = this.f20002a;
        int i10 = this.f20004c;
        y3 y3Var = this.f20003b;
        switch (i3) {
            case 0:
                y3Var.f20053a.f19728a.f19793r.b4(i10);
                return;
            default:
                final p pVar = y3Var.f20053a.f19728a;
                org.telegram.ui.ActionBar.e6 e6Var = pVar.f38415a;
                t3 t3Var = pVar.f19793r;
                a T2 = t3Var.T2();
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    t3Var.w3();
                                    return;
                                }
                                return;
                            }
                            if (T2 != null) {
                                TL_iv.PageBlock pageBlock = T2.f19431b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = pVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            p.Z(context, str, new f(0, pVar, pageblockmath), e6Var);
                            return;
                        }
                        n5 n5Var = t3Var.f19919q4;
                        if (n5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = t3Var.findFocus();
                            if ((findFocus instanceof h1) && (q10 = U2.q((h1) findFocus)) != null) {
                                pagetablecell = q10.f19843b;
                            }
                            if (pagetablecell != null) {
                                t3Var.j2(U2);
                                if (U2.I.add(pagetablecell)) {
                                    U2.f19771w.invalidate();
                                    U2.v();
                                }
                                n5Var = U2;
                            }
                        }
                        if (n5Var != null && n5Var.getModel() != null && !n5Var.I.isEmpty()) {
                            t3Var.I4(n5Var);
                            return;
                        } else {
                            t3Var.V1(b6.u(2, 2));
                            return;
                        }
                    }
                    f60 f60Var = pVar.I;
                    if (f60Var != null) {
                        f60Var.u();
                    }
                    final f60 F = f60.F(pVar, e6Var, view);
                    F.Q = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, 2131231069, null, bd.M0(2131753999, null), new g(pVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, 2131231564, null, bd.M0(2131754006, null), new g(pVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, 2131231576, null, bd.M0(2131754003, null), new g(pVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, 2131231597, null, bd.M0(2131754001, null), new g(pVar, T2, 4));
                    if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, 2131231552, null, bd.M0(2131753987, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(2131231565, bd.M0(2131754013, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f19793r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f19793r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(2131231566, bd.M0(2131753998, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f19793r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f19793r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    pVar.I = F;
                    return;
                }
                int i11 = pVar.f19792n;
                f60 f60Var2 = pVar.I;
                if (f60Var2 != null) {
                    f60Var2.u();
                }
                f60 G = f60.G(pVar, e6Var, view, true);
                G.Q = true;
                f60 J = G.J();
                if (!hp.s1(i11).s4() && !h10.i(i11).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(2131231240, bd.M0(2131753756, null), new ai.g4(G, 7), false);
                J.k();
                pVar.T(J, T2, new TL_iv.pageBlockHeading1(), 2131231558, bd.M0(2131754030, null), az.W0 + 2, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading2(), 2131231559, bd.M0(2131754029, null), az.W0 + 1, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading3(), 2131231560, bd.M0(2131754028, null), az.W0, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading4(), 2131231561, bd.M0(2131754027, null), az.W0 - 1, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading5(), 2131231562, bd.M0(2131754026, null), az.W0 - 2, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading6(), 2131231563, bd.M0(2131754025, null), az.W0 - 3, G);
                if (T2 != null && t3.F3(T2.f19431b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a2 a2Var = new a2(pVar.getContext(), 2131231558);
                a2Var.a(z10);
                G.j(z11, 0, a2Var, bd.M0(2131754031, null), new ai.y3(G, J, 2));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, 2131231595, null, bd.M0(2131753988, null), new g(pVar, T2, 5));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, 2131231580, null, bd.M0(2131753996, null), new g(pVar, T2, 6));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                a2 a2Var2 = new a2(pVar.getContext(), 2131231579);
                a2Var2.a(z10);
                G.j(z14, 0, a2Var2, bd.M0(2131753997, null), new g(pVar, T2, 7));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, 2131231551, null, bd.M0(2131754055, null), new g(pVar, T2, 8));
                if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                a2 a2Var3 = new a2(pVar.getContext(), 2131231554);
                a2Var3.a(z10);
                G.j(z16, 0, a2Var3, bd.M0(2131754032, null), new g(pVar, T2, 9));
                G.Z();
                pVar.I = G;
                return;
        }
    }
}
