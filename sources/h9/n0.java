package h9;

import java.util.Collection;
import java.util.Map;
public final class n0 extends d0 {
    public final j0 f14354b;

    public n0(j0 j0Var) {
        this.f14354b = j0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.f14354b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final h2 n() {
        j0 j0Var = this.f14354b;
        j0Var.getClass();
        return new m0(j0Var);
    }

    @Override
    public final int size() {
        return this.f14354b.f14334f;
    }
}
