package e2;

import a8.ma;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10286i;
    public static final String f10287j;
    public static final String f10288k;
    public static final String f10289l;
    public static final String f10290m;
    public static final String f10291n;
    public static final String f10292o;
    public static final String f10293p;
    public static final String f10294q;
    public static final String f10295r;
    public static final String f10296s;
    public static final String f10297t;
    public final int f10298a;
    public final int f10299b;
    public final Uri[] f10300c;
    public final l0[] d;
    public final int[] f10301e;
    public final long[] f10302f;
    public final String[] f10303g;
    public final b[] h;

    static {
        String str = h2.l0.f13778a;
        f10286i = Integer.toString(0, 36);
        f10287j = Integer.toString(1, 36);
        f10288k = Integer.toString(2, 36);
        f10289l = Integer.toString(3, 36);
        f10290m = Integer.toString(4, 36);
        f10291n = Integer.toString(5, 36);
        f10292o = Integer.toString(6, 36);
        f10293p = Integer.toString(7, 36);
        f10294q = Integer.toString(8, 36);
        f10295r = Integer.toString(9, 36);
        f10296s = Integer.toString(10, 36);
        f10297t = Integer.toString(11, 36);
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
        this.f10298a = i7;
        this.f10299b = i10;
        this.f10301e = iArr;
        this.d = l0VarArr;
        this.f10302f = jArr;
        this.f10300c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10300c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10494b;
                    g0Var.getClass();
                    uri = g0Var.f10403a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10303g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10301e;
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
            if (this.f10298a == aVar.f10298a && this.f10299b == aVar.f10299b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10301e, aVar.f10301e) && Arrays.equals(this.f10302f, aVar.f10302f) && Arrays.equals(this.f10303g, aVar.f10303g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10301e);
        int hashCode3 = Arrays.hashCode(this.f10302f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10298a * 31) + this.f10299b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10303g)) * 31)) * 31;
    }
}
