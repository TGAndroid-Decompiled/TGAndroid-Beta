package b2;

import android.os.Bundle;
import j$.util.Objects;
import v7.t6;
public final class e1 {
    public static final String f2014j;
    public static final String f2015k;
    public static final String f2016l;
    public static final String f2017m;
    public static final String f2018n;
    public static final String f2019o;
    public static final String f2020p;
    public final Object f2021a;
    public final int f2022b;
    public final p0 f2023c;
    public final Object d;
    public final int e;
    public final long f2024f;
    public final long f2025g;
    public final int h;
    public final int f2026i;

    static {
        String str = e2.l0.f6165a;
        f2014j = Integer.toString(0, 36);
        f2015k = Integer.toString(1, 36);
        f2016l = Integer.toString(2, 36);
        f2017m = Integer.toString(3, 36);
        f2018n = Integer.toString(4, 36);
        f2019o = Integer.toString(5, 36);
        f2020p = Integer.toString(6, 36);
    }

    public e1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        t6.f(i11 >= 0);
        this.f2021a = obj;
        this.f2022b = i10;
        this.f2023c = p0Var;
        this.d = obj2;
        this.e = i11;
        this.f2024f = j10;
        this.f2025g = j11;
        this.h = i12;
        this.f2026i = i13;
    }

    public final boolean a(e1 e1Var) {
        if (this.f2022b == e1Var.f2022b && this.e == e1Var.e && this.f2024f == e1Var.f2024f && this.f2025g == e1Var.f2025g && this.h == e1Var.h && this.f2026i == e1Var.f2026i && Objects.equals(this.f2023c, e1Var.f2023c)) {
            return true;
        }
        return false;
    }

    public final e1 b(boolean z10, boolean z11) {
        int i10;
        p0 p0Var;
        long j10;
        int i11;
        if (z10 && z11) {
            return this;
        }
        int i12 = 0;
        if (z11) {
            i10 = this.f2022b;
        } else {
            i10 = 0;
        }
        if (z10) {
            p0Var = this.f2023c;
        } else {
            p0Var = null;
        }
        if (z11) {
            i12 = this.e;
        }
        int i13 = i12;
        long j11 = 0;
        if (z10) {
            j10 = this.f2024f;
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = this.f2025g;
        }
        int i14 = -1;
        if (z10) {
            i11 = this.h;
        } else {
            i11 = -1;
        }
        if (z10) {
            i14 = this.f2026i;
        }
        return new e1(this.f2021a, i10, p0Var, this.d, i13, j10, j11, i11, i14);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f2022b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f2014j, i11);
        }
        p0 p0Var = this.f2023c;
        if (p0Var != null) {
            bundle.putBundle(f2015k, p0Var.c(i10, false));
        }
        int i12 = this.e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f2016l, i12);
        }
        long j10 = this.f2024f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f2017m, j10);
        }
        long j11 = this.f2025g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f2018n, j11);
        }
        int i13 = this.h;
        if (i13 != -1) {
            bundle.putInt(f2019o, i13);
        }
        int i14 = this.f2026i;
        if (i14 != -1) {
            bundle.putInt(f2020p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f2021a, e1Var.f2021a) && Objects.equals(this.d, e1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2021a, Integer.valueOf(this.f2022b), this.f2023c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f2024f), Long.valueOf(this.f2025g), Integer.valueOf(this.h), Integer.valueOf(this.f2026i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2022b + ", period=" + this.e + ", pos=" + this.f2024f;
        int i10 = this.h;
        if (i10 == -1) {
            return str;
        }
        StringBuilder i11 = sc.e.i(str, ", contentPos=");
        i11.append(this.f2025g);
        i11.append(", adGroup=");
        i11.append(i10);
        i11.append(", ad=");
        i11.append(this.f2026i);
        return i11.toString();
    }
}
