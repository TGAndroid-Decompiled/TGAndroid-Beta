package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f6378a;
    public final l1 f6379b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f6378a = entry;
        this.f6379b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f6378a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f6378a;
        return this.f6379b.c(entry.getKey(), entry.getValue());
    }
}
