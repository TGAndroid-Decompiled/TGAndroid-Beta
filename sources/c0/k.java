package c0;
public final class k extends h {
    public final l f4101n;

    public k(l lVar) {
        this.f4101n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4101n.f4102a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4098a + "]";
    }
}
