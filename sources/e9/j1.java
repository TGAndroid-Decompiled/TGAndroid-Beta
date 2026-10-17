package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8464a;
    public final l1 f8465b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8464a = entry;
        this.f8465b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8464a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8464a;
        return this.f8465b.p(entry.getKey(), entry.getValue());
    }
}
