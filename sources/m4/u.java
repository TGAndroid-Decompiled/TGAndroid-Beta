package m4;

import a8.yb;
import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class u {
    public static final q1 e;
    public static final b2.c1 f18258f;
    public final q1 f18259a;
    public final b2.c1 f18260b;
    public final f9.i0 f18261c;
    public final f9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        f9.s1 s1Var = p1.d;
        for (int i10 = 0; i10 < s1Var.d; i10++) {
            hashSet.add(new p1(((Integer) s1Var.get(i10)).intValue()));
        }
        e = new q1(hashSet);
        HashSet hashSet2 = new HashSet();
        f9.s1 s1Var2 = p1.e;
        for (int i11 = 0; i11 < s1Var2.d; i11++) {
            hashSet2.add(new p1(((Integer) s1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < s1Var.d; i12++) {
            hashSet2.add(new p1(((Integer) s1Var.get(i12)).intValue()));
        }
        new q1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.b1.f3146b) {
            yb.p(!false);
            sparseBooleanArray.append(i13, true);
        }
        yb.p(!false);
        f18258f = new b2.c1(new b2.v(sparseBooleanArray));
    }

    public u(q1 q1Var, b2.c1 c1Var, f9.i0 i0Var, f9.i0 i0Var2) {
        this.f18259a = q1Var;
        this.f18260b = c1Var;
        this.f18261c = i0Var;
        this.d = i0Var2;
    }
}
