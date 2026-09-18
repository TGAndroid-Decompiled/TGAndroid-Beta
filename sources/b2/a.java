package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f2906i;
    public static final String f2907j;
    public static final String f2908k;
    public static final String f2909l;
    public static final String f2910m;
    public static final String f2911n;
    public static final String f2912o;
    public static final String f2913p;
    public static final String f2914q;
    public static final String f2915r;
    public final int f2916a;
    public final int f2917b;
    public final Uri[] f2918c;
    public final k0[] d;
    public final int[] e;
    public final long[] f2919f;
    public final String[] f2920g;

    static {
        String str = e2.d0.f7887a;
        h = Integer.toString(0, 36);
        f2906i = Integer.toString(1, 36);
        f2907j = Integer.toString(2, 36);
        f2908k = Integer.toString(3, 36);
        f2909l = Integer.toString(4, 36);
        f2910m = Integer.toString(5, 36);
        f2911n = Integer.toString(6, 36);
        f2912o = Integer.toString(7, 36);
        f2913p = Integer.toString(8, 36);
        f2914q = Integer.toString(9, 36);
        f2915r = Integer.toString(10, 36);
    }

    public a(int i10, int i11, int[] iArr, k0[] k0VarArr, long[] jArr, String[] strArr) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == k0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f2916a = i10;
        this.f2917b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f2919f = jArr;
        this.f2918c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2918c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3078b;
                    f0Var.getClass();
                    uri = f0Var.f2993a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2920g = strArr;
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
            if (this.f2916a == aVar.f2916a && this.f2917b == aVar.f2917b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2919f, aVar.f2919f) && Arrays.equals(this.f2920g, aVar.f2920g)) {
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
        return (((((Arrays.hashCode(this.f2919f) + ((hashCode2 + ((hashCode + (((((this.f2916a * 31) + this.f2917b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2920g)) * 31;
    }
}
