package b5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d5.f0;
import j4.j1;
import java.util.Map;
public final class j extends z {
    public static final int f1465b0 = 0;
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
    public final SparseBooleanArray f1466a0;

    static {
        new j(new i());
        int i9 = f0.f4349a;
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

    public j(i iVar) {
        super(iVar);
        this.M = iVar.A;
        this.N = iVar.B;
        this.O = iVar.C;
        this.P = iVar.D;
        this.Q = iVar.E;
        this.R = iVar.F;
        this.S = iVar.G;
        this.T = iVar.H;
        this.U = iVar.I;
        this.V = iVar.J;
        this.W = iVar.K;
        this.X = iVar.L;
        this.Y = iVar.M;
        this.Z = iVar.N;
        this.f1466a0 = iVar.O;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (super.equals(jVar) && this.M == jVar.M && this.N == jVar.N && this.O == jVar.O && this.P == jVar.P && this.Q == jVar.Q && this.R == jVar.R && this.S == jVar.S && this.T == jVar.T && this.U == jVar.U && this.V == jVar.V && this.W == jVar.W && this.X == jVar.X && this.Y == jVar.Y) {
                SparseBooleanArray sparseBooleanArray = jVar.f1466a0;
                SparseBooleanArray sparseBooleanArray2 = this.f1466a0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i9)) < 0) {
                                break;
                            }
                            i9++;
                        } else {
                            SparseArray sparseArray = jVar.Z;
                            SparseArray sparseArray2 = this.Z;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i10);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                j1 j1Var = (j1) entry.getKey();
                                                if (map2.containsKey(j1Var)) {
                                                    if (!f0.a(entry.getValue(), map2.get(j1Var))) {
                                                    }
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
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0);
    }
}
