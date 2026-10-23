package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8469a;
    public final l1 f8470b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8469a = entry;
        this.f8470b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8469a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8469a;
        return this.f8470b.q(entry.getKey(), entry.getValue());
    }
}
