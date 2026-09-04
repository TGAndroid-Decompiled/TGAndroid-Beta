package bi;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class j8 implements Utilities.CallbackReturn {
    public final l8 f3144a;
    public final boolean f3145b;
    public final int f3146c;
    public final List d;

    public j8(l8 l8Var, boolean z10, int i10, List list) {
        this.f3144a = l8Var;
        this.f3145b = z10;
        this.f3146c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f3144a.q(this.f3146c, this.d, this.f3145b));
    }
}
