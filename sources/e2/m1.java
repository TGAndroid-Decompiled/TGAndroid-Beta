package e2;

import a8.ja;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class m1 {
    public static final String f10207f;
    public static final String f10208g;
    public final int f10209a;
    public final String f10210b;
    public final int f10211c;
    public final u[] d;
    public int f10212e;

    static {
        String str = h2.l0.f13471a;
        f10207f = Integer.toString(0, 36);
        f10208g = Integer.toString(1, 36);
    }

    public m1(String str, u... uVarArr) {
        boolean z10;
        int h;
        if (uVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        this.f10210b = str;
        this.d = uVarArr;
        this.f10209a = uVarArr.length;
        String str2 = uVarArr[0].f10451s;
        if (TextUtils.isEmpty(str2)) {
            h = s0.h(uVarArr[0].f10450r);
        } else {
            h = s0.h(str2);
        }
        this.f10211c = h;
        String str3 = uVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i7 = uVarArr[0].f10439f | 16384;
        for (int i10 = 1; i10 < uVarArr.length; i10++) {
            String str4 = uVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i10, uVarArr[0].d, uVarArr[i10].d);
                return;
            } else if (i7 != (uVarArr[i10].f10439f | 16384)) {
                b("role flags", i10, Integer.toBinaryString(uVarArr[0].f10439f), Integer.toBinaryString(uVarArr[i10].f10439f));
                return;
            }
        }
    }

    public static void b(String str, int i7, String str2, String str3) {
        StringBuilder n10 = e2.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
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
            bundle2.putString(u.W, uVar.f10435a);
            bundle2.putString(u.X, uVar.f10436b);
            String str = u.B0;
            h9.i0 i0Var = uVar.f10437c;
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
                String str2 = xVar.f10478a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(x.f10477c, str2);
                }
                bundle3.putString(x.d, xVar.f10479b);
                arrayList2.add(bundle3);
                uVarArr = uVarArr2;
                length = i11;
            }
            u[] uVarArr3 = uVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(u.Y, uVar.d);
            bundle2.putInt(u.Z, uVar.f10438e);
            bundle2.putInt(u.f10410a0, uVar.f10439f);
            int i13 = uVar.f10440g;
            if (i13 != u.V.f10440g) {
                bundle2.putInt(u.C0, i13);
            }
            bundle2.putInt(u.f10411b0, uVar.h);
            bundle2.putInt(u.f10412c0, uVar.f10441i);
            bundle2.putString(u.f10413d0, uVar.f10443k);
            String str3 = uVar.f10445m;
            if (str3 != null) {
                bundle2.putString(u.G0, str3);
            }
            bundle2.putString(u.f10414e0, uVar.f10450r);
            bundle2.putString(u.f10415f0, uVar.f10451s);
            bundle2.putInt(u.f10416g0, uVar.f10452t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(u.f10417h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(u.f10418i0, uVar.f10454w);
            bundle2.putLong(u.f10419j0, uVar.f10455x);
            bundle2.putInt(u.f10420k0, uVar.f10457z);
            bundle2.putInt(u.f10421l0, uVar.A);
            bundle2.putInt(u.E0, uVar.B);
            bundle2.putInt(u.F0, uVar.C);
            bundle2.putFloat(u.m0, uVar.D);
            bundle2.putInt(u.f10422n0, uVar.E);
            bundle2.putFloat(u.f10423o0, uVar.F);
            bundle2.putByteArray(u.f10424p0, uVar.G);
            bundle2.putInt(u.f10425q0, uVar.H);
            m mVar = uVar.I;
            if (mVar != null) {
                String str4 = u.f10426r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(m.f10193i, mVar.f10199a);
                bundle4.putInt(m.f10194j, mVar.f10200b);
                bundle4.putInt(m.f10195k, mVar.f10201c);
                bundle4.putByteArray(m.f10196l, mVar.d);
                bundle4.putInt(m.f10197m, mVar.f10202e);
                bundle4.putInt(m.f10198n, mVar.f10203f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(u.D0, uVar.J);
            bundle2.putInt(u.f10427s0, uVar.K);
            bundle2.putInt(u.f10428t0, uVar.L);
            bundle2.putInt(u.f10429u0, uVar.M);
            bundle2.putInt(u.f10430v0, uVar.N);
            bundle2.putInt(u.f10431w0, uVar.O);
            bundle2.putInt(u.f10432x0, uVar.P);
            bundle2.putInt(u.f10434z0, uVar.R);
            bundle2.putInt(u.A0, uVar.S);
            bundle2.putInt(u.f10433y0, uVar.T);
            arrayList.add(bundle2);
            i7++;
            uVarArr = uVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f10207f, arrayList);
        bundle.putString(f10208g, this.f10210b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10210b.equals(m1Var.f10210b) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10212e == 0) {
            this.f10212e = Arrays.hashCode(this.d) + e2.h(527, 31, this.f10210b);
        }
        return this.f10212e;
    }

    public final String toString() {
        return this.f10210b + ": " + Arrays.toString(this.d);
    }
}
