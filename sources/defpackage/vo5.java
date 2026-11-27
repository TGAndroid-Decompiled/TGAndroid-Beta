package defpackage;

import java.util.Collection;
import java.util.Map;
public final class vo5 extends jo5 {
    public final qo5 b;

    public vo5(qo5 qo5Var) {
        this.b = qo5Var;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.a().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final v9c iterator() {
        qo5 qo5Var = this.b;
        qo5Var.getClass();
        return new uo5(qo5Var);
    }

    @Override
    public final int size() {
        return this.b.f;
    }
}
