package d5;

import android.util.SparseBooleanArray;
public final class g {
    public final SparseBooleanArray f4361a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.f4361a = sparseBooleanArray;
    }

    public final int a(int i9) {
        SparseBooleanArray sparseBooleanArray = this.f4361a;
        a.h(i9, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f4361a;
        int i9 = f0.f4349a;
        SparseBooleanArray sparseBooleanArray2 = this.f4361a;
        if (i9 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
                if (a(i10) != gVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i9 = f0.f4349a;
        SparseBooleanArray sparseBooleanArray = this.f4361a;
        if (i9 < 24) {
            int size = sparseBooleanArray.size();
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                size = (size * 31) + a(i10);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
