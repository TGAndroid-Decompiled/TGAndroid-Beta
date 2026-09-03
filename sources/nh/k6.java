package nh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class k6 implements Utilities.CallbackReturn {
    public final l6 f15520a;
    public final boolean f15521b;
    public final int f15522c;
    public final List d;

    public k6(l6 l6Var, boolean z4, int i10, List list) {
        this.f15520a = l6Var;
        this.f15521b = z4;
        this.f15522c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f15520a.q(this.f15522c, this.d, this.f15521b));
    }
}
