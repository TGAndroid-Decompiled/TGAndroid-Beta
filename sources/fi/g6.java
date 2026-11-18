package fi;

import java.util.List;
import org.telegram.messenger.y10;
public final class g6 implements y10 {
    public final h6 f12019a;
    public final boolean f12020b;
    public final int f12021c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12019a = h6Var;
        this.f12020b = z10;
        this.f12021c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12019a.q(this.f12021c, this.d, this.f12020b));
    }
}
