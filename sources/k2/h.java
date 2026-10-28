package k2;
public final class h {
    public static final h d = new Object().a();
    public final boolean f16165a;
    public final boolean f16166b;
    public final boolean f16167c;

    public h(cc.d dVar) {
        this.f16165a = dVar.f6189a;
        this.f16166b = dVar.f6190b;
        this.f16167c = dVar.f6191c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                if (this.f16165a == hVar.f16165a && this.f16166b == hVar.f16166b && this.f16167c == hVar.f16167c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16165a ? 1 : 0) << 2) + ((this.f16166b ? 1 : 0) << 1) + (this.f16167c ? 1 : 0);
    }
}
