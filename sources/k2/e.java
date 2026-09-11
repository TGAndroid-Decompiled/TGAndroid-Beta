package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f14567a;
    public final boolean f14568b;
    public final boolean f14569c;

    public e(ac.d dVar) {
        this.f14567a = dVar.f396a;
        this.f14568b = dVar.f397b;
        this.f14569c = dVar.f398c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f14567a == eVar.f14567a && this.f14568b == eVar.f14568b && this.f14569c == eVar.f14569c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14567a ? 1 : 0) << 2) + ((this.f14568b ? 1 : 0) << 1) + (this.f14569c ? 1 : 0);
    }
}
