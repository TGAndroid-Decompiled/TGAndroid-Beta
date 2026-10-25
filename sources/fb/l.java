package fb;
public final class l extends i {
    public final hb.m f10397a = new hb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f10397a.equals(this.f10397a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10397a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f10396a;
        }
        this.f10397a.put(str, iVar);
    }
}
