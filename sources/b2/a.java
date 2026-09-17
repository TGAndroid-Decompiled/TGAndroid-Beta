package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f1962i;
    public static final String f1963j;
    public static final String f1964k;
    public static final String f1965l;
    public static final String f1966m;
    public static final String f1967n;
    public static final String f1968o;
    public static final String f1969p;
    public static final String f1970q;
    public static final String f1971r;
    public final int f1972a;
    public final int f1973b;
    public final Uri[] f1974c;
    public final k0[] d;
    public final int[] f1975e;
    public final long[] f1976f;
    public final String[] f1977g;

    static {
        String str = e2.d0.f8765a;
        h = Integer.toString(0, 36);
        f1962i = Integer.toString(1, 36);
        f1963j = Integer.toString(2, 36);
        f1964k = Integer.toString(3, 36);
        f1965l = Integer.toString(4, 36);
        f1966m = Integer.toString(5, 36);
        f1967n = Integer.toString(6, 36);
        f1968o = Integer.toString(7, 36);
        f1969p = Integer.toString(8, 36);
        f1970q = Integer.toString(9, 36);
        f1971r = Integer.toString(10, 36);
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
        this.f1972a = i10;
        this.f1973b = i11;
        this.f1975e = iArr;
        this.d = k0VarArr;
        this.f1976f = jArr;
        this.f1974c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1974c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f2154b;
                    f0Var.getClass();
                    uri = f0Var.f2059a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f1977g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1975e;
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
            if (this.f1972a == aVar.f1972a && this.f1973b == aVar.f1973b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f1975e, aVar.f1975e) && Arrays.equals(this.f1976f, aVar.f1976f) && Arrays.equals(this.f1977g, aVar.f1977g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f1975e);
        return (((((Arrays.hashCode(this.f1976f) + ((hashCode2 + ((hashCode + (((((this.f1972a * 31) + this.f1973b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f1977g)) * 31;
    }
}
