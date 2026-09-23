package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13230a;
    public final boolean f13231b;
    public final boolean f13232c;

    public e(ac.d dVar) {
        this.f13230a = dVar.f382a;
        this.f13231b = dVar.f383b;
        this.f13232c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13230a == eVar.f13230a && this.f13231b == eVar.f13231b && this.f13232c == eVar.f13232c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13230a ? 1 : 0) << 2) + ((this.f13231b ? 1 : 0) << 1) + (this.f13232c ? 1 : 0);
    }
}
