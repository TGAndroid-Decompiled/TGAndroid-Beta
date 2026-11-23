package mg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f21024l;
    public long[][] f21025m;
    public int f21026n;

    public e(b bVar, long j3) {
        this.d = new ArrayList();
        this.f21015e = 0L;
        this.f21016f = Long.MAX_VALUE;
        this.f21017g = 0.0f;
        this.h = 0.0f;
        this.f21018i = 0;
        this.f21019j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f21012a, j3);
        int i7 = binarySearch - 4;
        int i10 = binarySearch + 4;
        if (i7 < 0) {
            i10 += -i7;
            i7 = 0;
        }
        long[] jArr = bVar.f21012a;
        if (i10 > jArr.length - 1) {
            i7 -= i10 - jArr.length;
            i10 = jArr.length - 1;
        }
        i7 = i7 < 0 ? 0 : i7;
        int i11 = (i10 - i7) + 1;
        this.f21012a = new long[i11];
        this.f21013b = new float[i11];
        this.d = new ArrayList();
        for (int i12 = 0; i12 < bVar.d.size(); i12++) {
            a aVar = new a();
            aVar.f21005a = new long[i11];
            aVar.f21007c = ((a) bVar.d.get(i12)).f21007c;
            aVar.d = ((a) bVar.d.get(i12)).d;
            aVar.f21010g = ((a) bVar.d.get(i12)).f21010g;
            aVar.h = ((a) bVar.d.get(i12)).h;
            aVar.f21011i = ((a) bVar.d.get(i12)).f21011i;
            this.d.add(aVar);
        }
        int i13 = 0;
        while (i7 <= i10) {
            this.f21012a[i13] = bVar.f21012a[i7];
            for (int i14 = 0; i14 < this.d.size(); i14++) {
                ((a) this.d.get(i14)).f21005a[i13] = ((a) bVar.d.get(i14)).f21005a[i7];
            }
            i13++;
            i7++;
        }
        this.f21020k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f21026n = 0;
        int length = this.f21013b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i7 = length / max;
        this.f21025m = (long[][]) Array.newInstance(Long.TYPE, size, i7);
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                long j3 = ((a) this.d.get(i11)).f21005a[i10];
                if (j3 > jArr[i11]) {
                    jArr[i11] = j3;
                }
            }
            if (i10 % max == 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    this.f21025m[i12][this.f21026n] = jArr[i12];
                    jArr[i12] = 0;
                }
                int i13 = this.f21026n + 1;
                this.f21026n = i13;
                if (i13 >= i7) {
                    return;
                }
            }
        }
    }
}
