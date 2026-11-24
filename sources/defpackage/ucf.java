package defpackage;
public final class ucf extends y4f {
    public final ief n;

    public ucf(ief iefVar) {
        this.n = iefVar;
    }

    @Override
    public final String a() {
        h7f h7fVar = (h7f) this.n.a.get();
        if (h7fVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return tb4.y("tag=[", String.valueOf(h7fVar.a), "]");
    }
}
