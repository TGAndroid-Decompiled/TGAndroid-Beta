package lh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class j6 implements Utilities.CallbackReturn {
    public final k6 f15806a;
    public final boolean f15807b;
    public final int f15808c;
    public final List d;

    public j6(k6 k6Var, boolean z10, int i10, List list) {
        this.f15806a = k6Var;
        this.f15807b = z10;
        this.f15808c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f15806a.q(this.f15808c, this.d, this.f15807b));
    }
}
