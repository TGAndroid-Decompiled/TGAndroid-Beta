package c0;
public final class k extends h {
    public final l f5246n;

    public k(l lVar) {
        this.f5246n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f5246n.f5247a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f5243a + "]";
    }
}
