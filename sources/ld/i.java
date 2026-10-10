package ld;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class i extends h implements kotlin.jvm.internal.f {
    public final int f15504a;

    public i(jd.c cVar) {
        super(cVar);
        this.f15504a = 2;
    }

    @Override
    public final int getArity() {
        return this.f15504a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f15185a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
