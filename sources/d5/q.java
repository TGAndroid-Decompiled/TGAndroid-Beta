package d5;

import l4.j1;
public final class q {
    public final j1 f5370a;
    public final int[] f5371b;

    public q(int i10, j1 j1Var, int[] iArr) {
        if (iArr.length == 0) {
            f5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f5370a = j1Var;
        this.f5371b = iArr;
    }
}
