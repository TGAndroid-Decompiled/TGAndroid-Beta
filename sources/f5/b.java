package f5;

import android.os.SystemClock;
import h5.d0;
import h5.y;
import j3.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o4.s0;
public final class b extends c {
    public final g5.f f5887g;
    public final long h;
    public final long f5888i;
    public final long f5889j;
    public final int f5890k;
    public final int f5891l;
    public final float f5892m;
    public final float f5893n;
    public final s8.v f5894o;
    public final y f5895p;
    public float f5896q;
    public int f5897r;
    public int f5898s;
    public long f5899t;
    public q4.k f5900u;

    public b(s0 s0Var, int[] iArr, g5.f fVar, long j10, long j11, long j12, s8.v vVar) {
        super(s0Var, iArr);
        if (j12 < j10) {
            h5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f5887g = fVar;
        this.h = j10 * 1000;
        this.f5888i = j11 * 1000;
        this.f5889j = j12 * 1000;
        this.f5890k = 1279;
        this.f5891l = 719;
        this.f5892m = 0.7f;
        this.f5893n = 0.75f;
        this.f5894o = s8.v.t(vVar);
        this.f5895p = y.f6993a;
        this.f5896q = 1.0f;
        this.f5898s = 0;
        this.f5899t = -9223372036854775807L;
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
                long j11 = kVar.f42763n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void a() {
        this.f5900u = null;
    }

    @Override
    public final void b() {
        this.f5899t = -9223372036854775807L;
        this.f5900u = null;
    }

    @Override
    public final int c(long j10, List list) {
        q4.k kVar;
        int i10;
        int i11;
        this.f5895p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f5899t;
        if (j11 != -9223372036854775807L && elapsedRealtime - j11 < 1000 && (list.isEmpty() || ((q4.k) s8.l.h(list)).equals(this.f5900u))) {
            return list.size();
        }
        this.f5899t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (q4.k) s8.l.h(list);
        }
        this.f5900u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long y10 = d0.y(((q4.k) list.get(size - 1)).h - j10, this.f5896q);
        long j12 = this.f5889j;
        if (y10 >= j12) {
            y(list);
            n0 n0Var = this.d[x(-1, elapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                q4.k kVar2 = (q4.k) list.get(i12);
                n0 n0Var2 = kVar2.d;
                if (d0.y(kVar2.h - j10, this.f5896q) >= j12 && n0Var2.f8721n < n0Var.f8721n && (i10 = n0Var2.I) != -1 && i10 <= this.f5891l && (i11 = n0Var2.H) != -1 && i11 <= this.f5890k && i10 < n0Var.I) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final int h() {
        return this.f5897r;
    }

    @Override
    public final Object j() {
        return null;
    }

    @Override
    public final int k() {
        return this.f5898s;
    }

    @Override
    public final void s(float f10) {
        this.f5896q = f10;
    }

    @Override
    public final void v(long j10, long j11, long j12, List list, q4.l[] lVarArr) {
        long y10;
        int n10;
        long j13;
        this.f5895p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f5897r;
        if (i10 < lVarArr.length && lVarArr[i10].next()) {
            q4.l lVar = lVarArr[this.f5897r];
            y10 = lVar.a1() - lVar.n0();
        } else {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    q4.l lVar2 = lVarArr[i11];
                    if (lVar2.next()) {
                        y10 = lVar2.a1() - lVar2.n0();
                        break;
                    }
                    i11++;
                } else {
                    y10 = y(list);
                    break;
                }
            }
        }
        int i12 = this.f5898s;
        if (i12 == 0) {
            this.f5898s = 1;
            this.f5897r = x(0, elapsedRealtime);
            return;
        }
        int i13 = this.f5897r;
        if (list.isEmpty()) {
            n10 = -1;
        } else {
            n10 = n(((q4.k) s8.l.h(list)).d);
        }
        if (n10 != -1) {
            i12 = ((q4.k) s8.l.h(list)).e;
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
                j14 = Math.min(((float) j13) * this.f5893n, j14);
            }
            int i14 = n0Var2.f8721n;
            int i15 = n0Var.f8721n;
            if ((i14 > i15 && j11 < j14) || (i14 < i15 && j11 >= this.f5888i)) {
                x10 = i13;
            }
        }
        if (x10 != i13) {
            i12 = 3;
        }
        this.f5898s = i12;
        this.f5897r = x10;
    }

    public final int x(int i10, long j10) {
        long j11;
        long j12;
        g5.s sVar = (g5.s) this.f5887g;
        synchronized (sVar) {
            j11 = sVar.f6434l;
        }
        this.f5887g.getClass();
        long j13 = (((float) j11) * this.f5892m) / this.f5896q;
        if (!this.f5894o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f5894o.size() - 1 && ((a) this.f5894o.get(i11)).f5885a < j13) {
                i11++;
            }
            a aVar = (a) this.f5894o.get(i11 - 1);
            a aVar2 = (a) this.f5894o.get(i11);
            long j14 = aVar.f5885a;
            float f10 = ((float) (j13 - j14)) / ((float) (aVar2.f5885a - j14));
            j13 = aVar.f5886b + (f10 * ((float) (aVar2.f5886b - j12)));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (int i13 = 0; i13 < this.f5902b; i13++) {
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
                    if ((!z4 || n0Var.v) && ((!z4 && n0Var.v) || n0Var.f8721n < n0Var2.f8721n)) {
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
            int i16 = n0Var3.f8721n;
            if (n0Var3.v) {
                break;
            } else if (i16 <= j13) {
                break;
            }
        }
        return i12;
    }
}
