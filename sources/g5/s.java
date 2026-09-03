package g5;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.d1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
public final class s implements f, v0 {
    public static final s8.i0 f6419n = s8.v.w(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final s8.i0 f6420o = s8.v.w(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final s8.i0 f6421p = s8.v.w(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final s8.i0 f6422q = s8.v.w(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final s8.i0 f6423r = s8.v.w(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final s8.i0 f6424s = s8.v.w(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static s f6425t;
    public final s8.x f6426a;
    public final ja.c f6427b = new ja.c(12);
    public final t0 f6428c;
    public final h5.y d;
    public final boolean e;
    public int f6429f;
    public long f6430g;
    public long h;
    public int f6431i;
    public long f6432j;
    public long f6433k;
    public volatile long f6434l;
    public long f6435m;

    public s(Context context, Map map, int i10, h5.y yVar, boolean z4) {
        this.f6426a = s8.x.a(map);
        this.f6428c = new t0(i10);
        this.d = yVar;
        this.e = z4;
        if (context != null) {
            h5.u d = h5.u.d(context);
            int f10 = d.f();
            this.f6431i = f10;
            this.f6434l = a(f10);
            r rVar = new r(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d.f6982c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(rVar));
            ((Handler) d.f6981b).post(new ff.c(11, d, rVar));
            return;
        }
        this.f6431i = 0;
        this.f6434l = a(0);
    }

    public static synchronized s b(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (f6425t == null) {
                    d1 d1Var = new d1(context);
                    f6425t = new s((Context) d1Var.f2750c, (HashMap) d1Var.d, d1Var.f2748a, (h5.y) d1Var.e, d1Var.f2749b);
                }
                sVar = f6425t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final long a(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        s8.x xVar = this.f6426a;
        Long l10 = (Long) xVar.get(valueOf);
        if (l10 == null) {
            l10 = (Long) xVar.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i10, long j10, long j11) {
        int i11;
        long j12;
        long j13;
        if (i10 != 0 || j10 != 0 || j11 != this.f6435m) {
            this.f6435m = j11;
            Iterator it = ((CopyOnWriteArrayList) this.f6427b.f9336b).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (!eVar.f6371c) {
                    i11 = i10;
                    j12 = j10;
                    j13 = j11;
                    eVar.f6369a.post(new d(eVar, i11, j12, j13, 0));
                } else {
                    i11 = i10;
                    j12 = j10;
                    j13 = j11;
                }
                i10 = i11;
                j10 = j12;
                j11 = j13;
            }
        }
    }

    public final synchronized void d(long j10, long j11) {
        try {
            this.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f6432j += (int) (elapsedRealtime - this.f6430g);
            this.f6433k += j10;
            if (j11 > 0 && j10 > 0) {
                this.f6428c.a((((float) j10) * 8000.0f) / ((float) j11), (int) Math.sqrt(j10));
                if (this.f6432j < 2000) {
                    if (this.f6433k >= 524288) {
                    }
                    c((int) j11, j10, this.f6434l);
                    this.f6430g = elapsedRealtime;
                    this.h = 0L;
                }
                this.f6434l = this.f6428c.b();
                c((int) j11, j10, this.f6434l);
                this.f6430g = elapsedRealtime;
                this.h = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(g5.p r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: g5.s.e(g5.p, boolean):void");
    }

    public final synchronized void f(g5.p r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: g5.s.f(g5.p, boolean):void");
    }
}
