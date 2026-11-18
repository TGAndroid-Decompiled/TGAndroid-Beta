package oi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.y60;
public final class v3 implements View.OnClickListener {
    public final int f22420a;
    public final x3 f22421b;
    public final int f22422c;

    public v3(x3 x3Var, int i7, int i10) {
        this.f22420a = i10;
        this.f22421b = x3Var;
        this.f22422c = i7;
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
        int i7 = this.f22420a;
        int i10 = this.f22422c;
        x3 x3Var = this.f22421b;
        switch (i7) {
            case 0:
                x3Var.f22458a.f22129a.f22210r.b4(i10);
                return;
            default:
                final o oVar = x3Var.f22458a.f22129a;
                i6 i6Var = oVar.f36765a;
                s3 s3Var = oVar.f22210r;
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
                                TL_iv.PageBlock pageBlock = T2.f21910b;
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
                            o.Z(context, str, new li.d(3, oVar, pageblockmath), i6Var);
                            return;
                        }
                        l5 l5Var = s3Var.f22340q4;
                        if (l5Var == null && (U2 = s3Var.U2()) != null && U2.getModel() != null) {
                            View findFocus = s3Var.findFocus();
                            if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                                pagetablecell = q10.f22227b;
                            }
                            if (pagetablecell != null) {
                                s3Var.j2(U2);
                                if (U2.I.add(pagetablecell)) {
                                    U2.f22168w.invalidate();
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
                    y60 y60Var = oVar.I;
                    if (y60Var != null) {
                        y60Var.v();
                    }
                    final y60 G = y60.G(oVar, i6Var, view);
                    G.T = true;
                    if (T2 != null && T2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    G.j(z17, 2131231069, null, gd.M0(2131753997, null), new f(oVar, T2, 1));
                    if (T2 != null && T2.b() && !T2.a() && !T2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    G.j(z18, 2131231565, null, gd.M0(2131754004, null), new f(oVar, T2, 2));
                    if (T2 != null && T2.b() && !T2.a() && T2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    G.j(z19, 2131231577, null, gd.M0(2131754001, null), new f(oVar, T2, 3));
                    if (T2 != null && T2.b() && T2.a() && !T2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    G.j(z20, 2131231598, null, gd.M0(2131753999, null), new f(oVar, T2, 4));
                    if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    G.j(z21, 2131231553, null, gd.M0(2131753985, null), new b(s3Var, 1));
                    boolean p22 = s3Var.p2();
                    boolean s22 = s3Var.s2();
                    if (p22 || s22) {
                        G.k();
                        if (p22) {
                            G.c(2131231566, gd.M0(2131754011, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f22210r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            oVar.f22210r.u3(true);
                                            G.v();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            G.c(2131231567, gd.M0(2131753996, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            oVar.f22210r.u3(false);
                                            G.v();
                                            return;
                                        default:
                                            oVar.f22210r.u3(true);
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
                int i11 = oVar.f22209n;
                y60 y60Var2 = oVar.I;
                if (y60Var2 != null) {
                    y60Var2.v();
                }
                y60 H = y60.H(oVar, i6Var, view, true);
                H.T = true;
                y60 K = H.K();
                if (!mp.u1(i11).B4() && !j10.i(i11).q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K.c(2131231240, gd.M0(2131753754, null), new bi.c6(H, 7), false);
                K.k();
                oVar.U(K, T2, new TL_iv.pageBlockHeading1(), 2131231559, gd.M0(2131754028, null), bz.W0 + 2, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading2(), 2131231560, gd.M0(2131754027, null), bz.W0 + 1, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading3(), 2131231561, gd.M0(2131754026, null), bz.W0, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading4(), 2131231562, gd.M0(2131754025, null), bz.W0 - 1, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading5(), 2131231563, gd.M0(2131754024, null), bz.W0 - 2, H);
                oVar.U(K, T2, new TL_iv.pageBlockHeading6(), 2131231564, gd.M0(2131754023, null), bz.W0 - 3, H);
                if (T2 != null && s3.F3(T2.f21910b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x1 x1Var = new x1(oVar.getContext(), 2131231559);
                x1Var.a(z10);
                H.j(z11, 0, x1Var, gd.M0(2131754029, null), new bi.v5(H, K, 2));
                if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, 2131231596, null, gd.M0(2131753986, null), new f(oVar, T2, 5));
                if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, 2131231581, null, gd.M0(2131753994, null), new f(oVar, T2, 6));
                if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                x1 x1Var2 = new x1(oVar.getContext(), 2131231580);
                x1Var2.a(z10);
                H.j(z14, 0, x1Var2, gd.M0(2131753995, null), new f(oVar, T2, 7));
                if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                H.j(z15, 2131231552, null, gd.M0(2131754053, null), new f(oVar, T2, 8));
                if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                x1 x1Var3 = new x1(oVar.getContext(), 2131231555);
                x1Var3.a(z10);
                H.j(z16, 0, x1Var3, gd.M0(2131754030, null), new f(oVar, T2, 9));
                H.a0();
                oVar.I = H;
                return;
        }
    }
}
