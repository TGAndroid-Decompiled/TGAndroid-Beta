package c0;
public final class k extends h {
    public final l f5912n;

    public k(l lVar) {
        this.f5912n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f5912n.f5913a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f5909a + "]";
    }
}
