package fi;

import java.util.List;
import org.telegram.messenger.z10;
public final class g6 implements z10 {
    public final h6 f12060a;
    public final boolean f12061b;
    public final int f12062c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12060a = h6Var;
        this.f12061b = z10;
        this.f12062c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12060a.q(this.f12062c, this.d, this.f12061b));
    }
}
