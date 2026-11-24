package defpackage;
public final class l91 extends a4 {
    public final m91 n;

    public l91(m91 m91Var) {
        this.n = m91Var;
    }

    @Override
    public final String i() {
        k91 k91Var = (k91) this.n.a.get();
        if (k91Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + k91Var.a + "]";
    }
}
