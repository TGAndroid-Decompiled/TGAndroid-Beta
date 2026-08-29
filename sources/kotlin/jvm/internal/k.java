package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f13922a;

    public k(int i10) {
        this.f13922a = i10;
    }

    @Override
    public final int getArity() {
        return this.f13922a;
    }

    public final String toString() {
        r.f13928a.getClass();
        String a2 = s.a(this);
        j.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
