package f5;

import android.os.SystemClock;
import h5.d0;
import j3.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o4.s0;
public final class b extends c {
    public final g5.f f5996g;
    public final long h;
    public final long f5997i;
    public final long f5998j;
    public final int f5999k;
    public final int f6000l;
    public final float f6001m;
    public final float f6002n;
    public final s8.v f6003o;
    public final h5.y f6004p;
    public float f6005q;
    public int f6006r;
    public int f6007s;
    public long f6008t;
    public q4.k f6009u;

    public b(s0 s0Var, int[] iArr, g5.f fVar, long j10, long j11, long j12, s8.v vVar) {
        super(s0Var, iArr);
        if (j12 < j10) {
            h5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f5996g = fVar;
        this.h = j10 * 1000;
        this.f5997i = j11 * 1000;
        this.f5998j = j12 * 1000;
        this.f5999k = 1279;
        this.f6000l = 719;
        this.f6001m = 0.7f;
        this.f6002n = 0.75f;
        this.f6003o = s8.v.t(vVar);
        this.f6004p = h5.y.f7314a;
        this.f6005q = 1.0f;
        this.f6007s = 0;
        this.f6008t = -9223372036854775807L;
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            s8.s sVar = (s8.s) arrayList.get(i10);
            if (sVar != null) {
                sVar.b(new a(j10, jArr[i10]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            q4.k kVar = (q4.k) s8.l.h(list);
            long j10 = kVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = kVar.f44478n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void a() {
        this.f6009u = null;
    }

    @Override
    public final void b() {
        this.f6008t = -9223372036854775807L;
        this.f6009u = null;
    }

    @Override
    public final int c(long j10, List list) {
        q4.k kVar;
        int i10;
        int i11;
        this.f6004p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f6008t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((q4.k) s8.l.h(list)).equals(this.f6009u))) {
            return list.size();
        }
        this.f6008t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (q4.k) s8.l.h(list);
        }
        this.f6009u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long y10 = d0.y(((q4.k) list.get(size - 1)).h - j10, this.f6005q);
        long j12 = this.f5998j;
        if (y10 >= j12) {
            y(list);
            n0 n0Var = this.d[x(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                q4.k kVar2 = (q4.k) list.get(i12);
                n0 n0Var2 = kVar2.d;
                if (d0.y(kVar2.h - j10, this.f6005q) >= j12 && n0Var2.f9323n < n0Var.f9323n && (i10 = n0Var2.I) != -1 && i10 <= this.f6000l && (i11 = n0Var2.H) != -1 && i11 <= this.f5999k && i10 < n0Var.I) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final int h() {
        return this.f6006r;
    }

    @Override
    public final Object j() {
        return null;
    }

    @Override
    public final int k() {
        return this.f6007s;
    }

    @Override
    public final void s(float f10) {
        this.f6005q = f10;
    }

    @Override
    public final void v(long j10, long j11, long j12, List list, q4.l[] lVarArr) {
        long y10;
        int n10;
        long j13;
        this.f6004p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f6006r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            q4.l lVar = lVarArr[this.f6006r];
            y10 = lVar.l() - lVar.k();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    q4.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        y10 = lVar2.l() - lVar2.k();
                        break;
                    }
                    i11++;
                } else {
                    y10 = y(list);
                    break;
                }
            }
        }
        int i12 = this.f6007s;
        if (i12 == 0) {
            this.f6007s = 1;
            this.f6006r = x(0, elapsedRealtime);
            return;
        }
        int i13 = this.f6006r;
        if (list.isEmpty()) {
            n10 = -1;
        } else {
            n10 = n(((q4.k) s8.l.h(list)).d);
        }
        if (n10 != -1) {
            i12 = ((q4.k) s8.l.h(list)).f44476e;
            i13 = n10;
        }
        int x10 = x(1, elapsedRealtime);
        if (x10 != i13 && !o(i13, elapsedRealtime)) {
            n0[] n0VarArr = this.d;
            n0 n0Var = n0VarArr[i13];
            n0 n0Var2 = n0VarArr[x10];
            long j14 = this.h;
            if (j12 != -9223372036854775807L) {
                if (y10 != -9223372036854775807L) {
                    j13 = j12 - y10;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f6002n, j14);
            }
            int i14 = n0Var2.f9323n;
            int i15 = n0Var.f9323n;
            if ((i14 > i15 && j11 < j14) || (i14 < i15 && j11 >= this.f5997i)) {
                x10 = i13;
            }
        }
        if (x10 != i13) {
            i12 = 3;
        }
        this.f6007s = i12;
        this.f6006r = x10;
    }

    public final int x(int i10, long j10) {
        long j11;
        long j12;
        g5.s sVar = (g5.s) this.f5996g;
        synchronized (sVar) {
            j11 = sVar.f6923l;
        }
        this.f5996g.getClass();
        long j13 = (((float) j11) * this.f6001m) / this.f6005q;
        if (!this.f6003o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f6003o.size() - 1 && ((a) this.f6003o.get(i11)).f5994a < j13) {
                i11++;
            }
            a aVar = (a) this.f6003o.get(i11 - 1);
            a aVar2 = (a) this.f6003o.get(i11);
            long j14 = aVar.f5994a;
            float f10 = ((float) (j13 - j14)) / ((float) (aVar2.f5994a - j14));
            j13 = aVar.f5995b + (f10 * ((float) (aVar2.f5995b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f6011b; i13++) {
            if (j10 == Long.MIN_VALUE || !o(i13, j10)) {
                n0 n0Var = this.d[i13];
                int max = Math.max(n0Var.H, n0Var.I);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    n0 n0Var2 = this.d[num.intValue()];
                    boolean z4 = n0Var2.v;
                    if ((!z4 || n0Var.v) && ((!z4 && n0Var.v) || n0Var.f9323n < n0Var2.f9323n)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
            }
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].v) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            i12 = ((Integer) obj2).intValue();
            n0 n0Var3 = this.d[i12];
            int i16 = n0Var3.f9323n;
            if (n0Var3.v) {
                break;
            } else if (i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
