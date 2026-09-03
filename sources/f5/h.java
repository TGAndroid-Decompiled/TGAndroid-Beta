package f5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import h5.d0;
import java.util.Map;
import o4.t0;
public final class h extends w {
    public static final int f5915d0 = 0;
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
    public final boolean Z;
    public final boolean f5916a0;
    public final SparseArray f5917b0;
    public final SparseBooleanArray f5918c0;

    static {
        new h(new g());
        int i10 = d0.f6924a;
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
        Integer.toString(1017, 36);
    }

    public h(g gVar) {
        super(gVar);
        this.N = gVar.A;
        this.O = gVar.B;
        this.P = gVar.C;
        this.Q = gVar.D;
        this.R = gVar.E;
        this.S = gVar.F;
        this.T = gVar.G;
        this.U = gVar.H;
        this.V = gVar.I;
        this.W = gVar.J;
        this.X = gVar.K;
        this.Y = gVar.L;
        this.Z = gVar.M;
        this.f5916a0 = gVar.N;
        this.f5917b0 = gVar.O;
        this.f5918c0 = gVar.P;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (super.equals(hVar) && this.N == hVar.N && this.O == hVar.O && this.P == hVar.P && this.Q == hVar.Q && this.R == hVar.R && this.S == hVar.S && this.T == hVar.T && this.U == hVar.U && this.V == hVar.V && this.W == hVar.W && this.X == hVar.X && this.Y == hVar.Y && this.Z == hVar.Z && this.f5916a0 == hVar.f5916a0) {
                SparseBooleanArray sparseBooleanArray = hVar.f5918c0;
                SparseBooleanArray sparseBooleanArray2 = this.f5918c0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        } else {
                            SparseArray sparseArray = hVar.f5917b0;
                            SparseArray sparseArray2 = this.f5917b0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                t0 t0Var = (t0) entry.getKey();
                                                if (map2.containsKey(t0Var)) {
                                                    if (!d0.a(entry.getValue(), map2.get(t0Var))) {
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
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0)) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f5916a0 ? 1 : 0);
    }
}
