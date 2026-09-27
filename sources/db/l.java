package db;
public final class l extends i {
    public final fb.m f7594a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f7594a.equals(this.f7594a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7594a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f7593a;
        }
        this.f7594a.put(str, iVar);
    }
}
