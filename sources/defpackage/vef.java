package defpackage;
public final class vef extends a7f {
    public final jgf n;

    public vef(jgf jgfVar) {
        this.n = jgfVar;
    }

    @Override
    public final String a() {
        j9f j9fVar = (j9f) this.n.a.get();
        if (j9fVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return kt6.o("tag=[", String.valueOf(j9fVar.a), "]");
    }
}
