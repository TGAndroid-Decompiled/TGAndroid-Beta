package e2;

import a8.ia;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class m1 {
    public static final String f10376f;
    public static final String f10377g;
    public final int f10378a;
    public final String f10379b;
    public final int f10380c;
    public final u[] d;
    public int f10381e;

    static {
        String str = h2.m0.f14114a;
        f10376f = Integer.toString(0, 36);
        f10377g = Integer.toString(1, 36);
    }

    public m1(String str, u... uVarArr) {
        boolean z9;
        int h;
        if (uVarArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.f10379b = str;
        this.d = uVarArr;
        this.f10378a = uVarArr.length;
        String str2 = uVarArr[0].f10620s;
        if (TextUtils.isEmpty(str2)) {
            h = s0.h(uVarArr[0].f10619r);
        } else {
            h = s0.h(str2);
        }
        this.f10380c = h;
        String str3 = uVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i7 = uVarArr[0].f10608f | 16384;
        for (int i10 = 1; i10 < uVarArr.length; i10++) {
            String str4 = uVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i10, uVarArr[0].d, uVarArr[i10].d);
                return;
            } else if (i7 != (uVarArr[i10].f10608f | 16384)) {
                b("role flags", i10, Integer.toBinaryString(uVarArr[0].f10608f), Integer.toBinaryString(uVarArr[i10].f10608f));
                return;
            }
        }
    }

    public static void b(String str, int i7, String str2, String str3) {
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        n10.append(str3);
        n10.append("' (track ");
        n10.append(i7);
        n10.append(")");
        h2.a.d("TrackGroup", "", new IllegalStateException(n10.toString()));
    }

    public final int a(u uVar) {
        int i7 = 0;
        while (true) {
            u[] uVarArr = this.d;
            if (i7 < uVarArr.length) {
                if (uVar == uVarArr[i7]) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        u[] uVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(uVarArr.length);
        int length = uVarArr.length;
        int i7 = 0;
        while (i7 < length) {
            u uVar = uVarArr[i7];
            List list = uVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(u.W, uVar.f10604a);
            bundle2.putString(u.X, uVar.f10605b);
            String str = u.B0;
            h9.i0 i0Var = uVar.f10606c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                x xVar = (x) obj;
                xVar.getClass();
                Bundle bundle3 = new Bundle();
                u[] uVarArr2 = uVarArr;
                String str2 = xVar.f10647a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(x.f10646c, str2);
                }
                bundle3.putString(x.d, xVar.f10648b);
                arrayList2.add(bundle3);
                uVarArr = uVarArr2;
                length = i11;
            }
            u[] uVarArr3 = uVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(u.Y, uVar.d);
            bundle2.putInt(u.Z, uVar.f10607e);
            bundle2.putInt(u.f10579a0, uVar.f10608f);
            int i13 = uVar.f10609g;
            if (i13 != u.V.f10609g) {
                bundle2.putInt(u.C0, i13);
            }
            bundle2.putInt(u.f10580b0, uVar.h);
            bundle2.putInt(u.f10581c0, uVar.f10610i);
            bundle2.putString(u.f10582d0, uVar.f10612k);
            String str3 = uVar.f10614m;
            if (str3 != null) {
                bundle2.putString(u.G0, str3);
            }
            bundle2.putString(u.f10583e0, uVar.f10619r);
            bundle2.putString(u.f10584f0, uVar.f10620s);
            bundle2.putInt(u.f10585g0, uVar.f10621t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(u.f10586h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(u.f10587i0, uVar.f10623w);
            bundle2.putLong(u.f10588j0, uVar.f10624x);
            bundle2.putInt(u.f10589k0, uVar.f10626z);
            bundle2.putInt(u.f10590l0, uVar.A);
            bundle2.putInt(u.E0, uVar.B);
            bundle2.putInt(u.F0, uVar.C);
            bundle2.putFloat(u.m0, uVar.D);
            bundle2.putInt(u.f10591n0, uVar.E);
            bundle2.putFloat(u.f10592o0, uVar.F);
            bundle2.putByteArray(u.f10593p0, uVar.G);
            bundle2.putInt(u.f10594q0, uVar.H);
            m mVar = uVar.I;
            if (mVar != null) {
                String str4 = u.f10595r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(m.f10362i, mVar.f10368a);
                bundle4.putInt(m.f10363j, mVar.f10369b);
                bundle4.putInt(m.f10364k, mVar.f10370c);
                bundle4.putByteArray(m.f10365l, mVar.d);
                bundle4.putInt(m.f10366m, mVar.f10371e);
                bundle4.putInt(m.f10367n, mVar.f10372f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(u.D0, uVar.J);
            bundle2.putInt(u.f10596s0, uVar.K);
            bundle2.putInt(u.f10597t0, uVar.L);
            bundle2.putInt(u.f10598u0, uVar.M);
            bundle2.putInt(u.f10599v0, uVar.N);
            bundle2.putInt(u.f10600w0, uVar.O);
            bundle2.putInt(u.f10601x0, uVar.P);
            bundle2.putInt(u.f10603z0, uVar.R);
            bundle2.putInt(u.A0, uVar.S);
            bundle2.putInt(u.f10602y0, uVar.T);
            arrayList.add(bundle2);
            i7++;
            uVarArr = uVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f10376f, arrayList);
        bundle.putString(f10377g, this.f10379b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10379b.equals(m1Var.f10379b) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10381e == 0) {
            this.f10381e = Arrays.hashCode(this.d) + com.google.android.recaptcha.internal.a.h(527, 31, this.f10379b);
        }
        return this.f10381e;
    }

    public final String toString() {
        return this.f10379b + ": " + Arrays.toString(this.d);
    }
}
