package fi;

import java.util.List;
import org.telegram.messenger.z10;
public final class g6 implements z10 {
    public final h6 f12011a;
    public final boolean f12012b;
    public final int f12013c;
    public final List d;

    public g6(h6 h6Var, boolean z10, int i7, List list) {
        this.f12011a = h6Var;
        this.f12012b = z10;
        this.f12013c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f12011a.q(this.f12013c, this.d, this.f12012b));
    }
}
