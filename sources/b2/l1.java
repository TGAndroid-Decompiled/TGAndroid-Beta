package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f2140f;
    public static final String f2141g;
    public final int f2142a;
    public final String f2143b;
    public final int f2144c;
    public final s[] d;
    public int f2145e;

    static {
        String str = e2.d0.f8737a;
        f2140f = Integer.toString(0, 36);
        f2141g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f2143b = str;
        this.d = sVarArr;
        this.f2142a = sVarArr.length;
        int h = r0.h(sVarArr[0].f2370r);
        this.f2144c = h == -1 ? r0.h(sVarArr[0].f2369q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f2359f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f2359f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f2359f), Integer.toBinaryString(sVarArr[i11].f2359f));
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
            List list = sVar.f2373u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f2355a);
            bundle2.putString(s.W, sVar.f2356b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f2357c;
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
                String str2 = wVar.f2405a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f2404c, str2);
                }
                bundle3.putString(w.d, wVar.f2406b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.f2358e);
            bundle2.putInt(s.Z, sVar.f2359f);
            int i14 = sVar.f2360g;
            if (i14 != s.U.f2360g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f2330a0, sVar.h);
            bundle2.putInt(s.f2331b0, sVar.f2361i);
            bundle2.putString(s.f2332c0, sVar.f2363k);
            bundle2.putString(s.f2333d0, sVar.f2369q);
            bundle2.putString(s.f2334e0, sVar.f2370r);
            bundle2.putInt(s.f2335f0, sVar.f2371s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f2336g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f2337h0, sVar.v);
            bundle2.putLong(s.f2338i0, sVar.f2374w);
            bundle2.putInt(s.f2339j0, sVar.f2376y);
            bundle2.putInt(s.f2340k0, sVar.f2377z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f2341l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f2342n0, sVar.E);
            bundle2.putByteArray(s.f2343o0, sVar.F);
            bundle2.putInt(s.f2344p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f2345q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f2073i, jVar.f2079a);
                bundle4.putInt(j.f2074j, jVar.f2080b);
                bundle4.putInt(j.f2075k, jVar.f2081c);
                bundle4.putByteArray(j.f2076l, jVar.d);
                bundle4.putInt(j.f2077m, jVar.f2082e);
                bundle4.putInt(j.f2078n, jVar.f2083f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f2346r0, sVar.J);
            bundle2.putInt(s.f2347s0, sVar.K);
            bundle2.putInt(s.f2348t0, sVar.L);
            bundle2.putInt(s.f2349u0, sVar.M);
            bundle2.putInt(s.f2350v0, sVar.N);
            bundle2.putInt(s.f2351w0, sVar.O);
            bundle2.putInt(s.f2353y0, sVar.Q);
            bundle2.putInt(s.f2354z0, sVar.R);
            bundle2.putInt(s.f2352x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f2140f, arrayList);
        bundle.putString(f2141g, this.f2143b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f2143b.equals(l1Var.f2143b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2145e == 0) {
            this.f2145e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.f2143b);
        }
        return this.f2145e;
    }

    public final String toString() {
        return this.f2143b + ": " + Arrays.toString(this.d);
    }
}
