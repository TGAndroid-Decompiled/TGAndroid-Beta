package b2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class l1 {
    public static final String f1782f;
    public static final String f1783g;
    public final int f1784a;
    public final String f1785b;
    public final int f1786c;
    public final s[] d;
    public int e;

    static {
        String str = e2.d0.f7188a;
        f1782f = Integer.toString(0, 36);
        f1783g = Integer.toString(1, 36);
    }

    public l1(String str, s... sVarArr) {
        boolean z10;
        if (sVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f1785b = str;
        this.d = sVarArr;
        this.f1784a = sVarArr.length;
        int h = r0.h(sVarArr[0].f2002r);
        this.f1786c = h == -1 ? r0.h(sVarArr[0].f2001q) : h;
        String str2 = sVarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = sVarArr[0].f1991f | 16384;
        for (int i11 = 1; i11 < sVarArr.length; i11++) {
            String str3 = sVarArr[i11].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, sVarArr[0].d, sVarArr[i11].d);
                return;
            } else if (i10 != (sVarArr[i11].f1991f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(sVarArr[0].f1991f), Integer.toBinaryString(sVarArr[i11].f1991f));
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
            List list = sVar.f2005u;
            Bundle bundle2 = new Bundle();
            bundle2.putString(s.V, sVar.f1988a);
            bundle2.putString(s.W, sVar.f1989b);
            String str = s.A0;
            e9.i0 i0Var = sVar.f1990c;
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
                String str2 = wVar.f2034a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(w.f2033c, str2);
                }
                bundle3.putString(w.d, wVar.f2035b);
                arrayList2.add(bundle3);
                sVarArr = sVarArr2;
                length = i12;
            }
            s[] sVarArr3 = sVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(s.X, sVar.d);
            bundle2.putInt(s.Y, sVar.e);
            bundle2.putInt(s.Z, sVar.f1991f);
            int i14 = sVar.f1992g;
            if (i14 != s.U.f1992g) {
                bundle2.putInt(s.B0, i14);
            }
            bundle2.putInt(s.f1963a0, sVar.h);
            bundle2.putInt(s.f1964b0, sVar.f1993i);
            bundle2.putString(s.f1965c0, sVar.f1995k);
            bundle2.putString(s.f1966d0, sVar.f2001q);
            bundle2.putString(s.f1967e0, sVar.f2002r);
            bundle2.putInt(s.f1968f0, sVar.f2003s);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(s.f1969g0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(s.f1970h0, sVar.v);
            bundle2.putLong(s.f1971i0, sVar.f2006w);
            bundle2.putInt(s.f1972j0, sVar.f2008y);
            bundle2.putInt(s.f1973k0, sVar.f2009z);
            bundle2.putInt(s.D0, sVar.A);
            bundle2.putInt(s.E0, sVar.B);
            bundle2.putFloat(s.f1974l0, sVar.C);
            bundle2.putInt(s.m0, sVar.D);
            bundle2.putFloat(s.f1975n0, sVar.E);
            bundle2.putByteArray(s.f1976o0, sVar.F);
            bundle2.putInt(s.f1977p0, sVar.G);
            j jVar = sVar.H;
            if (jVar != null) {
                String str3 = s.f1978q0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(j.f1720i, jVar.f1726a);
                bundle4.putInt(j.f1721j, jVar.f1727b);
                bundle4.putInt(j.f1722k, jVar.f1728c);
                bundle4.putByteArray(j.f1723l, jVar.d);
                bundle4.putInt(j.f1724m, jVar.e);
                bundle4.putInt(j.f1725n, jVar.f1729f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(s.C0, sVar.I);
            bundle2.putInt(s.f1979r0, sVar.J);
            bundle2.putInt(s.f1980s0, sVar.K);
            bundle2.putInt(s.f1981t0, sVar.L);
            bundle2.putInt(s.f1982u0, sVar.M);
            bundle2.putInt(s.f1983v0, sVar.N);
            bundle2.putInt(s.f1984w0, sVar.O);
            bundle2.putInt(s.f1986y0, sVar.Q);
            bundle2.putInt(s.f1987z0, sVar.R);
            bundle2.putInt(s.f1985x0, sVar.S);
            arrayList.add(bundle2);
            i10++;
            sVarArr = sVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f1782f, arrayList);
        bundle.putString(f1783g, this.f1785b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1.class == obj.getClass()) {
            l1 l1Var = (l1) obj;
            if (this.f1785b.equals(l1Var.f1785b) && Arrays.equals(this.d, l1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a4.a.h(527, 31, this.f1785b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f1785b + ": " + Arrays.toString(this.d);
    }
}
