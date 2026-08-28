package b5;

import j4.i1;
public final class s {
    public final i1 f1496a;
    public final int[] f1497b;

    public s(int i9, i1 i1Var, int[] iArr) {
        if (iArr.length == 0) {
            d5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f1496a = i1Var;
        this.f1497b = iArr;
    }
}
