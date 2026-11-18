package e2;

import a8.la;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10296i;
    public static final String f10297j;
    public static final String f10298k;
    public static final String f10299l;
    public static final String f10300m;
    public static final String f10301n;
    public static final String f10302o;
    public static final String f10303p;
    public static final String f10304q;
    public static final String f10305r;
    public static final String f10306s;
    public static final String f10307t;
    public final int f10308a;
    public final int f10309b;
    public final Uri[] f10310c;
    public final l0[] d;
    public final int[] f10311e;
    public final long[] f10312f;
    public final String[] f10313g;
    public final b[] h;

    static {
        String str = h2.l0.f13786a;
        f10296i = Integer.toString(0, 36);
        f10297j = Integer.toString(1, 36);
        f10298k = Integer.toString(2, 36);
        f10299l = Integer.toString(3, 36);
        f10300m = Integer.toString(4, 36);
        f10301n = Integer.toString(5, 36);
        f10302o = Integer.toString(6, 36);
        f10303p = Integer.toString(7, 36);
        f10304q = Integer.toString(8, 36);
        f10305r = Integer.toString(9, 36);
        f10306s = Integer.toString(10, 36);
        f10307t = Integer.toString(11, 36);
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
        this.f10308a = i7;
        this.f10309b = i10;
        this.f10311e = iArr;
        this.d = l0VarArr;
        this.f10312f = jArr;
        this.f10310c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10310c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10504b;
                    g0Var.getClass();
                    uri = g0Var.f10413a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10313g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10311e;
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
            if (this.f10308a == aVar.f10308a && this.f10309b == aVar.f10309b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10311e, aVar.f10311e) && Arrays.equals(this.f10312f, aVar.f10312f) && Arrays.equals(this.f10313g, aVar.f10313g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10311e);
        int hashCode3 = Arrays.hashCode(this.f10312f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10308a * 31) + this.f10309b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10313g)) * 31)) * 31;
    }
}
