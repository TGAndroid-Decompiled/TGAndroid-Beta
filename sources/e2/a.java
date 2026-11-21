package e2;

import a8.la;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10322i;
    public static final String f10323j;
    public static final String f10324k;
    public static final String f10325l;
    public static final String f10326m;
    public static final String f10327n;
    public static final String f10328o;
    public static final String f10329p;
    public static final String f10330q;
    public static final String f10331r;
    public static final String f10332s;
    public static final String f10333t;
    public final int f10334a;
    public final int f10335b;
    public final Uri[] f10336c;
    public final l0[] d;
    public final int[] f10337e;
    public final long[] f10338f;
    public final String[] f10339g;
    public final b[] h;

    static {
        String str = h2.l0.f13812a;
        f10322i = Integer.toString(0, 36);
        f10323j = Integer.toString(1, 36);
        f10324k = Integer.toString(2, 36);
        f10325l = Integer.toString(3, 36);
        f10326m = Integer.toString(4, 36);
        f10327n = Integer.toString(5, 36);
        f10328o = Integer.toString(6, 36);
        f10329p = Integer.toString(7, 36);
        f10330q = Integer.toString(8, 36);
        f10331r = Integer.toString(9, 36);
        f10332s = Integer.toString(10, 36);
        f10333t = Integer.toString(11, 36);
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
        this.f10334a = i7;
        this.f10335b = i10;
        this.f10337e = iArr;
        this.d = l0VarArr;
        this.f10338f = jArr;
        this.f10336c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10336c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10530b;
                    g0Var.getClass();
                    uri = g0Var.f10439a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10339g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10337e;
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
            if (this.f10334a == aVar.f10334a && this.f10335b == aVar.f10335b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10337e, aVar.f10337e) && Arrays.equals(this.f10338f, aVar.f10338f) && Arrays.equals(this.f10339g, aVar.f10339g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10337e);
        int hashCode3 = Arrays.hashCode(this.f10338f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10334a * 31) + this.f10335b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10339g)) * 31)) * 31;
    }
}
