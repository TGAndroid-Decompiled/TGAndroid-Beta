package defpackage;
public final class o20 extends Exception {
    public o20(String str, l20 l20Var) {
        super(str + " " + l20Var);
    }

    public o20(l20 l20Var) {
        this("Unhandled input format:", l20Var);
    }
}
