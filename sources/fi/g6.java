package fi;

import java.util.List;
import org.telegram.messenger.y10;
public final class g6 implements y10 {
    public final h6 f12057a;
    public final boolean f12058b;
    public final int f12059c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12057a = h6Var;
        this.f12058b = z10;
        this.f12059c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12057a.q(this.f12059c, this.d, this.f12058b));
    }
}
