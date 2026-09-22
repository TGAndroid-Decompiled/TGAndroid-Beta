package e9;

import java.io.Serializable;
import org.telegram.ui.mb1;
public final class w extends y0 implements Serializable {
    public final mb1 f8141a;

    public w(mb1 mb1Var) {
        this.f8141a = mb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8141a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8141a.equals(((w) obj).f8141a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8141a.hashCode();
    }

    public final String toString() {
        return this.f8141a.toString();
    }
}
