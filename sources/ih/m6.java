package ih;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class m6 implements Utilities.CallbackReturn {
    public final n6 f11769a;
    public final boolean f11770b;
    public final int f11771c;
    public final List d;

    public m6(n6 n6Var, boolean z10, int i9, List list) {
        this.f11769a = n6Var;
        this.f11770b = z10;
        this.f11771c = i9;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f11769a.q(this.f11771c, this.d, this.f11770b));
    }
}
