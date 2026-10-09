package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f3413f;
    public static final String f3414g;
    public final int f3415a;
    public final String f3416b;
    public final int f3417c;
    public final s[] d;
    public int f3418e;

    static {
        String str = e2.d0.f8532a;
        f3413f = Integer.toString(0, 36);
        f3414g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f3416b = str;
        this.d = sVarArr;
        this.f3415a = sVarArr.length;
        int h = r0.h(sVarArr[0].f3643r);
        this.f3417c = h == -1 ? r0.h(sVarArr[0].f3642q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f3632f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f3632f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f3632f), Integer.toBinaryString(sVarArr[i11].f3632f));
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
            List list = sVar.f3646u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f3628a);
            bundle2.putString(s.W, sVar.f3629b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f3630c;
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
                String str2 = wVar.f3678a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f3677c, str2);
                }
                bundle3.putString(w.d, wVar.f3679b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.f3631e);
            bundle2.putInt(s.Z, sVar.f3632f);
            int i14 = sVar.f3633g;
            if (i14 != s.U.f3633g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f3603a0, sVar.h);
            bundle2.putInt(s.f3604b0, sVar.f3634i);
            bundle2.putString(s.f3605c0, sVar.f3636k);
            bundle2.putString(s.f3606d0, sVar.f3642q);
            bundle2.putString(s.f3607e0, sVar.f3643r);
            bundle2.putInt(s.f3608f0, sVar.f3644s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f3609g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f3610h0, sVar.v);
            bundle2.putLong(s.f3611i0, sVar.f3647w);
            bundle2.putInt(s.f3612j0, sVar.f3649y);
            bundle2.putInt(s.f3613k0, sVar.f3650z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f3614l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f3615n0, sVar.E);
            bundle2.putByteArray(s.f3616o0, sVar.F);
            bundle2.putInt(s.f3617p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f3618q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f3346i, jVar.f3352a);
                bundle4.putInt(j.f3347j, jVar.f3353b);
                bundle4.putInt(j.f3348k, jVar.f3354c);
                bundle4.putByteArray(j.f3349l, jVar.d);
                bundle4.putInt(j.f3350m, jVar.f3355e);
                bundle4.putInt(j.f3351n, jVar.f3356f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f3619r0, sVar.J);
            bundle2.putInt(s.f3620s0, sVar.K);
            bundle2.putInt(s.f3621t0, sVar.L);
            bundle2.putInt(s.f3622u0, sVar.M);
            bundle2.putInt(s.f3623v0, sVar.N);
            bundle2.putInt(s.f3624w0, sVar.O);
            bundle2.putInt(s.f3626y0, sVar.Q);
            bundle2.putInt(s.f3627z0, sVar.R);
            bundle2.putInt(s.f3625x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3413f, arrayList);
        bundle.putString(f3414g, this.f3416b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f3416b.equals(l1Var.f3416b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3418e == 0) {
            this.f3418e = Arrays.hashCode(this.d) + a1.g.h(527, 31, this.f3416b);
        }
        return this.f3418e;
    }

    public final String toString() {
        return this.f3416b + ": " + Arrays.toString(this.d);
    }
}
