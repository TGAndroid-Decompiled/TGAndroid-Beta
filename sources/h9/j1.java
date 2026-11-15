package h9;

import java.io.Serializable;
import java.util.ArrayList;
public final class j1 implements g9.t, Serializable {
    public final int f13690a;

    public j1() {
        o.g(2, "expectedValuesPerKey");
        this.f13690a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f13690a);
    }
}
