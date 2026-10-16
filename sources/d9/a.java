package d9;
public final class a extends i {
    public final i f6426a;
    public final i f6427b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f6426a = iVar;
        iVar2.getClass();
        this.f6427b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f6426a.c(c10) && this.f6427b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f6426a + ", " + this.f6427b + ")";
    }
}
