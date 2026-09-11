package kg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class e extends b {
    public long[] f14937l;
    public long[][] f14938m;
    public int f14939n;

    public e(b bVar, long j3) {
        this.d = new ArrayList();
        this.f14928e = 0L;
        this.f14929f = Long.MAX_VALUE;
        this.f14930g = 0.0f;
        this.h = 0.0f;
        this.f14931i = 0;
        this.f14932j = 0;
        int binarySearch = Arrays.binarySearch(bVar.f14925a, j3);
        int i10 = binarySearch - 4;
        int i11 = binarySearch + 4;
        if (i10 < 0) {
            i11 += -i10;
            i10 = 0;
        }
        long[] jArr = bVar.f14925a;
        if (i11 > jArr.length - 1) {
            i10 -= i11 - jArr.length;
            i11 = jArr.length - 1;
        }
        i10 = i10 < 0 ? 0 : i10;
        int i12 = (i11 - i10) + 1;
        this.f14925a = new long[i12];
        this.f14926b = new float[i12];
        this.d = new ArrayList();
        for (int i13 = 0; i13 < bVar.d.size(); i13++) {
            a aVar = new a();
            aVar.f14918a = new long[i12];
            aVar.f14920c = ((a) bVar.d.get(i13)).f14920c;
            aVar.d = ((a) bVar.d.get(i13)).d;
            aVar.f14923g = ((a) bVar.d.get(i13)).f14923g;
            aVar.h = ((a) bVar.d.get(i13)).h;
            aVar.f14924i = ((a) bVar.d.get(i13)).f14924i;
            this.d.add(aVar);
        }
        int i14 = 0;
        while (i10 <= i11) {
            this.f14925a[i14] = bVar.f14925a[i10];
            for (int i15 = 0; i15 < this.d.size(); i15++) {
                ((a) this.d.get(i15)).f14918a[i14] = ((a) bVar.d.get(i15)).f14918a[i10];
            }
            i14++;
            i10++;
        }
        this.f14933k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.f14939n = 0;
        int length = this.f14926b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i10 = length / max;
        this.f14938m = (long[][]) Array.newInstance(Long.TYPE, size, i10);
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = 0; i12 < size; i12++) {
                long j3 = ((a) this.d.get(i12)).f14918a[i11];
                if (j3 > jArr[i12]) {
                    jArr[i12] = j3;
                }
            }
            if (i11 % max == 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    this.f14938m[i13][this.f14939n] = jArr[i13];
                    jArr[i13] = 0;
                }
                int i14 = this.f14939n + 1;
                this.f14939n = i14;
                if (i14 >= i10) {
                    return;
                }
            }
        }
    }
}
