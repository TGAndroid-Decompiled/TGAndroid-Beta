package i2;

import java.util.ArrayList;
import java.util.Arrays;
public final class c extends dd.k {
    public final long f15948c;
    public final ArrayList d;
    public final ArrayList f15949e;

    public c(int i7, long j3) {
        super(i7, 1);
        this.f15948c = j3;
        this.d = new ArrayList();
        this.f15949e = new ArrayList();
    }

    public final c d(int i7) {
        ArrayList arrayList = this.f15949e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f8351b == i7) {
                return cVar;
            }
        }
        return null;
    }

    public final d e(int i7) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.f8351b == i7) {
                return dVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return dd.k.a(this.f8351b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f15949e.toArray());
    }
}
