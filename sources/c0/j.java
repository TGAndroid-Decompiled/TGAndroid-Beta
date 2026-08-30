package c0;
public final class j extends h {
    public final k f1859n;

    public j(k kVar) {
        this.f1859n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f1859n.f1860a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f1856a + "]";
    }
}
