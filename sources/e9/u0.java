package e9;

import java.io.Serializable;
import java.util.ArrayList;
public final class u0 implements d9.j, Serializable {
    public final int f8804a;

    public u0() {
        q.e(2, "expectedValuesPerKey");
        this.f8804a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f8804a);
    }
}
