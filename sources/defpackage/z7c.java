package defpackage;
public final class z7c extends bx7 {
    public final mo5 c;

    public z7c(String str, y79 y79Var) {
        super(str, null, false, 1);
        this.c = mo5.q(y79Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        mo5 mo5Var = this.c;
        if (mo5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + mo5Var;
    }
}
