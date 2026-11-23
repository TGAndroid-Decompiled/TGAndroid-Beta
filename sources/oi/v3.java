package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a70;
public final class v3 implements View.OnClickListener {
    public final int f22441a;
    public final x3 f22442b;
    public final int f22443c;

    public v3(x3 x3Var, int i7, int i10) {
        this.f22441a = i10;
        this.f22442b = x3Var;
        this.f22443c = i7;
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
        l5 U2;
        o5 q10;
        String str;
        int i7 = this.f22441a;
        int i10 = this.f22443c;
        x3 x3Var = this.f22442b;
        switch (i7) {
            case 0:
                x3Var.f22481a.f22155a.f22237r.b4(i10);
                return;
            default:
                final o oVar = x3Var.f22481a.f22155a;
                h6 h6Var = oVar.f37476a;
                s3 s3Var = oVar.f22237r;
                a T2 = s3Var.T2();
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    s3Var.w3();
                                    return;
                                }
                                return;
                            }
                            if (T2 != null) {
                                TL_iv.PageBlock pageBlock = T2.f21901b;
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
                            o.Z(context, str, new li.d(3, oVar, pageblockmath), h6Var);
                            return;
                        }
                        l5 l5Var = s3Var.f22368q4;
                        if (l5Var == null && (U2 = s3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = s3Var.findFocus();
                            if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                                pagetablecell = q10.f22254b;
                            }
                            if (pagetablecell != null) {
                                s3Var.j2(U2);
                                if (U2.I.add(pagetablecell)) {
                                    U2.f22186w.invalidate();
                                    U2.v();
                                }
                                l5Var = U2;
                            }
                        }
                        if (l5Var != null && l5Var.getModel() != null && !l5Var.I.isEmpty()) {
                            s3Var.I4(l5Var);
                            return;
                        } else {
                            s3Var.V1(z5.u(2, 2));
                            return;
                        }
                    }
                    a70 a70Var = oVar.I;
                    if (a70Var != null) {
                        a70Var.v();
                    }
                    final a70 G = a70.G(oVar, h6Var, view);
                    G.T = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    G.j(z17, 2131231069, null, hd.N0(2131753996, null), new f(oVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    G.j(z18, 2131231565, null, hd.N0(2131754003, null), new f(oVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    G.j(z19, 2131231577, null, hd.N0(2131754000, null), new f(oVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    G.j(z20, 2131231598, null, hd.N0(2131753998, null), new f(oVar, T2, 4));
                    if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    G.j(z21, 2131231553, null, hd.N0(2131753984, null), new b(s3Var, 1));
                    boolean p22 = s3Var.p2();
                    boolean s22 = s3Var.s2();
                    if (p22 || s22) {
                        G.k();
                        if (p22) {
                            G.c(2131231566, hd.N0(2131754010, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f22237r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            oVar.f22237r.u3(true);
                                            G.v();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            G.c(2131231567, hd.N0(2131753995, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f22237r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            oVar.f22237r.u3(true);
                                            G.v();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    G.X = true;
                    G.a0();
                    oVar.I = G;
                    return;
                }
                int i11 = oVar.f22236n;
                a70 a70Var2 = oVar.I;
                if (a70Var2 != null) {
                    a70Var2.v();
                }
                a70 H = a70.H(oVar, h6Var, view, true);
                H.T = true;
                a70 K = H.K();
                if (!np.u1(i11).B4() && !k10.i(i11).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K.c(2131231240, hd.N0(2131753753, null), new bi.h6(H, 7), false);
                K.k();
                oVar.U(K, T2, new TL_iv.pageBlockHeading1(), 2131231559, hd.N0(2131754027, null), cz.W0 + 2, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading2(), 2131231560, hd.N0(2131754026, null), cz.W0 + 1, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading3(), 2131231561, hd.N0(2131754025, null), cz.W0, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading4(), 2131231562, hd.N0(2131754024, null), cz.W0 - 1, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading5(), 2131231563, hd.N0(2131754023, null), cz.W0 - 2, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading6(), 2131231564, hd.N0(2131754022, null), cz.W0 - 3, H);
                if (T2 != null && s3.F3(T2.f21901b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                y1 y1Var = new y1(oVar.getContext(), 2131231559);
                y1Var.a(z10);
                H.j(z11, 0, y1Var, hd.N0(2131754028, null), new bi.a6(H, K, 2));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231596, null, hd.N0(2131753985, null), new f(oVar, T2, 5));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231581, null, hd.N0(2131753993, null), new f(oVar, T2, 6));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                y1 y1Var2 = new y1(oVar.getContext(), 2131231580);
                y1Var2.a(z10);
                H.j(z14, 0, y1Var2, hd.N0(2131753994, null), new f(oVar, T2, 7));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                H.j(z15, 2131231552, null, hd.N0(2131754052, null), new f(oVar, T2, 8));
                if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                y1 y1Var3 = new y1(oVar.getContext(), 2131231555);
                y1Var3.a(z10);
                H.j(z16, 0, y1Var3, hd.N0(2131754029, null), new f(oVar, T2, 9));
                H.a0();
                oVar.I = H;
                return;
        }
    }
}
