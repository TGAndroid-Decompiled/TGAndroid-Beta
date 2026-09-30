package db;
public final class l extends i {
    public final fb.m f7592a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7592a.equals(this.f7592a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7592a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7591a;
        }
        this.f7592a.put(str, iVar);
    }
}
