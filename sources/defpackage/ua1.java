package defpackage;
public final class ua1 extends a4 {
    public final va1 n;

    public ua1(va1 va1Var) {
        this.n = va1Var;
    }

    @Override
    public final String i() {
        ta1 ta1Var = (ta1) this.n.a.get();
        if (ta1Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + ta1Var.a + "]";
    }
}
