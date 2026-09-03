package c9;
public final class l {
    public final u f2192a;
    public final boolean f2193b;

    public l(u uVar, boolean z4) {
        this.f2192a = uVar;
        this.f2193b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f2192a.equals(this.f2192a) && lVar.f2193b == this.f2193b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2192a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2193b).hashCode();
    }
}
