package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
public final class gf2 extends n39 {
    public final Context c;
    public final kf2 d;

    public gf2(kf2 kf2Var, Context context) {
        this.d = kf2Var;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(defpackage.s49 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.D(s49):boolean");
    }

    public final TLObject E(int i) {
        kf2 kf2Var = this.d;
        int i2 = kf2Var.E0;
        if (i >= i2 && i < kf2Var.F0) {
            return (TLObject) kf2Var.F.get(i - i2);
        }
        int i3 = kf2Var.U0;
        if (i >= i3 && i < kf2Var.V0) {
            return (TLObject) kf2Var.H.get(i - i3);
        }
        int i4 = kf2Var.X0;
        if (i >= i4 && i < kf2Var.Y0) {
            return (TLObject) kf2Var.G.get(i - i4);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.d1;
    }

    @Override
    public final int d(int i) {
        kf2 kf2Var = this.d;
        if (i != kf2Var.z0 && i != kf2Var.A0 && i != kf2Var.v0 && i != kf2Var.t0) {
            if (i < kf2Var.E0 || i >= kf2Var.F0) {
                if (i < kf2Var.X0 || i >= kf2Var.Y0) {
                    if (i < kf2Var.U0 || i >= kf2Var.V0) {
                        if (i != kf2Var.C0 && i != kf2Var.G0 && i != kf2Var.H0) {
                            if (i != kf2Var.D0 && i != kf2Var.S && i != kf2Var.N0 && i != kf2Var.s0 && i != kf2Var.p0) {
                                if (i != kf2Var.b1 && i != kf2Var.P0 && i != kf2Var.R0 && i != kf2Var.u0 && i != kf2Var.y0 && i != kf2Var.K0 && i != kf2Var.M0 && i != kf2Var.j1 && i != kf2Var.o0 && i != kf2Var.r0) {
                                    if (i == kf2Var.c1) {
                                        return 4;
                                    }
                                    if (i == kf2Var.B0) {
                                        return 6;
                                    }
                                    if (i != kf2Var.g0 && i != kf2Var.h0 && i != kf2Var.m0 && i != kf2Var.i0 && i != kf2Var.j0 && i != kf2Var.T && i != kf2Var.e0 && i != kf2Var.f0 && i != kf2Var.l0 && i != kf2Var.Q0) {
                                        if (i != kf2Var.Z0 && i != kf2Var.T0 && i != kf2Var.W0 && i != kf2Var.g1) {
                                            if (i == kf2Var.O0) {
                                                return 9;
                                            }
                                            if (i == kf2Var.a1) {
                                                return 10;
                                            }
                                            if (i == kf2Var.f1) {
                                                return 11;
                                            }
                                            if (i != kf2Var.x0 && i != kf2Var.J0 && i != kf2Var.L0) {
                                                if (kf2Var.p0(i)) {
                                                    return 13;
                                                }
                                                if (i == kf2Var.U) {
                                                    return 14;
                                                }
                                                if (i == kf2Var.S0) {
                                                    return 15;
                                                }
                                                if (i != kf2Var.h1 && i != kf2Var.i1 && i != kf2Var.n0) {
                                                    if (i == kf2Var.q0) {
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
    public final void t(defpackage.s49 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        boolean z;
        wjb wjbVar;
        fja fjaVar;
        fja fjaVar2;
        int i3 = 2;
        int i4 = 0;
        Context context = this.c;
        kf2 kf2Var = this.d;
        switch (i) {
            case 0:
                int i5 = kf2Var.O;
                if (i5 != 0 && i5 != 3) {
                    i2 = 6;
                } else {
                    i2 = 7;
                }
                if (i5 == 0 || i5 == 3) {
                    i3 = 6;
                }
                if (kf2Var.e1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                gh6 gh6Var = new gh6(this.c, i2, i3, z, null);
                gh6Var.setDelegate(new ff2(this, (byte) 0));
                fjaVar2 = gh6Var;
                fjaVar = fjaVar2;
                break;
            case 1:
                fjaVar = new mhb(context);
                break;
            case 2:
                fjaVar = new dh6(context);
                break;
            case 3:
                fjaVar = new b9a(context, (de9) null);
                break;
            case 4:
                mhb mhbVar = new mhb(context);
                if (kf2Var.s) {
                    mhbVar.setText(k96.M0(2131748046, null));
                    fjaVar = mhbVar;
                    break;
                } else if (kf2Var.w) {
                    mhbVar.setText(k96.M0(2131748045, null));
                    fjaVar = mhbVar;
                    break;
                } else {
                    mhbVar.setText(k96.M0(2131748044, null));
                    fjaVar = mhbVar;
                    break;
                }
            case 5:
                ld5 ld5Var = new ld5(this.c, bkb.K6, 21, 11, false, null);
                ld5Var.setHeight(43);
                fjaVar2 = ld5Var;
                fjaVar = fjaVar2;
                break;
            case 6:
                fjaVar = new uib(context);
                break;
            case 7:
            case 14:
                fjaVar = new zgb(context);
                break;
            case 8:
                wjbVar = ((d) kf2Var).resourceProvider;
                View l35Var = new l35(26, wjbVar, context);
                l35Var.setBackground(null);
                fjaVar = l35Var;
                break;
            case 9:
            default:
                fja fjaVar3 = new fja(context, null);
                fjaVar3.b(kf2Var.p1, null, k96.M0(2131745113, "SlowmodeOff"), k96.a0(null, null, 2131745112, 5), k96.a0(null, null, 2131745112, 10), k96.a0(null, null, 2131745112, 30), k96.a0(null, null, 2131745114, 1), k96.a0(null, null, 2131745114, 5), k96.a0(null, null, 2131745114, 15), k96.a0(null, null, 2131745117, 1));
                fjaVar3.setCallback(new ff2(this, (byte) 1));
                fjaVar = fjaVar3;
                break;
            case 10:
                fjaVar = new q86(context, gl.L(40.0f), gl.L(120.0f));
                break;
            case 11:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(6);
                pi4Var.x = false;
                pi4Var.setUseHeaderOffset(false);
                pi4Var.setPaddingLeft(gl.L(5.0f));
                e49 e49Var = new e49(-1, -1);
                int L = gl.L(12.0f);
                ((ViewGroup.MarginLayoutParams) e49Var).rightMargin = L;
                ((ViewGroup.MarginLayoutParams) e49Var).leftMargin = L;
                ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(30.0f);
                pi4Var.setLayoutParams(e49Var);
                fjaVar = pi4Var;
                break;
            case 12:
                wgb wgbVar = new wgb(23, kf2Var.getResourceProvider(), this.c, false, true);
                wgbVar.w = (byte) 50;
                fjaVar = wgbVar;
                break;
            case 13:
                ag2 ag2Var = new ag2(this.c, 4, 21, false, kf2Var.getResourceProvider());
                ag2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                ag2Var.setEnabled(true);
                fjaVar = ag2Var;
                break;
            case 15:
                fja fjaVar4 = new fja(context, null);
                Drawable[] drawableArr = {kf2Var.getParentActivity().getDrawable(2131231934), kf2Var.getParentActivity().getDrawable(2131231935), kf2Var.getParentActivity().getDrawable(2131231935), kf2Var.getParentActivity().getDrawable(2131231935), kf2Var.getParentActivity().getDrawable(2131231935)};
                int i6 = kf2Var.s1;
                if (i6 > 0) {
                    i4 = i6 - 1;
                }
                fjaVar4.b(i4, drawableArr, "1", "2", "3", "4", "5");
                fjaVar4.setCallback(new ff2(this, (byte) 2));
                fjaVar2 = fjaVar4;
                fjaVar = fjaVar2;
                break;
            case 16:
                fjaVar = new ahb(context, kf2Var.getResourceProvider());
                break;
            case 17:
                fjaVar = new ija(context, kf2Var.getResourceProvider());
                break;
        }
        return new s49(fjaVar);
    }
}
