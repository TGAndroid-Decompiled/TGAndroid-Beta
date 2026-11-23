package fi;

import java.util.List;
import org.telegram.messenger.x10;
public final class g6 implements x10 {
    public final h6 f12022a;
    public final boolean f12023b;
    public final int f12024c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12022a = h6Var;
        this.f12023b = z10;
        this.f12024c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12022a.q(this.f12024c, this.d, this.f12023b));
    }
}
