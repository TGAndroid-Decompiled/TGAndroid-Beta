package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f1599i;
    public static final String f1600j;
    public static final String f1601k;
    public static final String f1602l;
    public static final String f1603m;
    public static final String f1604n;
    public static final String f1605o;
    public static final String f1606p;
    public static final String f1607q;
    public static final String f1608r;
    public final int f1609a;
    public final int f1610b;
    public final Uri[] f1611c;
    public final k0[] d;
    public final int[] e;
    public final long[] f1612f;
    public final String[] f1613g;

    static {
        String str = e2.d0.f7188a;
        h = Integer.toString(0, 36);
        f1599i = Integer.toString(1, 36);
        f1600j = Integer.toString(2, 36);
        f1601k = Integer.toString(3, 36);
        f1602l = Integer.toString(4, 36);
        f1603m = Integer.toString(5, 36);
        f1604n = Integer.toString(6, 36);
        f1605o = Integer.toString(7, 36);
        f1606p = Integer.toString(8, 36);
        f1607q = Integer.toString(9, 36);
        f1608r = Integer.toString(10, 36);
    }

    public a(int i10, int i11, int[] iArr, k0[] k0VarArr, long[] jArr, String[] strArr) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == k0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f1609a = i10;
        this.f1610b = i11;
        this.e = iArr;
        this.d = k0VarArr;
        this.f1612f = jArr;
        this.f1611c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f1611c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f1771b;
                    f0Var.getClass();
                    uri = f0Var.f1686a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f1613g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1609a == aVar.f1609a && this.f1610b == aVar.f1610b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f1612f, aVar.f1612f) && Arrays.equals(this.f1613g, aVar.f1613g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.e);
        return (((((Arrays.hashCode(this.f1612f) + ((hashCode2 + ((hashCode + (((((this.f1609a * 31) + this.f1610b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f1613g)) * 31;
    }
}
