package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13240a;
    public final boolean f13241b;
    public final boolean f13242c;

    public e(ac.d dVar) {
        this.f13240a = dVar.f380a;
        this.f13241b = dVar.f381b;
        this.f13242c = dVar.f382c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13240a == eVar.f13240a && this.f13241b == eVar.f13241b && this.f13242c == eVar.f13242c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13240a ? 1 : 0) << 2) + ((this.f13241b ? 1 : 0) << 1) + (this.f13242c ? 1 : 0);
    }
}
