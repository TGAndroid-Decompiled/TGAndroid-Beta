package ci;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.CallbackReturn {
    public final z6 f6159a;
    public final boolean f6160b;
    public final int f6161c;
    public final List d;

    public y6(z6 z6Var, boolean z10, int i10, List list) {
        this.f6159a = z6Var;
        this.f6160b = z10;
        this.f6161c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f6159a.q(this.f6161c, this.d, this.f6160b));
    }
}
