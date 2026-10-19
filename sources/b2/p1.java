package b2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.u6;
public final class p1 {
    public static final String f3900f;
    public static final String f3901g;
    public final int f3902a;
    public final String f3903b;
    public final int f3904c;
    public final w[] d;
    public int e;

    static {
        String str = e2.m0.f8254a;
        f3900f = Integer.toString(0, 36);
        f3901g = Integer.toString(1, 36);
    }

    public p1(String str, w... wVarArr) {
        boolean z10;
        int h;
        if (wVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.f3903b = str;
        this.d = wVarArr;
        this.f3902a = wVarArr.length;
        String str2 = wVarArr[0].f4130s;
        if (TextUtils.isEmpty(str2)) {
            h = v0.h(wVarArr[0].f4129r);
        } else {
            h = v0.h(str2);
        }
        this.f3904c = h;
        String str3 = wVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i10 = wVarArr[0].f4118f | 16384;
        for (int i11 = 1; i11 < wVarArr.length; i11++) {
            String str4 = wVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i11, wVarArr[0].d, wVarArr[i11].d);
                return;
            } else if (i10 != (wVarArr[i11].f4118f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(wVarArr[0].f4118f), Integer.toBinaryString(wVarArr[i11].f4118f));
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

    public final int a(w wVar) {
        int i10 = 0;
        while (true) {
            w[] wVarArr = this.d;
            if (i10 < wVarArr.length) {
                if (wVar == wVarArr[i10]) {
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
        w[] wVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(wVarArr.length);
        int length = wVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            w wVar = wVarArr[i10];
            List list = wVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(w.W, wVar.f4115a);
            bundle2.putString(w.X, wVar.f4116b);
            String str = w.B0;
            e9.n0 n0Var = wVar.f4117c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                Bundle bundle3 = new Bundle();
                w[] wVarArr2 = wVarArr;
                String str2 = a0Var.f3689a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(a0.f3688c, str2);
                }
                bundle3.putString(a0.d, a0Var.f3690b);
                arrayList2.add(bundle3);
                wVarArr = wVarArr2;
                length = i12;
            }
            w[] wVarArr3 = wVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(w.Y, wVar.d);
            bundle2.putInt(w.Z, wVar.e);
            bundle2.putInt(w.f4090a0, wVar.f4118f);
            int i14 = wVar.f4119g;
            if (i14 != w.V.f4119g) {
                bundle2.putInt(w.C0, i14);
            }
            bundle2.putInt(w.f4091b0, wVar.h);
            bundle2.putInt(w.f4092c0, wVar.f4120i);
            bundle2.putString(w.f4093d0, wVar.f4122k);
            String str3 = wVar.f4124m;
            if (str3 != null) {
                bundle2.putString(w.G0, str3);
            }
            bundle2.putString(w.f4094e0, wVar.f4129r);
            bundle2.putString(w.f4095f0, wVar.f4130s);
            bundle2.putInt(w.f4096g0, wVar.f4131t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(w.f4097h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(w.f4098i0, wVar.f4133w);
            bundle2.putLong(w.f4099j0, wVar.f4134x);
            bundle2.putInt(w.f4100k0, wVar.f4136z);
            bundle2.putInt(w.f4101l0, wVar.A);
            bundle2.putInt(w.E0, wVar.B);
            bundle2.putInt(w.F0, wVar.C);
            bundle2.putFloat(w.m0, wVar.D);
            bundle2.putInt(w.f4102n0, wVar.E);
            bundle2.putFloat(w.f4103o0, wVar.F);
            bundle2.putByteArray(w.f4104p0, wVar.G);
            bundle2.putInt(w.f4105q0, wVar.H);
            n nVar = wVar.I;
            if (nVar != null) {
                String str4 = w.f4106r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(n.f3838i, nVar.f3844a);
                bundle4.putInt(n.f3839j, nVar.f3845b);
                bundle4.putInt(n.f3840k, nVar.f3846c);
                bundle4.putByteArray(n.f3841l, nVar.d);
                bundle4.putInt(n.f3842m, nVar.e);
                bundle4.putInt(n.f3843n, nVar.f3847f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(w.D0, wVar.J);
            bundle2.putInt(w.f4107s0, wVar.K);
            bundle2.putInt(w.f4108t0, wVar.L);
            bundle2.putInt(w.f4109u0, wVar.M);
            bundle2.putInt(w.f4110v0, wVar.N);
            bundle2.putInt(w.f4111w0, wVar.O);
            bundle2.putInt(w.f4112x0, wVar.P);
            bundle2.putInt(w.f4114z0, wVar.R);
            bundle2.putInt(w.A0, wVar.S);
            bundle2.putInt(w.f4113y0, wVar.T);
            arrayList.add(bundle2);
            i10++;
            wVarArr = wVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3900f, arrayList);
        bundle.putString(f3901g, this.f3903b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f3903b.equals(p1Var.f3903b) && Arrays.equals(this.d, p1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.g(527, 31, this.f3903b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f3903b + ": " + Arrays.toString(this.d);
    }
}
