package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f13993a;
    public final h1 f13994b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f13993a = entry;
        this.f13994b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f13993a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f13993a;
        return this.f13994b.m(entry.getKey(), entry.getValue());
    }
}
