package m4;

import android.util.SparseBooleanArray;
import e9.x1;
import java.util.HashSet;
import v7.u6;
public final class t {
    public static final p1 e;
    public static final b2.b1 f16733f;
    public final p1 f16734a;
    public final b2.b1 f16735b;
    public final e9.n0 f16736c;
    public final e9.n0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        x1 x1Var = o1.d;
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            hashSet.add(new o1(((Integer) x1Var.get(i10)).intValue()));
        }
        e = new p1(hashSet);
        HashSet hashSet2 = new HashSet();
        x1 x1Var2 = o1.e;
        for (int i11 = 0; i11 < x1Var2.d; i11++) {
            hashSet2.add(new o1(((Integer) x1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < x1Var.d; i12++) {
            hashSet2.add(new o1(((Integer) x1Var.get(i12)).intValue()));
        }
        new p1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.a1.f3691b) {
            u6.p(!false);
            sparseBooleanArray.append(i13, true);
        }
        u6.p(!false);
        f16733f = new b2.b1(new b2.u(sparseBooleanArray));
    }

    public t(p1 p1Var, b2.b1 b1Var, e9.n0 n0Var, e9.n0 n0Var2) {
        this.f16734a = p1Var;
        this.f16735b = b1Var;
        this.f16736c = n0Var;
        this.d = n0Var2;
    }
}
