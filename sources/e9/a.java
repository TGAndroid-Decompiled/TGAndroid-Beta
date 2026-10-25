package e9;
public final class a extends i {
    public final i f9833a;
    public final i f9834b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f9833a = iVar;
        iVar2.getClass();
        this.f9834b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f9833a.c(c10) && this.f9834b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f9833a + ", " + this.f9834b + ")";
    }
}
