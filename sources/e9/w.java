package e9;

import java.io.Serializable;
public final class w extends y0 implements Serializable {
    public final sg.p f7442a;

    public w(sg.p pVar) {
        this.f7442a = pVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f7442a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f7442a.equals(((w) obj).f7442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7442a.hashCode();
    }

    public final String toString() {
        return this.f7442a.toString();
    }
}
