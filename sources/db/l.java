package db;
public final class l extends i {
    public final fb.n f8261a = new fb.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8261a.equals(this.f8261a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8261a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8260a;
        }
        this.f8261a.put(str, iVar);
    }
}
