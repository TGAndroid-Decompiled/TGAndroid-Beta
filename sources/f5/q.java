package f5;

import o4.s0;
public final class q {
    public final s0 f6059a;
    public final int[] f6060b;

    public q(int i10, s0 s0Var, int[] iArr) {
        if (iArr.length == 0) {
            h5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f6059a = s0Var;
        this.f6060b = iArr;
    }
}
