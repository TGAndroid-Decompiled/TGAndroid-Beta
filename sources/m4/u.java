package m4;

import android.util.SparseBooleanArray;
import e9.x1;
import java.util.HashSet;
import v7.u6;
public final class u {
    public static final q1 e;
    public static final b2.c1 f15643f;
    public final q1 f15644a;
    public final b2.c1 f15645b;
    public final e9.n0 f15646c;
    public final e9.n0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        x1 x1Var = p1.d;
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            hashSet.add(new p1(((Integer) x1Var.get(i10)).intValue()));
        }
        e = new q1(hashSet);
        HashSet hashSet2 = new HashSet();
        x1 x1Var2 = p1.e;
        for (int i11 = 0; i11 < x1Var2.d; i11++) {
            hashSet2.add(new p1(((Integer) x1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < x1Var.d; i12++) {
            hashSet2.add(new p1(((Integer) x1Var.get(i12)).intValue()));
        }
        new q1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.b1.f2079b) {
            u6.p(!false);
            sparseBooleanArray.append(i13, true);
        }
        u6.p(!false);
        f15643f = new b2.c1(new b2.v(sparseBooleanArray));
    }

    public u(q1 q1Var, b2.c1 c1Var, e9.n0 n0Var, e9.n0 n0Var2) {
        this.f15644a = q1Var;
        this.f15645b = c1Var;
        this.f15646c = n0Var;
        this.d = n0Var2;
    }
}
