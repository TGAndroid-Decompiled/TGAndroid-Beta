package hd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
public abstract class i extends h implements kotlin.jvm.internal.g {
    public final int f14397a;

    public i(int i3, fd.c cVar) {
        super(cVar);
        this.f14397a = i3;
    }

    @Override
    public final int getArity() {
        return this.f14397a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            s.f17362a.getClass();
            String a10 = t.a(this);
            kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
