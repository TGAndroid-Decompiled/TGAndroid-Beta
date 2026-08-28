package o8;

import java.io.Serializable;
import java.util.ArrayList;
public final class g0 implements n8.i, Serializable {
    public final int f19046a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.f19046a = 2;
    }

    @Override
    public final Object get() {
        return new ArrayList(this.f19046a);
    }
}
