package db;
public final class l extends i {
    public final fb.m f6381a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f6381a.equals(this.f6381a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6381a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f6380a;
        }
        this.f6381a.put(str, iVar);
    }
}
