package db;
public final class l extends i {
    public final fb.m f7605a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7605a.equals(this.f7605a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7605a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7604a;
        }
        this.f7605a.put(str, iVar);
    }
}
