package defpackage;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
public final class xz implements b86, fd, vob, wob, nl0, dq7 {
    public final byte a;

    public xz(byte b) {
        this.a = b;
    }

    public static AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public final String c(int i) {
        return String.valueOf(i);
    }

    @Override
    public final void e(int i, View view) {
        ((b8) view).d(i, i);
    }

    @Override
    public final int f(View view) {
        b8 b8Var = (b8) view;
        if (b8Var.getTextView() != null) {
            return b8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override
    public final void invoke(Object obj) {
        long j;
        v30 v30Var;
        switch (this.a) {
            case 2:
                ha3 ha3Var = (ha3) obj;
                ja3 ja3Var = ha3Var.a;
                if (ha3Var == ja3Var.j && ja3Var.n != null) {
                    oh2 oh2Var = ja3Var.p;
                    int i = oh2Var.b;
                    if (i != -1) {
                        long j2 = ((s00) oh2Var.e).f / i;
                        l40 l40Var = ja3Var.t;
                        l40Var.getClass();
                        j = gcc.Z(l40Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    ja3Var.n.C0(gcc.i0(j), ((s00) ja3Var.p.e).f, SystemClock.elapsedRealtime() - ja3Var.Z);
                    return;
                }
                return;
            case 3:
                v30 v30Var2 = ((ha3) obj).a.n;
                if (v30Var2 != null) {
                    v30Var2.u(new qf5((byte) 14));
                    return;
                }
                return;
            case 4:
                ha3 ha3Var2 = (ha3) obj;
                ja3 ja3Var2 = ha3Var2.a;
                if (ha3Var2 == ja3Var2.j && (v30Var = ja3Var2.n) != null && ja3Var2.R) {
                    v30Var.w0();
                    return;
                }
                return;
            case 5:
                ha3 ha3Var3 = (ha3) obj;
                ja3 ja3Var3 = ha3Var3.a;
                if (ha3Var3 == ja3Var3.j && ja3Var3.P) {
                    ja3Var3.Q = true;
                    return;
                }
                return;
            default:
                v30 v30Var3 = ((ga3) obj).a.n;
                if (v30Var3 != null) {
                    v30Var3.Z();
                    return;
                }
                return;
        }
    }

    @Override
    public final int l(vnb vnbVar, boolean z) {
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
        float f12;
        switch (this.a) {
            case 10:
                if (i86.e(262144)) {
                    f = 0.82f;
                } else {
                    f = 0.76f;
                }
                int v0 = aob.v0(aob.d6, vnbVar);
                if (z) {
                    return aob.p1(0.9f, -15658735);
                }
                return dtd.m(f, v0, -14145496);
            case 11:
                if (i86.e(262144)) {
                    f2 = 0.85f;
                } else {
                    f2 = 0.76f;
                }
                return aob.p1(f2, aob.v0(aob.d6, vnbVar));
            case 12:
                if (!i86.e(256)) {
                    return aob.w0(null, aob.G8, false);
                }
                int w0 = aob.w0(null, aob.G8, false);
                if (z) {
                    f3 = 0.85f;
                } else {
                    f3 = 0.825f;
                }
                return aob.p1(f3, w0);
            case 13:
                if (i86.e(262144)) {
                    f4 = 0.85f;
                } else {
                    f4 = 0.76f;
                }
                return dtd.m(f4, aob.v0(aob.d6, vnbVar), aob.v0(aob.Je, vnbVar));
            case 14:
                if (i86.e(262144)) {
                    f5 = 0.85f;
                } else {
                    f5 = 0.8f;
                }
                return dtd.m(f5, aob.v0(aob.a7, vnbVar), aob.v0(aob.d6, vnbVar));
            case 15:
                if (i86.e(262144)) {
                    f6 = 0.85f;
                } else {
                    f6 = 0.76f;
                }
                return dtd.m(f6, aob.v0(aob.d6, vnbVar), aob.v0(aob.Ql, vnbVar));
            case 16:
                if (i86.e(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return dtd.m(f7, aob.v0(aob.d6, vnbVar), aob.v0(aob.Ql, vnbVar));
            case 17:
                return 855638016;
            case 18:
                return 1073741824;
            case 19:
                return aob.p1(0.88f, aob.v0(aob.d6, vnbVar));
            case 20:
                if (i86.e(262144)) {
                    f8 = 0.85f;
                } else {
                    f8 = 0.76f;
                }
                return aob.p1(f8, aob.v0(aob.wj, vnbVar));
            case 21:
                int v02 = aob.v0(aob.h5, vnbVar);
                if (z) {
                    f9 = 0.82f;
                } else {
                    f9 = 0.78f;
                }
                return aob.p1(f9, v02);
            case 22:
                return aob.p1(0.075f, -16777216);
            case 23:
                int v03 = aob.v0(aob.G8, vnbVar);
                if (z) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return aob.p1(f10, v03);
            case 24:
                if (i86.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return dtd.m(f11, aob.v0(aob.d6, vnbVar), aob.v0(aob.Pl, vnbVar));
            case 25:
                if (i86.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return aob.p1(f12, aob.v0(aob.d6, vnbVar));
            case 26:
                return aob.p1(0.78f, aob.v0(aob.h5, vnbVar));
            case 27:
                return aob.p1(0.7f, aob.v0(aob.d6, vnbVar));
            default:
                i86.e(262144);
                return 0;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }
}
