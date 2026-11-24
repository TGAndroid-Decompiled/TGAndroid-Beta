package defpackage;
public final class o30 extends Exception {
    public o30(String str, l30 l30Var) {
        super(str + " " + l30Var);
    }

    public o30(l30 l30Var) {
        this("Unhandled input format:", l30Var);
    }
}
