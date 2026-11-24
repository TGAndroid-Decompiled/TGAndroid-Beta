package defpackage;
public final class r41 {
    public final Object a;
    public final String b;

    public r41(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + u41.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
