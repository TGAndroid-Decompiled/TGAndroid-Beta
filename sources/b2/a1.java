package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class a1 {
    public static final String f3223j;
    public static final String f3224k;
    public static final String f3225l;
    public static final String f3226m;
    public static final String f3227n;
    public static final String f3228o;
    public static final String f3229p;
    public final Object f3230a;
    public final int f3231b;
    public final k0 f3232c;
    public final Object d;
    public final int f3233e;
    public final long f3234f;
    public final long f3235g;
    public final int h;
    public final int f3236i;

    static {
        String str = e2.d0.f8529a;
        f3223j = Integer.toString(0, 36);
        f3224k = Integer.toString(1, 36);
        f3225l = Integer.toString(2, 36);
        f3226m = Integer.toString(3, 36);
        f3227n = Integer.toString(4, 36);
        f3228o = Integer.toString(5, 36);
        f3229p = Integer.toString(6, 36);
    }

    public a1(Object obj, int i10, k0 k0Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f3230a = obj;
        this.f3231b = i10;
        this.f3232c = k0Var;
        this.d = obj2;
        this.f3233e = i11;
        this.f3234f = j3;
        this.f3235g = j10;
        this.h = i12;
        this.f3236i = i13;
    }

    public final boolean a(a1 a1Var) {
        if (this.f3231b == a1Var.f3231b && this.f3233e == a1Var.f3233e && this.f3234f == a1Var.f3234f && this.f3235g == a1Var.f3235g && this.h == a1Var.h && this.f3236i == a1Var.f3236i && Objects.equals(this.f3232c, a1Var.f3232c)) {
            return true;
        }
        return false;
    }

    public final a1 b(boolean z10, boolean z11) {
        int i10;
        k0 k0Var;
        long j3;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f3231b;
        } else {
            i10 = 0;
        }
        if (z10) {
            k0Var = this.f3232c;
        } else {
            k0Var = null;
        }
        if (z11) {
            i12 = this.f3233e;
        }
        int i13 = i12;
        long j10 = 0;
        if (z10) {
            j3 = this.f3234f;
        } else {
            j3 = 0;
        }
        if (z10) {
            j10 = this.f3235g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f3236i;
        }
        return new a1(this.f3230a, i10, k0Var, this.d, i13, j3, j10, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f3231b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f3223j, i11);
        }
        k0 k0Var = this.f3232c;
        if (k0Var != null) {
            bundle.putBundle(f3224k, k0Var.c(false));
        }
        int i12 = this.f3233e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f3225l, i12);
        }
        long j3 = this.f3234f;
        if (i10 < 3 || j3 != 0) {
            bundle.putLong(f3226m, j3);
        }
        long j10 = this.f3235g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f3227n, j10);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f3228o, i13);
        }
        int i14 = this.f3236i;
        if (i14 != -1) {
            bundle.putInt(f3229p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (a(a1Var) && Objects.equals(this.f3230a, a1Var.f3230a) && Objects.equals(this.d, a1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3230a, Integer.valueOf(this.f3231b), this.f3232c, this.d, Integer.valueOf(this.f3233e), Long.valueOf(this.f3234f), Long.valueOf(this.f3235g), Integer.valueOf(this.h), Integer.valueOf(this.f3236i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f3231b + ", period=" + this.f3233e + ", pos=" + this.f3234f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder j3 = sc.v.j(str, ", contentPos=");
        j3.append(this.f3235g);
        j3.append(", adGroup=");
        j3.append(i10);
        j3.append(", ad=");
        j3.append(this.f3236i);
        return j3.toString();
    }
}
