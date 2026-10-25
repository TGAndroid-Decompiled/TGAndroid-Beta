package f9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f10279a;
    public final g1 f10280b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.f10279a = entry;
        this.f10280b = g1Var;
    }

    @Override
    public final Object getKey() {
        return this.f10279a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f10279a;
        return this.f10280b.l(entry.getKey(), entry.getValue());
    }
}
