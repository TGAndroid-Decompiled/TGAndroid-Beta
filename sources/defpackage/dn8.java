package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class dn8 extends qn {
    public final byte b;
    public final ProfileActivity c;

    public dn8(ProfileActivity profileActivity, byte b) {
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
        qw4 qw4Var;
        int v0;
        int v02;
        a aVar;
        int v03;
        a aVar2;
        xha xhaVar;
        int v04;
        int i;
        float f2;
        int z1;
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
                qw4Var = ((d) profileActivity).glassEngine;
                qw4Var.g();
                if (z3) {
                    profileActivity.G1();
                }
                profileActivity.R3();
                profileActivity.S3();
                zm8 zm8Var = profileActivity.r;
                if (zm8Var != null && !profileActivity.q2) {
                    Object tag = zm8Var.getTag();
                    if (tag instanceof Integer) {
                        z1 = profileActivity.z1(bkb.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0]));
                    } else {
                        z1 = profileActivity.z1(bkb.v0(bkb.A8, profileActivity.A0), Boolean.TRUE);
                    }
                    zm8Var.setTextColor(bm2.f(f, z1, bkb.v0(bkb.Fj, profileActivity.A0)));
                }
                profileActivity.U3();
                an8 an8Var = profileActivity.v0;
                if (an8Var != null) {
                    an8Var.setActionBarActionMode(f);
                }
                vq8 vq8Var = profileActivity.w0;
                if (vq8Var != null) {
                    vq8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int i2 = -1;
                if (profileActivity.n6 != null) {
                    v0 = -1;
                } else {
                    v0 = bkb.v0(bkb.li, profileActivity.A0);
                }
                int i3 = bkb.Ej;
                int v05 = bkb.v0(i3, profileActivity.A0);
                int R0 = gl.R0(f, 1.0f, v0, v05);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.n6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(gl.R0(f, 1.0f, bkb.v0(bkb.g8, profileActivity.A0), v05));
                }
                if (profileActivity.n6 != null) {
                    v02 = -1;
                } else {
                    v02 = bkb.v0(bkb.u8, profileActivity.A0);
                }
                int v06 = bkb.v0(bkb.x8, profileActivity.A0);
                aVar = ((d) profileActivity).actionBar;
                aVar.H(gl.R0(f, 1.0f, v02, v06), false);
                da7 da7Var = profileActivity.n6;
                if (da7Var != null) {
                    v03 = 1090519039;
                } else if (da7Var != null) {
                    v03 = 553648127;
                } else {
                    v03 = bkb.v0(bkb.e8, profileActivity.A0);
                }
                int v07 = bkb.v0(bkb.y8, profileActivity.A0);
                aVar2 = ((d) profileActivity).actionBar;
                aVar2.G(gl.R0(f, 1.0f, v03, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    da7 da7Var2 = profileActivity.n6;
                    if (da7Var2 != null) {
                        int g = da7Var2.g();
                        boolean o = profileActivity.n6.o(bkb.I.o());
                        da7 da7Var3 = profileActivity.n6;
                        if (o) {
                            i = da7Var3.k();
                        } else {
                            i = da7Var3.i();
                        }
                        int f3 = bm2.f(0.4f, g, i);
                        if (bkb.I.o()) {
                            f2 = -0.1f;
                        } else {
                            f2 = -0.08f;
                        }
                        v04 = bkb.a(0.1f, f2, f3);
                    } else {
                        v04 = bkb.v0(bkb.pi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(gl.R0(f, 1.0f, v04, bkb.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    if (profileActivity.n6 == null) {
                        i2 = bkb.v0(bkb.qi, profileActivity.A0);
                    }
                    profileActivity.I.setColorFilter(gl.R0(f, 1.0f, i2, bkb.v0(bkb.c6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(gl.R0(f, 1.0f, bkb.v0(bkb.pi, profileActivity.A0), bkb.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.L3();
                mo8 mo8Var = profileActivity.p0;
                int i4 = mo8.r;
                ProfileActivity profileActivity3 = mo8Var.n;
                if (profileActivity3.M0) {
                    xhaVar = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    xhaVar = profileActivity3.S0;
                } else {
                    xhaVar = profileActivity3.U0;
                    if (xhaVar == null) {
                        xhaVar = null;
                    }
                }
                if (xhaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.O2(0, profileActivity.C1(), true);
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
