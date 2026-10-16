package md;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class h extends g implements kotlin.jvm.internal.f {
    public final int f15494a;

    public h(kd.c cVar) {
        super(cVar);
        this.f15494a = 2;
    }

    @Override
    public final int getArity() {
        return this.f15494a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f14366a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
