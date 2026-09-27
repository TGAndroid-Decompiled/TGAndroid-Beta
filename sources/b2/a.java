package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f2900i;
    public static final String f2901j;
    public static final String f2902k;
    public static final String f2903l;
    public static final String f2904m;
    public static final String f2905n;
    public static final String f2906o;
    public static final String f2907p;
    public static final String f2908q;
    public static final String f2909r;
    public final int f2910a;
    public final int f2911b;
    public final Uri[] f2912c;
    public final k0[] d;
    public final int[] e;
    public final long[] f2913f;
    public final String[] f2914g;

    static {
        String str = e2.d0.f7872a;
        h = Integer.toString(0, 36);
        f2900i = Integer.toString(1, 36);
        f2901j = Integer.toString(2, 36);
        f2902k = Integer.toString(3, 36);
        f2903l = Integer.toString(4, 36);
        f2904m = Integer.toString(5, 36);
        f2905n = Integer.toString(6, 36);
        f2906o = Integer.toString(7, 36);
        f2907p = Integer.toString(8, 36);
        f2908q = Integer.toString(9, 36);
        f2909r = Integer.toString(10, 36);
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
        this.f2910a = i10;
        this.f2911b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f2913f = jArr;
        this.f2912c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2912c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3072b;
                    f0Var.getClass();
                    uri = f0Var.f2987a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2914g = strArr;
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
            if (this.f2910a == aVar.f2910a && this.f2911b == aVar.f2911b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2913f, aVar.f2913f) && Arrays.equals(this.f2914g, aVar.f2914g)) {
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
        return (((((Arrays.hashCode(this.f2913f) + ((hashCode2 + ((hashCode + (((((this.f2910a * 31) + this.f2911b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2914g)) * 31;
    }
}
