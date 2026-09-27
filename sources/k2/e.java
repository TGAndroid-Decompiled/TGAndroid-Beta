package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13234a;
    public final boolean f13235b;
    public final boolean f13236c;

    public e(ac.d dVar) {
        this.f13234a = dVar.f382a;
        this.f13235b = dVar.f383b;
        this.f13236c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13234a == eVar.f13234a && this.f13235b == eVar.f13235b && this.f13236c == eVar.f13236c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13234a ? 1 : 0) << 2) + ((this.f13235b ? 1 : 0) << 1) + (this.f13236c ? 1 : 0);
    }
}
