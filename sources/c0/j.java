package c0;
public final class j extends h {
    public final k f3639n;

    public j(k kVar) {
        this.f3639n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f3639n.f3640a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3636a + "]";
    }
}
