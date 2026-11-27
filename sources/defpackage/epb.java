package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class epb implements Runnable {
    public final byte a;
    public final pqb b;

    public epb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        float f = 0.0f;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.b0 = false;
                int i2 = pqbVar.Y;
                int i3 = pqbVar.Z;
                ynb ynbVar = pqbVar.w;
                int i4 = pqbVar.n;
                if (i4 == 1) {
                    if (i3 == 0) {
                        ynbVar.c = i2;
                        aob.r1(false, false);
                    } else if (i3 == 1) {
                        ynbVar.d = i2;
                        aob.r1(true, true);
                        pqbVar.w0.i1();
                        pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                        pqbVar.r1(true);
                    }
                } else if (i4 == 2) {
                    if (i3 == 0) {
                        ynbVar.j = i2;
                    } else if (i3 == 1) {
                        int C0 = aob.C0(aob.Fe);
                        if (i2 == 0 && C0 != 0) {
                            ynbVar.k = 4294967296L;
                        } else {
                            ynbVar.k = i2;
                        }
                    } else if (i3 == 2) {
                        int C02 = aob.C0(aob.Ge);
                        if (i2 == 0 && C02 != 0) {
                            ynbVar.l = 4294967296L;
                        } else {
                            ynbVar.l = i2;
                        }
                    } else if (i3 == 3) {
                        int C03 = aob.C0(aob.He);
                        if (i2 == 0 && C03 != 0) {
                            ynbVar.m = 4294967296L;
                        } else {
                            ynbVar.m = i2;
                        }
                    }
                    aob.r1(true, false);
                    pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                    pqbVar.r1(true);
                } else if (i4 == 3) {
                    if (i3 == 0) {
                        ynbVar.e = i2;
                    } else if (i3 == 1) {
                        ynbVar.f = i2;
                    } else if (i3 == 2) {
                        int i5 = ynbVar.g;
                        ynbVar.g = i2;
                        if (i5 != 0) {
                            if (i2 == 0) {
                                pqbVar.x0.s(0);
                            }
                        } else if (i2 != 0) {
                            pqbVar.x0.i(0);
                            pqbVar.j1();
                        }
                    } else {
                        ynbVar.h = i2;
                    }
                    int i6 = pqbVar.Z;
                    if (i6 >= 0) {
                        pqbVar.M0[1].b(i6, i2);
                    }
                    aob.r1(true, true);
                    pqbVar.w0.i1();
                    pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                    pqbVar.r1(true);
                }
                int size = pqbVar.k0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    apb apbVar = (apb) pqbVar.k0.get(i7);
                    apbVar.e(pqbVar.getThemedColor(apbVar.e), false, false);
                }
                pqbVar.p0.i1();
                pqbVar.w0.i1();
                a81 a81Var = pqbVar.c0;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                pqbVar.Z = -1;
                return;
            case 1:
                pqbVar.presentFragment(w1b.d0(pqbVar.getMessagesController().M0(Long.valueOf(-pqbVar.L1)), true));
                return;
            case 2:
                pqbVar.r1.w(false);
                boolean a = pqbVar.a.a();
                b29 b29Var = pqbVar.P1;
                if (a) {
                    i = b29Var.e[0];
                } else {
                    i = 0;
                }
                b29Var.K(i);
                b29 b29Var2 = pqbVar.P1;
                if (b29Var2 != null) {
                    b29Var2.start();
                }
                pqbVar.g1(false);
                pqbVar.X0();
                pqbVar.n1();
                if (pqbVar.k0 != null) {
                    for (int i8 = 0; i8 < pqbVar.k0.size(); i8++) {
                        ((apb) pqbVar.k0.get(i8)).e(pqbVar.getThemedColor(((apb) pqbVar.k0.get(i8)).e), false, false);
                    }
                }
                if (pqbVar.O1) {
                    hqb hqbVar = pqbVar.r1;
                    if (hqbVar != null && hqbVar.a()) {
                        pqbVar.T1.setVisibility(0);
                        pqbVar.T1.a(pqbVar.p1);
                    } else {
                        pqbVar.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = pqbVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pqbVar.R1.cancel();
                    }
                    float f2 = pqbVar.q1;
                    if (pqbVar.r1.a()) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    pqbVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new ija(pqbVar, (byte) 23));
                    pqbVar.R1.addListener(new upb(pqbVar, (byte) 5));
                    pqbVar.R1.setDuration(250L);
                    pqbVar.R1.setInterpolator(k43.f);
                    pqbVar.R1.start();
                    return;
                }
                return;
            default:
                if (pqbVar.getParentActivity() != null && pqbVar.getParentActivity() != null) {
                    boolean z = xea.a;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    int i9 = xea.R + 1;
                    xea.R = i9;
                    edit.putInt("dayNightWallpaperSwitchHint", i9);
                    edit.apply();
                    lg5 lg5Var = new lg5(7, null, pqbVar.getParentActivity(), true);
                    lg5Var.setAlpha(0.0f);
                    lg5Var.setVisibility(4);
                    lg5Var.setShowingDuration(4000L);
                    pqbVar.m0.addView(lg5Var, tre.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pqbVar.r1.a()) {
                        lg5Var.setText(ob6.M0(2131746607, null));
                    } else {
                        lg5Var.setText(ob6.M0(2131746606, null));
                    }
                    lg5Var.b();
                    lg5Var.c(pqbVar.Q1);
                    lg5Var.setExtraTranslationY(-hl.L(14.0f));
                    return;
                }
                return;
        }
    }
}
