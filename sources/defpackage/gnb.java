package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
public final class gnb implements Runnable {
    public final byte a;
    public final rob b;

    public gnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        float f = 0.0f;
        rob robVar = this.b;
        switch (b) {
            case 0:
                robVar.b0 = false;
                int i2 = robVar.Y;
                int i3 = robVar.Z;
                amb ambVar = robVar.w;
                int i4 = robVar.n;
                if (i4 == 1) {
                    if (i3 == 0) {
                        ambVar.c = i2;
                        cmb.r1(false, false);
                    } else if (i3 == 1) {
                        ambVar.d = i2;
                        cmb.r1(true, true);
                        robVar.w0.h1();
                        robVar.X.setHasChanges(robVar.V0(robVar.n));
                        robVar.r1(true);
                    }
                } else if (i4 == 2) {
                    if (i3 == 0) {
                        ambVar.j = i2;
                    } else if (i3 == 1) {
                        int C0 = cmb.C0(cmb.Ee);
                        if (i2 == 0 && C0 != 0) {
                            ambVar.k = 4294967296L;
                        } else {
                            ambVar.k = i2;
                        }
                    } else if (i3 == 2) {
                        int C02 = cmb.C0(cmb.Fe);
                        if (i2 == 0 && C02 != 0) {
                            ambVar.l = 4294967296L;
                        } else {
                            ambVar.l = i2;
                        }
                    } else if (i3 == 3) {
                        int C03 = cmb.C0(cmb.Ge);
                        if (i2 == 0 && C03 != 0) {
                            ambVar.m = 4294967296L;
                        } else {
                            ambVar.m = i2;
                        }
                    }
                    cmb.r1(true, false);
                    robVar.X.setHasChanges(robVar.V0(robVar.n));
                    robVar.r1(true);
                } else if (i4 == 3) {
                    if (i3 == 0) {
                        ambVar.e = i2;
                    } else if (i3 == 1) {
                        ambVar.f = i2;
                    } else if (i3 == 2) {
                        int i5 = ambVar.g;
                        ambVar.g = i2;
                        if (i5 != 0) {
                            if (i2 == 0) {
                                robVar.x0.s(0);
                            }
                        } else if (i2 != 0) {
                            robVar.x0.i(0);
                            robVar.j1();
                        }
                    } else {
                        ambVar.h = i2;
                    }
                    int i6 = robVar.Z;
                    if (i6 >= 0) {
                        robVar.M0[1].b(i6, i2);
                    }
                    cmb.r1(true, true);
                    robVar.w0.h1();
                    robVar.X.setHasChanges(robVar.V0(robVar.n));
                    robVar.r1(true);
                }
                int size = robVar.k0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    cnb cnbVar = (cnb) robVar.k0.get(i7);
                    cnbVar.e(robVar.getThemedColor(cnbVar.e), false, false);
                }
                robVar.p0.h1();
                robVar.w0.h1();
                a91 a91Var = robVar.c0;
                if (a91Var != null) {
                    a91Var.invalidate();
                }
                robVar.Z = -1;
                return;
            case 1:
                robVar.presentFragment(xza.e0(robVar.getMessagesController().L0(Long.valueOf(-robVar.L1)), true));
                return;
            case 2:
                robVar.r1.w(false);
                boolean a = robVar.a.a();
                p09 p09Var = robVar.P1;
                if (a) {
                    i = p09Var.e[0];
                } else {
                    i = 0;
                }
                p09Var.K(i);
                p09 p09Var2 = robVar.P1;
                if (p09Var2 != null) {
                    p09Var2.start();
                }
                robVar.g1(false);
                robVar.X0();
                robVar.n1();
                if (robVar.k0 != null) {
                    for (int i8 = 0; i8 < robVar.k0.size(); i8++) {
                        ((cnb) robVar.k0.get(i8)).e(robVar.getThemedColor(((cnb) robVar.k0.get(i8)).e), false, false);
                    }
                }
                if (robVar.O1) {
                    job jobVar = robVar.r1;
                    if (jobVar != null && jobVar.a()) {
                        robVar.T1.setVisibility(0);
                        robVar.T1.a(robVar.p1);
                    } else {
                        robVar.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = robVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        robVar.R1.cancel();
                    }
                    float f2 = robVar.q1;
                    if (robVar.r1.a()) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    robVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new rha(robVar, (byte) 23));
                    robVar.R1.addListener(new wnb(robVar, (byte) 5));
                    robVar.R1.setDuration(250L);
                    robVar.R1.setInterpolator(d53.f);
                    robVar.R1.start();
                    return;
                }
                return;
            default:
                if (robVar.getParentActivity() != null && robVar.getParentActivity() != null) {
                    boolean z = gda.a;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    int i9 = gda.R + 1;
                    gda.R = i9;
                    edit.putInt("dayNightWallpaperSwitchHint", i9);
                    edit.apply();
                    ig5 ig5Var = new ig5(7, null, robVar.getParentActivity(), true);
                    ig5Var.setAlpha(0.0f);
                    ig5Var.setVisibility(4);
                    ig5Var.setShowingDuration(4000L);
                    robVar.m0.addView(ig5Var, qoe.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (robVar.r1.a()) {
                        ig5Var.setText(jb6.M0(2131746613, null));
                    } else {
                        ig5Var.setText(jb6.M0(2131746612, null));
                    }
                    ig5Var.b();
                    ig5Var.c(robVar.Q1);
                    ig5Var.setExtraTranslationY(-gm.L(14.0f));
                    return;
                }
                return;
        }
    }
}
