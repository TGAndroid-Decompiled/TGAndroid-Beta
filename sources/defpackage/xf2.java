package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;
public final class xf2 extends c79 {
    public final Context c;
    public final bg2 d;

    public xf2(bg2 bg2Var, Context context) {
        this.d = bg2Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(defpackage.f89 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.D(f89):boolean");
    }

    public final TLObject E(int i) {
        bg2 bg2Var = this.d;
        int i2 = bg2Var.E0;
        if (i >= i2 && i < bg2Var.F0) {
            return (TLObject) bg2Var.F.get(i - i2);
        }
        int i3 = bg2Var.U0;
        if (i >= i3 && i < bg2Var.V0) {
            return (TLObject) bg2Var.H.get(i - i3);
        }
        int i4 = bg2Var.X0;
        if (i >= i4 && i < bg2Var.Y0) {
            return (TLObject) bg2Var.G.get(i - i4);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.d1;
    }

    @Override
    public final int d(int i) {
        bg2 bg2Var = this.d;
        if (i != bg2Var.z0 && i != bg2Var.A0 && i != bg2Var.v0 && i != bg2Var.t0) {
            if (i < bg2Var.E0 || i >= bg2Var.F0) {
                if (i < bg2Var.X0 || i >= bg2Var.Y0) {
                    if (i < bg2Var.U0 || i >= bg2Var.V0) {
                        if (i != bg2Var.C0 && i != bg2Var.G0 && i != bg2Var.H0) {
                            if (i != bg2Var.D0 && i != bg2Var.S && i != bg2Var.N0 && i != bg2Var.s0 && i != bg2Var.p0) {
                                if (i != bg2Var.b1 && i != bg2Var.P0 && i != bg2Var.R0 && i != bg2Var.u0 && i != bg2Var.y0 && i != bg2Var.K0 && i != bg2Var.M0 && i != bg2Var.j1 && i != bg2Var.o0 && i != bg2Var.r0) {
                                    if (i == bg2Var.c1) {
                                        return 4;
                                    }
                                    if (i == bg2Var.B0) {
                                        return 6;
                                    }
                                    if (i != bg2Var.g0 && i != bg2Var.h0 && i != bg2Var.m0 && i != bg2Var.i0 && i != bg2Var.j0 && i != bg2Var.T && i != bg2Var.e0 && i != bg2Var.f0 && i != bg2Var.l0 && i != bg2Var.Q0) {
                                        if (i != bg2Var.Z0 && i != bg2Var.T0 && i != bg2Var.W0 && i != bg2Var.g1) {
                                            if (i == bg2Var.O0) {
                                                return 9;
                                            }
                                            if (i == bg2Var.a1) {
                                                return 10;
                                            }
                                            if (i == bg2Var.f1) {
                                                return 11;
                                            }
                                            if (i != bg2Var.x0 && i != bg2Var.J0 && i != bg2Var.L0) {
                                                if (bg2Var.p0(i)) {
                                                    return 13;
                                                }
                                                if (i == bg2Var.U) {
                                                    return 14;
                                                }
                                                if (i == bg2Var.S0) {
                                                    return 15;
                                                }
                                                if (i != bg2Var.h1 && i != bg2Var.i1 && i != bg2Var.n0) {
                                                    if (i == bg2Var.q0) {
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
    public final void t(defpackage.f89 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf2.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        boolean z;
        vnb vnbVar;
        zma zmaVar;
        zma zmaVar2;
        int i3 = 2;
        int i4 = 0;
        Context context = this.c;
        bg2 bg2Var = this.d;
        switch (i) {
            case 0:
                int i5 = bg2Var.O;
                if (i5 != 0 && i5 != 3) {
                    i2 = 6;
                } else {
                    i2 = 7;
                }
                if (i5 == 0 || i5 == 3) {
                    i3 = 6;
                }
                if (bg2Var.e1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                lj6 lj6Var = new lj6(this.c, i2, i3, z, null);
                lj6Var.setDelegate(new wf2(this, (byte) 0));
                zmaVar2 = lj6Var;
                zmaVar = zmaVar2;
                break;
            case 1:
                zmaVar = new ilb(context);
                break;
            case 2:
                zmaVar = new ij6(context);
                break;
            case 3:
                zmaVar = new sca(context, (uh9) null);
                break;
            case 4:
                ilb ilbVar = new ilb(context);
                if (bg2Var.s) {
                    ilbVar.setText(ob6.M0(2131747969, null));
                    zmaVar = ilbVar;
                    break;
                } else if (bg2Var.w) {
                    ilbVar.setText(ob6.M0(2131747968, null));
                    zmaVar = ilbVar;
                    break;
                } else {
                    ilbVar.setText(ob6.M0(2131747967, null));
                    zmaVar = ilbVar;
                    break;
                }
            case 5:
                mf5 mf5Var = new mf5(this.c, aob.L6, 21, 11, false, null);
                mf5Var.setHeight(43);
                zmaVar2 = mf5Var;
                zmaVar = zmaVar2;
                break;
            case 6:
                zmaVar = new qmb(context);
                break;
            case 7:
            case 14:
                zmaVar = new vkb(context);
                break;
            case 8:
                vnbVar = ((e) bg2Var).resourceProvider;
                View p55Var = new p55(26, vnbVar, context);
                p55Var.setBackground(null);
                zmaVar = p55Var;
                break;
            case 9:
            default:
                zma zmaVar3 = new zma(context, null);
                zmaVar3.b(bg2Var.p1, null, ob6.M0(2131745033, "SlowmodeOff"), ob6.a0(null, null, 2131745032, 5), ob6.a0(null, null, 2131745032, 10), ob6.a0(null, null, 2131745032, 30), ob6.a0(null, null, 2131745034, 1), ob6.a0(null, null, 2131745034, 5), ob6.a0(null, null, 2131745034, 15), ob6.a0(null, null, 2131745037, 1));
                zmaVar3.setCallback(new wf2(this, (byte) 1));
                zmaVar = zmaVar3;
                break;
            case 10:
                zmaVar = new ua6(context, hl.L(40.0f), hl.L(120.0f));
                break;
            case 11:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(6);
                tk4Var.x = false;
                tk4Var.setUseHeaderOffset(false);
                tk4Var.setPaddingLeft(hl.L(5.0f));
                r79 r79Var = new r79(-1, -1);
                int L = hl.L(12.0f);
                ((ViewGroup.MarginLayoutParams) r79Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) r79Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(30.0f);
                tk4Var.setLayoutParams(r79Var);
                zmaVar = tk4Var;
                break;
            case 12:
                skb skbVar = new skb(23, bg2Var.getResourceProvider(), this.c, false, true);
                skbVar.w = (byte) 50;
                zmaVar = skbVar;
                break;
            case 13:
                sg2 sg2Var = new sg2(this.c, 4, 21, false, bg2Var.getResourceProvider());
                sg2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                sg2Var.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                sg2Var.setEnabled(true);
                zmaVar = sg2Var;
                break;
            case 15:
                zma zmaVar4 = new zma(context, null);
                Drawable[] drawableArr = {bg2Var.getParentActivity().getDrawable(2131231934), bg2Var.getParentActivity().getDrawable(2131231935), bg2Var.getParentActivity().getDrawable(2131231935), bg2Var.getParentActivity().getDrawable(2131231935), bg2Var.getParentActivity().getDrawable(2131231935)};
                int i6 = bg2Var.s1;
                if (i6 > 0) {
                    i4 = i6 - 1;
                }
                zmaVar4.b(i4, drawableArr, "1", "2", "3", "4", "5");
                zmaVar4.setCallback(new wf2(this, (byte) 2));
                zmaVar2 = zmaVar4;
                zmaVar = zmaVar2;
                break;
            case 16:
                zmaVar = new wkb(context, bg2Var.getResourceProvider());
                break;
            case 17:
                zmaVar = new bna(context, bg2Var.getResourceProvider());
                break;
        }
        return new f89(zmaVar);
    }
}
