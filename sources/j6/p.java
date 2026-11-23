package j6;

import android.os.Looper;
import java.util.Locale;
public final class p {
    public static final Object f17361i = new Object();
    public final b f17362a;
    public final long f17363b;
    public final String f17364c;
    public o f17367g;
    public i6.g h;
    public long f17365e = -1;
    public long f17366f = 0;
    public final com.google.android.gms.internal.cast.y d = new com.google.android.gms.internal.cast.y(Looper.getMainLooper(), 0);

    public p(long j3, String str) {
        this.f17363b = j3;
        this.f17364c = str;
        this.f17362a = new b("RequestTracker", str);
    }

    public final void a(long j3, o oVar) {
        o oVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f17361i;
        synchronized (obj) {
            oVar2 = this.f17367g;
            j10 = this.f17365e;
            j11 = this.f17366f;
            this.f17365e = j3;
            this.f17367g = oVar;
            this.f17366f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.C(this.f17364c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                i6.g gVar = this.h;
                if (gVar != null) {
                    this.d.removeCallbacks(gVar);
                }
                i6.g gVar2 = new i6.g(this, 1);
                this.h = gVar2;
                this.d.postDelayed(gVar2, this.f17363b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, m mVar) {
        synchronized (f17361i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i7, mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z10;
        synchronized (f17361i) {
            long j10 = this.f17365e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f17361i) {
            if (this.f17365e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i7, Object obj) {
        this.f17362a.b(str, new Object[0]);
        Object obj2 = f17361i;
        synchronized (obj2) {
            try {
                if (this.f17367g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f17367g;
                    q6.m.h(oVar);
                    oVar.Z(this.f17364c, this.f17365e, i7, obj, this.f17366f, currentTimeMillis);
                }
                this.f17365e = -1L;
                this.f17367g = null;
                synchronized (obj2) {
                    i6.g gVar = this.h;
                    if (gVar != null) {
                        this.d.removeCallbacks(gVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i7) {
        synchronized (f17361i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f17365e;
                    e("clearing request " + j3, i7, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
