package e9;

import java.io.Serializable;
import org.telegram.ui.cb1;
public final class w extends y0 implements Serializable {
    public final cb1 f8126a;

    public w(cb1 cb1Var) {
        this.f8126a = cb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8126a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8126a.equals(((w) obj).f8126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8126a.hashCode();
    }

    public final String toString() {
        return this.f8126a.toString();
    }
}
