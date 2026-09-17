package c0;
public final class j extends h {
    public final k f3642n;

    public j(k kVar) {
        this.f3642n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f3642n.f3643a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3639a + "]";
    }
}
