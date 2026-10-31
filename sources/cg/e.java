package cg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f4175l;
    public long[][] f4176m;
    public int f4177n;

    public e(b bVar, long j10) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f4167f = Long.MAX_VALUE;
        this.f4168g = 0.0f;
        this.h = 0.0f;
        this.f4169i = 0;
        this.f4170j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f4164a, j10);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.f4164a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.f4164a = new long[i12];
        this.f4165b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.f4158a = new long[i12];
            aVar.f4160c = ((a) bVar.d.get(i13)).f4160c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.f4162g = ((a) bVar.d.get(i13)).f4162g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.f4163i = ((a) bVar.d.get(i13)).f4163i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.f4164a[i14] = bVar.f4164a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).f4158a[i14] = ((a) bVar.d.get(i15)).f4158a[i10];
            }
            i14++;
            i10++;
        }
        this.f4171k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f4177n = 0;
        int length = this.f4165b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f4176m = (long[][]) Array.newInstance(Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j10 = ((a) this.d.get(i12)).f4158a[i11];
                if (j10 > jArr[i12]) {
                    jArr[i12] = j10;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f4176m[i13][this.f4177n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f4177n + 1;
                this.f4177n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
