package fb;
public final class l extends i {
    public final hb.m f10396a = new hb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f10396a.equals(this.f10396a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10396a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f10395a;
        }
        this.f10396a.put(str, iVar);
    }
}
