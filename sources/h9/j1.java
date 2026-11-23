package h9;

import java.io.Serializable;
import java.util.ArrayList;
public final class j1 implements g9.t, Serializable {
    public final int f13999a;

    public j1() {
        o.g(2, "expectedValuesPerKey");
        this.f13999a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f13999a);
    }
}
