package c0;
public final class k extends h {
    public final l f4475n;

    public k(l lVar) {
        this.f4475n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4475n.f4476a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4472a + "]";
    }
}
