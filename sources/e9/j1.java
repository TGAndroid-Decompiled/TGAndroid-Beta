package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8462a;
    public final l1 f8463b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8462a = entry;
        this.f8463b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8462a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8462a;
        return this.f8463b.q(entry.getKey(), entry.getValue());
    }
}
