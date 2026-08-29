package f5;

import android.util.SparseBooleanArray;
public final class g {
    public final SparseBooleanArray f6596a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.f6596a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f6596a;
        a.h(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f6596a;
        int i10 = d0.f6579a;
        SparseBooleanArray sparseBooleanArray2 = this.f6596a;
        if (i10 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
                if (a(i11) != gVar.a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i10 = d0.f6579a;
        SparseBooleanArray sparseBooleanArray = this.f6596a;
        if (i10 < 24) {
            int size = sparseBooleanArray.size();
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                size = (size * 31) + a(i11);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
