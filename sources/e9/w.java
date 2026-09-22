package e9;

import java.io.Serializable;
import org.telegram.ui.kb1;
public final class w extends y0 implements Serializable {
    public final kb1 f8139a;

    public w(kb1 kb1Var) {
        this.f8139a = kb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8139a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8139a.equals(((w) obj).f8139a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8139a.hashCode();
    }

    public final String toString() {
        return this.f8139a.toString();
    }
}
