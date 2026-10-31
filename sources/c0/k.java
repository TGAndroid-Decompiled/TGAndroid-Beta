package c0;
public final class k extends h {
    public final l f3511n;

    public k(l lVar) {
        this.f3511n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f3511n.f3512a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3508a + "]";
    }
}
