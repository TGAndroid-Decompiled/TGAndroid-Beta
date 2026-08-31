package e8;

import android.util.SparseIntArray;
public final class b {
    public static final Object f4998c = new Object();
    public static int d;
    public final SparseIntArray f4999a = new SparseIntArray();
    public final SparseIntArray f5000b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f4998c) {
            try {
                int i11 = this.f4999a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f4999a.append(i10, i12);
                this.f5000b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
