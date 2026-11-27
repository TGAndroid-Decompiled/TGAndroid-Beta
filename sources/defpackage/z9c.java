package defpackage;
public final class z9c extends hy7 {
    public final po5 c;

    public z9c(String str, j99 j99Var) {
        super(str, null, false, 1);
        this.c = po5.q(j99Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        po5 po5Var = this.c;
        if (po5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + po5Var;
    }
}
