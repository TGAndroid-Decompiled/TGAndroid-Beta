package f9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f10278a;
    public final g1 f10279b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.f10278a = entry;
        this.f10279b = g1Var;
    }

    @Override
    public final Object getKey() {
        return this.f10278a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f10278a;
        return this.f10279b.l(entry.getKey(), entry.getValue());
    }
}
