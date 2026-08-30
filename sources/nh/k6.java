package nh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class k6 implements Utilities.CallbackReturn {
    public final l6 f15540a;
    public final boolean f15541b;
    public final int f15542c;
    public final List d;

    public k6(l6 l6Var, boolean z4, int i10, List list) {
        this.f15540a = l6Var;
        this.f15541b = z4;
        this.f15542c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f15540a.q(this.f15542c, this.d, this.f15541b));
    }
}
