package defpackage;
public final class z76 {
    public final Object a;
    public m41 b = new m41();
    public boolean c;
    public boolean d;

    public z76(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z76.class == obj.getClass()) {
            return this.a.equals(((z76) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
