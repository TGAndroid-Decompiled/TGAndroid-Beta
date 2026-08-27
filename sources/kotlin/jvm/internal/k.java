package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class k implements g, Serializable {

    public final int f15248a;

    public k(int i10) {
        this.f15248a = i10;
    }

    @Override
    public final int getArity() {
        return this.f15248a;
    }

    public final String toString() {
        r.f15254a.getClass();
        String strA = s.a(this);
        j.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
