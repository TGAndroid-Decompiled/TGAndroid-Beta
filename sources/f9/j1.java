package f9;

import java.io.Serializable;
import java.util.ArrayList;
public final class j1 implements e9.t, Serializable {
    public final int f10288a;

    public j1() {
        o.f(2, "expectedValuesPerKey");
        this.f10288a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f10288a);
    }
}
