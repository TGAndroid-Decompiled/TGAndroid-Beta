package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f2898i;
    public static final String f2899j;
    public static final String f2900k;
    public static final String f2901l;
    public static final String f2902m;
    public static final String f2903n;
    public static final String f2904o;
    public static final String f2905p;
    public static final String f2906q;
    public static final String f2907r;
    public final int f2908a;
    public final int f2909b;
    public final Uri[] f2910c;
    public final k0[] d;
    public final int[] e;
    public final long[] f2911f;
    public final String[] f2912g;

    static {
        String str = e2.d0.f7870a;
        h = Integer.toString(0, 36);
        f2898i = Integer.toString(1, 36);
        f2899j = Integer.toString(2, 36);
        f2900k = Integer.toString(3, 36);
        f2901l = Integer.toString(4, 36);
        f2902m = Integer.toString(5, 36);
        f2903n = Integer.toString(6, 36);
        f2904o = Integer.toString(7, 36);
        f2905p = Integer.toString(8, 36);
        f2906q = Integer.toString(9, 36);
        f2907r = Integer.toString(10, 36);
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
        this.f2908a = i10;
        this.f2909b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f2911f = jArr;
        this.f2910c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2910c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3070b;
                    f0Var.getClass();
                    uri = f0Var.f2985a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2912g = strArr;
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
            if (this.f2908a == aVar.f2908a && this.f2909b == aVar.f2909b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2911f, aVar.f2911f) && Arrays.equals(this.f2912g, aVar.f2912g)) {
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
        return (((((Arrays.hashCode(this.f2911f) + ((hashCode2 + ((hashCode + (((((this.f2908a * 31) + this.f2909b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2912g)) * 31;
    }
}
