package c0;
public final class k extends h {
    public final l f5241n;

    public k(l lVar) {
        this.f5241n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f5241n.f5242a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f5238a + "]";
    }
}
