package na;
public final class l extends i {
    public final pa.l f17194a = new pa.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f17194a.equals(this.f17194a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17194a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f17193a;
        }
        this.f17194a.put(str, iVar);
    }
}
