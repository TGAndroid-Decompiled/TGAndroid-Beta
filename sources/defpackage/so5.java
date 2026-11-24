package defpackage;

import java.util.Collection;
import java.util.Map;
public final class so5 extends go5 {
    public final no5 b;

    public so5(no5 no5Var) {
        this.b = no5Var;
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
    public final v7c iterator() {
        no5 no5Var = this.b;
        no5Var.getClass();
        return new ro5(no5Var);
    }

    @Override
    public final int size() {
        return this.b.f;
    }
}
