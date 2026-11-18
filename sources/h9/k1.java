package h9;

import java.io.Serializable;
import java.util.ArrayList;
public final class k1 implements g9.t, Serializable {
    public final int f14012a;

    public k1() {
        o.g(2, "expectedValuesPerKey");
        this.f14012a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f14012a);
    }
}
