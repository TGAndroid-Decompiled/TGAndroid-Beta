package c0;
public final class j extends h {
    public final k f2020n;

    public j(k kVar) {
        this.f2020n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f2020n.f2021a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f2017a + "]";
    }
}
