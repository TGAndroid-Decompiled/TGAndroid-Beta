package g9;
public final class a extends i {
    public final i f13242a;
    public final i f13243b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f13242a = iVar;
        iVar2.getClass();
        this.f13243b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f13242a.c(c10) && this.f13243b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f13242a + ", " + this.f13243b + ")";
    }
}
