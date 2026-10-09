package c0;
public final class j extends h {
    public final k f3978n;

    public j(k kVar) {
        this.f3978n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f3978n.f3979a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3975a + "]";
    }
}
