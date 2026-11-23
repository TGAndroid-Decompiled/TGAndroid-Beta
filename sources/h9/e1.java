package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f14025a;
    public final h1 f14026b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f14025a = entry;
        this.f14026b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f14025a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f14025a;
        return this.f14026b.m(entry.getKey(), entry.getValue());
    }
}
