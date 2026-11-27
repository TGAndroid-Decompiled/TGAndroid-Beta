package defpackage;

import j$.util.Objects;
public final class tj1 implements rj1 {
    public final long a;
    public final long b;
    public final boolean c;
    public final xy5 d;

    public tj1(long j, long j2, boolean z, xy5 xy5Var) {
        boolean z2;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        yve.f(z2);
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = xy5Var;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tj1.class == obj.getClass()) {
                tj1 tj1Var = (tj1) obj;
                if (this.a == tj1Var.a && this.b == tj1Var.b && this.c == tj1Var.c && Objects.equals(this.d, tj1Var.d)) {
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
        int b = (((tse.b(this.b) + ((tse.b(this.a) + 527) * 31)) * 31) + (this.c ? 1 : 0)) * 31;
        xy5 xy5Var = this.d;
        if (xy5Var != null) {
            i = xy5Var.hashCode();
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
            n = qu6.n(j2, ", endTimeMs=");
        }
        sb.append(n);
        if (!this.c) {
            str = "";
        } else {
            str = ", hidden";
        }
        sb.append(str);
        xy5 xy5Var = this.d;
        if (xy5Var != null) {
            str2 = ", title=" + xy5Var;
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override
    public final void b(lt6 lt6Var) {
    }
}
