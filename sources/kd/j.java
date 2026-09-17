package kd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class j extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public j(int i10, id.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            q.f15080a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
