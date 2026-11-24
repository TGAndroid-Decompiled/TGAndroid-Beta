package defpackage;

import java.util.Collection;
import java.util.Map;
public final class sm5 extends gm5 {
    public final nm5 b;

    public sm5(nm5 nm5Var) {
        this.b = nm5Var;
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
    public final v5c iterator() {
        nm5 nm5Var = this.b;
        nm5Var.getClass();
        return new rm5(nm5Var);
    }

    @Override
    public final int size() {
        return this.b.f;
    }
}
