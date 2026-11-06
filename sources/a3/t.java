package a3;

import e2.m1;
public final class t {
    public final m1 f133a;
    public final int[] f134b;

    public t(m1 m1Var, int... iArr) {
        if (iArr.length == 0) {
            h2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f133a = m1Var;
        this.f134b = iArr;
    }
}
