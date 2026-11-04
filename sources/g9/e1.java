package g9;

import java.util.Map;
public final class e1 extends k {
    public final Map.Entry f12073a;
    public final g1 f12074b;

    public e1(Map.Entry entry, g1 g1Var) {
        this.f12073a = entry;
        this.f12074b = g1Var;
    }

    @Override
    public final Object getKey() {
        return this.f12073a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f12073a;
        return this.f12074b.l(entry.getKey(), entry.getValue());
    }
}
