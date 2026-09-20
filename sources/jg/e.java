package jg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f13013l;
    public long[][] f13014m;
    public int f13015n;

    public e(b bVar, long j3) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f13005f = Long.MAX_VALUE;
        this.f13006g = 0.0f;
        this.h = 0.0f;
        this.f13007i = 0;
        this.f13008j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f13002a, j3);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.f13002a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.f13002a = new long[i12];
        this.f13003b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.f12996a = new long[i12];
            aVar.f12998c = ((a) bVar.d.get(i13)).f12998c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.f13000g = ((a) bVar.d.get(i13)).f13000g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.f13001i = ((a) bVar.d.get(i13)).f13001i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.f13002a[i14] = bVar.f13002a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).f12996a[i14] = ((a) bVar.d.get(i15)).f12996a[i10];
            }
            i14++;
            i10++;
        }
        this.f13009k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f13015n = 0;
        int length = this.f13003b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f13014m = (long[][]) Array.newInstance(Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j3 = ((a) this.d.get(i12)).f12996a[i11];
                if (j3 > jArr[i12]) {
                    jArr[i12] = j3;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f13014m[i13][this.f13015n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f13015n + 1;
                this.f13015n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
