package defpackage;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
public final class wz implements x56, ed, wkb, xkb, ml0, dn7 {
    public final byte a;

    public wz(byte b) {
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
    public final void d(int i, View view) {
        ((a8) view).d(i, i);
    }

    @Override
    public final int e(View view) {
        a8 a8Var = (a8) view;
        if (a8Var.getTextView() != null) {
            return a8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        long j;
        u30 u30Var;
        switch (this.a) {
            case 2:
                o93 o93Var = (o93) obj;
                q93 q93Var = o93Var.a;
                if (o93Var == q93Var.j && q93Var.n != null) {
                    wg2 wg2Var = q93Var.p;
                    int i = wg2Var.b;
                    if (i != -1) {
                        long j2 = ((r00) wg2Var.e).f / i;
                        j40 j40Var = q93Var.t;
                        j40Var.getClass();
                        j = g8c.Z(j40Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    q93Var.n.A2(g8c.i0(j), ((r00) q93Var.p.e).f, SystemClock.elapsedRealtime() - q93Var.Z);
                    return;
                }
                return;
            case 3:
                u30 u30Var2 = ((o93) obj).a.n;
                if (u30Var2 != null) {
                    u30Var2.A(new pd5((byte) 14));
                    return;
                }
                return;
            case 4:
                o93 o93Var2 = (o93) obj;
                q93 q93Var2 = o93Var2.a;
                if (o93Var2 == q93Var2.j && (u30Var = q93Var2.n) != null && q93Var2.R) {
                    u30Var.p2();
                    return;
                }
                return;
            case 5:
                o93 o93Var3 = (o93) obj;
                q93 q93Var3 = o93Var3.a;
                if (o93Var3 == q93Var3.j && q93Var3.P) {
                    q93Var3.Q = true;
                    return;
                }
                return;
            default:
                u30 u30Var3 = ((n93) obj).a.n;
                if (u30Var3 != null) {
                    u30Var3.f1();
                    return;
                }
                return;
        }
    }

    @Override
    public final int k(wjb wjbVar, boolean z) {
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
                if (e66.e(262144)) {
                    f = 0.82f;
                } else {
                    f = 0.76f;
                }
                int v0 = bkb.v0(bkb.c6, wjbVar);
                if (z) {
                    return bkb.p1(0.9f, -15658735);
                }
                return nod.m(f, v0, -14145496);
            case 11:
                if (e66.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return bkb.p1(f2, bkb.v0(bkb.c6, wjbVar));
            case 12:
                if (!e66.e(256)) {
                    return bkb.w0(null, bkb.F8, false);
                }
                int w0 = bkb.w0(null, bkb.F8, false);
                if (z) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.825f;
                }
                return bkb.p1(f3, w0);
            case 13:
                if (e66.e(262144)) {
                    f4 = 0.85f;
                } else {
                    f4 = 0.76f;
                }
                return nod.m(f4, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Pl, wjbVar));
            case 14:
                if (e66.e(262144)) {
                    f5 = 0.85f;
                } else {
                    f5 = 0.76f;
                }
                return nod.m(f5, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Ie, wjbVar));
            case 15:
                if (e66.e(262144)) {
                    f6 = 0.85f;
                } else {
                    f6 = 0.8f;
                }
                return nod.m(f6, bkb.v0(bkb.Z6, wjbVar), bkb.v0(bkb.c6, wjbVar));
            case 16:
                return 855638016;
            case 17:
                return 1073741824;
            case 18:
                int v02 = bkb.v0(bkb.g5, wjbVar);
                if (z) {
                    f7 = 0.82f;
                } else {
                    f7 = 0.78f;
                }
                return bkb.p1(f7, v02);
            case 19:
                return bkb.p1(0.075f, -16777216);
            case 20:
                if (e66.e(262144)) {
                    f8 = 0.85f;
                } else {
                    f8 = 0.76f;
                }
                return bkb.p1(f8, bkb.v0(bkb.vj, wjbVar));
            case 21:
                return bkb.p1(0.88f, bkb.v0(bkb.c6, wjbVar));
            case 22:
                int v03 = bkb.v0(bkb.F8, wjbVar);
                if (z) {
                    f9 = 0.85f;
                } else {
                    f9 = 0.825f;
                }
                return bkb.p1(f9, v03);
            case 23:
                if (e66.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return nod.m(f10, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Ol, wjbVar));
            case 24:
                if (e66.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return bkb.p1(f11, bkb.v0(bkb.c6, wjbVar));
            case 25:
                return bkb.p1(0.78f, bkb.v0(bkb.g5, wjbVar));
            case 26:
                return bkb.p1(0.7f, bkb.v0(bkb.c6, wjbVar));
            default:
                e66.e(262144);
                return 0;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        hdVar.dismiss();
    }
}
