package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f610a;
    public final boolean f611b;
    public final int f612c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f610a = d9Var;
        this.f611b = z10;
        this.f612c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f610a.q(this.f612c, this.d, this.f611b));
    }
}
