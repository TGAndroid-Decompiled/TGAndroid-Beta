package d5;

public final class m {

    public final Object f4811a;

    public c2.t f4812b = new c2.t();

    public boolean f4813c;
    public boolean d;

    public m(Object obj) {
        this.f4811a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f4811a.equals(((m) obj).f4811a);
    }

    public final int hashCode() {
        return this.f4811a.hashCode();
    }
}
