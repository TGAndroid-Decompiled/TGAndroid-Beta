package b5;

import j4.i1;

public final class r {

    public final i1 f1981a;

    public final int[] f1982b;

    public r(int i10, i1 i1Var, int[] iArr) {
        if (iArr.length == 0) {
            d5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f1981a = i1Var;
        this.f1982b = iArr;
    }
}
