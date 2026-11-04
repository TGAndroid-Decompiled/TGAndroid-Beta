package o4;

import android.util.SparseBooleanArray;
import b8.zb;
import java.util.HashSet;
public final class t {
    public static final o1 f20853e;
    public static final d2.a1 f20854f;
    public final o1 f20855a;
    public final d2.a1 f20856b;
    public final g9.i0 f20857c;
    public final g9.i0 d;

    static {
        int[] iArr;
        HashSet hashSet = new HashSet();
        g9.s1 s1Var = n1.d;
        for (int i3 = 0; i3 < s1Var.d; i3++) {
            hashSet.add(new n1(((Integer) s1Var.get(i3)).intValue()));
        }
        f20853e = new o1(hashSet);
        HashSet hashSet2 = new HashSet();
        g9.s1 s1Var2 = n1.f20760e;
        for (int i10 = 0; i10 < s1Var2.d; i10++) {
            hashSet2.add(new n1(((Integer) s1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < s1Var.d; i11++) {
            hashSet2.add(new n1(((Integer) s1Var.get(i11)).intValue()));
        }
        new o1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : d2.z0.f8524b) {
            zb.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        zb.p(!false);
        f20854f = new d2.a1(new d2.t(sparseBooleanArray));
    }

    public t(o1 o1Var, d2.a1 a1Var, g9.i0 i0Var, g9.i0 i0Var2) {
        this.f20855a = o1Var;
        this.f20856b = a1Var;
        this.f20857c = i0Var;
        this.d = i0Var2;
    }
}
