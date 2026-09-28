package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13231a;
    public final boolean f13232b;
    public final boolean f13233c;

    public e(ac.d dVar) {
        this.f13231a = dVar.f382a;
        this.f13232b = dVar.f383b;
        this.f13233c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13231a == eVar.f13231a && this.f13232b == eVar.f13232b && this.f13233c == eVar.f13233c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13231a ? 1 : 0) << 2) + ((this.f13232b ? 1 : 0) << 1) + (this.f13233c ? 1 : 0);
    }
}
