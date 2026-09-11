package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f1935i;
    public static final String f1936j;
    public static final String f1937k;
    public static final String f1938l;
    public static final String f1939m;
    public static final String f1940n;
    public static final String f1941o;
    public static final String f1942p;
    public static final String f1943q;
    public static final String f1944r;
    public final int f1945a;
    public final int f1946b;
    public final Uri[] f1947c;
    public final k0[] d;
    public final int[] f1948e;
    public final long[] f1949f;
    public final String[] f1950g;

    static {
        String str = e2.d0.f8737a;
        h = Integer.toString(0, 36);
        f1935i = Integer.toString(1, 36);
        f1936j = Integer.toString(2, 36);
        f1937k = Integer.toString(3, 36);
        f1938l = Integer.toString(4, 36);
        f1939m = Integer.toString(5, 36);
        f1940n = Integer.toString(6, 36);
        f1941o = Integer.toString(7, 36);
        f1942p = Integer.toString(8, 36);
        f1943q = Integer.toString(9, 36);
        f1944r = Integer.toString(10, 36);
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
        this.f1945a = i10;
        this.f1946b = i11;
        this.f1948e = iArr;
        this.d = k0VarArr;
        this.f1949f = jArr;
        this.f1947c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1947c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f2127b;
                    f0Var.getClass();
                    uri = f0Var.f2032a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f1950g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1948e;
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
            if (this.f1945a == aVar.f1945a && this.f1946b == aVar.f1946b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f1948e, aVar.f1948e) && Arrays.equals(this.f1949f, aVar.f1949f) && Arrays.equals(this.f1950g, aVar.f1950g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f1948e);
        return (((((Arrays.hashCode(this.f1949f) + ((hashCode2 + ((hashCode + (((((this.f1945a * 31) + this.f1946b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f1950g)) * 31;
    }
}
