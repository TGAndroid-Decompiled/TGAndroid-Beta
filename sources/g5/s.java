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
    public static final s8.i0 f6907n = s8.v.w(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final s8.i0 f6908o = s8.v.w(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final s8.i0 f6909p = s8.v.w(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final s8.i0 f6910q = s8.v.w(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final s8.i0 f6911r = s8.v.w(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final s8.i0 f6912s = s8.v.w(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static s f6913t;
    public final s8.x f6914a;
    public final o5.i f6915b = new o5.i(15);
    public final t0 f6916c;
    public final h5.y d;
    public final boolean f6917e;
    public int f6918f;
    public long f6919g;
    public long h;
    public int f6920i;
    public long f6921j;
    public long f6922k;
    public volatile long f6923l;
    public long f6924m;

    public s(Context context, Map map, int i10, h5.y yVar, boolean z4) {
        this.f6914a = s8.x.a(map);
        this.f6916c = new t0(i10);
        this.d = yVar;
        this.f6917e = z4;
        if (context != null) {
            h5.u d = h5.u.d(context);
            int f10 = d.f();
            this.f6920i = f10;
            this.f6923l = a(f10);
            r rVar = new r(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d.f7301c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(rVar));
            ((Handler) d.f7300b).post(new gf.c(4, d, rVar));
            return;
        }
        this.f6920i = 0;
        this.f6923l = a(0);
    }

    public static synchronized s b(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (f6913t == null) {
                    d1 d1Var = new d1(context);
                    f6913t = new s((Context) d1Var.f2697c, (HashMap) d1Var.d, d1Var.f2695a, (h5.y) d1Var.f2698e, d1Var.f2696b);
                }
                sVar = f6913t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final long a(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        s8.x xVar = this.f6914a;
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
        if (i10 != 0 || j10 != 0 || j11 != this.f6924m) {
            this.f6924m = j11;
            Iterator it = ((CopyOnWriteArrayList) this.f6915b.f16615b).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (!eVar.f6850c) {
                    i11 = i10;
                    j12 = j10;
                    j13 = j11;
                    eVar.f6848a.post(new d(eVar, i11, j12, j13, 0));
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
            this.f6921j += (int) (elapsedRealtime - this.f6919g);
            this.f6922k += j10;
            if (j11 > 0 && j10 > 0) {
                this.f6916c.a((((float) j10) * 8000.0f) / ((float) j11), (int) Math.sqrt(j10));
                if (this.f6921j < 2000) {
                    if (this.f6922k >= 524288) {
                    }
                    c((int) j11, j10, this.f6923l);
                    this.f6919g = elapsedRealtime;
                    this.h = 0L;
                }
                this.f6923l = this.f6916c.b();
                c((int) j11, j10, this.f6923l);
                this.f6919g = elapsedRealtime;
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
