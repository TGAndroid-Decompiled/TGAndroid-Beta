package c0;
public final class k extends h {
    public final l f4338n;

    public k(l lVar) {
        this.f4338n = lVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4338n.f4339a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4335a + "]";
    }
}
