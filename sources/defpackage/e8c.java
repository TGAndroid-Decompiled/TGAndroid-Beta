package defpackage;
public final class e8c extends UnsupportedOperationException {
    public final o94 a;

    public e8c(o94 o94Var) {
        this.a = o94Var;
    }

    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
