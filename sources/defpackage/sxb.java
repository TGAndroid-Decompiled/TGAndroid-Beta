package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class sxb {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final fm4[] d;
    public int e;

    static {
        String str = g8c.a;
        f = "0";
        g = "1";
    }

    public sxb(String str, fm4... fm4VarArr) {
        boolean z;
        int h;
        if (fm4VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        this.b = str;
        this.d = fm4VarArr;
        this.a = fm4VarArr.length;
        String str2 = fm4VarArr[0].t;
        if (TextUtils.isEmpty(str2)) {
            h = ud7.h(fm4VarArr[0].s);
        } else {
            h = ud7.h(str2);
        }
        this.c = h;
        String str3 = fm4VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i = fm4VarArr[0].f | 16384;
        for (int i2 = 1; i2 < fm4VarArr.length; i2++) {
            String str4 = fm4VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i2, fm4VarArr[0].d, fm4VarArr[i2].d);
                return;
            } else if (i != (fm4VarArr[i2].f | 16384)) {
                b("role flags", i2, Integer.toBinaryString(fm4VarArr[0].f), Integer.toBinaryString(fm4VarArr[i2].f));
                return;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder l = yjb.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l.append(str3);
        l.append("' (track ");
        l.append(i);
        l.append(")");
        lad.d("TrackGroup", "", new IllegalStateException(l.toString()));
    }

    public final int a(fm4 fm4Var) {
        int i = 0;
        while (true) {
            fm4[] fm4VarArr = this.d;
            if (i < fm4VarArr.length) {
                if (fm4Var == fm4VarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        fm4[] fm4VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(fm4VarArr.length);
        int length = fm4VarArr.length;
        int i = 0;
        while (i < length) {
            fm4 fm4Var = fm4VarArr[i];
            List list = fm4Var.w;
            Bundle bundle2 = new Bundle();
            bundle2.putString(fm4.a0, fm4Var.a);
            bundle2.putString(fm4.b0, fm4Var.b);
            String str = fm4.F0;
            mm5 mm5Var = fm4Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(mm5Var.size());
            int size = mm5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = mm5Var.get(i2);
                i2++;
                sw5 sw5Var = (sw5) obj;
                sw5Var.getClass();
                Bundle bundle3 = new Bundle();
                fm4[] fm4VarArr2 = fm4VarArr;
                String str2 = sw5Var.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(sw5.c, str2);
                }
                bundle3.putString(sw5.d, sw5Var.b);
                arrayList2.add(bundle3);
                fm4VarArr = fm4VarArr2;
                length = i3;
            }
            fm4[] fm4VarArr3 = fm4VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(fm4.c0, fm4Var.d);
            bundle2.putInt(fm4.d0, fm4Var.e);
            bundle2.putInt(fm4.e0, fm4Var.f);
            bundle2.putFloat(fm4.O0, fm4Var.g);
            int i5 = fm4Var.h;
            if (i5 != fm4.Z.h) {
                bundle2.putInt(fm4.G0, i5);
            }
            bundle2.putInt(fm4.f0, fm4Var.i);
            bundle2.putInt(fm4.g0, fm4Var.j);
            bundle2.putString(fm4.h0, fm4Var.l);
            String str3 = fm4Var.n;
            if (str3 != null) {
                bundle2.putString(fm4.K0, str3);
            }
            bundle2.putString(fm4.i0, fm4Var.s);
            bundle2.putString(fm4.j0, fm4Var.t);
            bundle2.putInt(fm4.k0, fm4Var.u);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(fm4.l0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(fm4.m0, fm4Var.x);
            bundle2.putLong(fm4.n0, fm4Var.y);
            bundle2.putInt(fm4.o0, fm4Var.A);
            bundle2.putInt(fm4.p0, fm4Var.B);
            bundle2.putInt(fm4.N0, fm4Var.C);
            bundle2.putInt(fm4.I0, fm4Var.D);
            bundle2.putInt(fm4.J0, fm4Var.E);
            bundle2.putFloat(fm4.q0, fm4Var.F);
            bundle2.putInt(fm4.r0, fm4Var.G);
            bundle2.putBoolean(fm4.M0, fm4Var.H);
            bundle2.putFloat(fm4.s0, fm4Var.I);
            bundle2.putByteArray(fm4.t0, fm4Var.J);
            bundle2.putInt(fm4.u0, fm4Var.K);
            hl2 hl2Var = fm4Var.L;
            if (hl2Var != null) {
                String str4 = fm4.v0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(hl2.i, hl2Var.a);
                bundle4.putInt(hl2.j, hl2Var.b);
                bundle4.putInt(hl2.k, hl2Var.c);
                bundle4.putByteArray(hl2.l, hl2Var.d);
                bundle4.putInt(hl2.m, hl2Var.e);
                bundle4.putInt(hl2.n, hl2Var.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(fm4.H0, fm4Var.M);
            bundle2.putInt(fm4.w0, fm4Var.N);
            bundle2.putInt(fm4.L0, fm4Var.O);
            bundle2.putInt(fm4.x0, fm4Var.P);
            bundle2.putInt(fm4.y0, fm4Var.Q);
            bundle2.putInt(fm4.z0, fm4Var.R);
            bundle2.putInt(fm4.A0, fm4Var.S);
            bundle2.putInt(fm4.B0, fm4Var.T);
            bundle2.putInt(fm4.D0, fm4Var.V);
            bundle2.putInt(fm4.E0, fm4Var.W);
            bundle2.putInt(fm4.C0, fm4Var.X);
            arrayList.add(bundle2);
            i++;
            fm4VarArr = fm4VarArr3;
            length = i4;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sxb.class == obj.getClass()) {
            sxb sxbVar = (sxb) obj;
            if (this.b.equals(sxbVar.b) && Arrays.equals(this.d, sxbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.d) + ir2.j(527, 31, this.b);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
