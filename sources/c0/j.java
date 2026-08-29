package c0;
public final class j extends h {
    public final k f2744n;

    public j(k kVar) {
        this.f2744n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f2744n.f2745a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f2741a + "]";
    }
}
