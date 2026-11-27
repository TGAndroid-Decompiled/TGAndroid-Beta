package defpackage;

import java.util.Iterator;
public final class nu5 extends x2c {
    public final es4 b;

    public nu5(Iterator it, es4 es4Var) {
        super(it);
        this.b = es4Var;
    }

    @Override
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
