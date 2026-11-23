package l2;

import a8.ma;
import j$.util.Objects;
public final class w0 {
    public final x2.g0 f19665a;
    public final long f19666b;
    public final long f19667c;
    public final long d;
    public final long f19668e;
    public final long f19669f;
    public final boolean f19670g;
    public final boolean h;
    public final boolean f19671i;
    public final boolean f19672j;
    public final boolean f19673k;

    public w0(x2.g0 g0Var, long j3, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        ma.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        ma.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        ma.f(z17);
        this.f19665a = g0Var;
        this.f19666b = j3;
        this.f19667c = j10;
        this.d = j11;
        this.f19668e = j12;
        this.f19669f = j13;
        this.f19670g = z10;
        this.h = z11;
        this.f19671i = z12;
        this.f19672j = z13;
        this.f19673k = z14;
    }

    public final w0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new w0(this.f19665a, this.f19666b, this.f19667c, j3, this.f19668e, this.f19669f, this.f19670g, this.h, this.f19671i, this.f19672j, this.f19673k);
    }

    public final w0 b(long j3, long j10) {
        if (j3 == this.f19666b && j10 == this.f19667c) {
            return this;
        }
        return new w0(this.f19665a, j3, j10, this.d, this.f19668e, this.f19669f, this.f19670g, this.h, this.f19671i, this.f19672j, this.f19673k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f19666b == w0Var.f19666b && this.d == w0Var.d && this.f19668e == w0Var.f19668e && this.f19669f == w0Var.f19669f && this.f19670g == w0Var.f19670g && this.h == w0Var.h && this.f19671i == w0Var.f19671i && this.f19672j == w0Var.f19672j && this.f19673k == w0Var.f19673k && Objects.equals(this.f19665a, w0Var.f19665a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19665a.hashCode() + 527) * 31) + ((int) this.f19666b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19668e)) * 31) + ((int) this.f19669f)) * 31) + (this.f19670g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19671i ? 1 : 0)) * 31) + (this.f19672j ? 1 : 0)) * 31) + (this.f19673k ? 1 : 0);
    }
}
