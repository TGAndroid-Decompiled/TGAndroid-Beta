package bi;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class j8 implements Utilities.CallbackReturn {
    public final l8 f3171a;
    public final boolean f3172b;
    public final int f3173c;
    public final List d;

    public j8(l8 l8Var, boolean z10, int i10, List list) {
        this.f3171a = l8Var;
        this.f3172b = z10;
        this.f3173c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f3171a.q(this.f3173c, this.d, this.f3172b));
    }
}
