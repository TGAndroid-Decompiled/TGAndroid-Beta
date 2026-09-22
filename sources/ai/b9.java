package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f592a;
    public final boolean f593b;
    public final int f594c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f592a = d9Var;
        this.f593b = z10;
        this.f594c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f592a.q(this.f594c, this.d, this.f593b));
    }
}
