package kd;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
public abstract class i extends h implements kotlin.jvm.internal.g {
    public final int f18215a;

    public i(int i7, id.c cVar) {
        super(cVar);
        this.f18215a = i7;
    }

    @Override
    public final int getArity() {
        return this.f18215a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            s.f19122a.getClass();
            String a10 = t.a(this);
            kotlin.jvm.internal.j.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}
