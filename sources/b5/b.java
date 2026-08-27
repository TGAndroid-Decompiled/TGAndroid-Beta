package b5;

import android.os.SystemClock;
import d5.b0;
import d5.g0;
import h3.t0;
import j4.i1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b extends c {

    public final com.google.android.exoplayer2.upstream.f f1917g;
    public final long h;

    public final long f1918i;

    public final long f1919j;

    public final int f1920k;

    public final int f1921l;

    public final float f1922m;

    public final float f1923n;

    public final p8.z f1924o;

    public final b0 f1925p;

    public float f1926q;

    public int f1927r;

    public int f1928s;

    public long f1929t;

    public l4.k f1930u;

    public b(i1 i1Var, int[] iArr, com.google.android.exoplayer2.upstream.f fVar, long j10, long j11, long j12, p8.z zVar) {
        super(i1Var, iArr);
        if (j12 < j10) {
            d5.a.K("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f1917g = fVar;
        this.h = j10 * 1000;
        this.f1918i = j11 * 1000;
        this.f1919j = j12 * 1000;
        this.f1920k = 1279;
        this.f1921l = 719;
        this.f1922m = 0.7f;
        this.f1923n = 0.75f;
        this.f1924o = p8.z.u(zVar);
        this.f1925p = b0.f4778a;
        this.f1926q = 1.0f;
        this.f1928s = 0;
        this.f1929t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p8.w wVar = (p8.w) arrayList.get(i10);
            if (wVar != null) {
                wVar.a(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            l4.k kVar = (l4.k) p8.l.g(list);
            long j10 = kVar.h;
            if (j10 != -9223372036854775807L) {
                long j11 = kVar.f15422n;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final int d() {
        return this.f1927r;
    }

    @Override
    public final void i() {
        this.f1929t = -9223372036854775807L;
        this.f1930u = null;
    }

    @Override
    public final int k(long j10, List list) {
        int i10;
        int i11;
        this.f1925p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f1929t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((l4.k) p8.l.g(list)).equals(this.f1930u))) {
            return list.size();
        }
        this.f1929t = jElapsedRealtime;
        this.f1930u = list.isEmpty() ? null : (l4.k) p8.l.g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = g0.x(((l4.k) list.get(size - 1)).h - j10, this.f1926q);
        long j12 = this.f1919j;
        if (jX >= j12) {
            x(list);
            t0 t0Var = this.d[w(-1, jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                l4.k kVar = (l4.k) list.get(i12);
                t0 t0Var2 = kVar.d;
                if (g0.x(kVar.h - j10, this.f1926q) >= j12 && t0Var2.f8189n < t0Var.f8189n && (i10 = t0Var2.H) != -1 && i10 <= this.f1921l && (i11 = t0Var2.G) != -1 && i11 <= this.f1920k && i10 < t0Var.H) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void l() {
        this.f1930u = null;
    }

    @Override
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long jX;
        this.f1925p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f1927r;
        if (i10 >= lVarArr.length || !lVarArr[i10].next()) {
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jX = x(list);
                    break;
                }
                l4.l lVar = lVarArr[i11];
                if (lVar.next()) {
                    jX = lVar.i() - lVar.g();
                    break;
                }
                i11++;
            }
        } else {
            l4.l lVar2 = lVarArr[this.f1927r];
            jX = lVar2.i() - lVar2.g();
        }
        int i12 = this.f1928s;
        if (i12 == 0) {
            this.f1928s = 1;
            this.f1927r = w(0, jElapsedRealtime);
            return;
        }
        int i13 = this.f1927r;
        int iA = list.isEmpty() ? -1 : a(((l4.k) p8.l.g(list)).d);
        if (iA != -1) {
            i12 = ((l4.k) p8.l.g(list)).f15420e;
            i13 = iA;
        }
        int iW = w(1, jElapsedRealtime);
        if (!f(i13, jElapsedRealtime)) {
            t0[] t0VarArr = this.d;
            t0 t0Var = t0VarArr[i13];
            t0 t0Var2 = t0VarArr[iW];
            long jMin = this.h;
            if (j12 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j12 - jX : j12) * this.f1923n), jMin);
            }
            int i14 = t0Var2.f8189n;
            int i15 = t0Var.f8189n;
            if ((i14 > i15 && j11 < jMin) || (i14 < i15 && j11 >= this.f1918i)) {
                iW = i13;
            }
        }
        if (iW != i13) {
            i12 = 3;
        }
        this.f1928s = i12;
        this.f1927r = iW;
    }

    @Override
    public final int p() {
        return this.f1928s;
    }

    @Override
    public final void q(float f10) {
        this.f1926q = f10;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(int i10, long j10) {
        long j11;
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.f1917g;
        synchronized (uVar) {
            j11 = uVar.f3064l;
        }
        long j12 = (long) (j11 * this.f1922m);
        this.f1917g.getClass();
        long j13 = (long) (j12 / this.f1926q);
        if (!this.f1924o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f1924o.size() - 1 && ((a) this.f1924o.get(i11)).f1915a < j13) {
                i11++;
            }
            a aVar = (a) this.f1924o.get(i11 - 1);
            a aVar2 = (a) this.f1924o.get(i11);
            long j14 = aVar.f1915a;
            float f10 = (j13 - j14) / (aVar2.f1915a - j14);
            long j15 = aVar.f1916b;
            j13 = j15 + ((long) (f10 * (aVar2.f1916b - j15)));
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        for (int i12 = 0; i12 < this.f1932b; i12++) {
            if (j10 == Long.MIN_VALUE || !f(i12, j10)) {
                t0 t0Var = this.d[i12];
                int iMax = Math.max(t0Var.G, t0Var.H);
                if (map.containsKey(Integer.valueOf(iMax))) {
                    Integer num = (Integer) map.get(Integer.valueOf(iMax));
                    t0 t0Var2 = this.d[num.intValue()];
                    boolean z10 = t0Var2.v;
                    if ((!z10 || t0Var.v) && ((!z10 && t0Var.v) || t0Var.f8189n < t0Var2.f8189n)) {
                        map.put(Integer.valueOf(iMax), Integer.valueOf(i12));
                        arrayList.remove(num);
                        arrayList.add(Integer.valueOf(i12));
                    }
                } else {
                    map.put(Integer.valueOf(iMax), Integer.valueOf(i12));
                    arrayList.add(Integer.valueOf(i12));
                }
            }
        }
        if (i10 == 0) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.d[iIntValue2].v) {
                    return iIntValue2;
                }
            }
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            iIntValue = ((Integer) obj2).intValue();
            t0 t0Var3 = this.d[iIntValue];
            int i15 = t0Var3.f8189n;
            if (t0Var3.v || i15 <= j13) {
                break;
            }
        }
        return iIntValue;
    }
}
