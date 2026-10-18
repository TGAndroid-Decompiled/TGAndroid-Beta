package eb;
public final class l extends i {
    public final gb.m f8577a = new gb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8577a.equals(this.f8577a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8577a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8576a;
        }
        this.f8577a.put(str, iVar);
    }
}
