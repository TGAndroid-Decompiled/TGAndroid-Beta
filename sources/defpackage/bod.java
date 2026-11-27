package defpackage;
public final class bod extends Throwable {
    public final byte a;

    public bod(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override
    public final Throwable fillInStackTrace() {
        byte b = this.a;
        return this;
    }
}
