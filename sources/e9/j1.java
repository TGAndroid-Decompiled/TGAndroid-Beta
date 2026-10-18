package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8465a;
    public final l1 f8466b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8465a = entry;
        this.f8466b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8465a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8465a;
        return this.f8466b.p(entry.getKey(), entry.getValue());
    }
}
