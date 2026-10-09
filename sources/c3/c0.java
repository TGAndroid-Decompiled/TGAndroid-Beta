package c3;
public final class c0 {
    public static final c0 f4083c = new c0(0, 0);
    public final long f4084a;
    public final long f4085b;

    public c0(long j3, long j10) {
        this.f4084a = j3;
        this.f4085b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f4084a == c0Var.f4084a && this.f4085b == c0Var.f4085b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4084a) * 31) + ((int) this.f4085b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f4084a);
        sb2.append(", position=");
        return a1.g.s(sb2, this.f4085b, "]");
    }
}
