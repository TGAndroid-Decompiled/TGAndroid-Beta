package b2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public final class q1 {
    public static final String f2289f;
    public static final String f2290g;
    public final int f2291a;
    public final String f2292b;
    public final int f2293c;
    public final x[] d;
    public int e;

    static {
        String str = e2.m0.f8372a;
        f2289f = Integer.toString(0, 36);
        f2290g = Integer.toString(1, 36);
    }

    public q1(String str, x... xVarArr) {
        boolean z10;
        int h;
        if (xVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f2292b = str;
        this.d = xVarArr;
        this.f2291a = xVarArr.length;
        String str2 = xVarArr[0].f2519s;
        if (TextUtils.isEmpty(str2)) {
            h = w0.h(xVarArr[0].f2518r);
        } else {
            h = w0.h(str2);
        }
        this.f2293c = h;
        String str3 = xVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i10 = xVarArr[0].f2507f | 16384;
        for (int i11 = 1; i11 < xVarArr.length; i11++) {
            String str4 = xVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i11, xVarArr[0].d, xVarArr[i11].d);
                return;
            } else if (i10 != (xVarArr[i11].f2507f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(xVarArr[0].f2507f), Integer.toBinaryString(xVarArr[i11].f2507f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w9 = a1.g.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w9.append(str3);
        w9.append("' (track ");
        w9.append(i10);
        w9.append(")");
        e2.a.d("TrackGroup", "", new IllegalStateException(w9.toString()));
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
            bundle2.putString(x.W, xVar.f2504a);
            bundle2.putString(x.X, xVar.f2505b);
            String str = x.B0;
            e9.n0 n0Var = xVar.f2506c;
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
                String str2 = b0Var.f2077a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(b0.f2076c, str2);
                }
                bundle3.putString(b0.d, b0Var.f2078b);
                arrayList2.add(bundle3);
                xVarArr = xVarArr2;
                length = i12;
            }
            x[] xVarArr3 = xVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(x.Y, xVar.d);
            bundle2.putInt(x.Z, xVar.e);
            bundle2.putInt(x.f2479a0, xVar.f2507f);
            int i14 = xVar.f2508g;
            if (i14 != x.V.f2508g) {
                bundle2.putInt(x.C0, i14);
            }
            bundle2.putInt(x.f2480b0, xVar.h);
            bundle2.putInt(x.f2481c0, xVar.f2509i);
            bundle2.putString(x.f2482d0, xVar.f2511k);
            String str3 = xVar.f2513m;
            if (str3 != null) {
                bundle2.putString(x.G0, str3);
            }
            bundle2.putString(x.f2483e0, xVar.f2518r);
            bundle2.putString(x.f2484f0, xVar.f2519s);
            bundle2.putInt(x.f2485g0, xVar.f2520t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(x.f2486h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(x.f2487i0, xVar.f2522w);
            bundle2.putLong(x.f2488j0, xVar.f2523x);
            bundle2.putInt(x.f2489k0, xVar.f2525z);
            bundle2.putInt(x.f2490l0, xVar.A);
            bundle2.putInt(x.E0, xVar.B);
            bundle2.putInt(x.F0, xVar.C);
            bundle2.putFloat(x.m0, xVar.D);
            bundle2.putInt(x.f2491n0, xVar.E);
            bundle2.putFloat(x.f2492o0, xVar.F);
            bundle2.putByteArray(x.f2493p0, xVar.G);
            bundle2.putInt(x.f2494q0, xVar.H);
            o oVar = xVar.I;
            if (oVar != null) {
                String str4 = x.f2495r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(o.f2227i, oVar.f2233a);
                bundle4.putInt(o.f2228j, oVar.f2234b);
                bundle4.putInt(o.f2229k, oVar.f2235c);
                bundle4.putByteArray(o.f2230l, oVar.d);
                bundle4.putInt(o.f2231m, oVar.e);
                bundle4.putInt(o.f2232n, oVar.f2236f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(x.D0, xVar.J);
            bundle2.putInt(x.f2496s0, xVar.K);
            bundle2.putInt(x.f2497t0, xVar.L);
            bundle2.putInt(x.f2498u0, xVar.M);
            bundle2.putInt(x.f2499v0, xVar.N);
            bundle2.putInt(x.f2500w0, xVar.O);
            bundle2.putInt(x.f2501x0, xVar.P);
            bundle2.putInt(x.f2503z0, xVar.R);
            bundle2.putInt(x.A0, xVar.S);
            bundle2.putInt(x.f2502y0, xVar.T);
            arrayList.add(bundle2);
            i10++;
            xVarArr = xVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f2289f, arrayList);
        bundle.putString(f2290g, this.f2292b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f2292b.equals(q1Var.f2292b) && Arrays.equals(this.d, q1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.g(527, 31, this.f2292b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f2292b + ": " + Arrays.toString(this.d);
    }
}
