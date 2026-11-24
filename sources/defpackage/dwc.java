package defpackage;
public class dwc extends Exception {
    public final int a;

    public dwc(int i, String str) {
        super(str);
        this.a = i;
    }

    public dwc(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
