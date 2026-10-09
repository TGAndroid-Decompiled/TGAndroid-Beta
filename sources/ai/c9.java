package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class c9 implements Utilities.CallbackReturn {
    public final e9 f785a;
    public final boolean f786b;
    public final int f787c;
    public final List d;

    public c9(e9 e9Var, boolean z10, int i10, List list) {
        this.f785a = e9Var;
        this.f786b = z10;
        this.f787c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f785a.q(this.f787c, this.d, this.f786b));
    }
}
