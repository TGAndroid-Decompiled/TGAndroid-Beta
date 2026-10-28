package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class j implements f, Serializable {
    public final int f16663a;

    public j(int i10) {
        this.f16663a = i10;
    }

    @Override
    public final int getArity() {
        return this.f16663a;
    }

    public final String toString() {
        q.f16669a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
