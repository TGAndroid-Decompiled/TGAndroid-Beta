package kotlin.jvm.internal;

import java.io.Serializable;
public abstract class j implements f, Serializable {
    public final int f13904a;

    public j(int i10) {
        this.f13904a = i10;
    }

    @Override
    public final int getArity() {
        return this.f13904a;
    }

    public final String toString() {
        q.f13910a.getClass();
        String a2 = r.a(this);
        i.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
