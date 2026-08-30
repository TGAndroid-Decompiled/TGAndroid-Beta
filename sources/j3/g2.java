package j3;
public final class g2 {
    public static final g2 f8591b = new g2(false);
    public final boolean f8592a;

    public g2(boolean z4) {
        this.f8592a = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g2.class == obj.getClass() && this.f8592a == ((g2) obj).f8592a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return !this.f8592a ? 1 : 0;
    }
}
