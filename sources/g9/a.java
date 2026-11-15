package g9;
public final class a extends i {
    public final i f12925a;
    public final i f12926b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f12925a = iVar;
        iVar2.getClass();
        this.f12926b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f12925a.c(c10) && this.f12926b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f12925a + ", " + this.f12926b + ")";
    }
}
