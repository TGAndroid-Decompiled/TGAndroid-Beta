package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f17609a;

    public k(int i7) {
        this.f17609a = i7;
    }

    @Override
    public final int getArity() {
        return this.f17609a;
    }

    public final String toString() {
        s.f17616a.getClass();
        String a10 = t.a(this);
        j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
