package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class uzb {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final go4[] d;
    public int e;

    static {
        String str = hac.a;
        f = "0";
        g = "1";
    }

    public uzb(String str, go4... go4VarArr) {
        boolean z;
        int h;
        if (go4VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        this.b = str;
        this.d = go4VarArr;
        this.a = go4VarArr.length;
        String str2 = go4VarArr[0].t;
        if (TextUtils.isEmpty(str2)) {
            h = wf7.h(go4VarArr[0].s);
        } else {
            h = wf7.h(str2);
        }
        this.c = h;
        String str3 = go4VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i = go4VarArr[0].f | 16384;
        for (int i2 = 1; i2 < go4VarArr.length; i2++) {
            String str4 = go4VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i2, go4VarArr[0].d, go4VarArr[i2].d);
                return;
            } else if (i != (go4VarArr[i2].f | 16384)) {
                b("role flags", i2, Integer.toBinaryString(go4VarArr[0].f), Integer.toBinaryString(go4VarArr[i2].f));
                return;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder m = mlb.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        m.append(str3);
        m.append("' (track ");
        m.append(i);
        m.append(")");
        ncd.d("TrackGroup", "", new IllegalStateException(m.toString()));
    }

    public final int a(go4 go4Var) {
        int i = 0;
        while (true) {
            go4[] go4VarArr = this.d;
            if (i < go4VarArr.length) {
                if (go4Var == go4VarArr[i]) {
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
        go4[] go4VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(go4VarArr.length);
        int length = go4VarArr.length;
        int i = 0;
        while (i < length) {
            go4 go4Var = go4VarArr[i];
            List list = go4Var.w;
            Bundle bundle2 = new Bundle();
            bundle2.putString(go4.a0, go4Var.a);
            bundle2.putString(go4.b0, go4Var.b);
            String str = go4.F0;
            mo5 mo5Var = go4Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(mo5Var.size());
            int size = mo5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = mo5Var.get(i2);
                i2++;
                sy5 sy5Var = (sy5) obj;
                sy5Var.getClass();
                Bundle bundle3 = new Bundle();
                go4[] go4VarArr2 = go4VarArr;
                String str2 = sy5Var.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(sy5.c, str2);
                }
                bundle3.putString(sy5.d, sy5Var.b);
                arrayList2.add(bundle3);
                go4VarArr = go4VarArr2;
                length = i3;
            }
            go4[] go4VarArr3 = go4VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(go4.c0, go4Var.d);
            bundle2.putInt(go4.d0, go4Var.e);
            bundle2.putInt(go4.e0, go4Var.f);
            bundle2.putFloat(go4.O0, go4Var.g);
            int i5 = go4Var.h;
            if (i5 != go4.Z.h) {
                bundle2.putInt(go4.G0, i5);
            }
            bundle2.putInt(go4.f0, go4Var.i);
            bundle2.putInt(go4.g0, go4Var.j);
            bundle2.putString(go4.h0, go4Var.l);
            String str3 = go4Var.n;
            if (str3 != null) {
                bundle2.putString(go4.K0, str3);
            }
            bundle2.putString(go4.i0, go4Var.s);
            bundle2.putString(go4.j0, go4Var.t);
            bundle2.putInt(go4.k0, go4Var.u);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(go4.l0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(go4.m0, go4Var.x);
            bundle2.putLong(go4.n0, go4Var.y);
            bundle2.putInt(go4.o0, go4Var.A);
            bundle2.putInt(go4.p0, go4Var.B);
            bundle2.putInt(go4.N0, go4Var.C);
            bundle2.putInt(go4.I0, go4Var.D);
            bundle2.putInt(go4.J0, go4Var.E);
            bundle2.putFloat(go4.q0, go4Var.F);
            bundle2.putInt(go4.r0, go4Var.G);
            bundle2.putBoolean(go4.M0, go4Var.H);
            bundle2.putFloat(go4.s0, go4Var.I);
            bundle2.putByteArray(go4.t0, go4Var.J);
            bundle2.putInt(go4.u0, go4Var.K);
            tm2 tm2Var = go4Var.L;
            if (tm2Var != null) {
                String str4 = go4.v0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(tm2.i, tm2Var.a);
                bundle4.putInt(tm2.j, tm2Var.b);
                bundle4.putInt(tm2.k, tm2Var.c);
                bundle4.putByteArray(tm2.l, tm2Var.d);
                bundle4.putInt(tm2.m, tm2Var.e);
                bundle4.putInt(tm2.n, tm2Var.f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(go4.H0, go4Var.M);
            bundle2.putInt(go4.w0, go4Var.N);
            bundle2.putInt(go4.L0, go4Var.O);
            bundle2.putInt(go4.x0, go4Var.P);
            bundle2.putInt(go4.y0, go4Var.Q);
            bundle2.putInt(go4.z0, go4Var.R);
            bundle2.putInt(go4.A0, go4Var.S);
            bundle2.putInt(go4.B0, go4Var.T);
            bundle2.putInt(go4.D0, go4Var.V);
            bundle2.putInt(go4.E0, go4Var.W);
            bundle2.putInt(go4.C0, go4Var.X);
            arrayList.add(bundle2);
            i++;
            go4VarArr = go4VarArr3;
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
        if (obj != null && uzb.class == obj.getClass()) {
            uzb uzbVar = (uzb) obj;
            if (this.b.equals(uzbVar.b) && Arrays.equals(this.d, uzbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.d) + ts2.j(527, 31, this.b);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
