package defpackage;
public final class dg7 extends Exception {
    public final byte a;

    public dg7(String str, Throwable th) {
        super(str, th);
        ite.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    public dg7(String str, int i) {
        super(str);
        ite.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
