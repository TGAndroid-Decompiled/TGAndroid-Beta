package b5;

import android.os.SystemClock;
import d5.f0;
import h3.t0;
import j4.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class b extends c {
    public final com.google.android.exoplayer2.upstream.f f1429g;
    public final long h;
    public final long f1430i;
    public final long f1431j;
    public final int f1432k;
    public final int f1433l;
    public final float f1434m;
    public final float f1435n;
    public final o8.z f1436o;
    public final d5.a0 f1437p;
    public float f1438q;
    public int f1439r;
    public int f1440s;
    public long f1441t;
    public l4.k f1442u;

    public b(i1 i1Var, int[] iArr, com.google.android.exoplayer2.upstream.f fVar, long j10, long j11, long j12, o8.z zVar) {
        super(i1Var, iArr);
        if (j12 < j10) {
            d5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f1429g = fVar;
        this.h = j10 * 1000;
        this.f1430i = j11 * 1000;
        this.f1431j = j12 * 1000;
        this.f1432k = 1279;
        this.f1433l = 719;
        this.f1434m = 0.7f;
        this.f1435n = 0.75f;
        this.f1436o = o8.z.u(zVar);
        this.f1437p = d5.a0.f4330a;
        this.f1438q = 1.0f;
        this.f1440s = 0;
        this.f1441t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            o8.w wVar = (o8.w) arrayList.get(i9);
            if (wVar != null) {
                wVar.a(new a(j10, jArr[i9]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            l4.k kVar = (l4.k) o8.l.g(list);
            long j10 = kVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = kVar.f16665n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int d() {
        return this.f1439r;
    }

    @Override
    public final void i() {
        this.f1441t = -9223372036854775807L;
        this.f1442u = null;
    }

    @Override
    public final int k(long j10, List list) {
        l4.k kVar;
        int i9;
        int i10;
        this.f1437p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f1441t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((l4.k) o8.l.g(list)).equals(this.f1442u))) {
            return list.size();
        }
        this.f1441t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (l4.k) o8.l.g(list);
        }
        this.f1442u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x10 = f0.x(((l4.k) list.get(size - 1)).h - j10, this.f1438q);
        long j12 = this.f1431j;
        if (x10 >= j12) {
            x(list);
            t0 t0Var = this.d[w(-1, elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                l4.k kVar2 = (l4.k) list.get(i11);
                t0 t0Var2 = kVar2.d;
                if (f0.x(kVar2.h - j10, this.f1438q) >= j12 && t0Var2.f9765n < t0Var.f9765n && (i9 = t0Var2.H) != -1 && i9 <= this.f1433l && (i10 = t0Var2.G) != -1 && i10 <= this.f1432k && i9 < t0Var.H) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override
    public final void l() {
        this.f1442u = null;
    }

    @Override
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long x10;
        int a2;
        long j13;
        this.f1437p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = this.f1439r;
        if (i9 < lVarArr.length && lVarArr[i9].next()) {
            l4.l lVar = lVarArr[this.f1439r];
            x10 = lVar.p() - lVar.c();
        } else {
            int length = lVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    l4.l lVar2 = lVarArr[i10];
                    if (lVar2.next()) {
                        x10 = lVar2.p() - lVar2.c();
                        break;
                    }
                    i10++;
                } else {
                    x10 = x(list);
                    break;
                }
            }
        }
        int i11 = this.f1440s;
        if (i11 == 0) {
            this.f1440s = 1;
            this.f1439r = w(0, elapsedRealtime);
            return;
        }
        int i12 = this.f1439r;
        if (list.isEmpty()) {
            a2 = -1;
        } else {
            a2 = a(((l4.k) o8.l.g(list)).d);
        }
        if (a2 != -1) {
            i11 = ((l4.k) o8.l.g(list)).f16663e;
            i12 = a2;
        }
        int w8 = w(1, elapsedRealtime);
        if (!f(i12, elapsedRealtime)) {
            t0[] t0VarArr = this.d;
            t0 t0Var = t0VarArr[i12];
            t0 t0Var2 = t0VarArr[w8];
            long j14 = this.h;
            if (j12 != -9223372036854775807L) {
                if (x10 != -9223372036854775807L) {
                    j13 = j12 - x10;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f1435n, j14);
            }
            int i13 = t0Var2.f9765n;
            int i14 = t0Var.f9765n;
            if ((i13 > i14 && j11 < j14) || (i13 < i14 && j11 >= this.f1430i)) {
                w8 = i12;
            }
        }
        if (w8 != i12) {
            i11 = 3;
        }
        this.f1440s = i11;
        this.f1439r = w8;
    }

    @Override
    public final int p() {
        return this.f1440s;
    }

    @Override
    public final void q(float f10) {
        this.f1438q = f10;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(int i9, long j10) {
        long j11;
        long j12;
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.f1429g;
        synchronized (uVar) {
            j11 = uVar.f2627l;
        }
        this.f1429g.getClass();
        long j13 = (((float) j11) * this.f1434m) / this.f1438q;
        if (!this.f1436o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f1436o.size() - 1 && ((a) this.f1436o.get(i10)).f1423a < j13) {
                i10++;
            }
            a aVar = (a) this.f1436o.get(i10 - 1);
            a aVar2 = (a) this.f1436o.get(i10);
            long j14 = aVar.f1423a;
            float f10 = ((float) (j13 - j14)) / ((float) (aVar2.f1423a - j14));
            j13 = aVar.f1424b + (f10 * ((float) (aVar2.f1424b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < this.f1444b; i12++) {
            if (j10 == Long.MIN_VALUE || !f(i12, j10)) {
                t0 t0Var = this.d[i12];
                int max = Math.max(t0Var.G, t0Var.H);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    t0 t0Var2 = this.d[num.intValue()];
                    boolean z10 = t0Var2.v;
                    if ((!z10 || t0Var.v) && ((!z10 && t0Var.v) || t0Var.f9765n < t0Var2.f9765n)) {
                        hashMap.put(Integer.valueOf(max), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
            }
        }
        if (i9 == 0) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                int intValue = ((Integer) obj).intValue();
                if (this.d[intValue].v) {
                    return intValue;
                }
            }
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            i11 = ((Integer) obj2).intValue();
            t0 t0Var3 = this.d[i11];
            int i15 = t0Var3.f9765n;
            if (t0Var3.v) {
                break;
            } else if (i15 <= j13) {
                break;
            }
        }
        return i11;
    }
}
