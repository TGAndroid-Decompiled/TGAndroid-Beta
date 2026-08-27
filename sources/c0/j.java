package c0;

public final class j extends h {

    public final k f2214n;

    public j(k kVar) {
        this.f2214n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f2214n.f2215a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f2211a + "]";
    }
}
