package bi;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class m8 implements Utilities.CallbackReturn {
    public final o8 f3321a;
    public final boolean f3322b;
    public final int f3323c;
    public final List d;

    public m8(o8 o8Var, boolean z10, int i10, List list) {
        this.f3321a = o8Var;
        this.f3322b = z10;
        this.f3323c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f3321a.q(this.f3323c, this.d, this.f3322b));
    }
}
