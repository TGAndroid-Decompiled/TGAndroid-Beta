package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class c extends dd.k {
    public final long f9551c;
    public final ArrayList d;
    public final ArrayList f9552e;

    public c(int i10, long j3) {
        super(i10, 1);
        this.f9551c = j3;
        this.d = new ArrayList();
        this.f9552e = new ArrayList();
    }

    public final c d(int i10) {
        ArrayList arrayList = this.f9552e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f8302b == i10) {
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
            if (dVar.f8302b == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return dd.k.a(this.f8302b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f9552e.toArray());
    }
}
