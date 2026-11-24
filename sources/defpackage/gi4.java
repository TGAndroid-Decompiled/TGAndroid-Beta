package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
public final class gi4 {
    public final SparseBooleanArray a;

    public gi4(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        gre.j(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gi4) {
                gi4 gi4Var = (gi4) obj;
                SparseBooleanArray sparseBooleanArray = gi4Var.a;
                int i = Build.VERSION.SDK_INT;
                SparseBooleanArray sparseBooleanArray2 = this.a;
                if (i < 24) {
                    if (sparseBooleanArray2.size() == sparseBooleanArray.size()) {
                        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                            if (a(i2) == gi4Var.a(i2)) {
                            }
                        }
                        return true;
                    }
                } else {
                    return sparseBooleanArray2.equals(sparseBooleanArray);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + a(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
