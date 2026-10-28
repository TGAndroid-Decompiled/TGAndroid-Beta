package nd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class h extends g implements kotlin.jvm.internal.f {
    public final int f18777a;

    public h(ld.c cVar) {
        super(cVar);
        this.f18777a = 2;
    }

    @Override
    public final int getArity() {
        return this.f18777a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f16669a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
