package f9;
public final class a extends i {
    public final i f11499a;
    public final i f11500b;

    public a(i iVar, i iVar2) {
        iVar.getClass();
        this.f11499a = iVar;
        iVar2.getClass();
        this.f11500b = iVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c2) {
        if (this.f11499a.c(c2) && this.f11500b.c(c2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f11499a + ", " + this.f11500b + ")";
    }
}
