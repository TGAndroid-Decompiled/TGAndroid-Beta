package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f3676i;
    public static final String f3677j;
    public static final String f3678k;
    public static final String f3679l;
    public static final String f3680m;
    public static final String f3681n;
    public static final String f3682o;
    public static final String f3683p;
    public static final String f3684q;
    public static final String f3685r;
    public static final String f3686s;
    public static final String f3687t;
    public final int f3688a;
    public final int f3689b;
    public final Uri[] f3690c;
    public final o0[] d;
    public final int[] e;
    public final long[] f3691f;
    public final String[] f3692g;
    public final b[] h;

    static {
        String str = e2.m0.f8259a;
        f3676i = Integer.toString(0, 36);
        f3677j = Integer.toString(1, 36);
        f3678k = Integer.toString(2, 36);
        f3679l = Integer.toString(3, 36);
        f3680m = Integer.toString(4, 36);
        f3681n = Integer.toString(5, 36);
        f3682o = Integer.toString(6, 36);
        f3683p = Integer.toString(7, 36);
        f3684q = Integer.toString(8, 36);
        f3685r = Integer.toString(9, 36);
        f3686s = Integer.toString(10, 36);
        f3687t = Integer.toString(11, 36);
    }

    public a(int i10, int i11, int[] iArr, o0[] o0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == o0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(iArr.length == bVarArr.length);
        this.f3688a = i10;
        this.f3689b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f3691f = jArr;
        this.f3690c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3690c;
            if (i12 < uriArr.length) {
                o0 o0Var = o0VarArr[i12];
                if (o0Var == null) {
                    uri = null;
                } else {
                    j0 j0Var = o0Var.f3894b;
                    j0Var.getClass();
                    uri = j0Var.f3804a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3692g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3688a == aVar.f3688a && this.f3689b == aVar.f3689b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3691f, aVar.f3691f) && Arrays.equals(this.f3692g, aVar.f3692g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.e);
        int hashCode3 = Arrays.hashCode(this.f3691f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3688a * 31) + this.f3689b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3692g)) * 31)) * 31;
    }
}
