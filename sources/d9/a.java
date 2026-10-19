package d9;
public final class a extends i {
    public final i f7879a;
    public final i f7880b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f7879a = iVar;
        iVar2.getClass();
        this.f7880b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f7879a.c(c10) && this.f7880b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f7879a + ", " + this.f7880b + ")";
    }
}
