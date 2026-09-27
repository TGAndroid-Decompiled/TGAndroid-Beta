package mb;

import n6.l;
public final class a extends Exception {
    public final int f15004a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f15004a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f15004a = 13;
    }
}
