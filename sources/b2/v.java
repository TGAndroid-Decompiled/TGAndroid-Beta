package b2;

import android.os.Build;
import android.util.SparseBooleanArray;
import v7.u6;
public final class v {
    public final SparseBooleanArray f2447a;

    public v(SparseBooleanArray sparseBooleanArray) {
        this.f2447a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f2447a;
        u6.j(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        SparseBooleanArray sparseBooleanArray = vVar.f2447a;
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f2447a;
        if (i10 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
                if (a(i11) != vVar.a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f2447a;
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
