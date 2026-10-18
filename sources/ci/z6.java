package ci;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.CallbackReturn {
    public final a7 f6254a;
    public final boolean f6255b;
    public final int f6256c;
    public final List d;

    public z6(a7 a7Var, boolean z10, int i10, List list) {
        this.f6254a = a7Var;
        this.f6255b = z10;
        this.f6256c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f6254a.q(this.f6256c, this.d, this.f6255b));
    }
}
