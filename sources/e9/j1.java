package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8463a;
    public final l1 f8464b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8463a = entry;
        this.f8464b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8463a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8463a;
        return this.f8464b.p(entry.getKey(), entry.getValue());
    }
}
