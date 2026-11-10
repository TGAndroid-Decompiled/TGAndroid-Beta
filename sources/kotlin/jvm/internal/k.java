package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f17612a;

    public k(int i7) {
        this.f17612a = i7;
    }

    @Override
    public final int getArity() {
        return this.f17612a;
    }

    public final String toString() {
        s.f17619a.getClass();
        String a10 = t.a(this);
        j.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}
