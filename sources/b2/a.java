package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f3671i;
    public static final String f3672j;
    public static final String f3673k;
    public static final String f3674l;
    public static final String f3675m;
    public static final String f3676n;
    public static final String f3677o;
    public static final String f3678p;
    public static final String f3679q;
    public static final String f3680r;
    public static final String f3681s;
    public static final String f3682t;
    public final int f3683a;
    public final int f3684b;
    public final Uri[] f3685c;
    public final o0[] d;
    public final int[] e;
    public final long[] f3686f;
    public final String[] f3687g;
    public final b[] h;

    static {
        String str = e2.m0.f8254a;
        f3671i = Integer.toString(0, 36);
        f3672j = Integer.toString(1, 36);
        f3673k = Integer.toString(2, 36);
        f3674l = Integer.toString(3, 36);
        f3675m = Integer.toString(4, 36);
        f3676n = Integer.toString(5, 36);
        f3677o = Integer.toString(6, 36);
        f3678p = Integer.toString(7, 36);
        f3679q = Integer.toString(8, 36);
        f3680r = Integer.toString(9, 36);
        f3681s = Integer.toString(10, 36);
        f3682t = Integer.toString(11, 36);
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
        this.f3683a = i10;
        this.f3684b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f3686f = jArr;
        this.f3685c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3685c;
            if (i12 < uriArr.length) {
                o0 o0Var = o0VarArr[i12];
                if (o0Var == null) {
                    uri = null;
                } else {
                    j0 j0Var = o0Var.f3889b;
                    j0Var.getClass();
                    uri = j0Var.f3799a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3687g = strArr;
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
            if (this.f3683a == aVar.f3683a && this.f3684b == aVar.f3684b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3686f, aVar.f3686f) && Arrays.equals(this.f3687g, aVar.f3687g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f3686f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3683a * 31) + this.f3684b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3687g)) * 31)) * 31;
    }
}
