package defpackage;
public final class mld extends Throwable {
    public final byte a;

    public mld(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override
    public final Throwable fillInStackTrace() {
        byte b = this.a;
        return this;
    }
}
