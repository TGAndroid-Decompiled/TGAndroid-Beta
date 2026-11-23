package e2;

import a8.ma;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10288i;
    public static final String f10289j;
    public static final String f10290k;
    public static final String f10291l;
    public static final String f10292m;
    public static final String f10293n;
    public static final String f10294o;
    public static final String f10295p;
    public static final String f10296q;
    public static final String f10297r;
    public static final String f10298s;
    public static final String f10299t;
    public final int f10300a;
    public final int f10301b;
    public final Uri[] f10302c;
    public final l0[] d;
    public final int[] f10303e;
    public final long[] f10304f;
    public final String[] f10305g;
    public final b[] h;

    static {
        String str = h2.l0.f13778a;
        f10288i = Integer.toString(0, 36);
        f10289j = Integer.toString(1, 36);
        f10290k = Integer.toString(2, 36);
        f10291l = Integer.toString(3, 36);
        f10292m = Integer.toString(4, 36);
        f10293n = Integer.toString(5, 36);
        f10294o = Integer.toString(6, 36);
        f10295p = Integer.toString(7, 36);
        f10296q = Integer.toString(8, 36);
        f10297r = Integer.toString(9, 36);
        f10298s = Integer.toString(10, 36);
        f10299t = Integer.toString(11, 36);
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
        ma.f(z10);
        ma.f(iArr.length == bVarArr.length);
        this.f10300a = i7;
        this.f10301b = i10;
        this.f10303e = iArr;
        this.d = l0VarArr;
        this.f10304f = jArr;
        this.f10302c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10302c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10496b;
                    g0Var.getClass();
                    uri = g0Var.f10405a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10305g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10303e;
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
            if (this.f10300a == aVar.f10300a && this.f10301b == aVar.f10301b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10303e, aVar.f10303e) && Arrays.equals(this.f10304f, aVar.f10304f) && Arrays.equals(this.f10305g, aVar.f10305g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10303e);
        int hashCode3 = Arrays.hashCode(this.f10304f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10300a * 31) + this.f10301b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10305g)) * 31)) * 31;
    }
}
