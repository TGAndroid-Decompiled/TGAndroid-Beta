package b2;

import a8.yb;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class q1 {
    public static final String f3356f;
    public static final String f3357g;
    public final int f3358a;
    public final String f3359b;
    public final int f3360c;
    public final x[] d;
    public int e;

    static {
        String str = e2.n0.f9692a;
        f3356f = Integer.toString(0, 36);
        f3357g = Integer.toString(1, 36);
    }

    public q1(String str, x... xVarArr) {
        boolean z10;
        int h;
        if (xVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f3359b = str;
        this.d = xVarArr;
        this.f3358a = xVarArr.length;
        String str2 = xVarArr[0].f3586s;
        if (TextUtils.isEmpty(str2)) {
            h = w0.h(xVarArr[0].f3585r);
        } else {
            h = w0.h(str2);
        }
        this.f3360c = h;
        String str3 = xVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : "";
        int i10 = xVarArr[0].f3574f | 16384;
        for (int i11 = 1; i11 < xVarArr.length; i11++) {
            String str4 = xVarArr[i11].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : "")) {
                b("languages", i11, xVarArr[0].d, xVarArr[i11].d);
                return;
            } else if (i10 != (xVarArr[i11].f3574f | 16384)) {
                b("role flags", i11, Integer.toBinaryString(xVarArr[0].f3574f), Integer.toBinaryString(xVarArr[i11].f3574f));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder w10 = a1.g.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w10.append(str3);
        w10.append("' (track ");
        w10.append(i10);
        w10.append(")");
        e2.a.d("TrackGroup", "", new IllegalStateException(w10.toString()));
    }

    public final int a(x xVar) {
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.d;
            if (i10 < xVarArr.length) {
                if (xVar == xVarArr[i10]) {
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
        x[] xVarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(xVarArr.length);
        int length = xVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            x xVar = xVarArr[i10];
            List list = xVar.v;
            Bundle bundle2 = new Bundle();
            bundle2.putString(x.W, xVar.f3571a);
            bundle2.putString(x.X, xVar.f3572b);
            String str = x.B0;
            f9.i0 i0Var = xVar.f3573c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = i0Var.get(i11);
                i11++;
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                Bundle bundle3 = new Bundle();
                x[] xVarArr2 = xVarArr;
                String str2 = b0Var.f3144a;
                int i12 = length;
                if (str2 != null) {
                    bundle3.putString(b0.f3143c, str2);
                }
                bundle3.putString(b0.d, b0Var.f3145b);
                arrayList2.add(bundle3);
                xVarArr = xVarArr2;
                length = i12;
            }
            x[] xVarArr3 = xVarArr;
            int i13 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(x.Y, xVar.d);
            bundle2.putInt(x.Z, xVar.e);
            bundle2.putInt(x.f3546a0, xVar.f3574f);
            int i14 = xVar.f3575g;
            if (i14 != x.V.f3575g) {
                bundle2.putInt(x.C0, i14);
            }
            bundle2.putInt(x.f3547b0, xVar.h);
            bundle2.putInt(x.f3548c0, xVar.f3576i);
            bundle2.putString(x.f3549d0, xVar.f3578k);
            String str3 = xVar.f3580m;
            if (str3 != null) {
                bundle2.putString(x.G0, str3);
            }
            bundle2.putString(x.f3550e0, xVar.f3585r);
            bundle2.putString(x.f3551f0, xVar.f3586s);
            bundle2.putInt(x.f3552g0, xVar.f3587t);
            for (int i15 = 0; i15 < list.size(); i15++) {
                bundle2.putByteArray(x.f3553h0 + "_" + Integer.toString(i15, 36), (byte[]) list.get(i15));
            }
            bundle2.putParcelable(x.f3554i0, xVar.f3589w);
            bundle2.putLong(x.f3555j0, xVar.f3590x);
            bundle2.putInt(x.f3556k0, xVar.f3592z);
            bundle2.putInt(x.f3557l0, xVar.A);
            bundle2.putInt(x.E0, xVar.B);
            bundle2.putInt(x.F0, xVar.C);
            bundle2.putFloat(x.m0, xVar.D);
            bundle2.putInt(x.f3558n0, xVar.E);
            bundle2.putFloat(x.f3559o0, xVar.F);
            bundle2.putByteArray(x.f3560p0, xVar.G);
            bundle2.putInt(x.f3561q0, xVar.H);
            o oVar = xVar.I;
            if (oVar != null) {
                String str4 = x.f3562r0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(o.f3294i, oVar.f3300a);
                bundle4.putInt(o.f3295j, oVar.f3301b);
                bundle4.putInt(o.f3296k, oVar.f3302c);
                bundle4.putByteArray(o.f3297l, oVar.d);
                bundle4.putInt(o.f3298m, oVar.e);
                bundle4.putInt(o.f3299n, oVar.f3303f);
                bundle2.putBundle(str4, bundle4);
            }
            bundle2.putInt(x.D0, xVar.J);
            bundle2.putInt(x.f3563s0, xVar.K);
            bundle2.putInt(x.f3564t0, xVar.L);
            bundle2.putInt(x.f3565u0, xVar.M);
            bundle2.putInt(x.f3566v0, xVar.N);
            bundle2.putInt(x.f3567w0, xVar.O);
            bundle2.putInt(x.f3568x0, xVar.P);
            bundle2.putInt(x.f3570z0, xVar.R);
            bundle2.putInt(x.A0, xVar.S);
            bundle2.putInt(x.f3569y0, xVar.T);
            arrayList.add(bundle2);
            i10++;
            xVarArr = xVarArr3;
            length = i13;
        }
        bundle.putParcelableArrayList(f3356f, arrayList);
        bundle.putString(f3357g, this.f3359b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f3359b.equals(q1Var.f3359b) && Arrays.equals(this.d, q1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + a1.g.f(527, 31, this.f3359b);
        }
        return this.e;
    }

    public final String toString() {
        return this.f3359b + ": " + Arrays.toString(this.d);
    }
}
