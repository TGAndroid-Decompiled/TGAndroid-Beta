package e2;

import a8.ja;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f9978i;
    public static final String f9979j;
    public static final String f9980k;
    public static final String f9981l;
    public static final String f9982m;
    public static final String f9983n;
    public static final String f9984o;
    public static final String f9985p;
    public static final String f9986q;
    public static final String f9987r;
    public static final String f9988s;
    public static final String f9989t;
    public final int f9990a;
    public final int f9991b;
    public final Uri[] f9992c;
    public final l0[] d;
    public final int[] f9993e;
    public final long[] f9994f;
    public final String[] f9995g;
    public final b[] h;

    static {
        String str = h2.l0.f13471a;
        f9978i = Integer.toString(0, 36);
        f9979j = Integer.toString(1, 36);
        f9980k = Integer.toString(2, 36);
        f9981l = Integer.toString(3, 36);
        f9982m = Integer.toString(4, 36);
        f9983n = Integer.toString(5, 36);
        f9984o = Integer.toString(6, 36);
        f9985p = Integer.toString(7, 36);
        f9986q = Integer.toString(8, 36);
        f9987r = Integer.toString(9, 36);
        f9988s = Integer.toString(10, 36);
        f9989t = Integer.toString(11, 36);
    }

    public a(int i7, int i10, int[] iArr, l0[] l0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z10;
        Uri uri;
        int i11 = 0;
        if (iArr.length == l0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ja.f(iArr.length == bVarArr.length);
        this.f9990a = i7;
        this.f9991b = i10;
        this.f9993e = iArr;
        this.d = l0VarArr;
        this.f9994f = jArr;
        this.f9992c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f9992c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10186b;
                    g0Var.getClass();
                    uri = g0Var.f10095a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f9995g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f9993e;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9990a == aVar.f9990a && this.f9991b == aVar.f9991b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f9993e, aVar.f9993e) && Arrays.equals(this.f9994f, aVar.f9994f) && Arrays.equals(this.f9995g, aVar.f9995g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f9993e);
        int hashCode3 = Arrays.hashCode(this.f9994f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f9990a * 31) + this.f9991b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f9995g)) * 31)) * 31;
    }
}
