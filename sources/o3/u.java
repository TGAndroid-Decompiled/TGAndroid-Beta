package o3;
public final class u {
    public static final u f19117c = new u(0, 0);
    public final long f19118a;
    public final long f19119b;

    public u(long j10, long j11) {
        this.f19118a = j10;
        this.f19119b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f19118a == uVar.f19118a && this.f19119b == uVar.f19119b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19118a) * 31) + ((int) this.f19119b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f19118a);
        sb2.append(", position=");
        return a4.w.p(sb2, this.f19119b, "]");
    }
}
