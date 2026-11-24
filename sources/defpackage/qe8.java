package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class qe8 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final bt6 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = hac.a;
        j = "0";
        k = "1";
        l = "2";
        m = "3";
        n = "4";
        o = "5";
        p = "6";
    }

    public qe8(Object obj, int i, bt6 bt6Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        jte.f(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = bt6Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean a(qe8 qe8Var) {
        if (this.b == qe8Var.b && this.e == qe8Var.e && this.f == qe8Var.f && this.g == qe8Var.g && this.h == qe8Var.h && this.i == qe8Var.i && Objects.equals(this.c, qe8Var.c)) {
            return true;
        }
        return false;
    }

    public final qe8 b(boolean z, boolean z2) {
        int i;
        bt6 bt6Var;
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
            bt6Var = this.c;
        } else {
            bt6Var = null;
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
        return new qe8(this.a, i, bt6Var, this.d, i5, j2, j3, i2, i3);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        bt6 bt6Var = this.c;
        if (bt6Var != null) {
            bundle.putBundle(k, bt6Var.b(i, false));
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
        if (obj != null && qe8.class == obj.getClass()) {
            qe8 qe8Var = (qe8) obj;
            if (a(qe8Var) && Objects.equals(this.a, qe8Var.a) && Objects.equals(this.d, qe8Var.d)) {
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
        StringBuilder k2 = b10.k(str, ", contentPos=");
        k2.append(this.g);
        k2.append(", adGroup=");
        k2.append(i);
        k2.append(", ad=");
        k2.append(this.i);
        return k2.toString();
    }
}
