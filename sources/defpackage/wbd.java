package defpackage;

import android.os.Looper;
import java.util.Locale;
public final class wbd {
    public static final Object i = new Object();
    public final ce6 a;
    public final int b;
    public final String c;
    public hbd g;
    public zka h;
    public long e = -1;
    public long f = 0;
    public final q79 d = new q79(Looper.getMainLooper(), (byte) 3);

    public wbd(long j, String str) {
        this.b = (int) j;
        this.c = str;
        this.a = new ce6("RequestTracker", str);
    }

    public final void a(long j, hbd hbdVar) {
        hbd hbdVar2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            hbdVar2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = hbdVar;
            this.f = currentTimeMillis;
        }
        if (hbdVar2 != null) {
            hbdVar2.u0(this.c, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            zka zkaVar = this.h;
            if (zkaVar != null) {
                this.d.removeCallbacks(zkaVar);
            }
            zka zkaVar2 = new zka(this, (byte) 27);
            this.h = zkaVar2;
            this.d.postDelayed(zkaVar2, this.b);
        }
    }

    public final void b(long j, int i2, tad tadVar) {
        synchronized (i) {
            if (c(j)) {
                Locale locale = Locale.ROOT;
                e(i2, tadVar, "request " + j + " completed");
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (i) {
            if (this.e != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void e(int i2, tad tadVar, String str) {
        this.a.b(str, new Object[0]);
        Object obj = i;
        synchronized (obj) {
            if (this.g != null) {
                long currentTimeMillis = System.currentTimeMillis();
                hbd hbdVar = this.g;
                ite.h(hbdVar);
                hbdVar.c0(this.c, this.e, i2, tadVar, this.f, currentTimeMillis);
            }
            this.e = -1L;
            this.g = null;
            synchronized (obj) {
                zka zkaVar = this.h;
                if (zkaVar != null) {
                    this.d.removeCallbacks(zkaVar);
                    this.h = null;
                }
            }
        }
    }

    public final boolean f(int i2) {
        synchronized (i) {
            if (d()) {
                Locale locale = Locale.ROOT;
                long j = this.e;
                e(i2, null, "clearing request " + j);
                return true;
            }
            return false;
        }
    }
}
