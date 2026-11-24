package defpackage;

import j$.util.Objects;
public final class sk1 implements qk1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final sy5 d;

    public sk1(long j, long j2, boolean z, sy5 sy5Var) {
        boolean z2;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        jte.f(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = sy5Var;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sk1.class == obj.getClass()) {
                sk1 sk1Var = (sk1) obj;
                if (this.a == sk1Var.a && this.b == sk1Var.b && this.c == sk1Var.c && Objects.equals(this.d, sk1Var.d)) {
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
        int b = (((cqe.b(this.b) + ((cqe.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        sy5 sy5Var = this.d;
        if (sy5Var != null) {
            i = sy5Var.hashCode();
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
            n = kt6.n(j2, ", endTimeMs=");
        }
        sb.append(n);
        if (!this.c) {
            str = "";
        } else {
            str = ", hidden";
        }
        sb.append(str);
        sy5 sy5Var = this.d;
        if (sy5Var != null) {
            str2 = ", title=" + sy5Var;
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
