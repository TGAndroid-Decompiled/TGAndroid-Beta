package defpackage;
public final class z56 {
    public final Object a;
    public e31 b = new e31();
    public boolean c;
    public boolean d;

    public z56(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z56.class == obj.getClass()) {
            return this.a.equals(((z56) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
