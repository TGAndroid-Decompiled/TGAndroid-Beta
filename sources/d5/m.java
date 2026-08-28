package d5;
public final class m {
    public final Object f4366a;
    public c2.t f4367b = new c2.t();
    public boolean f4368c;
    public boolean d;

    public m(Object obj) {
        this.f4366a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            return this.f4366a.equals(((m) obj).f4366a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4366a.hashCode();
    }
}
