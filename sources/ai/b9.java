package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f590a;
    public final boolean f591b;
    public final int f592c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f590a = d9Var;
        this.f591b = z10;
        this.f592c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f590a.q(this.f592c, this.d, this.f591b));
    }
}
