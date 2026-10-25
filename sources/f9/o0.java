package f9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends g2 {
    public int f10311a;
    public Object f10312b;
    public final Iterator f10313c;

    public o0(g2 g2Var) {
        this.f10313c = g2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f10311a <= 0 && !this.f10313c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f10311a <= 0) {
            o1 o1Var = (o1) this.f10313c.next();
            this.f10312b = o1Var.f10314a;
            this.f10311a = o1Var.a();
        }
        this.f10311a--;
        Object obj = this.f10312b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
