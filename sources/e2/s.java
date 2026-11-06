package e2;

import a8.ia;
import android.os.Build;
import android.util.SparseBooleanArray;
public final class s {
    public final SparseBooleanArray f10542a;

    public s(SparseBooleanArray sparseBooleanArray) {
        this.f10542a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f10542a;
        ia.j(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        SparseBooleanArray sparseBooleanArray = sVar.f10542a;
        int i7 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f10542a;
        if (i7 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
                if (a(i10) != sVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i7 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f10542a;
        if (i7 < 24) {
            int size = sparseBooleanArray.size();
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                size = (size * 31) + a(i10);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
