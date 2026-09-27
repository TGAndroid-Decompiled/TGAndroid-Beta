package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final h1 e;
    public static final b2.x0 f14935f;
    public final h1 f14936a;
    public final b2.x0 f14937b;
    public final e9.i0 f14938c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = g1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new g1(((Integer) a1Var.get(i10)).intValue()));
        }
        e = new h1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = g1.e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new g1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new g1(((Integer) a1Var.get(i12)).intValue()));
        }
        new h1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f3337b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f14935f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(h1 h1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f14936a = h1Var;
        this.f14937b = x0Var;
        this.f14938c = i0Var;
        this.d = i0Var2;
    }
}
