package e9;

import java.io.Serializable;
import java.util.ArrayList;
public final class o1 implements d9.t, Serializable {
    public final int f6394a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.f6394a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f6394a);
    }
}
