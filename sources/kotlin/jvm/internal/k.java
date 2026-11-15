package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f18751a;

    public k(int i7) {
        this.f18751a = i7;
    }

    @Override
    public final int getArity() {
        return this.f18751a;
    }

    public final String toString() {
        s.f18758a.getClass();
        String a10 = t.a(this);
        j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
