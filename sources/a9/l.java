package a9;
public final class l {
    public final v f255a;
    public final boolean f256b;

    public l(v vVar, boolean z10) {
        this.f255a = vVar;
        this.f256b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f255a.equals(this.f255a) && lVar.f256b == this.f256b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f255a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f256b).hashCode();
    }
}
