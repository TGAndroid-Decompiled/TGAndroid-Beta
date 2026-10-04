package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class b9 implements Utilities.CallbackReturn {
    public final d9 f662a;
    public final boolean f663b;
    public final int f664c;
    public final List d;

    public b9(d9 d9Var, boolean z10, int i10, List list) {
        this.f662a = d9Var;
        this.f663b = z10;
        this.f664c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f662a.q(this.f664c, this.d, this.f663b));
    }
}
