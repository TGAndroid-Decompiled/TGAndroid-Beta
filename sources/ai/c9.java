package ai;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class c9 implements Utilities.CallbackReturn {
    public final e9 f783a;
    public final boolean f784b;
    public final int f785c;
    public final List d;

    public c9(e9 e9Var, boolean z10, int i10, List list) {
        this.f783a = e9Var;
        this.f784b = z10;
        this.f785c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f783a.q(this.f785c, this.d, this.f784b));
    }
}
