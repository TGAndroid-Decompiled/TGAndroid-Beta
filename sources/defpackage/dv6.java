package defpackage;
public final class dv6 {
    public final Object a;
    public final byte b;

    public dv6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof ew6) {
            this.b = (byte) 2;
        } else {
            i98.g();
            throw null;
        }
    }
}
