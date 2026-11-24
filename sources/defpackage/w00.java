package defpackage;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
public final class w00 implements x76, ee, xmb, ymb, mm0, hp7 {
    public final byte a;

    public w00(byte b) {
        this.a = b;
    }

    public static AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public final String c(int i) {
        switch (this.a) {
            case 28:
                return String.valueOf(i);
            default:
                return String.format("%02d", Integer.valueOf(i * 5));
        }
    }

    @Override
    public final void e(int i, View view) {
        ((a8) view).d(i, i);
    }

    @Override
    public final int g(View view) {
        a8 a8Var = (a8) view;
        if (a8Var.getTextView() != null) {
            return a8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        long j;
        u40 u40Var;
        switch (this.a) {
            case 2:
                ab3 ab3Var = (ab3) obj;
                cb3 cb3Var = ab3Var.a;
                if (ab3Var == cb3Var.j && cb3Var.n != null) {
                    ki2 ki2Var = cb3Var.p;
                    int i = ki2Var.b;
                    if (i != -1) {
                        long j2 = ((r10) ki2Var.e).f / i;
                        j50 j50Var = cb3Var.t;
                        j50Var.getClass();
                        j = hac.Z(j50Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    cb3Var.n.x0(hac.i0(j), ((r10) cb3Var.p.e).f, SystemClock.elapsedRealtime() - cb3Var.Z);
                    return;
                }
                return;
            case 3:
                u40 u40Var2 = ((ab3) obj).a.n;
                if (u40Var2 != null) {
                    u40Var2.u(new nf5((byte) 14));
                    return;
                }
                return;
            case 4:
                ab3 ab3Var2 = (ab3) obj;
                cb3 cb3Var2 = ab3Var2.a;
                if (ab3Var2 == cb3Var2.j && (u40Var = cb3Var2.n) != null && cb3Var2.R) {
                    u40Var.s0();
                    return;
                }
                return;
            case 5:
                ab3 ab3Var3 = (ab3) obj;
                cb3 cb3Var3 = ab3Var3.a;
                if (ab3Var3 == cb3Var3.j && cb3Var3.P) {
                    cb3Var3.Q = true;
                    return;
                }
                return;
            default:
                u40 u40Var3 = ((za3) obj).a.n;
                if (u40Var3 != null) {
                    u40Var3.X();
                    return;
                }
                return;
        }
    }

    @Override
    public final int o(ylb ylbVar, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        switch (this.a) {
            case 10:
                if (e86.e(262144)) {
                    f = 0.82f;
                } else {
                    f = 0.76f;
                }
                int v0 = cmb.v0(cmb.c6, ylbVar);
                if (z) {
                    return cmb.p1(0.9f, -15658735);
                }
                return qqd.m(f, v0, -14145496);
            case 11:
                if (e86.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return cmb.p1(f2, cmb.v0(cmb.c6, ylbVar));
            case 12:
                if (!e86.e(256)) {
                    return cmb.w0(null, cmb.F8, false);
                }
                int w0 = cmb.w0(null, cmb.F8, false);
                if (z) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.825f;
                }
                return cmb.p1(f3, w0);
            case 13:
                if (e86.e(262144)) {
                    f4 = 0.85f;
                } else {
                    f4 = 0.76f;
                }
                return qqd.m(f4, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Pl, ylbVar));
            case 14:
                if (e86.e(262144)) {
                    f5 = 0.85f;
                } else {
                    f5 = 0.76f;
                }
                return qqd.m(f5, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Ie, ylbVar));
            case 15:
                if (e86.e(262144)) {
                    f6 = 0.85f;
                } else {
                    f6 = 0.8f;
                }
                return qqd.m(f6, cmb.v0(cmb.Z6, ylbVar), cmb.v0(cmb.c6, ylbVar));
            case 16:
                return 855638016;
            case 17:
                return 1073741824;
            case 18:
                int v02 = cmb.v0(cmb.g5, ylbVar);
                if (z) {
                    f7 = 0.82f;
                } else {
                    f7 = 0.78f;
                }
                return cmb.p1(f7, v02);
            case 19:
                return cmb.p1(0.075f, -16777216);
            case 20:
                if (e86.e(262144)) {
                    f8 = 0.85f;
                } else {
                    f8 = 0.76f;
                }
                return cmb.p1(f8, cmb.v0(cmb.vj, ylbVar));
            case 21:
                return cmb.p1(0.88f, cmb.v0(cmb.c6, ylbVar));
            case 22:
                int v03 = cmb.v0(cmb.F8, ylbVar);
                if (z) {
                    f9 = 0.85f;
                } else {
                    f9 = 0.825f;
                }
                return cmb.p1(f9, v03);
            case 23:
                if (e86.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return qqd.m(f10, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Ol, ylbVar));
            case 24:
                if (e86.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return cmb.p1(f11, cmb.v0(cmb.c6, ylbVar));
            case 25:
                return cmb.p1(0.78f, cmb.v0(cmb.g5, ylbVar));
            case 26:
                return cmb.p1(0.7f, cmb.v0(cmb.c6, ylbVar));
            default:
                e86.e(262144);
                return 0;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }
}
