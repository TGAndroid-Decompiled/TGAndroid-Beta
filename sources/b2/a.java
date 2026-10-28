package b2;

import a8.yb;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f3122i;
    public static final String f3123j;
    public static final String f3124k;
    public static final String f3125l;
    public static final String f3126m;
    public static final String f3127n;
    public static final String f3128o;
    public static final String f3129p;
    public static final String f3130q;
    public static final String f3131r;
    public static final String f3132s;
    public static final String f3133t;
    public final int f3134a;
    public final int f3135b;
    public final Uri[] f3136c;
    public final p0[] d;
    public final int[] e;
    public final long[] f3137f;
    public final String[] f3138g;
    public final b[] h;

    static {
        String str = e2.n0.f9691a;
        f3122i = Integer.toString(0, 36);
        f3123j = Integer.toString(1, 36);
        f3124k = Integer.toString(2, 36);
        f3125l = Integer.toString(3, 36);
        f3126m = Integer.toString(4, 36);
        f3127n = Integer.toString(5, 36);
        f3128o = Integer.toString(6, 36);
        f3129p = Integer.toString(7, 36);
        f3130q = Integer.toString(8, 36);
        f3131r = Integer.toString(9, 36);
        f3132s = Integer.toString(10, 36);
        f3133t = Integer.toString(11, 36);
    }

    public a(int i10, int i11, int[] iArr, p0[] p0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == p0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        yb.g(iArr.length == bVarArr.length);
        this.f3134a = i10;
        this.f3135b = i11;
        this.e = iArr;
        this.d = p0VarArr;
        this.f3137f = jArr;
        this.f3136c = new Uri[p0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3136c;
            if (i12 < uriArr.length) {
                p0 p0Var = p0VarArr[i12];
                if (p0Var == null) {
                    uri = null;
                } else {
                    k0 k0Var = p0Var.f3345b;
                    k0Var.getClass();
                    uri = k0Var.f3255a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3138g = strArr;
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
            if (this.f3134a == aVar.f3134a && this.f3135b == aVar.f3135b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3137f, aVar.f3137f) && Arrays.equals(this.f3138g, aVar.f3138g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f3137f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3134a * 31) + this.f3135b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3138g)) * 31)) * 31;
    }
}
