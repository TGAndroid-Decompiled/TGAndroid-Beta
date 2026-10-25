package k2;
public final class h {
    public static final h d = new Object().a();
    public final boolean f16166a;
    public final boolean f16167b;
    public final boolean f16168c;

    public h(cc.d dVar) {
        this.f16166a = dVar.f6189a;
        this.f16167b = dVar.f6190b;
        this.f16168c = dVar.f6191c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                h hVar = (h) obj;
                if (this.f16166a == hVar.f16166a && this.f16167b == hVar.f16167b && this.f16168c == hVar.f16168c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f16166a ? 1 : 0) << 2) + ((this.f16167b ? 1 : 0) << 1) + (this.f16168c ? 1 : 0);
    }
}
