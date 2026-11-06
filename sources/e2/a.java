package e2;

import a8.ia;
import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String f10142i;
    public static final String f10143j;
    public static final String f10144k;
    public static final String f10145l;
    public static final String f10146m;
    public static final String f10147n;
    public static final String f10148o;
    public static final String f10149p;
    public static final String f10150q;
    public static final String f10151r;
    public static final String f10152s;
    public static final String f10153t;
    public final int f10154a;
    public final int f10155b;
    public final Uri[] f10156c;
    public final l0[] d;
    public final int[] f10157e;
    public final long[] f10158f;
    public final String[] f10159g;
    public final b[] h;

    static {
        String str = h2.m0.f14112a;
        f10142i = Integer.toString(0, 36);
        f10143j = Integer.toString(1, 36);
        f10144k = Integer.toString(2, 36);
        f10145l = Integer.toString(3, 36);
        f10146m = Integer.toString(4, 36);
        f10147n = Integer.toString(5, 36);
        f10148o = Integer.toString(6, 36);
        f10149p = Integer.toString(7, 36);
        f10150q = Integer.toString(8, 36);
        f10151r = Integer.toString(9, 36);
        f10152s = Integer.toString(10, 36);
        f10153t = Integer.toString(11, 36);
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
        this.f10154a = i7;
        this.f10155b = i10;
        this.f10157e = iArr;
        this.d = l0VarArr;
        this.f10158f = jArr;
        this.f10156c = new Uri[l0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f10156c;
            if (i11 < uriArr.length) {
                l0 l0Var = l0VarArr[i11];
                if (l0Var == null) {
                    uri = null;
                } else {
                    g0 g0Var = l0Var.f10350b;
                    g0Var.getClass();
                    uri = g0Var.f10259a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f10159g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i7) {
        int i10;
        int i11 = i7 + 1;
        while (true) {
            int[] iArr = this.f10157e;
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
            if (this.f10154a == aVar.f10154a && this.f10155b == aVar.f10155b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f10157e, aVar.f10157e) && Arrays.equals(this.f10158f, aVar.f10158f) && Arrays.equals(this.f10159g, aVar.f10159g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f10157e);
        int hashCode3 = Arrays.hashCode(this.f10158f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f10154a * 31) + this.f10155b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 961) + Arrays.hashCode(this.f10159g)) * 31)) * 31;
    }
}
