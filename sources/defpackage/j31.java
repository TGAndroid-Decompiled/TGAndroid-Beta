package defpackage;
public final class j31 {
    public final Object a;
    public final String b;

    public j31(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + m31.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
