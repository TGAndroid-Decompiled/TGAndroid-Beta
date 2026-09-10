package m4;

import android.util.SparseBooleanArray;
import java.util.HashSet;
public final class p {
    public static final o1 e;
    public static final b2.x0 f13467f;
    public final o1 f13468a;
    public final b2.x0 f13469b;
    public final e9.i0 f13470c;
    public final e9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        e9.a1 a1Var = n1.d;
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            hashSet.add(new n1(((Integer) a1Var.get(i10)).intValue()));
        }
        e = new o1(hashSet);
        HashSet hashSet2 = new HashSet();
        e9.a1 a1Var2 = n1.e;
        for (int i11 = 0; i11 < a1Var2.d; i11++) {
            hashSet2.add(new n1(((Integer) a1Var2.get(i11)).intValue()));
        }
        for (int i12 = 0; i12 < a1Var.d; i12++) {
            hashSet2.add(new n1(((Integer) a1Var.get(i12)).intValue()));
        }
        new o1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i13 : b2.w0.f2036b) {
            e2.d.g(!false);
            sparseBooleanArray.append(i13, true);
        }
        e2.d.g(!false);
        f13467f = new b2.x0(new b2.q(sparseBooleanArray));
    }

    public p(o1 o1Var, b2.x0 x0Var, e9.i0 i0Var, e9.i0 i0Var2) {
        this.f13468a = o1Var;
        this.f13469b = x0Var;
        this.f13470c = i0Var;
        this.d = i0Var2;
    }
}
