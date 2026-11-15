package h9;

import java.io.Serializable;
public final class t extends q1 implements Serializable {
    public final a3.c f13751a;

    public t(a3.c cVar) {
        this.f13751a = cVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13751a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f13751a.equals(((t) obj).f13751a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13751a.hashCode();
    }

    public final String toString() {
        return this.f13751a.toString();
    }
}
