package c9;
public final class k {
    public final t f2168a;
    public final boolean f2169b;

    public k(t tVar, boolean z4) {
        this.f2168a = tVar;
        this.f2169b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f2168a.equals(this.f2168a) && kVar.f2169b == this.f2169b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2168a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2169b).hashCode();
    }
}
