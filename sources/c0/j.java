package c0;
public final class j extends h {
    public final k f1881n;

    public j(k kVar) {
        this.f1881n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f1881n.f1882a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f1878a + "]";
    }
}
