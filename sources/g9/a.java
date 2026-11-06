package g9;
public final class a extends i {
    public final i f13577a;
    public final i f13578b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f13577a = iVar;
        iVar2.getClass();
        this.f13578b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f13577a.c(c10) && this.f13578b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f13577a + ", " + this.f13578b + ")";
    }
}
