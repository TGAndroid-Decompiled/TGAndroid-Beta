package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final j1 f15956e;
    public static final b2.x0 f15957f;
    public final j1 f15958a;
    public final b2.x0 f15959b;
    public final e9.i0 f15960c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = i1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new i1(((Integer) a1Var.get(i10)).intValue()));
        }
        f15956e = new j1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = i1.f15860e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new i1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new i1(((Integer) a1Var.get(i12)).intValue()));
        }
        new j1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f3678b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f15957f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(j1 j1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f15958a = j1Var;
        this.f15959b = x0Var;
        this.f15960c = i0Var;
        this.d = i0Var2;
    }
}
