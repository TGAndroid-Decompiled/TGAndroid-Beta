package l2;

import a8.ja;
import j$.util.Objects;
public final class v0 {
    public final x2.f0 f19200a;
    public final long f19201b;
    public final long f19202c;
    public final long d;
    public final long f19203e;
    public final long f19204f;
    public final boolean f19205g;
    public final boolean h;
    public final boolean f19206i;
    public final boolean f19207j;
    public final boolean f19208k;

    public v0(x2.f0 f0Var, long j3, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17 = true;
        if (z14 && !z12) {
            z15 = false;
        } else {
            z15 = true;
        }
        ja.f(z15);
        if (z13 && !z12) {
            z16 = false;
        } else {
            z16 = true;
        }
        ja.f(z16);
        if (z11 && (z12 || z13 || z14)) {
            z17 = false;
        }
        ja.f(z17);
        this.f19200a = f0Var;
        this.f19201b = j3;
        this.f19202c = j10;
        this.d = j11;
        this.f19203e = j12;
        this.f19204f = j13;
        this.f19205g = z10;
        this.h = z11;
        this.f19206i = z12;
        this.f19207j = z13;
        this.f19208k = z14;
    }

    public final v0 a(long j3) {
        if (j3 == this.d) {
            return this;
        }
        return new v0(this.f19200a, this.f19201b, this.f19202c, j3, this.f19203e, this.f19204f, this.f19205g, this.h, this.f19206i, this.f19207j, this.f19208k);
    }

    public final v0 b(long j3, long j10) {
        if (j3 == this.f19201b && j10 == this.f19202c) {
            return this;
        }
        return new v0(this.f19200a, j3, j10, this.d, this.f19203e, this.f19204f, this.f19205g, this.h, this.f19206i, this.f19207j, this.f19208k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (this.f19201b == v0Var.f19201b && this.d == v0Var.d && this.f19203e == v0Var.f19203e && this.f19204f == v0Var.f19204f && this.f19205g == v0Var.f19205g && this.h == v0Var.h && this.f19206i == v0Var.f19206i && this.f19207j == v0Var.f19207j && this.f19208k == v0Var.f19208k && Objects.equals(this.f19200a, v0Var.f19200a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19200a.hashCode() + 527) * 31) + ((int) this.f19201b)) * 31) + ((int) this.d)) * 31) + ((int) this.f19203e)) * 31) + ((int) this.f19204f)) * 31) + (this.f19205g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f19206i ? 1 : 0)) * 31) + (this.f19207j ? 1 : 0)) * 31) + (this.f19208k ? 1 : 0);
    }
}
