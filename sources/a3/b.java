package a3;

import android.os.SystemClock;
import e2.m1;
import h2.g0;
import h2.m0;
import h9.f0;
import h9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends d {
    public final b3.d f59g;
    public final long h;
    public final long f60i;
    public final long f61j;
    public final int f62k;
    public final int f63l;
    public final float f64m;
    public final float f65n;
    public final i0 f66o;
    public final g0 f67p;
    public float f68q;
    public int f69r;
    public int f70s;
    public long f71t;
    public y2.l f72u;

    public b(m1 m1Var, int[] iArr, b3.d dVar, long j3, long j10, long j11, i0 i0Var) {
        super(m1Var, iArr);
        if (j11 < j3) {
            h2.a.l("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j3;
        }
        this.f59g = dVar;
        this.h = j3 * 1000;
        this.f60i = j10 * 1000;
        this.f61j = j11 * 1000;
        this.f62k = 1279;
        this.f63l = 719;
        this.f64m = 0.7f;
        this.f65n = 0.75f;
        this.f66o = i0.q(i0Var);
        this.f67p = g0.f14088a;
        this.f68q = 1.0f;
        this.f70s = 0;
        this.f71t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j10 : jArr) {
            j3 += j10;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            f0 f0Var = (f0) arrayList.get(i7);
            if (f0Var != null) {
                f0Var.c(new a(j3, jArr[i7]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            y2.l lVar = (y2.l) h9.o.n(list);
            long j3 = lVar.h;
            if (j3 != -9223372036854775807L) {
                long j10 = lVar.f58909n;
                if (j10 != -9223372036854775807L) {
                    return j10 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int d() {
        return this.f69r;
    }

    @Override
    public final void e(long j3, long j10, long j11, List list, y2.m[] mVarArr) {
        long x10;
        int b10;
        long j12;
        this.f67p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = this.f69r;
        if (i7 < mVarArr.length && mVarArr[i7].next()) {
            y2.m mVar = mVarArr[this.f69r];
            x10 = mVar.E() - mVar.w();
        } else {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    y2.m mVar2 = mVarArr[i10];
                    if (mVar2.next()) {
                        x10 = mVar2.E() - mVar2.w();
                        break;
                    }
                    i10++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i11 = this.f70s;
        if (i11 == 0) {
            this.f70s = 1;
            this.f69r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.f69r;
        if (list.isEmpty()) {
            b10 = -1;
        } else {
            b10 = b(((y2.l) h9.o.n(list)).d);
        }
        if (b10 != -1) {
            i11 = ((y2.l) h9.o.n(list)).f58907e;
            i12 = b10;
        }
        int w10 = w(1, elapsedRealtime);
        if (w10 != i12 && !a(i12, elapsedRealtime)) {
            e2.u[] uVarArr = this.d;
            e2.u uVar = uVarArr[i12];
            e2.u uVar2 = uVarArr[w10];
            int i13 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
            long j13 = this.h;
            if (i13 != 0) {
                if (x10 != -9223372036854775807L) {
                    j12 = j11 - x10;
                } else {
                    j12 = j11;
                }
                j13 = Math.min(((float) j12) * this.f65n, j13);
            }
            int i14 = uVar2.f10606j;
            int i15 = uVar.f10606j;
            if ((i14 > i15 && j10 < j13) || (i14 < i15 && j10 >= this.f60i)) {
                w10 = i12;
            }
        }
        if (w10 != i12) {
            i11 = 3;
        }
        this.f70s = i11;
        this.f69r = w10;
    }

    @Override
    public final void h() {
        this.f71t = -9223372036854775807L;
        this.f72u = null;
    }

    @Override
    public final int j(long j3, List list) {
        y2.l lVar;
        int i7;
        int i10;
        this.f67p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f71t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((y2.l) h9.o.n(list)).equals(this.f72u))) {
            return list.size();
        }
        this.f71t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (y2.l) h9.o.n(list);
        }
        this.f72u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = m0.F(((y2.l) list.get(size - 1)).h - j3, this.f68q);
        long j11 = this.f61j;
        if (F >= j11) {
            x(list);
            e2.u uVar = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                y2.l lVar2 = (y2.l) list.get(i11);
                e2.u uVar2 = lVar2.d;
                if (m0.F(lVar2.h - j3, this.f68q) >= j11 && uVar2.f10606j < uVar.f10606j && (i7 = uVar2.A) != -1 && i7 <= this.f63l && (i10 = uVar2.f10621z) != -1 && i10 <= this.f62k && i7 < uVar.A) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override
    public final void l() {
        this.f72u = null;
    }

    @Override
    public final int o() {
        return this.f70s;
    }

    @Override
    public final void q(float f10) {
        this.f68q = f10;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(int i7, long j3) {
        b3.d dVar;
        e2.u[] uVarArr;
        long j10;
        this.f59g.getClass();
        long a10 = (((float) ((b3.g) dVar).a()) * this.f64m) / this.f68q;
        i0 i0Var = this.f66o;
        if (!i0Var.isEmpty()) {
            int i10 = 1;
            while (i10 < i0Var.size() - 1 && ((a) i0Var.get(i10)).f57a < a10) {
                i10++;
            }
            a aVar = (a) i0Var.get(i10 - 1);
            a aVar2 = (a) i0Var.get(i10);
            long j11 = aVar.f57a;
            a10 = ((((float) (a10 - j11)) / ((float) (aVar2.f57a - j11))) * ((float) (aVar2.f58b - j10))) + aVar.f58b;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f75b;
            uVarArr = this.d;
            if (i12 >= i13) {
                break;
            }
            if (j3 == Long.MIN_VALUE || !a(i12, j3)) {
                e2.u uVar = uVarArr[i12];
                int max = Math.max(uVar.f10621z, uVar.A);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    e2.u uVar2 = uVarArr[num.intValue()];
                    boolean z9 = uVar2.f10610n;
                    if ((!z9 || uVar.f10610n) && ((!z9 && uVar.f10610n) || uVar.f10606j < uVar2.f10606j)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
            }
            i12++;
        }
        if (i7 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (uVarArr[intValue].f10610n) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i11 = ((Integer) obj2).intValue();
            e2.u uVar3 = uVarArr[i11];
            int i16 = uVar3.f10606j;
            if (!uVar3.f10610n) {
                if (i16 <= a10) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11;
    }
}
