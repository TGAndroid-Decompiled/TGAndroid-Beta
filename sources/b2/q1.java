package b2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public final class q1 {
    public static final String f2293f;
    public static final String f2294g;
    public final int f2295a;
    public final String f2296b;
    public final int f2297c;
    public final x[] d;
    public int e;

    static {
        String str = e2.m0.f8375a;
        f2293f = Integer.toString(0, 36);
        f2294g = Integer.toString(1, 36);
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
        this.f2296b = str;
        this.d = xVarArr;
        this.f2295a = xVarArr.length;
        String str2 = xVarArr[0].f2523s;
        if (TextUtils.isEmpty(str2)) {
            h = w0.h(xVarArr[0].f2522r);
        } else {
            h = w0.h(str2);
        }
        this.f2297c = h;
        String str3 = xVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i10 = xVarArr[0].f2511f | 16384;
        for (int i11 = 1; i11 < xVarArr.length; i11++) {
            String str4 = xVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i11, xVarArr[0].d, xVarArr[i11].d);
                return;
            } else if (i10 != (xVarArr[i11].f2511f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(xVarArr[0].f2511f), Integer.toBinaryString(xVarArr[i11].f2511f));
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
            bundle2.putString(x.W, xVar.f2508a);
            bundle2.putString(x.X, xVar.f2509b);
            String str = x.B0;
            e9.n0 n0Var = xVar.f2510c;
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
                String str2 = b0Var.f2081a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(b0.f2080c, str2);
                }
                bundle3.putString(b0.d, b0Var.f2082b);
                arrayList2.add(bundle3);
                xVarArr = xVarArr2;
                length = i12;
            }
            x[] xVarArr3 = xVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(x.Y, xVar.d);
            bundle2.putInt(x.Z, xVar.e);
            bundle2.putInt(x.f2483a0, xVar.f2511f);
            int i14 = xVar.f2512g;
            if (i14 != x.V.f2512g) {
                bundle2.putInt(x.C0, i14);
            }
            bundle2.putInt(x.f2484b0, xVar.h);
            bundle2.putInt(x.f2485c0, xVar.f2513i);
            bundle2.putString(x.f2486d0, xVar.f2515k);
            String str3 = xVar.f2517m;
            if (str3 != null) {
                bundle2.putString(x.G0, str3);
            }
            bundle2.putString(x.f2487e0, xVar.f2522r);
            bundle2.putString(x.f2488f0, xVar.f2523s);
            bundle2.putInt(x.f2489g0, xVar.f2524t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(x.f2490h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(x.f2491i0, xVar.f2526w);
            bundle2.putLong(x.f2492j0, xVar.f2527x);
            bundle2.putInt(x.f2493k0, xVar.f2529z);
            bundle2.putInt(x.f2494l0, xVar.A);
            bundle2.putInt(x.E0, xVar.B);
            bundle2.putInt(x.F0, xVar.C);
            bundle2.putFloat(x.m0, xVar.D);
            bundle2.putInt(x.f2495n0, xVar.E);
            bundle2.putFloat(x.f2496o0, xVar.F);
            bundle2.putByteArray(x.f2497p0, xVar.G);
            bundle2.putInt(x.f2498q0, xVar.H);
            o oVar = xVar.I;
            if (oVar != null) {
                String str4 = x.f2499r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(o.f2231i, oVar.f2237a);
                bundle4.putInt(o.f2232j, oVar.f2238b);
                bundle4.putInt(o.f2233k, oVar.f2239c);
                bundle4.putByteArray(o.f2234l, oVar.d);
                bundle4.putInt(o.f2235m, oVar.e);
                bundle4.putInt(o.f2236n, oVar.f2240f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(x.D0, xVar.J);
            bundle2.putInt(x.f2500s0, xVar.K);
            bundle2.putInt(x.f2501t0, xVar.L);
            bundle2.putInt(x.f2502u0, xVar.M);
            bundle2.putInt(x.f2503v0, xVar.N);
            bundle2.putInt(x.f2504w0, xVar.O);
            bundle2.putInt(x.f2505x0, xVar.P);
            bundle2.putInt(x.f2507z0, xVar.R);
            bundle2.putInt(x.A0, xVar.S);
            bundle2.putInt(x.f2506y0, xVar.T);
            arrayList.add(bundle2);
            i10++;
            xVarArr = xVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f2293f, arrayList);
        bundle.putString(f2294g, this.f2296b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f2296b.equals(q1Var.f2296b) && Arrays.equals(this.d, q1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.g(527, 31, this.f2296b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f2296b + ": " + Arrays.toString(this.d);
    }
}
