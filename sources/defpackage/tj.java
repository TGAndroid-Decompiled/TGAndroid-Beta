package defpackage;

import j$.util.Objects;
public final class tj {
    public final long a;
    public final aob b;
    public final int c;
    public final rx6 d;
    public final long e;
    public final aob f;
    public final int g;
    public final rx6 h;
    public final long i;
    public final long j;

    public tj(long j, aob aobVar, int i, rx6 rx6Var, long j2, aob aobVar2, int i2, rx6 rx6Var2, long j3, long j4) {
        this.a = j;
        this.b = aobVar;
        this.c = i;
        this.d = rx6Var;
        this.e = j2;
        this.f = aobVar2;
        this.g = i2;
        this.h = rx6Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tj.class == obj.getClass()) {
                tj tjVar = (tj) obj;
                if (this.a == tjVar.a && this.c == tjVar.c && this.e == tjVar.e && this.g == tjVar.g && this.i == tjVar.i && this.j == tjVar.j && this.b.equals(tjVar.b) && Objects.equals(this.d, tjVar.d) && Objects.equals(this.f, tjVar.f) && Objects.equals(this.h, tjVar.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
