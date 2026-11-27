package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class cg8 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final ft6 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = gcc.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public cg8(Object obj, int i, ft6 ft6Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        yve.f(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = ft6Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean a(cg8 cg8Var) {
        if (this.b == cg8Var.b && this.e == cg8Var.e && this.f == cg8Var.f && this.g == cg8Var.g && this.h == cg8Var.h && this.i == cg8Var.i && Objects.equals(this.c, cg8Var.c)) {
            return true;
        }
        return false;
    }

    public final cg8 b(boolean z, boolean z2) {
        int i;
        ft6 ft6Var;
        long j2;
        long j3;
        int i2;
        int i3;
        if (z && z2) {
            return this;
        }
        int i4 = 0;
        if (z2) {
            i = this.b;
        } else {
            i = 0;
        }
        if (z) {
            ft6Var = this.c;
        } else {
            ft6Var = null;
        }
        if (z2) {
            i4 = this.e;
        }
        int i5 = i4;
        if (z) {
            long j4 = this.f;
            long j5 = this.g;
            i2 = this.h;
            i3 = this.i;
            j3 = j5;
            j2 = j4;
        } else {
            j2 = 0;
            j3 = 0;
            i2 = -1;
            i3 = -1;
        }
        return new cg8(this.a, i, ft6Var, this.d, i5, j2, j3, i2, i3);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        ft6 ft6Var = this.c;
        if (ft6Var != null) {
            bundle.putBundle(k, ft6Var.b(i, false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cg8.class == obj.getClass()) {
            cg8 cg8Var = (cg8) obj;
            if (a(cg8Var) && Objects.equals(this.a, cg8Var.a) && Objects.equals(this.d, cg8Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder l2 = c00.l(str, ", contentPos=");
        l2.append(this.g);
        l2.append(", adGroup=");
        l2.append(i);
        l2.append(", ad=");
        l2.append(this.i);
        return l2.toString();
    }
}
