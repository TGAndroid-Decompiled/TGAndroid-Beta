package hd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
public abstract class j extends c implements kotlin.jvm.internal.g {
    private final int arity;

    public j(int i3, fd.c cVar) {
        super(cVar);
        this.arity = i3;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            s.f17362a.getClass();
            String a10 = t.a(this);
            kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
