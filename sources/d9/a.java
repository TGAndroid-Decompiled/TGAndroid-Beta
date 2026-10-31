package d9;
public final class a extends i {
    public final i f5793a;
    public final i f5794b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f5793a = iVar;
        iVar2.getClass();
        this.f5794b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f5793a.c(c10) && this.f5794b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f5793a + ", " + this.f5794b + ")";
    }
}
