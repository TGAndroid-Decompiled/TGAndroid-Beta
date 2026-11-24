package defpackage;
public final class be7 extends Exception {
    public final byte a;

    public be7(String str, Throwable th) {
        super(str, th);
        fre.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    public be7(String str, int i) {
        super(str);
        fre.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
