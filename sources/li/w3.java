package li;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k60;
public final class w3 implements View.OnClickListener {
    public final int f18956a;
    public final y3 f18957b;
    public final int f18958c;

    public w3(y3 y3Var, int i7, int i10) {
        this.f18956a = i10;
        this.f18957b = y3Var;
        this.f18958c = i7;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
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
        m5 U2;
        p5 q10;
        String str;
        int i7 = this.f18956a;
        int i10 = this.f18958c;
        y3 y3Var = this.f18957b;
        switch (i7) {
            case 0:
                y3Var.f18999a.f18678a.f18760r.b4(i10);
                return;
            default:
                final p pVar = y3Var.f18999a.f18678a;
                f6 f6Var = pVar.f39003a;
                t3 t3Var = pVar.f18760r;
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
                                TL_iv.PageBlock pageBlock = T2.f18392b;
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
                            p.Z(context, str, new ai.f1(26, pVar, pageblockmath), f6Var);
                            return;
                        }
                        m5 m5Var = t3Var.f18892p4;
                        if (m5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = t3Var.findFocus();
                            if ((findFocus instanceof g1) && (q10 = U2.q((g1) findFocus)) != null) {
                                pagetablecell = q10.f18779b;
                            }
                            if (pagetablecell != null) {
                                t3Var.j2(U2);
                                if (U2.H.add(pagetablecell)) {
                                    U2.f18711w.invalidate();
                                    U2.v();
                                }
                                m5Var = U2;
                            }
                        }
                        if (m5Var != null && m5Var.getModel() != null && !m5Var.H.isEmpty()) {
                            t3Var.I4(m5Var);
                            return;
                        } else {
                            t3Var.V1(a6.u(2, 2));
                            return;
                        }
                    }
                    k60 k60Var = pVar.H;
                    if (k60Var != null) {
                        k60Var.u();
                    }
                    final k60 F = k60.F(pVar, f6Var, view);
                    F.Q = true;
                    if (T2 != null && T2.b()) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    F.j(z16, 2131231069, null, id.M0(2131753999, null), new f(pVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    F.j(z17, 2131231564, null, id.M0(2131754006, null), new f(pVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, 2131231576, null, id.M0(2131754003, null), new f(pVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, 2131231597, null, id.M0(2131754001, null), new f(pVar, T2, 4));
                    if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockDetails)) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, 2131231552, null, id.M0(2131753987, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(2131231565, id.M0(2131754013, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f18760r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f18760r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(2131231566, id.M0(2131753998, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f18760r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f18760r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    pVar.H = F;
                    return;
                }
                int i11 = pVar.f18759n;
                k60 k60Var2 = pVar.H;
                if (k60Var2 != null) {
                    k60Var2.u();
                }
                k60 G = k60.G(pVar, f6Var, view, true);
                G.Q = true;
                k60 J = G.J();
                if (!qp.s1(i11).s4() && !p10.i(i11).q()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                J.c(2131231240, id.M0(2131753756, null), new h(G, 0), false);
                J.k();
                pVar.T(J, T2, new TL_iv.pageBlockHeading1(), 2131231558, id.M0(2131754030, null), iz.W0 + 2, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading2(), 2131231559, id.M0(2131754029, null), iz.W0 + 1, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading3(), 2131231560, id.M0(2131754028, null), iz.W0, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading4(), 2131231561, id.M0(2131754027, null), iz.W0 - 1, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading5(), 2131231562, id.M0(2131754026, null), iz.W0 - 2, G);
                pVar.T(J, T2, new TL_iv.pageBlockHeading6(), 2131231563, id.M0(2131754025, null), iz.W0 - 3, G);
                if (T2 != null && t3.F3(T2.f18392b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z1 z1Var = new z1(pVar.getContext(), 2131231558);
                z1Var.a(z9);
                G.j(z10, 0, z1Var, id.M0(2131754031, null), new hi.h2(G, J, 1));
                if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockParagraph)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                G.j(z11, 2131231595, null, id.M0(2131753988, null), new f(pVar, T2, 5));
                if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockBlockquote)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, 2131231580, null, id.M0(2131753996, null), new f(pVar, T2, 6));
                if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockPullquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z1 z1Var2 = new z1(pVar.getContext(), 2131231579);
                z1Var2.a(z9);
                G.j(z13, 0, z1Var2, id.M0(2131753997, null), new f(pVar, T2, 7));
                if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockPreformatted)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                G.j(z14, 2131231551, null, id.M0(2131754055, null), new f(pVar, T2, 8));
                if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockFooter)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z1 z1Var3 = new z1(pVar.getContext(), 2131231554);
                z1Var3.a(z9);
                G.j(z15, 0, z1Var3, id.M0(2131754032, null), new f(pVar, T2, 9));
                G.Z();
                pVar.H = G;
                return;
        }
    }
}
