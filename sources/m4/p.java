package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final j1 f16269e;
    public static final b2.x0 f16270f;
    public final j1 f16271a;
    public final b2.x0 f16272b;
    public final e9.i0 f16273c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = i1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new i1(((Integer) a1Var.get(i10)).intValue()));
        }
        f16269e = new j1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = i1.f16172e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new i1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new i1(((Integer) a1Var.get(i12)).intValue()));
        }
        new j1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f3680b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f16270f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(j1 j1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f16271a = j1Var;
        this.f16272b = x0Var;
        this.f16273c = i0Var;
        this.d = i0Var2;
    }
}
