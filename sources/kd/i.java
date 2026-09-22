package kd;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class i extends h implements kotlin.jvm.internal.f {
    public final int f13586a;

    public i(id.c cVar) {
        super(cVar);
        this.f13586a = 2;
    }

    @Override
    public final int getArity() {
        return this.f13586a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f13895a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
