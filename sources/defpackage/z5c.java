package defpackage;
public final class z5c extends av7 {
    public final mm5 c;

    public z5c(String str, w59 w59Var) {
        super(str, null, false, 1);
        this.c = mm5.q(w59Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        mm5 mm5Var = this.c;
        if (mm5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + mm5Var;
    }
}
