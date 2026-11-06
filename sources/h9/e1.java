package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f14319a;
    public final h1 f14320b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f14319a = entry;
        this.f14320b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f14319a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f14319a;
        return this.f14320b.j(entry.getKey(), entry.getValue());
    }
}
