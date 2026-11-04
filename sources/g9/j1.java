package g9;

import java.io.Serializable;
import java.util.ArrayList;
public final class j1 implements f9.t, Serializable {
    public final int f12087a;

    public j1() {
        o.g(2, "expectedValuesPerKey");
        this.f12087a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f12087a);
    }
}
