package h2;

import java.util.ArrayList;
import java.util.Arrays;
public final class c extends ad.l {
    public final long f14104c;
    public final ArrayList d;
    public final ArrayList f14105e;

    public c(int i3, long j10) {
        super(i3, 1);
        this.f14104c = j10;
        this.d = new ArrayList();
        this.f14105e = new ArrayList();
    }

    public final c d(int i3) {
        ArrayList arrayList = this.f14105e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f365b == i3) {
                return cVar;
            }
        }
        return null;
    }

    public final d e(int i3) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar.f365b == i3) {
                return dVar;
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return ad.l.a(this.f365b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f14105e.toArray());
    }
}
