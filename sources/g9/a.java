package g9;
public final class a extends i {
    public final i f13234a;
    public final i f13235b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f13234a = iVar;
        iVar2.getClass();
        this.f13235b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        if (this.f13234a.c(c10) && this.f13235b.c(c10)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f13234a + ", " + this.f13235b + ")";
    }
}
