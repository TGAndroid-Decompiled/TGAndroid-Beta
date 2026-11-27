package defpackage;

import android.net.Uri;
import java.util.Arrays;
public final class ca {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final int a;
    public final Uri[] b;
    public final ft6[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final da[] g;

    static {
        String str = gcc.a;
        h = "0";
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
        o = "7";
        p = "8";
        q = "9";
        r = "a";
        s = "b";
    }

    public ca(int i2, int[] iArr, ft6[] ft6VarArr, long[] jArr, String[] strArr, da[] daVarArr) {
        boolean z;
        Uri uri;
        int i3 = 0;
        if (iArr.length == ft6VarArr.length) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        yve.f(iArr.length == daVarArr.length);
        this.a = i2;
        this.d = iArr;
        this.c = ft6VarArr;
        this.e = jArr;
        this.b = new Uri[ft6VarArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i3 < uriArr.length) {
                ft6 ft6Var = ft6VarArr[i3];
                if (ft6Var == null) {
                    uri = null;
                } else {
                    bt6 bt6Var = ft6Var.b;
                    bt6Var.getClass();
                    uri = bt6Var.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f = strArr;
                this.g = daVarArr;
                return;
            }
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.d;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ca.class == obj.getClass()) {
            ca caVar = (ca) obj;
            if (this.a == caVar.a && Arrays.equals(this.c, caVar.c) && Arrays.equals(this.d, caVar.d) && Arrays.equals(this.e, caVar.e) && Arrays.equals(this.f, caVar.f) && Arrays.equals(this.g, caVar.g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c);
        int hashCode2 = Arrays.hashCode(this.d);
        int hashCode3 = Arrays.hashCode(this.e);
        return (Arrays.hashCode(this.g) + ((((hashCode3 + ((hashCode2 + ((hashCode + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
