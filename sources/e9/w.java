package e9;

import java.io.Serializable;
import org.telegram.ui.ob1;
public final class w extends y0 implements Serializable {
    public final ob1 f8137a;

    public w(ob1 ob1Var) {
        this.f8137a = ob1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8137a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8137a.equals(((w) obj).f8137a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8137a.hashCode();
    }

    public final String toString() {
        return this.f8137a.toString();
    }
}
