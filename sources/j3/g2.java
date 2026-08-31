package j3;
public final class g2 {
    public static final g2 f9160b = new g2(false);
    public final boolean f9161a;

    public g2(boolean z4) {
        this.f9161a = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g2.class == obj.getClass() && this.f9161a == ((g2) obj).f9161a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.f9161a ? 1 : 0;
    }
}
