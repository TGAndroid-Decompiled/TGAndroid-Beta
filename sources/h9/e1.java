package h9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f13988a;
    public final h1 f13989b;

    public e1(Map.Entry entry, h1 h1Var) {
        this.f13988a = entry;
        this.f13989b = h1Var;
    }

    @Override
    public final Object getKey() {
        return this.f13988a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f13988a;
        return this.f13989b.m(entry.getKey(), entry.getValue());
    }
}
