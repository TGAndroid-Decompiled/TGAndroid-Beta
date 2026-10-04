package db;
public final class l extends i {
    public final fb.m f8211a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8211a.equals(this.f8211a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8211a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8210a;
        }
        this.f8211a.put(str, iVar);
    }
}
