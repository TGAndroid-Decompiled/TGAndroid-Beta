package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.u6;
public final class f1 {
    public static final String f2127j;
    public static final String f2128k;
    public static final String f2129l;
    public static final String f2130m;
    public static final String f2131n;
    public static final String f2132o;
    public static final String f2133p;
    public final Object f2134a;
    public final int f2135b;
    public final p0 f2136c;
    public final Object d;
    public final int e;
    public final long f2137f;
    public final long f2138g;
    public final int h;
    public final int f2139i;

    static {
        String str = e2.m0.f8372a;
        f2127j = Integer.toString(0, 36);
        f2128k = Integer.toString(1, 36);
        f2129l = Integer.toString(2, 36);
        f2130m = Integer.toString(3, 36);
        f2131n = Integer.toString(4, 36);
        f2132o = Integer.toString(5, 36);
        f2133p = Integer.toString(6, 36);
    }

    public f1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(i11 >= 0);
        this.f2134a = obj;
        this.f2135b = i10;
        this.f2136c = p0Var;
        this.d = obj2;
        this.e = i11;
        this.f2137f = j10;
        this.f2138g = j11;
        this.h = i12;
        this.f2139i = i13;
    }

    public final boolean a(f1 f1Var) {
        if (this.f2135b == f1Var.f2135b && this.e == f1Var.e && this.f2137f == f1Var.f2137f && this.f2138g == f1Var.f2138g && this.h == f1Var.h && this.f2139i == f1Var.f2139i && Objects.equals(this.f2136c, f1Var.f2136c)) {
            return true;
        }
        return false;
    }

    public final f1 b(boolean z10, boolean z11) {
        int i10;
        p0 p0Var;
        long j10;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f2135b;
        } else {
            i10 = 0;
        }
        if (z10) {
            p0Var = this.f2136c;
        } else {
            p0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f2137f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f2138g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f2139i;
        }
        return new f1(this.f2134a, i10, p0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2135b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2127j, i11);
        }
        p0 p0Var = this.f2136c;
        if (p0Var != null) {
            bundle.putBundle(f2128k, p0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2129l, i12);
        }
        long j10 = this.f2137f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2130m, j10);
        }
        long j11 = this.f2138g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f2131n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2132o, i13);
        }
        int i14 = this.f2139i;
        if (i14 != -1) {
            bundle.putInt(f2133p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (a(f1Var) && Objects.equals(this.f2134a, f1Var.f2134a) && Objects.equals(this.d, f1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2134a, Integer.valueOf(this.f2135b), this.f2136c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2137f), Long.valueOf(this.f2138g), Integer.valueOf(this.h), Integer.valueOf(this.f2139i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2135b + ", period=" + this.e + ", pos=" + this.f2137f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = t8.b.i(str, ", contentPos=");
        i11.append(this.f2138g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f2139i);
        return i11.toString();
    }
}
