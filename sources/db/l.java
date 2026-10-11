package db;
public final class l extends i {
    public final fb.m f8263a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8263a.equals(this.f8263a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8263a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8262a;
        }
        this.f8263a.put(str, iVar);
    }
}
