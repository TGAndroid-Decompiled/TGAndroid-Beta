package eb;
public final class l extends i {
    public final gb.m f8576a = new gb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8576a.equals(this.f8576a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8576a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8575a;
        }
        this.f8576a.put(str, iVar);
    }
}
