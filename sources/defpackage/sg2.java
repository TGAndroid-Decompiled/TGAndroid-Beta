package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
public final class sg2 extends q59 {
    public final Context c;
    public final wg2 d;

    public sg2(wg2 wg2Var, Context context) {
        this.d = wg2Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(defpackage.u69 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.D(u69):boolean");
    }

    public final TLObject E(int i) {
        wg2 wg2Var = this.d;
        int i2 = wg2Var.E0;
        if (i >= i2 && i < wg2Var.F0) {
            return (TLObject) wg2Var.F.get(i - i2);
        }
        int i3 = wg2Var.U0;
        if (i >= i3 && i < wg2Var.V0) {
            return (TLObject) wg2Var.H.get(i - i3);
        }
        int i4 = wg2Var.X0;
        if (i >= i4 && i < wg2Var.Y0) {
            return (TLObject) wg2Var.G.get(i - i4);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.d1;
    }

    @Override
    public final int d(int i) {
        wg2 wg2Var = this.d;
        if (i != wg2Var.z0 && i != wg2Var.A0 && i != wg2Var.v0 && i != wg2Var.t0) {
            if (i < wg2Var.E0 || i >= wg2Var.F0) {
                if (i < wg2Var.X0 || i >= wg2Var.Y0) {
                    if (i < wg2Var.U0 || i >= wg2Var.V0) {
                        if (i != wg2Var.C0 && i != wg2Var.G0 && i != wg2Var.H0) {
                            if (i != wg2Var.D0 && i != wg2Var.S && i != wg2Var.N0 && i != wg2Var.s0 && i != wg2Var.p0) {
                                if (i != wg2Var.b1 && i != wg2Var.P0 && i != wg2Var.R0 && i != wg2Var.u0 && i != wg2Var.y0 && i != wg2Var.K0 && i != wg2Var.M0 && i != wg2Var.j1 && i != wg2Var.o0 && i != wg2Var.r0) {
                                    if (i == wg2Var.c1) {
                                        return 4;
                                    }
                                    if (i == wg2Var.B0) {
                                        return 6;
                                    }
                                    if (i != wg2Var.g0 && i != wg2Var.h0 && i != wg2Var.m0 && i != wg2Var.i0 && i != wg2Var.j0 && i != wg2Var.T && i != wg2Var.e0 && i != wg2Var.f0 && i != wg2Var.l0 && i != wg2Var.Q0) {
                                        if (i != wg2Var.Z0 && i != wg2Var.T0 && i != wg2Var.W0 && i != wg2Var.g1) {
                                            if (i == wg2Var.O0) {
                                                return 9;
                                            }
                                            if (i == wg2Var.a1) {
                                                return 10;
                                            }
                                            if (i == wg2Var.f1) {
                                                return 11;
                                            }
                                            if (i != wg2Var.x0 && i != wg2Var.J0 && i != wg2Var.L0) {
                                                if (wg2Var.q0(i)) {
                                                    return 13;
                                                }
                                                if (i == wg2Var.U) {
                                                    return 14;
                                                }
                                                if (i == wg2Var.S0) {
                                                    return 15;
                                                }
                                                if (i != wg2Var.h1 && i != wg2Var.i1 && i != wg2Var.n0) {
                                                    if (i == wg2Var.q0) {
                                                        return 17;
                                                    }
                                                    return 0;
                                                }
                                                return 16;
                                            }
                                            return 12;
                                        }
                                        return 8;
                                    }
                                    return 7;
                                }
                                return 1;
                            }
                            return 5;
                        }
                        return 3;
                    }
                    return 0;
                }
                return 0;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(defpackage.u69 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        boolean z;
        ylb ylbVar;
        hla hlaVar;
        hla hlaVar2;
        int i3 = 2;
        int i4 = 0;
        Context context = this.c;
        wg2 wg2Var = this.d;
        switch (i) {
            case 0:
                int i5 = wg2Var.O;
                if (i5 != 0 && i5 != 3) {
                    i2 = 6;
                } else {
                    i2 = 7;
                }
                if (i5 == 0 || i5 == 3) {
                    i3 = 6;
                }
                if (wg2Var.e1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                ij6 ij6Var = new ij6(this.c, i2, i3, z, null);
                ij6Var.setDelegate(new rg2(this, (byte) 0));
                hlaVar2 = ij6Var;
                hlaVar = hlaVar2;
                break;
            case 1:
                hlaVar = new njb(context);
                break;
            case 2:
                hlaVar = new fj6(context);
                break;
            case 3:
                hlaVar = new bba(context, (hg9) null);
                break;
            case 4:
                njb njbVar = new njb(context);
                if (wg2Var.s) {
                    njbVar.setText(jb6.M0(2131747972, null));
                    hlaVar = njbVar;
                    break;
                } else if (wg2Var.w) {
                    njbVar.setText(jb6.M0(2131747971, null));
                    hlaVar = njbVar;
                    break;
                } else {
                    njbVar.setText(jb6.M0(2131747970, null));
                    hlaVar = njbVar;
                    break;
                }
            case 5:
                jf5 jf5Var = new jf5(this.c, cmb.K6, 21, 11, false, null);
                jf5Var.setHeight(43);
                hlaVar2 = jf5Var;
                hlaVar = hlaVar2;
                break;
            case 6:
                hlaVar = new vkb(context);
                break;
            case 7:
            case 14:
                hlaVar = new ajb(context);
                break;
            case 8:
                ylbVar = ((d) wg2Var).resourceProvider;
                View l55Var = new l55(26, ylbVar, context);
                l55Var.setBackground(null);
                hlaVar = l55Var;
                break;
            case 9:
            default:
                hla hlaVar3 = new hla(context, null);
                hlaVar3.b(wg2Var.p1, null, jb6.M0(2131745039, "SlowmodeOff"), jb6.a0(null, null, 2131745038, 5), jb6.a0(null, null, 2131745038, 10), jb6.a0(null, null, 2131745038, 30), jb6.a0(null, null, 2131745040, 1), jb6.a0(null, null, 2131745040, 5), jb6.a0(null, null, 2131745040, 15), jb6.a0(null, null, 2131745043, 1));
                hlaVar3.setCallback(new rg2(this, (byte) 1));
                hlaVar = hlaVar3;
                break;
            case 10:
                hlaVar = new pa6(context, gm.L(40.0f), gm.L(120.0f));
                break;
            case 11:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(6);
                tk4Var.x = false;
                tk4Var.setUseHeaderOffset(false);
                tk4Var.setPaddingLeft(gm.L(5.0f));
                g69 g69Var = new g69(-1, -1);
                int L = gm.L(12.0f);
                ((ViewGroup.MarginLayoutParams) g69Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) g69Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(30.0f);
                tk4Var.setLayoutParams(g69Var);
                hlaVar = tk4Var;
                break;
            case 12:
                xib xibVar = new xib(23, wg2Var.getResourceProvider(), this.c, false, true);
                xibVar.w = (byte) 50;
                hlaVar = xibVar;
                break;
            case 13:
                oh2 oh2Var = new oh2(this.c, 4, 21, false, wg2Var.getResourceProvider());
                oh2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                oh2Var.setEnabled(true);
                hlaVar = oh2Var;
                break;
            case 15:
                hla hlaVar4 = new hla(context, null);
                Drawable[] drawableArr = {wg2Var.getParentActivity().getDrawable(2131231935), wg2Var.getParentActivity().getDrawable(2131231936), wg2Var.getParentActivity().getDrawable(2131231936), wg2Var.getParentActivity().getDrawable(2131231936), wg2Var.getParentActivity().getDrawable(2131231936)};
                int i6 = wg2Var.s1;
                if (i6 > 0) {
                    i4 = i6 - 1;
                }
                hlaVar4.b(i4, drawableArr, "1", "2", "3", "4", "5");
                hlaVar4.setCallback(new rg2(this, (byte) 2));
                hlaVar2 = hlaVar4;
                hlaVar = hlaVar2;
                break;
            case 16:
                hlaVar = new bjb(context, wg2Var.getResourceProvider());
                break;
            case 17:
                hlaVar = new jla(context, wg2Var.getResourceProvider());
                break;
        }
        return new u69(hlaVar);
    }
}
