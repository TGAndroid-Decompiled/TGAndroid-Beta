package ed;

import g7.g7;
import hd.r1;
import java.util.Iterator;
public final class e implements b {
    public final int f5112a;
    public final Object f5113b;

    public e(Object obj, int i9) {
        this.f5112a = i9;
        this.f5113b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f5112a) {
            case 0:
                ?? obj = new Object();
                obj.f5111c = g7.a(obj, obj, (r1) this.f5113b);
                return obj;
            case 1:
                return (Iterator) this.f5113b;
            default:
                return new fd.b((String) this.f5113b);
        }
    }
}
