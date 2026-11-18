package c0;
public final class k extends h {
    public final l f4343n;

    public k(l lVar) {
        this.f4343n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4343n.f4344a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4340a + "]";
    }
}
