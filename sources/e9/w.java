package e9;

import java.io.Serializable;
import org.telegram.ui.gb1;
public final class w extends y0 implements Serializable {
    public final gb1 f8821a;

    public w(gb1 gb1Var) {
        this.f8821a = gb1Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8821a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f8821a.equals(((w) obj).f8821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8821a.hashCode();
    }

    public final String toString() {
        return this.f8821a.toString();
    }
}
