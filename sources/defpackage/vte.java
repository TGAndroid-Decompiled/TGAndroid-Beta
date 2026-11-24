package defpackage;
public abstract class vte {
    public final byte a = 1;

    public final int hashCode() {
        switch (this.a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                String b = f59.a(getClass()).b();
                b.getClass();
                return b;
            default:
                return super.toString();
        }
    }
}
