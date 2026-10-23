package eb;
public final class l extends i {
    public final gb.m f8581a = new gb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8581a.equals(this.f8581a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8581a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8580a;
        }
        this.f8581a.put(str, iVar);
    }
}
