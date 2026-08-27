package ma;

public final class l extends i {

    public final oa.l f17911a = new oa.l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l) && ((l) obj).f17911a.equals(this.f17911a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f17911a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f17910a;
        }
        this.f17911a.put(str, iVar);
    }
}
