package k2;
public final class h {
    public static final h d = new Object().a();
    public final boolean f14730a;
    public final boolean f14731b;
    public final boolean f14732c;

    public h(bc.d dVar) {
        this.f14730a = dVar.f4253a;
        this.f14731b = dVar.f4254b;
        this.f14732c = dVar.f4255c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                if (this.f14730a == hVar.f14730a && this.f14731b == hVar.f14731b && this.f14732c == hVar.f14732c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14730a ? 1 : 0) << 2) + ((this.f14731b ? 1 : 0) << 1) + (this.f14732c ? 1 : 0);
    }
}
