package h3;
public final class i2 {
    public static final i2 f9504b = new i2(false);
    public final boolean f9505a;

    public i2(boolean z10) {
        this.f9505a = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i2.class == obj.getClass() && this.f9505a == ((i2) obj).f9505a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.f9505a ? 1 : 0;
    }
}
