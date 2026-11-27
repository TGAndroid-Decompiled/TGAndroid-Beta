package defpackage;
public final class p20 extends Exception {
    public p20(String str, m20 m20Var) {
        super(str + " " + m20Var);
    }

    public p20(m20 m20Var) {
        this("Unhandled input format:", m20Var);
    }
}
