package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f2059i;
    public static final String f2060j;
    public static final String f2061k;
    public static final String f2062l;
    public static final String f2063m;
    public static final String f2064n;
    public static final String f2065o;
    public static final String f2066p;
    public static final String f2067q;
    public static final String f2068r;
    public static final String f2069s;
    public static final String f2070t;
    public final int f2071a;
    public final int f2072b;
    public final Uri[] f2073c;
    public final p0[] d;
    public final int[] e;
    public final long[] f2074f;
    public final String[] f2075g;
    public final b[] h;

    static {
        String str = e2.m0.f8375a;
        f2059i = Integer.toString(0, 36);
        f2060j = Integer.toString(1, 36);
        f2061k = Integer.toString(2, 36);
        f2062l = Integer.toString(3, 36);
        f2063m = Integer.toString(4, 36);
        f2064n = Integer.toString(5, 36);
        f2065o = Integer.toString(6, 36);
        f2066p = Integer.toString(7, 36);
        f2067q = Integer.toString(8, 36);
        f2068r = Integer.toString(9, 36);
        f2069s = Integer.toString(10, 36);
        f2070t = Integer.toString(11, 36);
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
        u6.g(z10);
        u6.g(iArr.length == bVarArr.length);
        this.f2071a = i10;
        this.f2072b = i11;
        this.e = iArr;
        this.d = p0VarArr;
        this.f2074f = jArr;
        this.f2073c = new Uri[p0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f2073c;
            if (i12 < uriArr.length) {
                p0 p0Var = p0VarArr[i12];
                if (p0Var == null) {
                    uri = null;
                } else {
                    k0 k0Var = p0Var.f2282b;
                    k0Var.getClass();
                    uri = k0Var.f2192a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f2075g = strArr;
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
            if (this.f2071a == aVar.f2071a && this.f2072b == aVar.f2072b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f2074f, aVar.f2074f) && Arrays.equals(this.f2075g, aVar.f2075g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f2074f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f2071a * 31) + this.f2072b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f2075g)) * 31)) * 31;
    }
}
