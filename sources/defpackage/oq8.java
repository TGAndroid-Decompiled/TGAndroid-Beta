package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class oq8 extends rn {
    public final byte b;
    public final ProfileActivity c;

    public oq8(ProfileActivity profileActivity, byte b) {
        super("headerShadow", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = profileActivity;
                super("avatarAnimationProgress", (byte) 0);
                return;
            default:
                this.c = profileActivity;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        vy4 vy4Var;
        int v0;
        int v02;
        a aVar;
        int v03;
        a aVar2;
        sla slaVar;
        int v04;
        int i;
        float f2;
        int A1;
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                ProfileActivity profileActivity2 = (ProfileActivity) obj;
                profileActivity.b1 = f;
                return;
            default:
                a aVar3 = (a) obj;
                if (profileActivity.W5 > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (f > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                profileActivity.W5 = f;
                vy4Var = ((e) profileActivity).glassEngine;
                vy4Var.g();
                if (z3) {
                    profileActivity.H1();
                }
                profileActivity.S3();
                profileActivity.T3();
                kq8 kq8Var = profileActivity.r;
                if (kq8Var != null && !profileActivity.q2) {
                    Object tag = kq8Var.getTag();
                    if (tag instanceof Integer) {
                        A1 = profileActivity.A1(aob.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0]));
                    } else {
                        A1 = profileActivity.A1(aob.v0(aob.B8, profileActivity.A0), Boolean.TRUE);
                    }
                    kq8Var.setTextColor(vm2.f(f, A1, aob.v0(aob.Gj, profileActivity.A0)));
                }
                profileActivity.V3();
                lq8 lq8Var = profileActivity.v0;
                if (lq8Var != null) {
                    lq8Var.setActionBarActionMode(f);
                }
                gu8 gu8Var = profileActivity.w0;
                if (gu8Var != null) {
                    gu8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int i2 = -1;
                if (profileActivity.n6 != null) {
                    v0 = -1;
                } else {
                    v0 = aob.v0(aob.mi, profileActivity.A0);
                }
                int i3 = aob.Fj;
                int v05 = aob.v0(i3, profileActivity.A0);
                int R0 = hl.R0(f, 1.0f, v0, v05);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.n6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(hl.R0(f, 1.0f, aob.v0(aob.h8, profileActivity.A0), v05));
                }
                if (profileActivity.n6 != null) {
                    v02 = -1;
                } else {
                    v02 = aob.v0(aob.v8, profileActivity.A0);
                }
                int v06 = aob.v0(aob.y8, profileActivity.A0);
                aVar = ((e) profileActivity).actionBar;
                aVar.H(hl.R0(f, 1.0f, v02, v06), false);
                kc7 kc7Var = profileActivity.n6;
                if (kc7Var != null) {
                    v03 = 1090519039;
                } else if (kc7Var != null) {
                    v03 = 553648127;
                } else {
                    v03 = aob.v0(aob.f8, profileActivity.A0);
                }
                int v07 = aob.v0(aob.z8, profileActivity.A0);
                aVar2 = ((e) profileActivity).actionBar;
                aVar2.G(hl.R0(f, 1.0f, v03, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    kc7 kc7Var2 = profileActivity.n6;
                    if (kc7Var2 != null) {
                        int g = kc7Var2.g();
                        boolean o = profileActivity.n6.o(aob.I.o());
                        kc7 kc7Var3 = profileActivity.n6;
                        if (o) {
                            i = kc7Var3.k();
                        } else {
                            i = kc7Var3.i();
                        }
                        int f3 = vm2.f(0.4f, g, i);
                        if (aob.I.o()) {
                            f2 = -0.1f;
                        } else {
                            f2 = -0.08f;
                        }
                        v04 = aob.a(0.1f, f2, f3);
                    } else {
                        v04 = aob.v0(aob.qi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(hl.R0(f, 1.0f, v04, aob.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    if (profileActivity.n6 == null) {
                        i2 = aob.v0(aob.ri, profileActivity.A0);
                    }
                    profileActivity.I.setColorFilter(hl.R0(f, 1.0f, i2, aob.v0(aob.d6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(hl.R0(f, 1.0f, aob.v0(aob.qi, profileActivity.A0), aob.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.M3();
                yr8 yr8Var = profileActivity.p0;
                int i4 = yr8.r;
                ProfileActivity profileActivity3 = yr8Var.n;
                if (profileActivity3.M0) {
                    slaVar = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    slaVar = profileActivity3.S0;
                } else {
                    slaVar = profileActivity3.U0;
                    if (slaVar == null) {
                        slaVar = null;
                    }
                }
                if (slaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.P2(0, profileActivity.D1(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                ProfileActivity profileActivity2 = (ProfileActivity) obj;
                return Float.valueOf(profileActivity.b1);
            default:
                a aVar = (a) obj;
                return Float.valueOf(profileActivity.W5);
        }
    }
}
