package c0;
public final class j extends h {
    public final k f4056n;

    public j(k kVar) {
        this.f4056n = kVar;
    }

    @Override
    public final String i() {
        i iVar = (i) this.f4056n.f4057a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f4053a + "]";
    }
}
