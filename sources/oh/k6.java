package oh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class k6 implements Utilities.CallbackReturn {
    public final l6 f17365a;
    public final boolean f17366b;
    public final int f17367c;
    public final List d;

    public k6(l6 l6Var, boolean z4, int i10, List list) {
        this.f17365a = l6Var;
        this.f17366b = z4;
        this.f17367c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f17365a.q(this.f17367c, this.d, this.f17366b));
    }
}
