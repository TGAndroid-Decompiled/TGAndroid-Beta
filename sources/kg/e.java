package kg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f14262l;
    public long[][] f14263m;
    public int f14264n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f14254f = Long.MAX_VALUE;
        this.f14255g = 0.0f;
        this.h = 0.0f;
        this.f14256i = 0;
        this.f14257j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f14251a, j10);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.f14251a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.f14251a = new long[i12];
        this.f14252b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.f14245a = new long[i12];
            aVar.f14247c = ((a) bVar.d.get(i13)).f14247c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.f14249g = ((a) bVar.d.get(i13)).f14249g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.f14250i = ((a) bVar.d.get(i13)).f14250i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.f14251a[i14] = bVar.f14251a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).f14245a[i14] = ((a) bVar.d.get(i15)).f14245a[i10];
            }
            i14++;
            i10++;
        }
        this.f14258k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f14264n = 0;
        int length = this.f14252b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f14263m = (long[][]) Array.newInstance(Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j10 = ((a) this.d.get(i12)).f14245a[i11];
                if (j10 > jArr[i12]) {
                    jArr[i12] = j10;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f14263m[i13][this.f14264n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f14264n + 1;
                this.f14264n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
