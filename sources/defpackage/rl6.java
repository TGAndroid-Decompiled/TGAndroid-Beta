package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
public final class rl6 implements ix9 {
    public final oi2 a;
    public final SparseArray b;
    public final long c;
    public final int d;

    public rl6(SparseArray sparseArray, long j, int i, long j2, long j3) {
        oi2 oi2Var;
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        List list = (List) sparseArray.get(i);
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                ql6 ql6Var = (ql6) list.get(i4);
                jArr3[i4] = ql6Var.a;
                jArr[i4] = ql6Var.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                ncd.f("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            oi2Var = new oi2(iArr, jArr, jArr2, jArr3);
        } else {
            oi2Var = null;
        }
        this.a = oi2Var;
    }

    @Override
    public final boolean c() {
        List list = (List) this.b.get(this.d);
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final hx9 f(long j) {
        oi2 oi2Var = this.a;
        if (oi2Var != null) {
            return oi2Var.f(j);
        }
        kx9 kx9Var = kx9.c;
        return new hx9(kx9Var, kx9Var);
    }

    @Override
    public final long h() {
        return this.c;
    }
}
