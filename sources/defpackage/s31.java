package defpackage;
public final class s31 {
    public final Object a;
    public final String b;

    public s31(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + v31.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
