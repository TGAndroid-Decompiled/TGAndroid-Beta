package db;
public final class l extends i {
    public final fb.m f6710a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f6710a.equals(this.f6710a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6710a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f6709a;
        }
        this.f6710a.put(str, iVar);
    }
}
