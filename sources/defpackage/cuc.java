package defpackage;
public class cuc extends Exception {
    public final int a;

    public cuc(int i, String str) {
        super(str);
        this.a = i;
    }

    public cuc(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
