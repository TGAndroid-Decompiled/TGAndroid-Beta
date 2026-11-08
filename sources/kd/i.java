package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
public abstract class i extends h implements kotlin.jvm.internal.g {
    public final int f17264a;

    public i(int i7, id.c cVar) {
        super(cVar);
        this.f17264a = i7;
    }

    @Override
    public final int getArity() {
        return this.f17264a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            s.f17616a.getClass();
            String a10 = t.a(this);
            kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
