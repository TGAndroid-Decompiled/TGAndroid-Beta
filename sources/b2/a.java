package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f2901i;
    public static final String f2902j;
    public static final String f2903k;
    public static final String f2904l;
    public static final String f2905m;
    public static final String f2906n;
    public static final String f2907o;
    public static final String f2908p;
    public static final String f2909q;
    public static final String f2910r;
    public final int f2911a;
    public final int f2912b;
    public final Uri[] f2913c;
    public final k0[] d;
    public final int[] e;
    public final long[] f2914f;
    public final String[] f2915g;

    static {
        String str = e2.d0.f7883a;
        h = Integer.toString(0, 36);
        f2901i = Integer.toString(1, 36);
        f2902j = Integer.toString(2, 36);
        f2903k = Integer.toString(3, 36);
        f2904l = Integer.toString(4, 36);
        f2905m = Integer.toString(5, 36);
        f2906n = Integer.toString(6, 36);
        f2907o = Integer.toString(7, 36);
        f2908p = Integer.toString(8, 36);
        f2909q = Integer.toString(9, 36);
        f2910r = Integer.toString(10, 36);
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
        this.f2911a = i10;
        this.f2912b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f2914f = jArr;
        this.f2913c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2913c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3073b;
                    f0Var.getClass();
                    uri = f0Var.f2988a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2915g = strArr;
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
            if (this.f2911a == aVar.f2911a && this.f2912b == aVar.f2912b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2914f, aVar.f2914f) && Arrays.equals(this.f2915g, aVar.f2915g)) {
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
        return (((((Arrays.hashCode(this.f2914f) + ((hashCode2 + ((hashCode + (((((this.f2911a * 31) + this.f2912b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2915g)) * 31;
    }
}
