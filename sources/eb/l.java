package eb;
public final class l extends i {
    public final gb.m f8575a = new gb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8575a.equals(this.f8575a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8575a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8574a;
        }
        this.f8575a.put(str, iVar);
    }
}
