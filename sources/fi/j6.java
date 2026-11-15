package fi;

import java.util.List;
import org.telegram.messenger.a20;
public final class j6 implements a20 {
    public final k6 f11901a;
    public final boolean f11902b;
    public final int f11903c;
    public final List d;

    public j6(k6 k6Var, boolean z10, int i7, List list) {
        this.f11901a = k6Var;
        this.f11902b = z10;
        this.f11903c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f11901a.q(this.f11903c, this.d, this.f11902b));
    }
}
