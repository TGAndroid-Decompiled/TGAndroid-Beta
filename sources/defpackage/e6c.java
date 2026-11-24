package defpackage;
public final class e6c extends UnsupportedOperationException {
    public final f84 a;

    public e6c(f84 f84Var) {
        this.a = f84Var;
    }

    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
