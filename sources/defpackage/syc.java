package defpackage;
public class syc extends Exception {
    public final int a;

    public syc(int i, String str) {
        super(str);
        this.a = i;
    }

    public syc(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
