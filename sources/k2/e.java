package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13246a;
    public final boolean f13247b;
    public final boolean f13248c;

    public e(ac.d dVar) {
        this.f13246a = dVar.f382a;
        this.f13247b = dVar.f383b;
        this.f13248c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13246a == eVar.f13246a && this.f13247b == eVar.f13247b && this.f13248c == eVar.f13248c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13246a ? 1 : 0) << 2) + ((this.f13247b ? 1 : 0) << 1) + (this.f13248c ? 1 : 0);
    }
}
