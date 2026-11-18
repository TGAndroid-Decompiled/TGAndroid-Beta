package fi;

import java.util.List;
import org.telegram.messenger.y10;
public final class g6 implements y10 {
    public final h6 f12016a;
    public final boolean f12017b;
    public final int f12018c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12016a = h6Var;
        this.f12017b = z10;
        this.f12018c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12016a.q(this.f12018c, this.d, this.f12017b));
    }
}
