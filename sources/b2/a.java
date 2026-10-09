package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f3208i;
    public static final String f3209j;
    public static final String f3210k;
    public static final String f3211l;
    public static final String f3212m;
    public static final String f3213n;
    public static final String f3214o;
    public static final String f3215p;
    public static final String f3216q;
    public static final String f3217r;
    public final int f3218a;
    public final int f3219b;
    public final Uri[] f3220c;
    public final k0[] d;
    public final int[] f3221e;
    public final long[] f3222f;
    public final String[] f3223g;

    static {
        String str = e2.d0.f8532a;
        h = Integer.toString(0, 36);
        f3208i = Integer.toString(1, 36);
        f3209j = Integer.toString(2, 36);
        f3210k = Integer.toString(3, 36);
        f3211l = Integer.toString(4, 36);
        f3212m = Integer.toString(5, 36);
        f3213n = Integer.toString(6, 36);
        f3214o = Integer.toString(7, 36);
        f3215p = Integer.toString(8, 36);
        f3216q = Integer.toString(9, 36);
        f3217r = Integer.toString(10, 36);
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
        this.f3218a = i10;
        this.f3219b = i11;
        this.f3221e = iArr;
        this.d = k0VarArr;
        this.f3222f = jArr;
        this.f3220c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3220c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3400b;
                    f0Var.getClass();
                    uri = f0Var.f3305a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3223g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f3221e;
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
            if (this.f3218a == aVar.f3218a && this.f3219b == aVar.f3219b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f3221e, aVar.f3221e) && Arrays.equals(this.f3222f, aVar.f3222f) && Arrays.equals(this.f3223g, aVar.f3223g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f3221e);
        return (((((Arrays.hashCode(this.f3222f) + ((hashCode2 + ((hashCode + (((((this.f3218a * 31) + this.f3219b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3223g)) * 31;
    }
}
