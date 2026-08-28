package la;
public final class l extends i {
    public final na.m f16727a = new na.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f16727a.equals(this.f16727a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16727a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f16726a;
        }
        this.f16727a.put(str, iVar);
    }
}
