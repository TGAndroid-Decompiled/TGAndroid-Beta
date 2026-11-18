package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f13996a;
    public final h1 f13997b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f13996a = entry;
        this.f13997b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f13996a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f13996a;
        return this.f13997b.m(entry.getKey(), entry.getValue());
    }
}
