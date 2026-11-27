package defpackage;
public final class kg7 extends Exception {
    public final byte a;

    public kg7(String str, Throwable th) {
        super(str, th);
        xve.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    public kg7(String str, int i) {
        super(str);
        xve.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
