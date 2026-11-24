package defpackage;

import j$.util.Objects;
public final class kj1 implements ij1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final sw5 d;

    public kj1(long j, long j2, boolean z, sw5 sw5Var) {
        boolean z2;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        gre.f(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = sw5Var;
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && kj1.class == obj.getClass()) {
                kj1 kj1Var = (kj1) obj;
                if (this.a == kj1Var.a && this.b == kj1Var.b && this.c == kj1Var.c && Objects.equals(this.d, kj1Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int b = (((zne.b(this.b) + ((zne.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        sw5 sw5Var = this.d;
        if (sw5Var != null) {
            i = sw5Var.hashCode();
        } else {
            i = 0;
        }
        return b + i;
    }

    public final String toString() {
        Object valueOf;
        String n;
        String str;
        StringBuilder sb = new StringBuilder("Chapter: startTimeMs=");
        long j = this.a;
        if (j == -9223372036854775807L) {
            valueOf = "UNSET";
        } else {
            valueOf = Long.valueOf(j);
        }
        sb.append(valueOf);
        long j2 = this.b;
        String str2 = "";
        if (j2 == -9223372036854775807L) {
            n = "";
        } else {
            n = ls6.n(j2, ", endTimeMs=");
        }
        sb.append(n);
        if (!this.c) {
            str = "";
        } else {
            str = ", hidden";
        }
        sb.append(str);
        sw5 sw5Var = this.d;
        if (sw5Var != null) {
            str2 = ", title=" + sw5Var;
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override
    public final void b(hr6 hr6Var) {
    }
}
