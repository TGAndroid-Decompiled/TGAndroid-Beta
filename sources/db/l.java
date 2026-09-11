package db;
public final class l extends i {
    public final fb.m f6683a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f6683a.equals(this.f6683a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6683a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f6682a;
        }
        this.f6683a.put(str, iVar);
    }
}
