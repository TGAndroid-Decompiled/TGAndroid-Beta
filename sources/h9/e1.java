package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f13985a;
    public final g1 f13986b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.f13985a = entry;
        this.f13986b = g1Var;
    }

    @Override
    public final Object getKey() {
        return this.f13985a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f13985a;
        return this.f13986b.u(entry.getKey(), entry.getValue());
    }
}
