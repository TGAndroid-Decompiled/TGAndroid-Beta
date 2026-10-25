package b2;
public final class d1 {
    public final v f3165a;

    public d1(v vVar) {
        this.f3165a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        return this.f3165a.equals(((d1) obj).f3165a);
    }

    public final int hashCode() {
        return this.f3165a.hashCode();
    }
}
