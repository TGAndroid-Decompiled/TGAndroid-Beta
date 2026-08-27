package m3;

public final class u {

    public static final u f17634c = new u(0, 0);

    public final long f17635a;

    public final long f17636b;

    public u(long j10, long j11) {
        this.f17635a = j10;
        this.f17636b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f17635a == uVar.f17635a && this.f17636b == uVar.f17636b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17635a) * 31) + ((int) this.f17636b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f17635a);
        sb2.append(", position=");
        return a9.p.o(sb2, this.f17636b, "]");
    }
}
