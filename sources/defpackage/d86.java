package defpackage;
public final class d86 {
    public final Object a;
    public n31 b = new n31();
    public boolean c;
    public boolean d;

    public d86(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d86.class == obj.getClass()) {
            return this.a.equals(((d86) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
