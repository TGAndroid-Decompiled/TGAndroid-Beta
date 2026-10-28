package f9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends g2 {
    public int f10310a;
    public Object f10311b;
    public final Iterator f10312c;

    public o0(g2 g2Var) {
        this.f10312c = g2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f10310a <= 0 && !this.f10312c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f10310a <= 0) {
            o1 o1Var = (o1) this.f10312c.next();
            this.f10311b = o1Var.f10313a;
            this.f10310a = o1Var.a();
        }
        this.f10310a--;
        Object obj = this.f10311b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
