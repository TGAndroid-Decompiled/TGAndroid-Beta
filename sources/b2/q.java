package b2;

import android.os.Build;
import android.util.SparseBooleanArray;
public final class q {
    public final SparseBooleanArray f2259a;

    public q(SparseBooleanArray sparseBooleanArray) {
        this.f2259a = sparseBooleanArray;
    }

    public final int a(int i10) {
        SparseBooleanArray sparseBooleanArray = this.f2259a;
        e2.d.c(i10, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        SparseBooleanArray sparseBooleanArray = qVar.f2259a;
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f2259a;
        if (i10 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i11 = 0; i11 < sparseBooleanArray2.size(); i11++) {
                if (a(i11) != qVar.a(i11)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i10 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f2259a;
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
