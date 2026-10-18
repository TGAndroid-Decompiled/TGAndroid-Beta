package kg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f15064l;
    public long[][] f15065m;
    public int f15066n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f15056f = Long.MAX_VALUE;
        this.f15057g = 0.0f;
        this.h = 0.0f;
        this.f15058i = 0;
        this.f15059j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f15053a, j10);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.f15053a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.f15053a = new long[i12];
        this.f15054b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.f15047a = new long[i12];
            aVar.f15049c = ((a) bVar.d.get(i13)).f15049c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.f15051g = ((a) bVar.d.get(i13)).f15051g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.f15052i = ((a) bVar.d.get(i13)).f15052i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.f15053a[i14] = bVar.f15053a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).f15047a[i14] = ((a) bVar.d.get(i15)).f15047a[i10];
            }
            i14++;
            i10++;
        }
        this.f15060k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f15066n = 0;
        int length = this.f15054b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f15065m = (long[][]) Array.newInstance(Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j10 = ((a) this.d.get(i12)).f15047a[i11];
                if (j10 > jArr[i12]) {
                    jArr[i12] = j10;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f15065m[i13][this.f15066n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f15066n + 1;
                this.f15066n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
