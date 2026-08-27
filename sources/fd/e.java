package fd;

import h7.h7;
import id.r1;
import java.util.Iterator;

public final class e implements b {

    public final int f6043a;

    public final Object f6044b;

    public e(Object obj, int i10) {
        this.f6043a = i10;
        this.f6044b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f6043a) {
            case 0:
                r1 r1Var = (r1) this.f6044b;
                c cVar = new c();
                cVar.f6042c = h7.a(r1Var, cVar, cVar);
                return cVar;
            case 1:
                return (Iterator) this.f6044b;
            default:
                return new gd.b((String) this.f6044b);
        }
    }
}
