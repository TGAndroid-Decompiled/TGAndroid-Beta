package e9;

import java.io.Serializable;
import org.telegram.ui.lb1;
public final class w extends y0 implements Serializable {
    public final lb1 f8142a;

    public w(lb1 lb1Var) {
        this.f8142a = lb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8142a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8142a.equals(((w) obj).f8142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8142a.hashCode();
    }

    public final String toString() {
        return this.f8142a.toString();
    }
}
