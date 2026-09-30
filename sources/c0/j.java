package c0;
public final class j extends h {
    public final k f3634n;

    public j(k kVar) {
        this.f3634n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f3634n.f3635a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3631a + "]";
    }
}
