package defpackage;

import java.util.Map;
public final class ok6 extends n3 {
    public final Map.Entry b;
    public final rk6 c;

    public ok6(Map.Entry entry, rk6 rk6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = rk6Var;
    }

    @Override
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.c(entry.getKey(), entry.getValue());
    }
}
