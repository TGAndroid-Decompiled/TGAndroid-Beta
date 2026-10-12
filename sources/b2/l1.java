package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f3411f;
    public static final String f3412g;
    public final int f3413a;
    public final String f3414b;
    public final int f3415c;
    public final s[] d;
    public int f3416e;

    static {
        String str = e2.d0.f8529a;
        f3411f = Integer.toString(0, 36);
        f3412g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f3414b = str;
        this.d = sVarArr;
        this.f3413a = sVarArr.length;
        int h = r0.h(sVarArr[0].f3641r);
        this.f3415c = h == -1 ? r0.h(sVarArr[0].f3640q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f3630f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f3630f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f3630f), Integer.toBinaryString(sVarArr[i11].f3630f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder x10 = a1.g.x("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
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
            List list = sVar.f3644u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f3626a);
            bundle2.putString(s.W, sVar.f3627b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f3628c;
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
                String str2 = wVar.f3676a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f3675c, str2);
                }
                bundle3.putString(w.d, wVar.f3677b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.f3629e);
            bundle2.putInt(s.Z, sVar.f3630f);
            int i14 = sVar.f3631g;
            if (i14 != s.U.f3631g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f3601a0, sVar.h);
            bundle2.putInt(s.f3602b0, sVar.f3632i);
            bundle2.putString(s.f3603c0, sVar.f3634k);
            bundle2.putString(s.f3604d0, sVar.f3640q);
            bundle2.putString(s.f3605e0, sVar.f3641r);
            bundle2.putInt(s.f3606f0, sVar.f3642s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f3607g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f3608h0, sVar.v);
            bundle2.putLong(s.f3609i0, sVar.f3645w);
            bundle2.putInt(s.f3610j0, sVar.f3647y);
            bundle2.putInt(s.f3611k0, sVar.f3648z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f3612l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f3613n0, sVar.E);
            bundle2.putByteArray(s.f3614o0, sVar.F);
            bundle2.putInt(s.f3615p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f3616q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f3344i, jVar.f3350a);
                bundle4.putInt(j.f3345j, jVar.f3351b);
                bundle4.putInt(j.f3346k, jVar.f3352c);
                bundle4.putByteArray(j.f3347l, jVar.d);
                bundle4.putInt(j.f3348m, jVar.f3353e);
                bundle4.putInt(j.f3349n, jVar.f3354f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f3617r0, sVar.J);
            bundle2.putInt(s.f3618s0, sVar.K);
            bundle2.putInt(s.f3619t0, sVar.L);
            bundle2.putInt(s.f3620u0, sVar.M);
            bundle2.putInt(s.f3621v0, sVar.N);
            bundle2.putInt(s.f3622w0, sVar.O);
            bundle2.putInt(s.f3624y0, sVar.Q);
            bundle2.putInt(s.f3625z0, sVar.R);
            bundle2.putInt(s.f3623x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3411f, arrayList);
        bundle.putString(f3412g, this.f3414b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f3414b.equals(l1Var.f3414b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3416e == 0) {
            this.f3416e = Arrays.hashCode(this.d) + a1.g.h(527, 31, this.f3414b);
        }
        return this.f3416e;
    }

    public final String toString() {
        return this.f3414b + ": " + Arrays.toString(this.d);
    }
}
