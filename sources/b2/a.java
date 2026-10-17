package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f3672i;
    public static final String f3673j;
    public static final String f3674k;
    public static final String f3675l;
    public static final String f3676m;
    public static final String f3677n;
    public static final String f3678o;
    public static final String f3679p;
    public static final String f3680q;
    public static final String f3681r;
    public static final String f3682s;
    public static final String f3683t;
    public final int f3684a;
    public final int f3685b;
    public final Uri[] f3686c;
    public final o0[] d;
    public final int[] e;
    public final long[] f3687f;
    public final String[] f3688g;
    public final b[] h;

    static {
        String str = e2.m0.f8254a;
        f3672i = Integer.toString(0, 36);
        f3673j = Integer.toString(1, 36);
        f3674k = Integer.toString(2, 36);
        f3675l = Integer.toString(3, 36);
        f3676m = Integer.toString(4, 36);
        f3677n = Integer.toString(5, 36);
        f3678o = Integer.toString(6, 36);
        f3679p = Integer.toString(7, 36);
        f3680q = Integer.toString(8, 36);
        f3681r = Integer.toString(9, 36);
        f3682s = Integer.toString(10, 36);
        f3683t = Integer.toString(11, 36);
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
        this.f3684a = i10;
        this.f3685b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f3687f = jArr;
        this.f3686c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3686c;
            if (i12 < uriArr.length) {
                o0 o0Var = o0VarArr[i12];
                if (o0Var == null) {
                    uri = null;
                } else {
                    j0 j0Var = o0Var.f3890b;
                    j0Var.getClass();
                    uri = j0Var.f3800a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3688g = strArr;
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
            if (this.f3684a == aVar.f3684a && this.f3685b == aVar.f3685b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3687f, aVar.f3687f) && Arrays.equals(this.f3688g, aVar.f3688g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f3687f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3684a * 31) + this.f3685b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3688g)) * 31)) * 31;
    }
}
