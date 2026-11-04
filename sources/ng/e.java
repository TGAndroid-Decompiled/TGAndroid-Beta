package ng;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f20385l;
    public long[][] f20386m;
    public int f20387n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.f20376e = 0L;
        this.f20377f = Long.MAX_VALUE;
        this.f20378g = 0.0f;
        this.h = 0.0f;
        this.f20379i = 0;
        this.f20380j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f20373a, j10);
        int i3 = binarySearch - 4;
        int i10 = binarySearch + 4;
        if (i3 < 0) {
            i10 += -i3;
            i3 = 0;
        }
        long[] jArr = bVar.f20373a;
        if (i10 > jArr.length - 1) {
            i3 -= i10 - jArr.length;
            i10 = jArr.length - 1;
        }
        i3 = i3 < 0 ? 0 : i3;
        int i11 = (i10 - i3) + 1;
        this.f20373a = new long[i11];
        this.f20374b = new float[i11];
        this.d = new ArrayList();
        for (int i12 = 0; i12 < bVar.d.size(); i12++) {
            a aVar = new a();
            aVar.f20366a = new long[i11];
            aVar.f20368c = ((a) bVar.d.get(i12)).f20368c;
            aVar.d = ((a) bVar.d.get(i12)).d;
            aVar.f20371g = ((a) bVar.d.get(i12)).f20371g;
            aVar.h = ((a) bVar.d.get(i12)).h;
            aVar.f20372i = ((a) bVar.d.get(i12)).f20372i;
            this.d.add(aVar);
        }
        int i13 = 0;
        while (i3 <= i10) {
            this.f20373a[i13] = bVar.f20373a[i3];
            for (int i14 = 0; i14 < this.d.size(); i14++) {
                ((a) this.d.get(i14)).f20366a[i13] = ((a) bVar.d.get(i14)).f20366a[i3];
            }
            i13++;
            i3++;
        }
        this.f20381k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f20387n = 0;
        int length = this.f20374b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i3 = length / max;
        this.f20386m = (long[][]) Array.newInstance(Long.TYPE, size, i3);
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                long j10 = ((a) this.d.get(i11)).f20366a[i10];
                if (j10 > jArr[i11]) {
                    jArr[i11] = j10;
                }
            }
            if (i10 % max == 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    this.f20386m[i12][this.f20387n] = jArr[i12];
                    jArr[i12] = 0;
                }
                int i13 = this.f20387n + 1;
                this.f20387n = i13;
                if (i13 >= i3) {
                    return;
                }
            }
        }
    }
}
