package c0;
public final class k extends h {
    public final l f4476n;

    public k(l lVar) {
        this.f4476n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4476n.f4477a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4473a + "]";
    }
}
