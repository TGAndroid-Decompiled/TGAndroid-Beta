package f2;

import java.util.ArrayList;
import java.util.Arrays;
public final class d extends dd.k {
    public final long f9175c;
    public final ArrayList d;
    public final ArrayList f9176e;

    public d(int i10, long j3) {
        super(i10, 1);
        this.f9175c = j3;
        this.d = new ArrayList();
        this.f9176e = new ArrayList();
    }

    public final d i(int i10) {
        ArrayList arrayList = this.f9176e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.f6773b == i10) {
                return dVar;
            }
        }
        return null;
    }

    public final e j(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) arrayList.get(i11);
            if (eVar.f6773b == i10) {
                return eVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return dd.k.b(this.f6773b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f9176e.toArray());
    }
}
