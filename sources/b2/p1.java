package b2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.t6;
public final class p1 {
    public static final String f2185f;
    public static final String f2186g;
    public final int f2187a;
    public final String f2188b;
    public final int f2189c;
    public final x[] d;
    public int e;

    static {
        String str = e2.l0.f6165a;
        f2185f = Integer.toString(0, 36);
        f2186g = Integer.toString(1, 36);
    }

    public p1(String str, x... xVarArr) {
        boolean z10;
        int h;
        if (xVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        this.f2188b = str;
        this.d = xVarArr;
        this.f2187a = xVarArr.length;
        String str2 = xVarArr[0].f2423s;
        if (TextUtils.isEmpty(str2)) {
            h = v0.h(xVarArr[0].f2422r);
        } else {
            h = v0.h(str2);
        }
        this.f2189c = h;
        String str3 = xVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i10 = xVarArr[0].f2411f | 16384;
        for (int i11 = 1; i11 < xVarArr.length; i11++) {
            String str4 = xVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i11, xVarArr[0].d, xVarArr[i11].d);
                return;
            } else if (i10 != (xVarArr[i11].f2411f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(xVarArr[0].f2411f), Integer.toBinaryString(xVarArr[i11].f2411f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder v = a1.g.v("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        v.append(str3);
        v.append("' (track ");
        v.append(i10);
        v.append(")");
        e2.a.d("TrackGroup", "", new IllegalStateException(v.toString()));
    }

    public final int a(x xVar) {
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.d;
            if (i10 < xVarArr.length) {
                if (xVar == xVarArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        x[] xVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(xVarArr.length);
        int length = xVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            x xVar = xVarArr[i10];
            List list = xVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(x.W, xVar.f2408a);
            bundle2.putString(x.X, xVar.f2409b);
            String str = x.B0;
            e9.n0 n0Var = xVar.f2410c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                Bundle bundle3 = new Bundle();
                x[] xVarArr2 = xVarArr;
                String str2 = b0Var.f1980a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(b0.f1979c, str2);
                }
                bundle3.putString(b0.d, b0Var.f1981b);
                arrayList2.add(bundle3);
                xVarArr = xVarArr2;
                length = i12;
            }
            x[] xVarArr3 = xVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(x.Y, xVar.d);
            bundle2.putInt(x.Z, xVar.e);
            bundle2.putInt(x.f2383a0, xVar.f2411f);
            int i14 = xVar.f2412g;
            if (i14 != x.V.f2412g) {
                bundle2.putInt(x.C0, i14);
            }
            bundle2.putInt(x.f2384b0, xVar.h);
            bundle2.putInt(x.f2385c0, xVar.f2413i);
            bundle2.putString(x.f2386d0, xVar.f2415k);
            String str3 = xVar.f2417m;
            if (str3 != null) {
                bundle2.putString(x.G0, str3);
            }
            bundle2.putString(x.f2387e0, xVar.f2422r);
            bundle2.putString(x.f2388f0, xVar.f2423s);
            bundle2.putInt(x.f2389g0, xVar.f2424t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(x.f2390h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(x.f2391i0, xVar.f2426w);
            bundle2.putLong(x.f2392j0, xVar.f2427x);
            bundle2.putInt(x.f2393k0, xVar.f2429z);
            bundle2.putInt(x.f2394l0, xVar.A);
            bundle2.putInt(x.E0, xVar.B);
            bundle2.putInt(x.F0, xVar.C);
            bundle2.putFloat(x.m0, xVar.D);
            bundle2.putInt(x.f2395n0, xVar.E);
            bundle2.putFloat(x.f2396o0, xVar.F);
            bundle2.putByteArray(x.f2397p0, xVar.G);
            bundle2.putInt(x.f2398q0, xVar.H);
            o oVar = xVar.I;
            if (oVar != null) {
                String str4 = x.f2399r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(o.f2150i, oVar.f2156a);
                bundle4.putInt(o.f2151j, oVar.f2157b);
                bundle4.putInt(o.f2152k, oVar.f2158c);
                bundle4.putByteArray(o.f2153l, oVar.d);
                bundle4.putInt(o.f2154m, oVar.e);
                bundle4.putInt(o.f2155n, oVar.f2159f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(x.D0, xVar.J);
            bundle2.putInt(x.f2400s0, xVar.K);
            bundle2.putInt(x.f2401t0, xVar.L);
            bundle2.putInt(x.f2402u0, xVar.M);
            bundle2.putInt(x.f2403v0, xVar.N);
            bundle2.putInt(x.f2404w0, xVar.O);
            bundle2.putInt(x.f2405x0, xVar.P);
            bundle2.putInt(x.f2407z0, xVar.R);
            bundle2.putInt(x.A0, xVar.S);
            bundle2.putInt(x.f2406y0, xVar.T);
            arrayList.add(bundle2);
            i10++;
            xVarArr = xVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f2185f, arrayList);
        bundle.putString(f2186g, this.f2188b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f2188b.equals(p1Var.f2188b) && Arrays.equals(this.d, p1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.f(527, 31, this.f2188b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f2188b + ": " + Arrays.toString(this.d);
    }
}
