package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f2167f;
    public static final String f2168g;
    public final int f2169a;
    public final String f2170b;
    public final int f2171c;
    public final s[] d;
    public int f2172e;

    static {
        String str = e2.d0.f8765a;
        f2167f = Integer.toString(0, 36);
        f2168g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f2170b = str;
        this.d = sVarArr;
        this.f2169a = sVarArr.length;
        int h = r0.h(sVarArr[0].f2397r);
        this.f2171c = h == -1 ? r0.h(sVarArr[0].f2396q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f2386f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f2386f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f2386f), Integer.toBinaryString(sVarArr[i11].f2386f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w10 = a4.a.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w10.append(str3);
        w10.append("' (track ");
        w10.append(i10);
        w10.append(")");
        e2.a.f("TrackGroup", "", new IllegalStateException(w10.toString()));
    }

    public final int a(s sVar) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.d;
            if (i10 < sVarArr.length) {
                if (sVar == sVarArr[i10]) {
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
        s[] sVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(sVarArr.length);
        int length = sVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            s sVar = sVarArr[i10];
            List list = sVar.f2400u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f2382a);
            bundle2.putString(s.W, sVar.f2383b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f2384c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = i0Var.get(i11);
                i11++;
                w wVar = (w) obj;
                wVar.getClass();
                Bundle bundle3 = new Bundle();
                s[] sVarArr2 = sVarArr;
                String str2 = wVar.f2432a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f2431c, str2);
                }
                bundle3.putString(w.d, wVar.f2433b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.f2385e);
            bundle2.putInt(s.Z, sVar.f2386f);
            int i14 = sVar.f2387g;
            if (i14 != s.U.f2387g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f2357a0, sVar.h);
            bundle2.putInt(s.f2358b0, sVar.f2388i);
            bundle2.putString(s.f2359c0, sVar.f2390k);
            bundle2.putString(s.f2360d0, sVar.f2396q);
            bundle2.putString(s.f2361e0, sVar.f2397r);
            bundle2.putInt(s.f2362f0, sVar.f2398s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f2363g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f2364h0, sVar.v);
            bundle2.putLong(s.f2365i0, sVar.f2401w);
            bundle2.putInt(s.f2366j0, sVar.f2403y);
            bundle2.putInt(s.f2367k0, sVar.f2404z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f2368l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f2369n0, sVar.E);
            bundle2.putByteArray(s.f2370o0, sVar.F);
            bundle2.putInt(s.f2371p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f2372q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f2100i, jVar.f2106a);
                bundle4.putInt(j.f2101j, jVar.f2107b);
                bundle4.putInt(j.f2102k, jVar.f2108c);
                bundle4.putByteArray(j.f2103l, jVar.d);
                bundle4.putInt(j.f2104m, jVar.f2109e);
                bundle4.putInt(j.f2105n, jVar.f2110f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f2373r0, sVar.J);
            bundle2.putInt(s.f2374s0, sVar.K);
            bundle2.putInt(s.f2375t0, sVar.L);
            bundle2.putInt(s.f2376u0, sVar.M);
            bundle2.putInt(s.f2377v0, sVar.N);
            bundle2.putInt(s.f2378w0, sVar.O);
            bundle2.putInt(s.f2380y0, sVar.Q);
            bundle2.putInt(s.f2381z0, sVar.R);
            bundle2.putInt(s.f2379x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f2167f, arrayList);
        bundle.putString(f2168g, this.f2170b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f2170b.equals(l1Var.f2170b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2172e == 0) {
            this.f2172e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.f2170b);
        }
        return this.f2172e;
    }

    public final String toString() {
        return this.f2170b + ": " + Arrays.toString(this.d);
    }
}
