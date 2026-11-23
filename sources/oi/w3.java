package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bi.h6;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.x60;
public final class w3 implements View.OnClickListener {
    public final int f22571a;
    public final y3 f22572b;
    public final int f22573c;

    public w3(y3 y3Var, int i7, int i10) {
        this.f22571a = i10;
        this.f22572b = y3Var;
        this.f22573c = i7;
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
        m5 U2;
        p5 q10;
        String str;
        int i7 = this.f22571a;
        int i10 = this.f22573c;
        y3 y3Var = this.f22572b;
        switch (i7) {
            case 0:
                y3Var.f22611a.f22285a.f22367r.b4(i10);
                return;
            default:
                final p pVar = y3Var.f22611a.f22285a;
                i6 i6Var = pVar.f37134a;
                t3 t3Var = pVar.f22367r;
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
                                TL_iv.PageBlock pageBlock = T2.f22001b;
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
                            p.Z(context, str, new ki.n2(4, pVar, pageblockmath), i6Var);
                            return;
                        }
                        m5 m5Var = t3Var.f22498q4;
                        if (m5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = t3Var.findFocus();
                            if ((findFocus instanceof f1) && (q10 = U2.q((f1) findFocus)) != null) {
                                pagetablecell = q10.f22382b;
                            }
                            if (pagetablecell != null) {
                                t3Var.j2(U2);
                                if (U2.I.add(pagetablecell)) {
                                    U2.f22316w.invalidate();
                                    U2.v();
                                }
                                m5Var = U2;
                            }
                        }
                        if (m5Var != null && m5Var.getModel() != null && !m5Var.I.isEmpty()) {
                            t3Var.I4(m5Var);
                            return;
                        } else {
                            t3Var.V1(a6.u(2, 2));
                            return;
                        }
                    }
                    x60 x60Var = pVar.I;
                    if (x60Var != null) {
                        x60Var.v();
                    }
                    final x60 G = x60.G(pVar, i6Var, view);
                    G.T = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    G.j(z17, 2131231071, null, gd.N0(2131753996, null), new f(pVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    G.j(z18, 2131231568, null, gd.N0(2131754003, null), new f(pVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    G.j(z19, 2131231580, null, gd.N0(2131754000, null), new f(pVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    G.j(z20, 2131231601, null, gd.N0(2131753998, null), new f(pVar, T2, 4));
                    if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    G.j(z21, 2131231556, null, gd.N0(2131753984, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        G.k();
                        if (p22) {
                            G.c(2131231569, gd.N0(2131754010, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f22367r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            pVar.f22367r.u3(true);
                                            G.v();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            G.c(2131231570, gd.N0(2131753995, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f22367r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            pVar.f22367r.u3(true);
                                            G.v();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    G.X = true;
                    G.a0();
                    pVar.I = G;
                    return;
                }
                int i11 = pVar.f22366n;
                x60 x60Var2 = pVar.I;
                if (x60Var2 != null) {
                    x60Var2.v();
                }
                x60 H = x60.H(pVar, i6Var, view, true);
                H.T = true;
                x60 K = H.K();
                if (!mp.u1(i11).B4() && !i10.i(i11).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K.c(2131231243, gd.N0(2131753753, null), new h6(H, 7), false);
                K.k();
                pVar.U(K, T2, new TL_iv.pageBlockHeading1(), 2131231562, gd.N0(2131754027, null), bz.W0 + 2, H);
                pVar.U(K, T2, new TL_iv.pageBlockHeading2(), 2131231563, gd.N0(2131754026, null), bz.W0 + 1, H);
                pVar.U(K, T2, new TL_iv.pageBlockHeading3(), 2131231564, gd.N0(2131754025, null), bz.W0, H);
                pVar.U(K, T2, new TL_iv.pageBlockHeading4(), 2131231565, gd.N0(2131754024, null), bz.W0 - 1, H);
                pVar.U(K, T2, new TL_iv.pageBlockHeading5(), 2131231566, gd.N0(2131754023, null), bz.W0 - 2, H);
                pVar.U(K, T2, new TL_iv.pageBlockHeading6(), 2131231567, gd.N0(2131754022, null), bz.W0 - 3, H);
                if (T2 != null && t3.F3(T2.f22001b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z1 z1Var = new z1(pVar.getContext(), 2131231562);
                z1Var.a(z10);
                H.j(z11, 0, z1Var, gd.N0(2131754028, null), new bi.a6(H, K, 2));
                if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231599, null, gd.N0(2131753985, null), new f(pVar, T2, 5));
                if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231584, null, gd.N0(2131753993, null), new f(pVar, T2, 6));
                if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z1 z1Var2 = new z1(pVar.getContext(), 2131231583);
                z1Var2.a(z10);
                H.j(z14, 0, z1Var2, gd.N0(2131753994, null), new f(pVar, T2, 7));
                if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                H.j(z15, 2131231555, null, gd.N0(2131754052, null), new f(pVar, T2, 8));
                if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z1 z1Var3 = new z1(pVar.getContext(), 2131231558);
                z1Var3.a(z10);
                H.j(z16, 0, z1Var3, gd.N0(2131754029, null), new f(pVar, T2, 9));
                H.a0();
                pVar.I = H;
                return;
        }
    }
}
