package f9;

import java.util.Collection;
import java.util.Map;
public final class n0 extends d0 {
    public final j0 f10305b;

    public n0(j0 j0Var) {
        this.f10305b = j0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.f10305b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final g2 r() {
        j0 j0Var = this.f10305b;
        j0Var.getClass();
        return new m0(j0Var);
    }

    @Override
    public final int size() {
        return this.f10305b.f10287f;
    }
}
