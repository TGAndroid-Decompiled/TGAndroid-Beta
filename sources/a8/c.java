package a8;

import android.util.SparseIntArray;
public final class c {
    public static final Object f112c = new Object();
    public static int d;
    public final SparseIntArray f113a = new SparseIntArray();
    public final SparseIntArray f114b = new SparseIntArray();

    public final int a(int i9) {
        synchronized (f112c) {
            try {
                int i10 = this.f113a.get(i9, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.f113a.append(i9, i11);
                this.f114b.append(i11, i9);
                return i11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
