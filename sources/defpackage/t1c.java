package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class t1c {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final ko4[] d;
    public int e;

    static {
        String str = gcc.a;
        f = "0";
        g = "1";
    }

    public t1c(String str, ko4... ko4VarArr) {
        boolean z;
        int h;
        if (ko4VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        this.b = str;
        this.d = ko4VarArr;
        this.a = ko4VarArr.length;
        String str2 = ko4VarArr[0].t;
        if (TextUtils.isEmpty(str2)) {
            h = dg7.h(ko4VarArr[0].s);
        } else {
            h = dg7.h(str2);
        }
        this.c = h;
        String str3 = ko4VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i = ko4VarArr[0].f | 16384;
        for (int i2 = 1; i2 < ko4VarArr.length; i2++) {
            String str4 = ko4VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i2, ko4VarArr[0].d, ko4VarArr[i2].d);
                return;
            } else if (i != (ko4VarArr[i2].f | 16384)) {
                b("role flags", i2, Integer.toBinaryString(ko4VarArr[0].f), Integer.toBinaryString(ko4VarArr[i2].f));
                return;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder l = xnb.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l.append(str3);
        l.append("' (track ");
        l.append(i);
        l.append(")");
        efd.d("TrackGroup", "", new IllegalStateException(l.toString()));
    }

    public final int a(ko4 ko4Var) {
        int i = 0;
        while (true) {
            ko4[] ko4VarArr = this.d;
            if (i < ko4VarArr.length) {
                if (ko4Var == ko4VarArr[i]) {
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
        ko4[] ko4VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ko4VarArr.length);
        int length = ko4VarArr.length;
        int i = 0;
        while (i < length) {
            ko4 ko4Var = ko4VarArr[i];
            List list = ko4Var.w;
            Bundle bundle2 = new Bundle();
            bundle2.putString(ko4.a0, ko4Var.a);
            bundle2.putString(ko4.b0, ko4Var.b);
            String str = ko4.F0;
            po5 po5Var = ko4Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(po5Var.size());
            int size = po5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = po5Var.get(i2);
                i2++;
                xy5 xy5Var = (xy5) obj;
                xy5Var.getClass();
                Bundle bundle3 = new Bundle();
                ko4[] ko4VarArr2 = ko4VarArr;
                String str2 = xy5Var.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(xy5.c, str2);
                }
                bundle3.putString(xy5.d, xy5Var.b);
                arrayList2.add(bundle3);
                ko4VarArr = ko4VarArr2;
                length = i3;
            }
            ko4[] ko4VarArr3 = ko4VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(ko4.c0, ko4Var.d);
            bundle2.putInt(ko4.d0, ko4Var.e);
            bundle2.putInt(ko4.e0, ko4Var.f);
            bundle2.putFloat(ko4.O0, ko4Var.g);
            int i5 = ko4Var.h;
            if (i5 != ko4.Z.h) {
                bundle2.putInt(ko4.G0, i5);
            }
            bundle2.putInt(ko4.f0, ko4Var.i);
            bundle2.putInt(ko4.g0, ko4Var.j);
            bundle2.putString(ko4.h0, ko4Var.l);
            String str3 = ko4Var.n;
            if (str3 != null) {
                bundle2.putString(ko4.K0, str3);
            }
            bundle2.putString(ko4.i0, ko4Var.s);
            bundle2.putString(ko4.j0, ko4Var.t);
            bundle2.putInt(ko4.k0, ko4Var.u);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(ko4.l0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(ko4.m0, ko4Var.x);
            bundle2.putLong(ko4.n0, ko4Var.y);
            bundle2.putInt(ko4.o0, ko4Var.A);
            bundle2.putInt(ko4.p0, ko4Var.B);
            bundle2.putInt(ko4.N0, ko4Var.C);
            bundle2.putInt(ko4.I0, ko4Var.D);
            bundle2.putInt(ko4.J0, ko4Var.E);
            bundle2.putFloat(ko4.q0, ko4Var.F);
            bundle2.putInt(ko4.r0, ko4Var.G);
            bundle2.putBoolean(ko4.M0, ko4Var.H);
            bundle2.putFloat(ko4.s0, ko4Var.I);
            bundle2.putByteArray(ko4.t0, ko4Var.J);
            bundle2.putInt(ko4.u0, ko4Var.K);
            bm2 bm2Var = ko4Var.L;
            if (bm2Var != null) {
                String str4 = ko4.v0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(bm2.i, bm2Var.a);
                bundle4.putInt(bm2.j, bm2Var.b);
                bundle4.putInt(bm2.k, bm2Var.c);
                bundle4.putByteArray(bm2.l, bm2Var.d);
                bundle4.putInt(bm2.m, bm2Var.e);
                bundle4.putInt(bm2.n, bm2Var.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(ko4.H0, ko4Var.M);
            bundle2.putInt(ko4.w0, ko4Var.N);
            bundle2.putInt(ko4.L0, ko4Var.O);
            bundle2.putInt(ko4.x0, ko4Var.P);
            bundle2.putInt(ko4.y0, ko4Var.Q);
            bundle2.putInt(ko4.z0, ko4Var.R);
            bundle2.putInt(ko4.A0, ko4Var.S);
            bundle2.putInt(ko4.B0, ko4Var.T);
            bundle2.putInt(ko4.D0, ko4Var.V);
            bundle2.putInt(ko4.E0, ko4Var.W);
            bundle2.putInt(ko4.C0, ko4Var.X);
            arrayList.add(bundle2);
            i++;
            ko4VarArr = ko4VarArr3;
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
        if (obj != null && t1c.class == obj.getClass()) {
            t1c t1cVar = (t1c) obj;
            if (this.b.equals(t1cVar.b) && Arrays.equals(this.d, t1cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.d) + bs2.j(527, 31, this.b);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
