package d5;

import android.os.SystemClock;
import f5.d0;
import j3.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l4.j1;
import q8.z;
public final class b extends c {
    public final com.google.android.exoplayer2.upstream.f f5309g;
    public final long h;
    public final long f5310i;
    public final long f5311j;
    public final int f5312k;
    public final int f5313l;
    public final float f5314m;
    public final float f5315n;
    public final z f5316o;
    public final f5.y f5317p;
    public float f5318q;
    public int f5319r;
    public int f5320s;
    public long f5321t;
    public n4.k f5322u;

    public b(j1 j1Var, int[] iArr, com.google.android.exoplayer2.upstream.f fVar, long j10, long j11, long j12, z zVar) {
        super(j1Var, iArr);
        if (j12 < j10) {
            f5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f5309g = fVar;
        this.h = j10 * 1000;
        this.f5310i = j11 * 1000;
        this.f5311j = j12 * 1000;
        this.f5312k = 1279;
        this.f5313l = 719;
        this.f5314m = 0.7f;
        this.f5315n = 0.75f;
        this.f5316o = z.u(zVar);
        this.f5317p = f5.y.f6646a;
        this.f5318q = 1.0f;
        this.f5320s = 0;
        this.f5321t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q8.w wVar = (q8.w) arrayList.get(i10);
            if (wVar != null) {
                wVar.a(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            n4.k kVar = (n4.k) q8.l.g(list);
            long j10 = kVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = kVar.f17132n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void b(long j10, long j11, long j12, List list, n4.l[] lVarArr) {
        long x4;
        int m10;
        long j13;
        this.f5317p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f5319r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            n4.l lVar = lVarArr[this.f5319r];
            x4 = lVar.l() - lVar.b();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    n4.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        x4 = lVar2.l() - lVar2.b();
                        break;
                    }
                    i11++;
                } else {
                    x4 = x(list);
                    break;
                }
            }
        }
        int i12 = this.f5320s;
        if (i12 == 0) {
            this.f5320s = 1;
            this.f5319r = w(0, elapsedRealtime);
            return;
        }
        int i13 = this.f5319r;
        if (list.isEmpty()) {
            m10 = -1;
        } else {
            m10 = m(((n4.k) q8.l.g(list)).d);
        }
        if (m10 != -1) {
            i12 = ((n4.k) q8.l.g(list)).f17130e;
            i13 = m10;
        }
        int w10 = w(1, elapsedRealtime);
        if (!e(i13, elapsedRealtime)) {
            t0[] t0VarArr = this.d;
            t0 t0Var = t0VarArr[i13];
            t0 t0Var2 = t0VarArr[w10];
            long j14 = this.h;
            if (j12 != -9223372036854775807L) {
                if (x4 != -9223372036854775807L) {
                    j13 = j12 - x4;
                } else {
                    j13 = j12;
                }
                j14 = Math.min(((float) j13) * this.f5315n, j14);
            }
            int i14 = t0Var2.f10802n;
            int i15 = t0Var.f10802n;
            if ((i14 > i15 && j11 < j14) || (i14 < i15 && j11 >= this.f5310i)) {
                w10 = i13;
            }
        }
        if (w10 != i13) {
            i12 = 3;
        }
        this.f5320s = i12;
        this.f5319r = w10;
    }

    @Override
    public final int c() {
        return this.f5319r;
    }

    @Override
    public final void h() {
        this.f5321t = -9223372036854775807L;
        this.f5322u = null;
    }

    @Override
    public final int j(long j10, List list) {
        n4.k kVar;
        int i10;
        int i11;
        this.f5317p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f5321t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((n4.k) q8.l.g(list)).equals(this.f5322u))) {
            return list.size();
        }
        this.f5321t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (n4.k) q8.l.g(list);
        }
        this.f5322u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x4 = d0.x(((n4.k) list.get(size - 1)).h - j10, this.f5318q);
        long j12 = this.f5311j;
        if (x4 >= j12) {
            x(list);
            t0 t0Var = this.d[w(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                n4.k kVar2 = (n4.k) list.get(i12);
                t0 t0Var2 = kVar2.d;
                if (d0.x(kVar2.h - j10, this.f5318q) >= j12 && t0Var2.f10802n < t0Var.f10802n && (i10 = t0Var2.H) != -1 && i10 <= this.f5313l && (i11 = t0Var2.G) != -1 && i11 <= this.f5312k && i10 < t0Var.H) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void k() {
        this.f5322u = null;
    }

    @Override
    public final int o() {
        return this.f5320s;
    }

    @Override
    public final void q(float f9) {
        this.f5318q = f9;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(int i10, long j10) {
        long j11;
        long j12;
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.f5309g;
        synchronized (uVar) {
            j11 = uVar.f3641l;
        }
        this.f5309g.getClass();
        long j13 = (((float) j11) * this.f5314m) / this.f5318q;
        if (!this.f5316o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f5316o.size() - 1 && ((a) this.f5316o.get(i11)).f5307a < j13) {
                i11++;
            }
            a aVar = (a) this.f5316o.get(i11 - 1);
            a aVar2 = (a) this.f5316o.get(i11);
            long j14 = aVar.f5307a;
            float f9 = ((float) (j13 - j14)) / ((float) (aVar2.f5307a - j14));
            j13 = aVar.f5308b + (f9 * ((float) (aVar2.f5308b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f5324b; i13++) {
            if (j10 == Long.MIN_VALUE || !e(i13, j10)) {
                t0 t0Var = this.d[i13];
                int max = Math.max(t0Var.G, t0Var.H);
                if (!hashMap.containsKey(Integer.valueOf(max))) {
                    hashMap.put(Integer.valueOf(max), Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(i13));
                } else {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(max));
                    t0 t0Var2 = this.d[num.intValue()];
                    boolean z10 = t0Var2.v;
                    if ((!z10 || t0Var.v) && ((!z10 && t0Var.v) || t0Var.f10802n < t0Var2.f10802n)) {
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
            t0 t0Var3 = this.d[i12];
            int i16 = t0Var3.f10802n;
            if (t0Var3.v) {
                break;
            } else if (i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
