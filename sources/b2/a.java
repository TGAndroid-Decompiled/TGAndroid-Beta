package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f3206i;
    public static final String f3207j;
    public static final String f3208k;
    public static final String f3209l;
    public static final String f3210m;
    public static final String f3211n;
    public static final String f3212o;
    public static final String f3213p;
    public static final String f3214q;
    public static final String f3215r;
    public final int f3216a;
    public final int f3217b;
    public final Uri[] f3218c;
    public final k0[] d;
    public final int[] f3219e;
    public final long[] f3220f;
    public final String[] f3221g;

    static {
        String str = e2.d0.f8529a;
        h = Integer.toString(0, 36);
        f3206i = Integer.toString(1, 36);
        f3207j = Integer.toString(2, 36);
        f3208k = Integer.toString(3, 36);
        f3209l = Integer.toString(4, 36);
        f3210m = Integer.toString(5, 36);
        f3211n = Integer.toString(6, 36);
        f3212o = Integer.toString(7, 36);
        f3213p = Integer.toString(8, 36);
        f3214q = Integer.toString(9, 36);
        f3215r = Integer.toString(10, 36);
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
        this.f3216a = i10;
        this.f3217b = i11;
        this.f3219e = iArr;
        this.d = k0VarArr;
        this.f3220f = jArr;
        this.f3218c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3218c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3398b;
                    f0Var.getClass();
                    uri = f0Var.f3303a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3221g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f3219e;
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
            if (this.f3216a == aVar.f3216a && this.f3217b == aVar.f3217b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f3219e, aVar.f3219e) && Arrays.equals(this.f3220f, aVar.f3220f) && Arrays.equals(this.f3221g, aVar.f3221g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f3219e);
        return (((((Arrays.hashCode(this.f3220f) + ((hashCode2 + ((hashCode + (((((this.f3216a * 31) + this.f3217b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3221g)) * 31;
    }
}
