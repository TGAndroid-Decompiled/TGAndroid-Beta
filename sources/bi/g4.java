package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z60;
public final class g4 implements View.OnClickListener {
    public final int f3039a;
    public final i4 f3040b;
    public final int f3041c;

    public g4(i4 i4Var, int i10, int i11) {
        this.f3039a = i11;
        this.f3040b = i4Var;
        this.f3041c = i10;
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
        z5 U2;
        c6 q6;
        String str;
        int i10 = this.f3039a;
        int i11 = this.f3041c;
        i4 i4Var = this.f3040b;
        switch (i10) {
            case 0:
                i4Var.f3075a.f3271a.f3350r.b4(i11);
                return;
            default:
                final t tVar = i4Var.f3075a.f3271a;
                org.telegram.ui.ActionBar.p6 p6Var = tVar.f30963a;
                d4 d4Var = tVar.f3350r;
                a T2 = d4Var.T2();
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 4) {
                            if (i11 != 7) {
                                if (i11 == 9) {
                                    d4Var.w3();
                                    return;
                                }
                                return;
                            }
                            if (T2 != null) {
                                TL_iv.PageBlock pageBlock = T2.f2818b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = tVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            t.X(context, str, new ag.e0(3, tVar, pageblockmath), p6Var);
                            return;
                        }
                        z5 z5Var = d4Var.f2941p4;
                        if (z5Var == null && (U2 = d4Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = d4Var.findFocus();
                            if ((findFocus instanceof n1) && (q6 = U2.q((n1) findFocus)) != null) {
                                pagetablecell = q6.f2906b;
                            }
                            if (pagetablecell != null) {
                                d4Var.j2(U2);
                                if (U2.H.add(pagetablecell)) {
                                    U2.f3483w.invalidate();
                                    U2.v();
                                }
                                z5Var = U2;
                            }
                        }
                        if (z5Var != null && z5Var.getModel() != null && !z5Var.H.isEmpty()) {
                            d4Var.I4(z5Var);
                            return;
                        } else {
                            d4Var.U1(q6.u(2, 2));
                            return;
                        }
                    }
                    z60 z60Var = tVar.H;
                    if (z60Var != null) {
                        z60Var.u();
                    }
                    final z60 F = z60.F(tVar, p6Var, view);
                    F.Q = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, 2131231069, null, dd.L0(2131753999, null), new h(tVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, 2131231565, null, dd.L0(2131754006, null), new h(tVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, 2131231577, null, dd.L0(2131754003, null), new h(tVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, 2131231598, null, dd.L0(2131754001, null), new h(tVar, T2, 4));
                    if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, 2131231553, null, dd.L0(2131753987, null), new b(d4Var, 1));
                    boolean p22 = d4Var.p2();
                    boolean s22 = d4Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(2131231566, dd.L0(2131754013, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            tVar.f3350r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            tVar.f3350r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(2131231567, dd.L0(2131753998, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            tVar.f3350r.u3(false);
                                            F.u();
                                            return;
                                        default:
                                            tVar.f3350r.u3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    tVar.H = F;
                    return;
                }
                int i12 = tVar.f3349n;
                z60 z60Var2 = tVar.H;
                if (z60Var2 != null) {
                    z60Var2.u();
                }
                z60 G = z60.G(tVar, p6Var, view, true);
                G.Q = true;
                z60 J = G.J();
                if (!wp.r1(i12).p4() && !e20.i(i12).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(2131231241, dd.L0(2131753756, null), new j(G, 0), false);
                J.k();
                tVar.S(J, T2, new TL_iv.pageBlockHeading1(), 2131231559, dd.L0(2131754030, null), uz.W0 + 2, G);
                tVar.S(J, T2, new TL_iv.pageBlockHeading2(), 2131231560, dd.L0(2131754029, null), uz.W0 + 1, G);
                tVar.S(J, T2, new TL_iv.pageBlockHeading3(), 2131231561, dd.L0(2131754028, null), uz.W0, G);
                tVar.S(J, T2, new TL_iv.pageBlockHeading4(), 2131231562, dd.L0(2131754027, null), uz.W0 - 1, G);
                tVar.S(J, T2, new TL_iv.pageBlockHeading5(), 2131231563, dd.L0(2131754026, null), uz.W0 - 2, G);
                tVar.S(J, T2, new TL_iv.pageBlockHeading6(), 2131231564, dd.L0(2131754025, null), uz.W0 - 3, G);
                if (T2 != null && d4.F3(T2.f2818b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i2 i2Var = new i2(tVar.getContext(), 2131231559);
                i2Var.a(z10);
                G.j(z11, 0, i2Var, dd.L0(2131754031, null), new k(G, J, 0));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, 2131231596, null, dd.L0(2131753988, null), new h(tVar, T2, 5));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, 2131231581, null, dd.L0(2131753996, null), new h(tVar, T2, 6));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i2 i2Var2 = new i2(tVar.getContext(), 2131231580);
                i2Var2.a(z10);
                G.j(z14, 0, i2Var2, dd.L0(2131753997, null), new h(tVar, T2, 7));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, 2131231552, null, dd.L0(2131754055, null), new h(tVar, T2, 8));
                if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                i2 i2Var3 = new i2(tVar.getContext(), 2131231555);
                i2Var3.a(z10);
                G.j(z16, 0, i2Var3, dd.L0(2131754032, null), new h(tVar, T2, 9));
                G.Z();
                tVar.H = G;
                return;
        }
    }
}
