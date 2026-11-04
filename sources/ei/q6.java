package ei;

import java.util.List;
import org.telegram.messenger.v10;
public final class q6 implements v10 {
    public final r6 f10808a;
    public final boolean f10809b;
    public final int f10810c;
    public final List d;

    public q6(r6 r6Var, boolean z10, int i3, List list) {
        this.f10808a = r6Var;
        this.f10809b = z10;
        this.f10810c = i3;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f10808a.q(this.f10810c, this.d, this.f10809b));
    }
}
