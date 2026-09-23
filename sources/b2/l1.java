package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f3081f;
    public static final String f3082g;
    public final int f3083a;
    public final String f3084b;
    public final int f3085c;
    public final s[] d;
    public int e;

    static {
        String str = e2.d0.f7871a;
        f3081f = Integer.toString(0, 36);
        f3082g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f3084b = str;
        this.d = sVarArr;
        this.f3083a = sVarArr.length;
        int h = r0.h(sVarArr[0].f3301r);
        this.f3085c = h == -1 ? r0.h(sVarArr[0].f3300q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f3290f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f3290f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f3290f), Integer.toBinaryString(sVarArr[i11].f3290f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder x10 = a4.a.x("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        x10.append(str3);
        x10.append("' (track ");
        x10.append(i10);
        x10.append(")");
        e2.a.f("TrackGroup", "", new IllegalStateException(x10.toString()));
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
            List list = sVar.f3304u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f3287a);
            bundle2.putString(s.W, sVar.f3288b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f3289c;
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
                String str2 = wVar.f3333a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f3332c, str2);
                }
                bundle3.putString(w.d, wVar.f3334b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.e);
            bundle2.putInt(s.Z, sVar.f3290f);
            int i14 = sVar.f3291g;
            if (i14 != s.U.f3291g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f3262a0, sVar.h);
            bundle2.putInt(s.f3263b0, sVar.f3292i);
            bundle2.putString(s.f3264c0, sVar.f3294k);
            bundle2.putString(s.f3265d0, sVar.f3300q);
            bundle2.putString(s.f3266e0, sVar.f3301r);
            bundle2.putInt(s.f3267f0, sVar.f3302s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f3268g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f3269h0, sVar.v);
            bundle2.putLong(s.f3270i0, sVar.f3305w);
            bundle2.putInt(s.f3271j0, sVar.f3307y);
            bundle2.putInt(s.f3272k0, sVar.f3308z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f3273l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f3274n0, sVar.E);
            bundle2.putByteArray(s.f3275o0, sVar.F);
            bundle2.putInt(s.f3276p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f3277q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f3019i, jVar.f3025a);
                bundle4.putInt(j.f3020j, jVar.f3026b);
                bundle4.putInt(j.f3021k, jVar.f3027c);
                bundle4.putByteArray(j.f3022l, jVar.d);
                bundle4.putInt(j.f3023m, jVar.e);
                bundle4.putInt(j.f3024n, jVar.f3028f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f3278r0, sVar.J);
            bundle2.putInt(s.f3279s0, sVar.K);
            bundle2.putInt(s.f3280t0, sVar.L);
            bundle2.putInt(s.f3281u0, sVar.M);
            bundle2.putInt(s.f3282v0, sVar.N);
            bundle2.putInt(s.f3283w0, sVar.O);
            bundle2.putInt(s.f3285y0, sVar.Q);
            bundle2.putInt(s.f3286z0, sVar.R);
            bundle2.putInt(s.f3284x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3081f, arrayList);
        bundle.putString(f3082g, this.f3084b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f3084b.equals(l1Var.f3084b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.f3084b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f3084b + ": " + Arrays.toString(this.d);
    }
}
