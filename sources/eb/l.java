package eb;
public final class l extends i {
    public final gb.o f8695a = new gb.o(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof l) || !((l) obj).f8695a.equals(this.f8695a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8695a.hashCode();
    }

    public final void n(String str, i iVar) {
        if (iVar == null) {
            iVar = k.f8694a;
        }
        this.f8695a.put(str, iVar);
    }
}
