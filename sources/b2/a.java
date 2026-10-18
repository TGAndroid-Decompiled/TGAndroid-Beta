package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f3673i;
    public static final String f3674j;
    public static final String f3675k;
    public static final String f3676l;
    public static final String f3677m;
    public static final String f3678n;
    public static final String f3679o;
    public static final String f3680p;
    public static final String f3681q;
    public static final String f3682r;
    public static final String f3683s;
    public static final String f3684t;
    public final int f3685a;
    public final int f3686b;
    public final Uri[] f3687c;
    public final o0[] d;
    public final int[] e;
    public final long[] f3688f;
    public final String[] f3689g;
    public final b[] h;

    static {
        String str = e2.m0.f8255a;
        f3673i = Integer.toString(0, 36);
        f3674j = Integer.toString(1, 36);
        f3675k = Integer.toString(2, 36);
        f3676l = Integer.toString(3, 36);
        f3677m = Integer.toString(4, 36);
        f3678n = Integer.toString(5, 36);
        f3679o = Integer.toString(6, 36);
        f3680p = Integer.toString(7, 36);
        f3681q = Integer.toString(8, 36);
        f3682r = Integer.toString(9, 36);
        f3683s = Integer.toString(10, 36);
        f3684t = Integer.toString(11, 36);
    }

    public a(int i10, int i11, int[] iArr, o0[] o0VarArr, long[] jArr, String[] strArr, b[] bVarArr) {
        boolean z10;
        Uri uri;
        int i12 = 0;
        if (iArr.length == o0VarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(iArr.length == bVarArr.length);
        this.f3685a = i10;
        this.f3686b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f3688f = jArr;
        this.f3687c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3687c;
            if (i12 < uriArr.length) {
                o0 o0Var = o0VarArr[i12];
                if (o0Var == null) {
                    uri = null;
                } else {
                    j0 j0Var = o0Var.f3891b;
                    j0Var.getClass();
                    uri = j0Var.f3801a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3689g = strArr;
                this.h = bVarArr;
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
            if (this.f3685a == aVar.f3685a && this.f3686b == aVar.f3686b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3688f, aVar.f3688f) && Arrays.equals(this.f3689g, aVar.f3689g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f3688f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3685a * 31) + this.f3686b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3689g)) * 31)) * 31;
    }
}
