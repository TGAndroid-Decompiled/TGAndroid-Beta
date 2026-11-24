package defpackage;
public final class kjd extends Throwable {
    public final byte a;

    public kjd(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override
    public final Throwable fillInStackTrace() {
        byte b = this.a;
        return this;
    }
}
