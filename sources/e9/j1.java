package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8583a;
    public final l1 f8584b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8583a = entry;
        this.f8584b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8583a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8583a;
        return this.f8584b.k(entry.getKey(), entry.getValue());
    }
}
