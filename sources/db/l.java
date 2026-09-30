package db;
public final class l extends i {
    public final fb.m f7604a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7604a.equals(this.f7604a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7604a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7603a;
        }
        this.f7604a.put(str, iVar);
    }
}
