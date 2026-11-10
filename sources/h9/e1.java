package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f14321a;
    public final h1 f14322b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f14321a = entry;
        this.f14322b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f14321a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f14321a;
        return this.f14322b.j(entry.getKey(), entry.getValue());
    }
}
