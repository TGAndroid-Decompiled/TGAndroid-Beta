package di;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.CallbackReturn {
    public final z6 f9402a;
    public final boolean f9403b;
    public final int f9404c;
    public final List d;

    public y6(z6 z6Var, boolean z10, int i10, List list) {
        this.f9402a = z6Var;
        this.f9403b = z10;
        this.f9404c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f9402a.q(this.f9404c, this.d, this.f9403b));
    }
}
