package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public final class moa extends nl1 {
    public long[] l;
    public long[][] m;
    public int n;

    public moa(nl1 nl1Var, long j) {
        this.d = new ArrayList();
        this.e = 0L;
        this.f = Long.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        int binarySearch = Arrays.binarySearch(nl1Var.a, j);
        int i = binarySearch - 4;
        int i2 = binarySearch + 4;
        if (i < 0) {
            i2 += -i;
            i = 0;
        }
        long[] jArr = nl1Var.a;
        if (i2 > jArr.length - 1) {
            i -= i2 - jArr.length;
            i2 = jArr.length - 1;
        }
        i = i < 0 ? 0 : i;
        int i3 = (i2 - i) + 1;
        this.a = new long[i3];
        this.b = new float[i3];
        this.d = new ArrayList();
        for (int i4 = 0; i4 < nl1Var.d.size(); i4++) {
            ml1 ml1Var = new ml1();
            ml1Var.a = new long[i3];
            ml1Var.c = ((ml1) nl1Var.d.get(i4)).c;
            ml1Var.d = ((ml1) nl1Var.d.get(i4)).d;
            ml1Var.g = ((ml1) nl1Var.d.get(i4)).g;
            ml1Var.h = ((ml1) nl1Var.d.get(i4)).h;
            ml1Var.i = ((ml1) nl1Var.d.get(i4)).i;
            this.d.add(ml1Var);
        }
        int i5 = 0;
        while (i <= i2) {
            this.a[i5] = nl1Var.a[i];
            for (int i6 = 0; i6 < this.d.size(); i6++) {
                ((ml1) this.d.get(i6)).a[i5] = ((ml1) nl1Var.d.get(i6)).a[i];
            }
            i5++;
            i++;
        }
        this.k = 86400000L;
        e();
    }

    @Override
    public final void e() {
        super.e();
        this.n = 0;
        int length = this.b.length;
        int size = this.d.size();
        int max = Math.max(1, Math.round(length / 140.0f));
        int i = length / max;
        this.m = (long[][]) Array.newInstance(Long.TYPE, size, i);
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                long j = ((ml1) this.d.get(i3)).a[i2];
                if (j > jArr[i3]) {
                    jArr[i3] = j;
                }
            }
            if (i2 % max == 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.m[i4][this.n] = jArr[i4];
                    jArr[i4] = 0;
                }
                int i5 = this.n + 1;
                this.n = i5;
                if (i5 >= i) {
                    return;
                }
            }
        }
    }
}
