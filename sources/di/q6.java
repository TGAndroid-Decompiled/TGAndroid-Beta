package di;

import java.util.List;
import org.telegram.messenger.d20;
public final class q6 implements d20 {
    public final r6 f9579a;
    public final boolean f9580b;
    public final int f9581c;
    public final List d;

    public q6(r6 r6Var, boolean z9, int i7, List list) {
        this.f9579a = r6Var;
        this.f9580b = z9;
        this.f9581c = i7;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f9579a.q(this.f9581c, this.d, this.f9580b));
    }
}
