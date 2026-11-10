package h9;

import java.io.Serializable;
import java.util.ArrayList;
public final class k1 implements g9.u, Serializable {
    public final int f14340a;

    public k1() {
        o.g(2, "expectedValuesPerKey");
        this.f14340a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f14340a);
    }
}
