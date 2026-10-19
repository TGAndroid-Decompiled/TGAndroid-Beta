package ci;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.CallbackReturn {
    public final a7 f6251a;
    public final boolean f6252b;
    public final int f6253c;
    public final List d;

    public z6(a7 a7Var, boolean z10, int i10, List list) {
        this.f6251a = a7Var;
        this.f6252b = z10;
        this.f6253c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f6251a.q(this.f6253c, this.d, this.f6252b));
    }
}
