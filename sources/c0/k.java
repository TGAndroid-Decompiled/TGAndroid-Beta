package c0;
public final class k extends h {
    public final l f4375n;

    public k(l lVar) {
        this.f4375n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4375n.f4376a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4372a + "]";
    }
}
