package c0;
public final class j extends h {
    public final k f4123n;

    public j(k kVar) {
        this.f4123n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4123n.f4124a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4120a + "]";
    }
}
