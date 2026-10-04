package db;
public final class l extends i {
    public final fb.m f8212a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8212a.equals(this.f8212a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8212a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8211a;
        }
        this.f8212a.put(str, iVar);
    }
}
