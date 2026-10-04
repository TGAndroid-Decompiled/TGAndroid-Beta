package e9;

import java.io.Serializable;
import org.telegram.ui.gb1;
public final class w extends y0 implements Serializable {
    public final gb1 f8822a;

    public w(gb1 gb1Var) {
        this.f8822a = gb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8822a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8822a.equals(((w) obj).f8822a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8822a.hashCode();
    }

    public final String toString() {
        return this.f8822a.toString();
    }
}
