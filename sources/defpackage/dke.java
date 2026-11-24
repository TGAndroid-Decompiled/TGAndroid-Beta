package defpackage;
public abstract class dke {
    public final byte a = 1;

    public abstract Object d();

    public final String toString() {
        switch (this.a) {
            case 1:
                return d().toString();
            default:
                return super.toString();
        }
    }
}
