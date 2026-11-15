package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;
public final class t3 implements View.OnClickListener {
    public final int f22014a;
    public final v3 f22015b;
    public final int f22016c;

    public t3(v3 v3Var, int i7, int i10) {
        this.f22014a = i10;
        this.f22015b = v3Var;
        this.f22016c = i7;
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
        k5 U2;
        n5 q10;
        String str;
        int i7 = this.f22014a;
        int i10 = this.f22016c;
        v3 v3Var = this.f22015b;
        switch (i7) {
            case 0:
                v3Var.f22057a.f21766a.f21848r.b4(i10);
                return;
            default:
                final o oVar = v3Var.f22057a.f21766a;
                e6 e6Var = oVar.f33608a;
                q3 q3Var = oVar.f21848r;
                a T2 = q3Var.T2();
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    q3Var.w3();
                                    return;
                                }
                                return;
                            }
                            if (T2 != null) {
                                TL_iv.PageBlock pageBlock = T2.f21544b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = oVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            o.Z(context, str, new li.v(1, oVar, pageblockmath), e6Var);
                            return;
                        }
                        k5 k5Var = q3Var.f21934q4;
                        if (k5Var == null && (U2 = q3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = q3Var.findFocus();
                            if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                                pagetablecell = q10.f21846b;
                            }
                            if (pagetablecell != null) {
                                q3Var.j2(U2);
                                if (U2.I.add(pagetablecell)) {
                                    U2.f21778w.invalidate();
                                    U2.v();
                                }
                                k5Var = U2;
                            }
                        }
                        if (k5Var != null && k5Var.getModel() != null && !k5Var.I.isEmpty()) {
                            q3Var.I4(k5Var);
                            return;
                        } else {
                            q3Var.V1(y5.u(2, 2));
                            return;
                        }
                    }
                    m60 m60Var = oVar.I;
                    if (m60Var != null) {
                        m60Var.u();
                    }
                    final m60 F = m60.F(oVar, e6Var, view);
                    F.Q = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, 2131231069, null, hd.M0(2131753999, null), new f(oVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, 2131231564, null, hd.M0(2131754006, null), new f(oVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, 2131231576, null, hd.M0(2131754003, null), new f(oVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, 2131231597, null, hd.M0(2131754001, null), new f(oVar, T2, 4));
                    if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, 2131231552, null, hd.M0(2131753987, null), new b(q3Var, 1));
                    boolean p22 = q3Var.p2();
                    boolean s22 = q3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(2131231565, hd.M0(2131754013, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f21848r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            oVar.f21848r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(2131231566, hd.M0(2131753998, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f21848r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            oVar.f21848r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    oVar.I = F;
                    return;
                }
                int i11 = oVar.f21847n;
                m60 m60Var2 = oVar.I;
                if (m60Var2 != null) {
                    m60Var2.u();
                }
                m60 G = m60.G(oVar, e6Var, view, true);
                G.Q = true;
                m60 J = G.J();
                if (!np.s1(i11).s4() && !m10.i(i11).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(2131231240, hd.M0(2131753756, null), new bi.u3(G, 7), false);
                J.k();
                oVar.U(J, T2, new TL_iv.pageBlockHeading1(), 2131231558, hd.M0(2131754030, null), gz.W0 + 2, G);
                oVar.U(J, T2, new TL_iv.pageBlockHeading2(), 2131231559, hd.M0(2131754029, null), gz.W0 + 1, G);
                oVar.U(J, T2, new TL_iv.pageBlockHeading3(), 2131231560, hd.M0(2131754028, null), gz.W0, G);
                oVar.U(J, T2, new TL_iv.pageBlockHeading4(), 2131231561, hd.M0(2131754027, null), gz.W0 - 1, G);
                oVar.U(J, T2, new TL_iv.pageBlockHeading5(), 2131231562, hd.M0(2131754026, null), gz.W0 - 2, G);
                oVar.U(J, T2, new TL_iv.pageBlockHeading6(), 2131231563, hd.M0(2131754025, null), gz.W0 - 3, G);
                if (T2 != null && q3.F3(T2.f21544b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x1 x1Var = new x1(oVar.getContext(), 2131231558);
                x1Var.a(z10);
                G.j(z11, 0, x1Var, hd.M0(2131754031, null), new bi.n3(G, J, 2));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, 2131231595, null, hd.M0(2131753988, null), new f(oVar, T2, 5));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, 2131231580, null, hd.M0(2131753996, null), new f(oVar, T2, 6));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                x1 x1Var2 = new x1(oVar.getContext(), 2131231579);
                x1Var2.a(z10);
                G.j(z14, 0, x1Var2, hd.M0(2131753997, null), new f(oVar, T2, 7));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, 2131231551, null, hd.M0(2131754055, null), new f(oVar, T2, 8));
                if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                x1 x1Var3 = new x1(oVar.getContext(), 2131231554);
                x1Var3.a(z10);
                G.j(z16, 0, x1Var3, hd.M0(2131754032, null), new f(oVar, T2, 9));
                G.Z();
                oVar.I = G;
                return;
        }
    }
}
