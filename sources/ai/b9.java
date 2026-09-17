package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f595a;
    public final boolean f596b;
    public final int f597c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f595a = d9Var;
        this.f596b = z10;
        this.f597c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f595a.q(this.f597c, this.d, this.f596b));
    }
}
