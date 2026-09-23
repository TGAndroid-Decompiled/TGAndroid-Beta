package db;
public final class l extends i {
    public final fb.m f7593a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7593a.equals(this.f7593a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7593a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7592a;
        }
        this.f7593a.put(str, iVar);
    }
}
