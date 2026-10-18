package ci;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.CallbackReturn {
    public final z6 f6150a;
    public final boolean f6151b;
    public final int f6152c;
    public final List d;

    public y6(z6 z6Var, boolean z10, int i10, List list) {
        this.f6150a = z6Var;
        this.f6151b = z10;
        this.f6152c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f6150a.q(this.f6152c, this.d, this.f6151b));
    }
}
