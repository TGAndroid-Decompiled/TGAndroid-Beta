package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ep8 extends ro {
    public final byte b;
    public final ProfileActivity c;

    public ep8(ProfileActivity profileActivity, byte b) {
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
        sy4 sy4Var;
        int v0;
        int v02;
        a aVar;
        int v03;
        a aVar2;
        zja zjaVar;
        int v04;
        int i;
        float f2;
        int B1;
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                ProfileActivity profileActivity2 = (ProfileActivity) obj;
                profileActivity.b1 = f;
                return;
            default:
                a aVar3 = (a) obj;
                if (profileActivity.b6 > 0.0f) {
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
                profileActivity.b6 = f;
                sy4Var = ((d) profileActivity).glassEngine;
                sy4Var.g();
                if (z3) {
                    profileActivity.I1();
                }
                profileActivity.V3();
                profileActivity.W3();
                ap8 ap8Var = profileActivity.r;
                if (ap8Var != null && !profileActivity.q2) {
                    Object tag = ap8Var.getTag();
                    if (tag instanceof Integer) {
                        B1 = profileActivity.B1(cmb.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0]));
                    } else {
                        B1 = profileActivity.B1(cmb.v0(cmb.A8, profileActivity.A0), Boolean.TRUE);
                    }
                    ap8Var.setTextColor(on2.f(f, B1, cmb.v0(cmb.Fj, profileActivity.A0)));
                }
                profileActivity.Y3();
                bp8 bp8Var = profileActivity.v0;
                if (bp8Var != null) {
                    bp8Var.setActionBarActionMode(f);
                }
                xs8 xs8Var = profileActivity.w0;
                if (xs8Var != null) {
                    xs8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int i2 = -1;
                if (profileActivity.s6 != null) {
                    v0 = -1;
                } else {
                    v0 = cmb.v0(cmb.li, profileActivity.A0);
                }
                int i3 = cmb.Ej;
                int v05 = cmb.v0(i3, profileActivity.A0);
                int R0 = gm.R0(f, 1.0f, v0, v05);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.s6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(gm.R0(f, 1.0f, cmb.v0(cmb.g8, profileActivity.A0), v05));
                }
                if (profileActivity.s6 != null) {
                    v02 = -1;
                } else {
                    v02 = cmb.v0(cmb.u8, profileActivity.A0);
                }
                int v06 = cmb.v0(cmb.x8, profileActivity.A0);
                aVar = ((d) profileActivity).actionBar;
                aVar.H(gm.R0(f, 1.0f, v02, v06), false);
                ec7 ec7Var = profileActivity.s6;
                if (ec7Var != null) {
                    v03 = 1090519039;
                } else if (ec7Var != null) {
                    v03 = 553648127;
                } else {
                    v03 = cmb.v0(cmb.e8, profileActivity.A0);
                }
                int v07 = cmb.v0(cmb.y8, profileActivity.A0);
                aVar2 = ((d) profileActivity).actionBar;
                aVar2.G(gm.R0(f, 1.0f, v03, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    ec7 ec7Var2 = profileActivity.s6;
                    if (ec7Var2 != null) {
                        int g = ec7Var2.g();
                        boolean o = profileActivity.s6.o(cmb.I.o());
                        ec7 ec7Var3 = profileActivity.s6;
                        if (o) {
                            i = ec7Var3.k();
                        } else {
                            i = ec7Var3.i();
                        }
                        int f3 = on2.f(0.4f, g, i);
                        if (cmb.I.o()) {
                            f2 = -0.1f;
                        } else {
                            f2 = -0.08f;
                        }
                        v04 = cmb.a(0.1f, f2, f3);
                    } else {
                        v04 = cmb.v0(cmb.pi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(gm.R0(f, 1.0f, v04, cmb.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    if (profileActivity.s6 == null) {
                        i2 = cmb.v0(cmb.qi, profileActivity.A0);
                    }
                    profileActivity.I.setColorFilter(gm.R0(f, 1.0f, i2, cmb.v0(cmb.c6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(gm.R0(f, 1.0f, cmb.v0(cmb.pi, profileActivity.A0), cmb.v0(i3, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.P3();
                nq8 nq8Var = profileActivity.p0;
                int i4 = nq8.r;
                ProfileActivity profileActivity3 = nq8Var.n;
                if (profileActivity3.M0) {
                    zjaVar = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    zjaVar = profileActivity3.S0;
                } else {
                    zjaVar = profileActivity3.U0;
                    if (zjaVar == null) {
                        zjaVar = null;
                    }
                }
                if (zjaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.R2(0, profileActivity.E1(), true);
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
                return Float.valueOf(profileActivity.b6);
        }
    }
}
