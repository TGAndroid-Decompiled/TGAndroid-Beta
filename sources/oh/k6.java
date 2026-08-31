package oh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class k6 implements Utilities.CallbackReturn {
    public final l6 f17363a;
    public final boolean f17364b;
    public final int f17365c;
    public final List d;

    public k6(l6 l6Var, boolean z4, int i10, List list) {
        this.f17363a = l6Var;
        this.f17364b = z4;
        this.f17365c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f17363a.q(this.f17365c, this.d, this.f17364b));
    }
}
