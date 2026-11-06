package e2;

import a8.ia;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class m1 {
    public static final String f10371f;
    public static final String f10372g;
    public final int f10373a;
    public final String f10374b;
    public final int f10375c;
    public final u[] d;
    public int f10376e;

    static {
        String str = h2.m0.f14112a;
        f10371f = Integer.toString(0, 36);
        f10372g = Integer.toString(1, 36);
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
        this.f10374b = str;
        this.d = uVarArr;
        this.f10373a = uVarArr.length;
        String str2 = uVarArr[0].f10615s;
        if (TextUtils.isEmpty(str2)) {
            h = s0.h(uVarArr[0].f10614r);
        } else {
            h = s0.h(str2);
        }
        this.f10375c = h;
        String str3 = uVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i7 = uVarArr[0].f10603f | 16384;
        for (int i10 = 1; i10 < uVarArr.length; i10++) {
            String str4 = uVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i10, uVarArr[0].d, uVarArr[i10].d);
                return;
            } else if (i7 != (uVarArr[i10].f10603f | 16384)) {
                b("role flags", i10, Integer.toBinaryString(uVarArr[0].f10603f), Integer.toBinaryString(uVarArr[i10].f10603f));
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
            bundle2.putString(u.W, uVar.f10599a);
            bundle2.putString(u.X, uVar.f10600b);
            String str = u.B0;
            h9.i0 i0Var = uVar.f10601c;
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
                String str2 = xVar.f10642a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(x.f10641c, str2);
                }
                bundle3.putString(x.d, xVar.f10643b);
                arrayList2.add(bundle3);
                uVarArr = uVarArr2;
                length = i11;
            }
            u[] uVarArr3 = uVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(u.Y, uVar.d);
            bundle2.putInt(u.Z, uVar.f10602e);
            bundle2.putInt(u.f10574a0, uVar.f10603f);
            int i13 = uVar.f10604g;
            if (i13 != u.V.f10604g) {
                bundle2.putInt(u.C0, i13);
            }
            bundle2.putInt(u.f10575b0, uVar.h);
            bundle2.putInt(u.f10576c0, uVar.f10605i);
            bundle2.putString(u.f10577d0, uVar.f10607k);
            String str3 = uVar.f10609m;
            if (str3 != null) {
                bundle2.putString(u.G0, str3);
            }
            bundle2.putString(u.f10578e0, uVar.f10614r);
            bundle2.putString(u.f10579f0, uVar.f10615s);
            bundle2.putInt(u.f10580g0, uVar.f10616t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(u.f10581h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(u.f10582i0, uVar.f10618w);
            bundle2.putLong(u.f10583j0, uVar.f10619x);
            bundle2.putInt(u.f10584k0, uVar.f10621z);
            bundle2.putInt(u.f10585l0, uVar.A);
            bundle2.putInt(u.E0, uVar.B);
            bundle2.putInt(u.F0, uVar.C);
            bundle2.putFloat(u.m0, uVar.D);
            bundle2.putInt(u.f10586n0, uVar.E);
            bundle2.putFloat(u.f10587o0, uVar.F);
            bundle2.putByteArray(u.f10588p0, uVar.G);
            bundle2.putInt(u.f10589q0, uVar.H);
            m mVar = uVar.I;
            if (mVar != null) {
                String str4 = u.f10590r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(m.f10357i, mVar.f10363a);
                bundle4.putInt(m.f10358j, mVar.f10364b);
                bundle4.putInt(m.f10359k, mVar.f10365c);
                bundle4.putByteArray(m.f10360l, mVar.d);
                bundle4.putInt(m.f10361m, mVar.f10366e);
                bundle4.putInt(m.f10362n, mVar.f10367f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(u.D0, uVar.J);
            bundle2.putInt(u.f10591s0, uVar.K);
            bundle2.putInt(u.f10592t0, uVar.L);
            bundle2.putInt(u.f10593u0, uVar.M);
            bundle2.putInt(u.f10594v0, uVar.N);
            bundle2.putInt(u.f10595w0, uVar.O);
            bundle2.putInt(u.f10596x0, uVar.P);
            bundle2.putInt(u.f10598z0, uVar.R);
            bundle2.putInt(u.A0, uVar.S);
            bundle2.putInt(u.f10597y0, uVar.T);
            arrayList.add(bundle2);
            i7++;
            uVarArr = uVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f10371f, arrayList);
        bundle.putString(f10372g, this.f10374b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10374b.equals(m1Var.f10374b) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10376e == 0) {
            this.f10376e = Arrays.hashCode(this.d) + com.google.android.recaptcha.internal.a.h(527, 31, this.f10374b);
        }
        return this.f10376e;
    }

    public final String toString() {
        return this.f10374b + ": " + Arrays.toString(this.d);
    }
}
