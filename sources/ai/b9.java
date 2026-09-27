package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f613a;
    public final boolean f614b;
    public final int f615c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f613a = d9Var;
        this.f614b = z10;
        this.f615c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f613a.q(this.f615c, this.d, this.f614b));
    }
}
