package di;

import java.util.List;
import org.telegram.messenger.d20;
public final class q6 implements d20 {
    public final r6 f9584a;
    public final boolean f9585b;
    public final int f9586c;
    public final List d;

    public q6(r6 r6Var, boolean z9, int i7, List list) {
        this.f9584a = r6Var;
        this.f9585b = z9;
        this.f9586c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f9584a.q(this.f9586c, this.d, this.f9585b));
    }
}
