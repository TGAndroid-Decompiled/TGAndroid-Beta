package g9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends g2 {
    public int f12111a;
    public Object f12112b;
    public final Iterator f12113c;

    public o0(g2 g2Var) {
        this.f12113c = g2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f12111a <= 0 && !this.f12113c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f12111a <= 0) {
            o1 o1Var = (o1) this.f12113c.next();
            this.f12112b = o1Var.f12114a;
            this.f12111a = o1Var.a();
        }
        this.f12111a--;
        Object obj = this.f12112b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
