package d2;

import android.os.Build;
import android.util.SparseBooleanArray;
import b8.zb;
public final class t {
    public final SparseBooleanArray f8412a;

    public t(SparseBooleanArray sparseBooleanArray) {
        this.f8412a = sparseBooleanArray;
    }

    public final int a(int i3) {
        SparseBooleanArray sparseBooleanArray = this.f8412a;
        zb.j(i3, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        SparseBooleanArray sparseBooleanArray = tVar.f8412a;
        int i3 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f8412a;
        if (i3 < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
                if (a(i10) != tVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i3 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f8412a;
        if (i3 < 24) {
            int size = sparseBooleanArray.size();
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                size = (size * 31) + a(i10);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
