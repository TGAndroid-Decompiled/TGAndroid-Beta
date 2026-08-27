package b5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d5.g0;
import j4.j1;
import java.util.Map;

public final class i extends y {

    public static final int f1950b0 = 0;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final SparseArray Z;

    public final SparseBooleanArray f1951a0;

    static {
        new i(new h());
        int i10 = g0.f4795a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
    }

    public i(h hVar) {
        super(hVar);
        this.M = hVar.A;
        this.N = hVar.B;
        this.O = hVar.C;
        this.P = hVar.D;
        this.Q = hVar.E;
        this.R = hVar.F;
        this.S = hVar.G;
        this.T = hVar.H;
        this.U = hVar.I;
        this.V = hVar.J;
        this.W = hVar.K;
        this.X = hVar.L;
        this.Y = hVar.M;
        this.Z = hVar.N;
        this.f1951a0 = hVar.O;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (super.equals(iVar) && this.M == iVar.M && this.N == iVar.N && this.O == iVar.O && this.P == iVar.P && this.Q == iVar.Q && this.R == iVar.R && this.S == iVar.S && this.T == iVar.T && this.U == iVar.U && this.V == iVar.V && this.W == iVar.W && this.X == iVar.X && this.Y == iVar.Y) {
                SparseBooleanArray sparseBooleanArray = iVar.f1951a0;
                SparseBooleanArray sparseBooleanArray2 = this.f1951a0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = iVar.Z;
                    SparseArray sparseArray2 = this.Z;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i11 = 0; i11 < size2; i11++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i11);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        j1 j1Var = (j1) entry.getKey();
                                        if (!map2.containsKey(j1Var) || !g0.a(entry.getValue(), map2.get(j1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0);
    }
}
