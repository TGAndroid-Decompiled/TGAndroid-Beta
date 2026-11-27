package defpackage;
public final class u91 extends b4 {
    public final v91 n;

    public u91(v91 v91Var) {
        this.n = v91Var;
    }

    @Override
    public final String i() {
        t91 t91Var = (t91) this.n.a.get();
        if (t91Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + t91Var.a + "]";
    }
}
