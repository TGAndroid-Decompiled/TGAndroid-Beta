package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f2905i;
    public static final String f2906j;
    public static final String f2907k;
    public static final String f2908l;
    public static final String f2909m;
    public static final String f2910n;
    public static final String f2911o;
    public static final String f2912p;
    public static final String f2913q;
    public static final String f2914r;
    public final int f2915a;
    public final int f2916b;
    public final Uri[] f2917c;
    public final k0[] d;
    public final int[] e;
    public final long[] f2918f;
    public final String[] f2919g;

    static {
        String str = e2.d0.f7887a;
        h = Integer.toString(0, 36);
        f2905i = Integer.toString(1, 36);
        f2906j = Integer.toString(2, 36);
        f2907k = Integer.toString(3, 36);
        f2908l = Integer.toString(4, 36);
        f2909m = Integer.toString(5, 36);
        f2910n = Integer.toString(6, 36);
        f2911o = Integer.toString(7, 36);
        f2912p = Integer.toString(8, 36);
        f2913q = Integer.toString(9, 36);
        f2914r = Integer.toString(10, 36);
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
        this.f2915a = i10;
        this.f2916b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f2918f = jArr;
        this.f2917c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2917c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3077b;
                    f0Var.getClass();
                    uri = f0Var.f2992a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2919g = strArr;
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
            if (this.f2915a == aVar.f2915a && this.f2916b == aVar.f2916b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2918f, aVar.f2918f) && Arrays.equals(this.f2919g, aVar.f2919g)) {
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
        return (((((Arrays.hashCode(this.f2918f) + ((hashCode2 + ((hashCode + (((((this.f2915a * 31) + this.f2916b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2919g)) * 31;
    }
}
