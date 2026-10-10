package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final i1 f16212e;
    public static final b2.x0 f16213f;
    public final i1 f16214a;
    public final b2.x0 f16215b;
    public final e9.i0 f16216c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = h1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new h1(((Integer) a1Var.get(i10)).intValue()));
        }
        f16212e = new i1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = h1.f16114e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new h1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new h1(((Integer) a1Var.get(i12)).intValue()));
        }
        new i1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f3680b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f16213f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(i1 i1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f16214a = i1Var;
        this.f16215b = x0Var;
        this.f16216c = i0Var;
        this.d = i0Var2;
    }
}
