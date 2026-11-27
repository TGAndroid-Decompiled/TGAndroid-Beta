package defpackage;
public final class khf extends p9f {
    public final yif n;

    public khf(yif yifVar) {
        this.n = yifVar;
    }

    @Override
    public final String a() {
        ybf ybfVar = (ybf) this.n.a.get();
        if (ybfVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return qd4.y("tag=[", String.valueOf(ybfVar.a), "]");
    }
}
