package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f13676a;
    public final g1 f13677b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.f13676a = entry;
        this.f13677b = g1Var;
    }

    @Override
    public final Object getKey() {
        return this.f13676a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f13676a;
        return this.f13677b.a(entry.getKey(), entry.getValue());
    }
}
