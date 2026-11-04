package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f17355a;

    public k(int i3) {
        this.f17355a = i3;
    }

    @Override
    public final int getArity() {
        return this.f17355a;
    }

    public final String toString() {
        s.f17362a.getClass();
        String a10 = t.a(this);
        j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
