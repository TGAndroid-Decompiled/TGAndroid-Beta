package k2;
public final class e {
    public static final e d = new Object().a();
    public final boolean f13242a;
    public final boolean f13243b;
    public final boolean f13244c;

    public e(ac.d dVar) {
        this.f13242a = dVar.f382a;
        this.f13243b = dVar.f383b;
        this.f13244c = dVar.f384c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f13242a == eVar.f13242a && this.f13243b == eVar.f13243b && this.f13244c == eVar.f13244c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13242a ? 1 : 0) << 2) + ((this.f13243b ? 1 : 0) << 1) + (this.f13244c ? 1 : 0);
    }
}
