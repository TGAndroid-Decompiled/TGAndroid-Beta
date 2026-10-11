package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class j implements f, Serializable {
    public final int f15214a;

    public j(int i10) {
        this.f15214a = i10;
    }

    @Override
    public final int getArity() {
        return this.f15214a;
    }

    public final String toString() {
        q.f15220a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
