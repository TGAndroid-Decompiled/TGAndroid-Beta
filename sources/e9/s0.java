package e9;

import java.util.Collection;
import java.util.Map;
public final class s0 extends i0 {
    public final o0 f8497b;

    public s0(o0 o0Var) {
        this.f8497b = o0Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.f8497b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final m2 r() {
        o0 o0Var = this.f8497b;
        o0Var.getClass();
        return new r0(o0Var);
    }

    @Override
    public final int size() {
        return this.f8497b.f8478f;
    }
}
