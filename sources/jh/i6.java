package jh;

import java.util.List;
import org.telegram.messenger.Utilities;

public final class i6 implements Utilities.CallbackReturn {

    public final j6 f13450a;

    public final boolean f13451b;

    public final int f13452c;
    public final List d;

    public i6(j6 j6Var, boolean z10, int i10, List list) {
        this.f13450a = j6Var;
        this.f13451b = z10;
        this.f13452c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        return Boolean.valueOf(this.f13450a.q(this.f13452c, this.d, this.f13451b));
    }
}
