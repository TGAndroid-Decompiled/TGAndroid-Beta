package b2;

import android.net.Uri;
import java.util.Arrays;
import v7.u6;
public final class a {
    public static final String f3669i;
    public static final String f3670j;
    public static final String f3671k;
    public static final String f3672l;
    public static final String f3673m;
    public static final String f3674n;
    public static final String f3675o;
    public static final String f3676p;
    public static final String f3677q;
    public static final String f3678r;
    public static final String f3679s;
    public static final String f3680t;
    public final int f3681a;
    public final int f3682b;
    public final Uri[] f3683c;
    public final o0[] d;
    public final int[] e;
    public final long[] f3684f;
    public final String[] f3685g;
    public final b[] h;

    static {
        String str = e2.m0.f8252a;
        f3669i = Integer.toString(0, 36);
        f3670j = Integer.toString(1, 36);
        f3671k = Integer.toString(2, 36);
        f3672l = Integer.toString(3, 36);
        f3673m = Integer.toString(4, 36);
        f3674n = Integer.toString(5, 36);
        f3675o = Integer.toString(6, 36);
        f3676p = Integer.toString(7, 36);
        f3677q = Integer.toString(8, 36);
        f3678r = Integer.toString(9, 36);
        f3679s = Integer.toString(10, 36);
        f3680t = Integer.toString(11, 36);
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
        this.f3681a = i10;
        this.f3682b = i11;
        this.e = iArr;
        this.d = o0VarArr;
        this.f3684f = jArr;
        this.f3683c = new Uri[o0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f3683c;
            if (i12 < uriArr.length) {
                o0 o0Var = o0VarArr[i12];
                if (o0Var == null) {
                    uri = null;
                } else {
                    j0 j0Var = o0Var.f3887b;
                    j0Var.getClass();
                    uri = j0Var.f3797a;
                }
                uriArr[i12] = uri;
                i12++;
            } else {
                this.f3685g = strArr;
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
            if (this.f3681a == aVar.f3681a && this.f3682b == aVar.f3682b && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f3684f, aVar.f3684f) && Arrays.equals(this.f3685g, aVar.f3685g) && Arrays.equals(this.h, aVar.h)) {
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
        int hashCode3 = Arrays.hashCode(this.f3684f);
        return (Arrays.hashCode(this.h) + ((((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f3681a * 31) + this.f3682b) * 31) + i10) * 31)) * 31)) * 31)) * 31) + i10) * 961) + Arrays.hashCode(this.f3685g)) * 31)) * 31;
    }
}
