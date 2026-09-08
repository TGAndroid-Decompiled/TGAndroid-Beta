package e9;

import java.io.Serializable;
import org.telegram.ui.f11;
public final class w extends y0 implements Serializable {
    public final f11 f9049a;

    public w(f11 f11Var) {
        this.f9049a = f11Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f9049a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f9049a.equals(((w) obj).f9049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9049a.hashCode();
    }

    public final String toString() {
        return this.f9049a.toString();
    }
}
