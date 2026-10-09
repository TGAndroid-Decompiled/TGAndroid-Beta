package db;
public final class l extends i {
    public final fb.m f8264a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8264a.equals(this.f8264a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8264a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8263a;
        }
        this.f8264a.put(str, iVar);
    }
}
