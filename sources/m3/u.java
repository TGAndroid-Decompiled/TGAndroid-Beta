package m3;
public final class u {
    public static final u f17258c = new u(0, 0);
    public final long f17259a;
    public final long f17260b;

    public u(long j10, long j11) {
        this.f17259a = j10;
        this.f17260b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f17259a == uVar.f17259a && this.f17260b == uVar.f17260b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17259a) * 31) + ((int) this.f17260b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f17259a);
        sb2.append(", position=");
        return aa.d.q(sb2, this.f17260b, "]");
    }
}
