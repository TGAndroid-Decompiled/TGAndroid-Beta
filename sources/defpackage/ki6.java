package defpackage;

import java.util.Map;
public final class ki6 extends m3 {
    public final Map.Entry b;
    public final ni6 c;

    public ki6(Map.Entry entry, ni6 ni6Var) {
        super((byte) 0, false);
        this.b = entry;
        this.c = ni6Var;
    }

    @Override
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.b;
        return this.c.e(entry.getKey(), entry.getValue());
    }
}
