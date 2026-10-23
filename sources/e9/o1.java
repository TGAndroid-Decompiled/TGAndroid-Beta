package e9;

import java.io.Serializable;
import java.util.ArrayList;
public final class o1 implements d9.u, Serializable {
    public final int f8485a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.f8485a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f8485a);
    }
}
