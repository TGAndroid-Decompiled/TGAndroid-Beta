package j3;
public final class i2 {
    public static final i2 f10541b = new i2(false);
    public final boolean f10542a;

    public i2(boolean z10) {
        this.f10542a = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i2.class == obj.getClass() && this.f10542a == ((i2) obj).f10542a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.f10542a ? 1 : 0;
    }
}
