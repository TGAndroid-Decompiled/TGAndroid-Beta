package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f3334f;
    public static final String f3335g;
    public final int f3336a;
    public final String f3337b;
    public final int f3338c;
    public final s[] d;
    public int f3339e;

    static {
        String str = e2.d0.f8537a;
        f3334f = Integer.toString(0, 36);
        f3335g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f3337b = str;
        this.d = sVarArr;
        this.f3336a = sVarArr.length;
        int h = r0.h(sVarArr[0].f3564r);
        this.f3338c = h == -1 ? r0.h(sVarArr[0].f3563q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f3553f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f3553f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f3553f), Integer.toBinaryString(sVarArr[i11].f3553f));
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
            List list = sVar.f3567u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f3549a);
            bundle2.putString(s.W, sVar.f3550b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f3551c;
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
                String str2 = wVar.f3599a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f3598c, str2);
                }
                bundle3.putString(w.d, wVar.f3600b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.f3552e);
            bundle2.putInt(s.Z, sVar.f3553f);
            int i14 = sVar.f3554g;
            if (i14 != s.U.f3554g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f3524a0, sVar.h);
            bundle2.putInt(s.f3525b0, sVar.f3555i);
            bundle2.putString(s.f3526c0, sVar.f3557k);
            bundle2.putString(s.f3527d0, sVar.f3563q);
            bundle2.putString(s.f3528e0, sVar.f3564r);
            bundle2.putInt(s.f3529f0, sVar.f3565s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f3530g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f3531h0, sVar.v);
            bundle2.putLong(s.f3532i0, sVar.f3568w);
            bundle2.putInt(s.f3533j0, sVar.f3570y);
            bundle2.putInt(s.f3534k0, sVar.f3571z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f3535l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f3536n0, sVar.E);
            bundle2.putByteArray(s.f3537o0, sVar.F);
            bundle2.putInt(s.f3538p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f3539q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f3267i, jVar.f3273a);
                bundle4.putInt(j.f3268j, jVar.f3274b);
                bundle4.putInt(j.f3269k, jVar.f3275c);
                bundle4.putByteArray(j.f3270l, jVar.d);
                bundle4.putInt(j.f3271m, jVar.f3276e);
                bundle4.putInt(j.f3272n, jVar.f3277f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f3540r0, sVar.J);
            bundle2.putInt(s.f3541s0, sVar.K);
            bundle2.putInt(s.f3542t0, sVar.L);
            bundle2.putInt(s.f3543u0, sVar.M);
            bundle2.putInt(s.f3544v0, sVar.N);
            bundle2.putInt(s.f3545w0, sVar.O);
            bundle2.putInt(s.f3547y0, sVar.Q);
            bundle2.putInt(s.f3548z0, sVar.R);
            bundle2.putInt(s.f3546x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3334f, arrayList);
        bundle.putString(f3335g, this.f3337b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f3337b.equals(l1Var.f3337b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3339e == 0) {
            this.f3339e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.f3337b);
        }
        return this.f3339e;
    }

    public final String toString() {
        return this.f3337b + ": " + Arrays.toString(this.d);
    }
}
