package e2;

import a8.ma;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class m1 {
    public static final String f10515f;
    public static final String f10516g;
    public final int f10517a;
    public final String f10518b;
    public final int f10519c;
    public final u[] d;
    public int f10520e;

    static {
        String str = h2.l0.f13778a;
        f10515f = Integer.toString(0, 36);
        f10516g = Integer.toString(1, 36);
    }

    public m1(String str, u... uVarArr) {
        boolean z10;
        int h;
        if (uVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        this.f10518b = str;
        this.d = uVarArr;
        this.f10517a = uVarArr.length;
        String str2 = uVarArr[0].f10759s;
        if (TextUtils.isEmpty(str2)) {
            h = s0.h(uVarArr[0].f10758r);
        } else {
            h = s0.h(str2);
        }
        this.f10519c = h;
        String str3 = uVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i7 = uVarArr[0].f10747f | 16384;
        for (int i10 = 1; i10 < uVarArr.length; i10++) {
            String str4 = uVarArr[i10].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i10, uVarArr[0].d, uVarArr[i10].d);
                return;
            } else if (i7 != (uVarArr[i10].f10747f | 16384)) {
                b("role flags", i10, Integer.toBinaryString(uVarArr[0].f10747f), Integer.toBinaryString(uVarArr[i10].f10747f));
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
            bundle2.putString(u.W, uVar.f10743a);
            bundle2.putString(u.X, uVar.f10744b);
            String str = u.B0;
            h9.i0 i0Var = uVar.f10745c;
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
                String str2 = xVar.f10786a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(x.f10785c, str2);
                }
                bundle3.putString(x.d, xVar.f10787b);
                arrayList2.add(bundle3);
                uVarArr = uVarArr2;
                length = i11;
            }
            u[] uVarArr3 = uVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(u.Y, uVar.d);
            bundle2.putInt(u.Z, uVar.f10746e);
            bundle2.putInt(u.f10718a0, uVar.f10747f);
            int i13 = uVar.f10748g;
            if (i13 != u.V.f10748g) {
                bundle2.putInt(u.C0, i13);
            }
            bundle2.putInt(u.f10719b0, uVar.h);
            bundle2.putInt(u.f10720c0, uVar.f10749i);
            bundle2.putString(u.f10721d0, uVar.f10751k);
            String str3 = uVar.f10753m;
            if (str3 != null) {
                bundle2.putString(u.G0, str3);
            }
            bundle2.putString(u.f10722e0, uVar.f10758r);
            bundle2.putString(u.f10723f0, uVar.f10759s);
            bundle2.putInt(u.f10724g0, uVar.f10760t);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(u.f10725h0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(u.f10726i0, uVar.f10762w);
            bundle2.putLong(u.f10727j0, uVar.f10763x);
            bundle2.putInt(u.f10728k0, uVar.f10765z);
            bundle2.putInt(u.f10729l0, uVar.A);
            bundle2.putInt(u.E0, uVar.B);
            bundle2.putInt(u.F0, uVar.C);
            bundle2.putFloat(u.m0, uVar.D);
            bundle2.putInt(u.f10730n0, uVar.E);
            bundle2.putFloat(u.f10731o0, uVar.F);
            bundle2.putByteArray(u.f10732p0, uVar.G);
            bundle2.putInt(u.f10733q0, uVar.H);
            m mVar = uVar.I;
            if (mVar != null) {
                String str4 = u.f10734r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(m.f10501i, mVar.f10507a);
                bundle4.putInt(m.f10502j, mVar.f10508b);
                bundle4.putInt(m.f10503k, mVar.f10509c);
                bundle4.putByteArray(m.f10504l, mVar.d);
                bundle4.putInt(m.f10505m, mVar.f10510e);
                bundle4.putInt(m.f10506n, mVar.f10511f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(u.D0, uVar.J);
            bundle2.putInt(u.f10735s0, uVar.K);
            bundle2.putInt(u.f10736t0, uVar.L);
            bundle2.putInt(u.f10737u0, uVar.M);
            bundle2.putInt(u.f10738v0, uVar.N);
            bundle2.putInt(u.f10739w0, uVar.O);
            bundle2.putInt(u.f10740x0, uVar.P);
            bundle2.putInt(u.f10742z0, uVar.R);
            bundle2.putInt(u.A0, uVar.S);
            bundle2.putInt(u.f10741y0, uVar.T);
            arrayList.add(bundle2);
            i7++;
            uVarArr = uVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f10515f, arrayList);
        bundle.putString(f10516g, this.f10518b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f10518b.equals(m1Var.f10518b) && Arrays.equals(this.d, m1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10520e == 0) {
            this.f10520e = Arrays.hashCode(this.d) + e2.h(527, 31, this.f10518b);
        }
        return this.f10520e;
    }

    public final String toString() {
        return this.f10518b + ": " + Arrays.toString(this.d);
    }
}
