package b2;

import android.net.Uri;
import java.util.Arrays;
public final class a {
    public static final String h;
    public static final String f3129i;
    public static final String f3130j;
    public static final String f3131k;
    public static final String f3132l;
    public static final String f3133m;
    public static final String f3134n;
    public static final String f3135o;
    public static final String f3136p;
    public static final String f3137q;
    public static final String f3138r;
    public final int f3139a;
    public final int f3140b;
    public final Uri[] f3141c;
    public final k0[] d;
    public final int[] f3142e;
    public final long[] f3143f;
    public final String[] f3144g;

    static {
        String str = e2.d0.f8538a;
        h = Integer.toString(0, 36);
        f3129i = Integer.toString(1, 36);
        f3130j = Integer.toString(2, 36);
        f3131k = Integer.toString(3, 36);
        f3132l = Integer.toString(4, 36);
        f3133m = Integer.toString(5, 36);
        f3134n = Integer.toString(6, 36);
        f3135o = Integer.toString(7, 36);
        f3136p = Integer.toString(8, 36);
        f3137q = Integer.toString(9, 36);
        f3138r = Integer.toString(10, 36);
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
        this.f3139a = i10;
        this.f3140b = i11;
        this.f3142e = iArr;
        this.d = k0VarArr;
        this.f3143f = jArr;
        this.f3141c = new Uri[k0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3141c;
            if (i12 < uriArr.length) {
                k0 k0Var = k0VarArr[i12];
                if (k0Var == null) {
                    uri = null;
                } else {
                    f0 f0Var = k0Var.f3321b;
                    f0Var.getClass();
                    uri = f0Var.f3226a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3144g = strArr;
                return;
            }
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f3142e;
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
            if (this.f3139a == aVar.f3139a && this.f3140b == aVar.f3140b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f3142e, aVar.f3142e) && Arrays.equals(this.f3143f, aVar.f3143f) && Arrays.equals(this.f3144g, aVar.f3144g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.f3142e);
        return (((((Arrays.hashCode(this.f3143f) + ((hashCode2 + ((hashCode + (((((this.f3139a * 31) + this.f3140b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3144g)) * 31;
    }
}
