package e9;

import java.io.Serializable;
import java.util.ArrayList;
public final class u0 implements d9.i, Serializable {
    public final int f7433a;

    public u0() {
        q.e(2, "expectedValuesPerKey");
        this.f7433a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f7433a);
    }
}
