package defpackage;

import java.util.Map;
public final class mk6 extends m3 {
    public final Map.Entry b;
    public final pk6 c;

    public mk6(Map.Entry entry, pk6 pk6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = pk6Var;
    }

    @Override
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.f(entry.getKey(), entry.getValue());
    }
}
