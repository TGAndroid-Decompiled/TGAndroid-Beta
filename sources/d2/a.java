package d2;

import android.net.Uri;
import b8.zb;
import java.util.Arrays;
public final class a {
    public static final String f8004i;
    public static final String f8005j;
    public static final String f8006k;
    public static final String f8007l;
    public static final String f8008m;
    public static final String f8009n;
    public static final String f8010o;
    public static final String f8011p;
    public static final String f8012q;
    public static final String f8013r;
    public static final String f8014s;
    public static final String f8015t;
    public final int f8016a;
    public final int f8017b;
    public final Uri[] f8018c;
    public final n0[] d;
    public final int[] f8019e;
    public final long[] f8020f;
    public final String[] f8021g;
    public final b[] h;

    static {
        String str = g2.n0.f11873a;
        f8004i = Integer.toString(0, 36);
        f8005j = Integer.toString(1, 36);
        f8006k = Integer.toString(2, 36);
        f8007l = Integer.toString(3, 36);
        f8008m = Integer.toString(4, 36);
        f8009n = Integer.toString(5, 36);
        f8010o = Integer.toString(6, 36);
        f8011p = Integer.toString(7, 36);
        f8012q = Integer.toString(8, 36);
        f8013r = Integer.toString(9, 36);
        f8014s = Integer.toString(10, 36);
        f8015t = Integer.toString(11, 36);
    }

    public a(int i3, int i10, int[] iArr, n0[] n0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z10;
        Uri uri;
        int i11 = 0;
        if (iArr.length == n0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        zb.f(iArr.length == bVarArr.length);
        this.f8016a = i3;
        this.f8017b = i10;
        this.f8019e = iArr;
        this.d = n0VarArr;
        this.f8020f = jArr;
        this.f8018c = new Uri[n0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f8018c;
            if (i11 < uriArr.length) {
                n0 n0Var = n0VarArr[i11];
                if (n0Var == null) {
                    uri = null;
                } else {
                    i0 i0Var = n0Var.f8241b;
                    i0Var.getClass();
                    uri = i0Var.f8139a;
                }
                uriArr[i11] = uri;
                i11++;
            } else {
                this.f8021g = strArr;
                this.h = bVarArr;
                return;
            }
        }
    }

    public final int a(int i3) {
        int i10;
        int i11 = i3 + 1;
        while (true) {
            int[] iArr = this.f8019e;
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
            if (this.f8016a == aVar.f8016a && this.f8017b == aVar.f8017b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f8019e, aVar.f8019e) && Arrays.equals(this.f8020f, aVar.f8020f) && Arrays.equals(this.f8021g, aVar.f8021g) && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f8019e);
        int hashCode3 = Arrays.hashCode(this.f8020f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f8016a * 31) + this.f8017b) * 31) + i3) * 31)) * 31)) * 31)) * 31) + i3) * 961) + Arrays.hashCode(this.f8021g)) * 31)) * 31;
    }
}
