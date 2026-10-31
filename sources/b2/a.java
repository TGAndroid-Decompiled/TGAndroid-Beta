package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.t6;
public final class a {
    public static final String f1960i;
    public static final String f1961j;
    public static final String f1962k;
    public static final String f1963l;
    public static final String f1964m;
    public static final String f1965n;
    public static final String f1966o;
    public static final String f1967p;
    public static final String f1968q;
    public static final String f1969r;
    public static final String f1970s;
    public static final String f1971t;
    public final int f1972a;
    public final int f1973b;
    public final Uri[] f1974c;
    public final p0[] d;
    public final int[] e;
    public final long[] f1975f;
    public final String[] f1976g;
    public final b[] h;

    static {
        String str = e2.l0.f6165a;
        f1960i = Integer.toString(0, 36);
        f1961j = Integer.toString(1, 36);
        f1962k = Integer.toString(2, 36);
        f1963l = Integer.toString(3, 36);
        f1964m = Integer.toString(4, 36);
        f1965n = Integer.toString(5, 36);
        f1966o = Integer.toString(6, 36);
        f1967p = Integer.toString(7, 36);
        f1968q = Integer.toString(8, 36);
        f1969r = Integer.toString(9, 36);
        f1970s = Integer.toString(10, 36);
        f1971t = Integer.toString(11, 36);
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
        t6.f(z10);
        t6.f(iArr.length == bVarArr.length);
        this.f1972a = i10;
        this.f1973b = i11;
        this.e = iArr;
        this.d = p0VarArr;
        this.f1975f = jArr;
        this.f1974c = new Uri[p0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1974c;
            if (i12 < uriArr.length) {
                p0 p0Var = p0VarArr[i12];
                if (p0Var == null) {
                    uri = null;
                } else {
                    k0 k0Var = p0Var.f2182b;
                    k0Var.getClass();
                    uri = k0Var.f2091a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f1976g = strArr;
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
            if (this.f1972a == aVar.f1972a && this.f1973b == aVar.f1973b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f1975f, aVar.f1975f) && Arrays.equals(this.f1976g, aVar.f1976g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f1975f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f1972a * 31) + this.f1973b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f1976g)) * 31)) * 31;
    }
}
