package db;
public final class l extends i {
    public final fb.n f7609a = new fb.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7609a.equals(this.f7609a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7609a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7608a;
        }
        this.f7609a.put(str, iVar);
    }
}
