package di;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.CallbackReturn {
    public final z6 f9403a;
    public final boolean f9404b;
    public final int f9405c;
    public final List d;

    public y6(z6 z6Var, boolean z10, int i10, List list) {
        this.f9403a = z6Var;
        this.f9404b = z10;
        this.f9405c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f9403a.q(this.f9405c, this.d, this.f9404b));
    }
}
