package e2;

import a8.la;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10325i;
    public static final String f10326j;
    public static final String f10327k;
    public static final String f10328l;
    public static final String f10329m;
    public static final String f10330n;
    public static final String f10331o;
    public static final String f10332p;
    public static final String f10333q;
    public static final String f10334r;
    public static final String f10335s;
    public static final String f10336t;
    public final int f10337a;
    public final int f10338b;
    public final Uri[] f10339c;
    public final l0[] d;
    public final int[] f10340e;
    public final long[] f10341f;
    public final String[] f10342g;
    public final b[] h;

    static {
        String str = h2.l0.f13815a;
        f10325i = Integer.toString(0, 36);
        f10326j = Integer.toString(1, 36);
        f10327k = Integer.toString(2, 36);
        f10328l = Integer.toString(3, 36);
        f10329m = Integer.toString(4, 36);
        f10330n = Integer.toString(5, 36);
        f10331o = Integer.toString(6, 36);
        f10332p = Integer.toString(7, 36);
        f10333q = Integer.toString(8, 36);
        f10334r = Integer.toString(9, 36);
        f10335s = Integer.toString(10, 36);
        f10336t = Integer.toString(11, 36);
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
        la.f(z10);
        la.f(iArr.length == bVarArr.length);
        this.f10337a = i7;
        this.f10338b = i10;
        this.f10340e = iArr;
        this.d = l0VarArr;
        this.f10341f = jArr;
        this.f10339c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10339c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10533b;
                    g0Var.getClass();
                    uri = g0Var.f10442a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10342g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10340e;
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
            if (this.f10337a == aVar.f10337a && this.f10338b == aVar.f10338b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10340e, aVar.f10340e) && Arrays.equals(this.f10341f, aVar.f10341f) && Arrays.equals(this.f10342g, aVar.f10342g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10340e);
        int hashCode3 = Arrays.hashCode(this.f10341f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10337a * 31) + this.f10338b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10342g)) * 31)) * 31;
    }
}
