package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class k implements g, Serializable {
    public final int f10985a;

    public k(int i10) {
        this.f10985a = i10;
    }

    @Override
    public final int getArity() {
        return this.f10985a;
    }

    public final String toString() {
        r.f10991a.getClass();
        String a2 = s.a(this);
        j.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
