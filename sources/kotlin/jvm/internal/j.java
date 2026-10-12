package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class j implements f, Serializable {
    public final int f14924a;

    public j(int i10) {
        this.f14924a = i10;
    }

    @Override
    public final int getArity() {
        return this.f14924a;
    }

    public final String toString() {
        q.f14930a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
