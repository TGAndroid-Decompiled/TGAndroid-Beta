package e9;

import java.io.Serializable;
import org.telegram.ui.db1;
public final class w extends y0 implements Serializable {
    public final db1 f8124a;

    public w(db1 db1Var) {
        this.f8124a = db1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8124a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8124a.equals(((w) obj).f8124a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8124a.hashCode();
    }

    public final String toString() {
        return this.f8124a.toString();
    }
}
