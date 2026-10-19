package c0;
public final class k extends h {
    public final l f4474n;

    public k(l lVar) {
        this.f4474n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4474n.f4475a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4471a + "]";
    }
}
