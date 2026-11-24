package defpackage;
public final class hh7 implements lf7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public hh7(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (this == obj) {
            return true;
        }
        if (obj != null && hh7.class == obj.getClass()) {
            hh7 hh7Var = (hh7) obj;
            if (this.a == hh7Var.a && this.b == hh7Var.b && this.c == hh7Var.c && this.d == hh7Var.d && this.e == hh7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = cqe.b(this.b);
        int b2 = cqe.b(this.c);
        int b3 = cqe.b(this.d);
        return cqe.b(this.e) + ((b3 + ((b2 + ((b + ((cqe.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
