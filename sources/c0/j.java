package c0;
public final class j extends h {
    public final k f2075n;

    public j(k kVar) {
        this.f2075n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f2075n.f2076a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f2072a + "]";
    }
}
