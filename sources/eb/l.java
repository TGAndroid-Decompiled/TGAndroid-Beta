package eb;
public final class l extends i {
    public final gb.m f8574a = new gb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8574a.equals(this.f8574a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8574a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8573a;
        }
        this.f8574a.put(str, iVar);
    }
}
