package e2;

import a8.ia;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10147i;
    public static final String f10148j;
    public static final String f10149k;
    public static final String f10150l;
    public static final String f10151m;
    public static final String f10152n;
    public static final String f10153o;
    public static final String f10154p;
    public static final String f10155q;
    public static final String f10156r;
    public static final String f10157s;
    public static final String f10158t;
    public final int f10159a;
    public final int f10160b;
    public final Uri[] f10161c;
    public final l0[] d;
    public final int[] f10162e;
    public final long[] f10163f;
    public final String[] f10164g;
    public final b[] h;

    static {
        String str = h2.m0.f14114a;
        f10147i = Integer.toString(0, 36);
        f10148j = Integer.toString(1, 36);
        f10149k = Integer.toString(2, 36);
        f10150l = Integer.toString(3, 36);
        f10151m = Integer.toString(4, 36);
        f10152n = Integer.toString(5, 36);
        f10153o = Integer.toString(6, 36);
        f10154p = Integer.toString(7, 36);
        f10155q = Integer.toString(8, 36);
        f10156r = Integer.toString(9, 36);
        f10157s = Integer.toString(10, 36);
        f10158t = Integer.toString(11, 36);
    }

    public a(int i7, int i10, int[] iArr, l0[] l0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z9;
        Uri uri;
        int i11 = 0;
        if (iArr.length == l0VarArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ia.f(iArr.length == bVarArr.length);
        this.f10159a = i7;
        this.f10160b = i10;
        this.f10162e = iArr;
        this.d = l0VarArr;
        this.f10163f = jArr;
        this.f10161c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10161c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10355b;
                    g0Var.getClass();
                    uri = g0Var.f10264a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10164g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10162e;
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
            if (this.f10159a == aVar.f10159a && this.f10160b == aVar.f10160b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10162e, aVar.f10162e) && Arrays.equals(this.f10163f, aVar.f10163f) && Arrays.equals(this.f10164g, aVar.f10164g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10162e);
        int hashCode3 = Arrays.hashCode(this.f10163f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10159a * 31) + this.f10160b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10164g)) * 31)) * 31;
    }
}
