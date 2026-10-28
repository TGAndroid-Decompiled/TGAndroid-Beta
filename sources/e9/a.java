package e9;
public final class a extends i {
    public final i f9832a;
    public final i f9833b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f9832a = iVar;
        iVar2.getClass();
        this.f9833b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f9832a.c(c10) && this.f9833b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f9832a + ", " + this.f9833b + ")";
    }
}
