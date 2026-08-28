package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class j implements f, Serializable {
    public final int f16494a;

    public j(int i9) {
        this.f16494a = i9;
    }

    @Override
    public final int getArity() {
        return this.f16494a;
    }

    public final String toString() {
        q.f16500a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
