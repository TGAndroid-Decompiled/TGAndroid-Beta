package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class c extends dd.k {
    public final long f9552c;
    public final ArrayList d;
    public final ArrayList f9553e;

    public c(int i10, long j3) {
        super(i10, 1);
        this.f9552c = j3;
        this.d = new ArrayList();
        this.f9553e = new ArrayList();
    }

    public final c d(int i10) {
        ArrayList arrayList = this.f9553e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f8303b == i10) {
                return cVar;
            }
        }
        return null;
    }

    public final d e(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.f8303b == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return dd.k.a(this.f8303b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f9553e.toArray());
    }
}
