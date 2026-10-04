package kd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class i extends h implements kotlin.jvm.internal.f {
    public final int f14757a;

    public i(id.c cVar) {
        super(cVar);
        this.f14757a = 2;
    }

    @Override
    public final int getArity() {
        return this.f14757a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f15115a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
