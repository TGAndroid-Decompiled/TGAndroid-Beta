package f9;

import java.io.Serializable;
import org.telegram.ui.dv;
public final class t extends q1 implements Serializable {
    public final dv f10342a;

    public t(dv dvVar) {
        this.f10342a = dvVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f10342a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f10342a.equals(((t) obj).f10342a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10342a.hashCode();
    }

    public final String toString() {
        return this.f10342a.toString();
    }
}
