package bi;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class m8 implements Utilities.CallbackReturn {
    public final o8 f3325a;
    public final boolean f3326b;
    public final int f3327c;
    public final List d;

    public m8(o8 o8Var, boolean z10, int i10, List list) {
        this.f3325a = o8Var;
        this.f3326b = z10;
        this.f3327c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f3325a.q(this.f3327c, this.d, this.f3326b));
    }
}
