package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class d extends ed.k {
    public final long f9563c;
    public final ArrayList d;
    public final ArrayList f9564e;

    public d(int i10, long j3) {
        super(i10, 1);
        this.f9563c = j3;
        this.d = new ArrayList();
        this.f9564e = new ArrayList();
    }

    public final d d(int i10) {
        ArrayList arrayList = this.f9564e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.f8881b == i10) {
                return dVar;
            }
        }
        return null;
    }

    public final e e(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) arrayList.get(i11);
            if (eVar.f8881b == i10) {
                return eVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return ed.k.a(this.f8881b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f9564e.toArray());
    }
}
