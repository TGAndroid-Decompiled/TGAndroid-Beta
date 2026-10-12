package e9;

import java.util.Map;
public final class j1 extends n {
    public final Map.Entry f8580a;
    public final l1 f8581b;

    public j1(Map.Entry entry, l1 l1Var) {
        this.f8580a = entry;
        this.f8581b = l1Var;
    }

    @Override
    public final Object getKey() {
        return this.f8580a.getKey();
    }

    @Override
    public final Object getValue() {
        Map.Entry entry = this.f8580a;
        return this.f8581b.e(entry.getKey(), entry.getValue());
    }
}
