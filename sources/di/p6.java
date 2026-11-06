package di;

import java.util.List;
import org.telegram.messenger.d20;
public final class p6 implements d20 {
    public final q6 f9514a;
    public final boolean f9515b;
    public final int f9516c;
    public final List d;

    public p6(q6 q6Var, boolean z9, int i7, List list) {
        this.f9514a = q6Var;
        this.f9515b = z9;
        this.f9516c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f9514a.q(this.f9516c, this.d, this.f9515b));
    }
}
