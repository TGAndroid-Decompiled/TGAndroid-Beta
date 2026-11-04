package d2;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b8.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class o1 {
    public static final String f8250f;
    public static final String f8251g;
    public final int f8252a;
    public final String f8253b;
    public final int f8254c;
    public final v[] d;
    public int f8255e;

    static {
        String str = g2.n0.f11873a;
        f8250f = Integer.toString(0, 36);
        f8251g = Integer.toString(1, 36);
    }

    public o1(String str, v... vVarArr) {
        boolean z10;
        int h;
        if (vVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f8253b = str;
        this.d = vVarArr;
        this.f8252a = vVarArr.length;
        String str2 = vVarArr[0].f8489s;
        if (TextUtils.isEmpty(str2)) {
            h = u0.h(vVarArr[0].f8488r);
        } else {
            h = u0.h(str2);
        }
        this.f8254c = h;
        String str3 = vVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i3 = vVarArr[0].f8477f | 16384;
        for (int i10 = 1; i10 < vVarArr.length; i10++) {
            String str4 = vVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i10, vVarArr[0].d, vVarArr[i10].d);
                return;
            } else if (i3 != (vVarArr[i10].f8477f | 16384)) {
                b("role flags", i10, Integer.toBinaryString(vVarArr[0].f8477f), Integer.toBinaryString(vVarArr[i10].f8477f));
                return;
            }
        }
    }

    public static void b(String str, int i3, String str2, String str3) {
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        n4.append(str3);
        n4.append("' (track ");
        n4.append(i3);
        n4.append(")");
        g2.a.d("TrackGroup", "", new IllegalStateException(n4.toString()));
    }

    public final int a(v vVar) {
        int i3 = 0;
        while (true) {
            v[] vVarArr = this.d;
            if (i3 < vVarArr.length) {
                if (vVar == vVarArr[i3]) {
                    return i3;
                }
                i3++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        v[] vVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(vVarArr.length);
        int length = vVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            v vVar = vVarArr[i3];
            List list = vVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(v.W, vVar.f8473a);
            bundle2.putString(v.X, vVar.f8474b);
            String str = v.B0;
            g9.i0 i0Var = vVar.f8475c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                z zVar = (z) obj;
                zVar.getClass();
                Bundle bundle3 = new Bundle();
                v[] vVarArr2 = vVarArr;
                String str2 = zVar.f8522a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(z.f8521c, str2);
                }
                bundle3.putString(z.d, zVar.f8523b);
                arrayList2.add(bundle3);
                vVarArr = vVarArr2;
                length = i11;
            }
            v[] vVarArr3 = vVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(v.Y, vVar.d);
            bundle2.putInt(v.Z, vVar.f8476e);
            bundle2.putInt(v.f8448a0, vVar.f8477f);
            int i13 = vVar.f8478g;
            if (i13 != v.V.f8478g) {
                bundle2.putInt(v.C0, i13);
            }
            bundle2.putInt(v.f8449b0, vVar.h);
            bundle2.putInt(v.f8450c0, vVar.f8479i);
            bundle2.putString(v.f8451d0, vVar.f8481k);
            String str3 = vVar.f8483m;
            if (str3 != null) {
                bundle2.putString(v.G0, str3);
            }
            bundle2.putString(v.f8452e0, vVar.f8488r);
            bundle2.putString(v.f8453f0, vVar.f8489s);
            bundle2.putInt(v.f8454g0, vVar.f8490t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(v.f8455h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(v.f8456i0, vVar.f8492w);
            bundle2.putLong(v.f8457j0, vVar.f8493x);
            bundle2.putInt(v.f8458k0, vVar.f8495z);
            bundle2.putInt(v.f8459l0, vVar.A);
            bundle2.putInt(v.E0, vVar.B);
            bundle2.putInt(v.F0, vVar.C);
            bundle2.putFloat(v.m0, vVar.D);
            bundle2.putInt(v.f8460n0, vVar.E);
            bundle2.putFloat(v.f8461o0, vVar.F);
            bundle2.putByteArray(v.f8462p0, vVar.G);
            bundle2.putInt(v.f8463q0, vVar.H);
            n nVar = vVar.I;
            if (nVar != null) {
                String str4 = v.f8464r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(n.f8222i, nVar.f8228a);
                bundle4.putInt(n.f8223j, nVar.f8229b);
                bundle4.putInt(n.f8224k, nVar.f8230c);
                bundle4.putByteArray(n.f8225l, nVar.d);
                bundle4.putInt(n.f8226m, nVar.f8231e);
                bundle4.putInt(n.f8227n, nVar.f8232f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(v.D0, vVar.J);
            bundle2.putInt(v.f8465s0, vVar.K);
            bundle2.putInt(v.f8466t0, vVar.L);
            bundle2.putInt(v.f8467u0, vVar.M);
            bundle2.putInt(v.f8468v0, vVar.N);
            bundle2.putInt(v.f8469w0, vVar.O);
            bundle2.putInt(v.f8470x0, vVar.P);
            bundle2.putInt(v.f8472z0, vVar.R);
            bundle2.putInt(v.A0, vVar.S);
            bundle2.putInt(v.f8471y0, vVar.T);
            arrayList.add(bundle2);
            i3++;
            vVarArr = vVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f8250f, arrayList);
        bundle.putString(f8251g, this.f8253b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f8253b.equals(o1Var.f8253b) && Arrays.equals(this.d, o1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8255e == 0) {
            this.f8255e = Arrays.hashCode(this.d) + com.google.android.recaptcha.internal.a.g(527, 31, this.f8253b);
        }
        return this.f8255e;
    }

    public final String toString() {
        return this.f8253b + ": " + Arrays.toString(this.d);
    }
}
