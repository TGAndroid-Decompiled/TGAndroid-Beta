package defpackage;
public final class eac extends UnsupportedOperationException {
    public final a94 a;

    public eac(a94 a94Var) {
        this.a = a94Var;
    }

    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
