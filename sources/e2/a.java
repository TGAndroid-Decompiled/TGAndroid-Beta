package e2;

import a8.la;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10293i;
    public static final String f10294j;
    public static final String f10295k;
    public static final String f10296l;
    public static final String f10297m;
    public static final String f10298n;
    public static final String f10299o;
    public static final String f10300p;
    public static final String f10301q;
    public static final String f10302r;
    public static final String f10303s;
    public static final String f10304t;
    public final int f10305a;
    public final int f10306b;
    public final Uri[] f10307c;
    public final l0[] d;
    public final int[] f10308e;
    public final long[] f10309f;
    public final String[] f10310g;
    public final b[] h;

    static {
        String str = h2.l0.f13783a;
        f10293i = Integer.toString(0, 36);
        f10294j = Integer.toString(1, 36);
        f10295k = Integer.toString(2, 36);
        f10296l = Integer.toString(3, 36);
        f10297m = Integer.toString(4, 36);
        f10298n = Integer.toString(5, 36);
        f10299o = Integer.toString(6, 36);
        f10300p = Integer.toString(7, 36);
        f10301q = Integer.toString(8, 36);
        f10302r = Integer.toString(9, 36);
        f10303s = Integer.toString(10, 36);
        f10304t = Integer.toString(11, 36);
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
        this.f10305a = i7;
        this.f10306b = i10;
        this.f10308e = iArr;
        this.d = l0VarArr;
        this.f10309f = jArr;
        this.f10307c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10307c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10501b;
                    g0Var.getClass();
                    uri = g0Var.f10410a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10310g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10308e;
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
            if (this.f10305a == aVar.f10305a && this.f10306b == aVar.f10306b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10308e, aVar.f10308e) && Arrays.equals(this.f10309f, aVar.f10309f) && Arrays.equals(this.f10310g, aVar.f10310g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10308e);
        int hashCode3 = Arrays.hashCode(this.f10309f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10305a * 31) + this.f10306b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10310g)) * 31)) * 31;
    }
}
