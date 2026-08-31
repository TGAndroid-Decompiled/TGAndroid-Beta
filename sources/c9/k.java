package c9;
public final class k {
    public final t f2358a;
    public final boolean f2359b;

    public k(t tVar, boolean z4) {
        this.f2358a = tVar;
        this.f2359b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f2358a.equals(this.f2358a) && kVar.f2359b == this.f2359b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2358a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2359b).hashCode();
    }
}
