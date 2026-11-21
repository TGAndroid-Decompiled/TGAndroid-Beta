package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f14022a;
    public final h1 f14023b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f14022a = entry;
        this.f14023b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f14022a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f14022a;
        return this.f14023b.m(entry.getKey(), entry.getValue());
    }
}
