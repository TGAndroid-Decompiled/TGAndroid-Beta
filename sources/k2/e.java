package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13243a;
    public final boolean f13244b;
    public final boolean f13245c;

    public e(ac.d dVar) {
        this.f13243a = dVar.f382a;
        this.f13244b = dVar.f383b;
        this.f13245c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13243a == eVar.f13243a && this.f13244b == eVar.f13244b && this.f13245c == eVar.f13245c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13243a ? 1 : 0) << 2) + ((this.f13244b ? 1 : 0) << 1) + (this.f13245c ? 1 : 0);
    }
}
