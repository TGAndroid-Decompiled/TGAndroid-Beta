package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final h1 f16268e;
    public static final b2.x0 f16269f;
    public final h1 f16270a;
    public final b2.x0 f16271b;
    public final e9.i0 f16272c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = g1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new g1(((Integer) a1Var.get(i10)).intValue()));
        }
        f16268e = new h1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = g1.f16168e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new g1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new g1(((Integer) a1Var.get(i12)).intValue()));
        }
        new h1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f3601b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f16269f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(h1 h1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f16270a = h1Var;
        this.f16271b = x0Var;
        this.f16272c = i0Var;
        this.d = i0Var2;
    }
}
