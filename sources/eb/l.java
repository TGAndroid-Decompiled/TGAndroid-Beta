package eb;
public final class l extends i {
    public final gb.n f8692a = new gb.n(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8692a.equals(this.f8692a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8692a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8691a;
        }
        this.f8692a.put(str, iVar);
    }
}
