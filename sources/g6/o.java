package g6;

import ai.q4;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;
public final class o {
    public static final Object f9451i = new Object();
    public final b f9452a;
    public final long f9453b;
    public final String f9454c;
    public n f9456g;
    public q4 h;
    public long e = -1;
    public long f9455f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f9453b = j3;
        this.f9454c = str;
        this.f9452a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f9451i;
        synchronized (obj) {
            nVar2 = this.f9456g;
            j10 = this.e;
            j11 = this.f9455f;
            this.e = j3;
            this.f9456g = nVar;
            this.f9455f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.p(this.f9454c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                q4 q4Var = this.h;
                if (q4Var != null) {
                    this.d.removeCallbacks(q4Var);
                }
                q4 q4Var2 = new q4(this, 20);
                this.h = q4Var2;
                this.d.postDelayed(q4Var2, this.f9453b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f9451i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i10, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z10;
        synchronized (f9451i) {
            long j10 = this.e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f9451i) {
            if (this.e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f9452a.b(str, new Object[0]);
        Object obj2 = f9451i;
        synchronized (obj2) {
            try {
                if (this.f9456g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f9456g;
                    n6.l.h(nVar);
                    nVar.y(this.f9454c, this.e, i10, obj, this.f9455f, currentTimeMillis);
                }
                this.e = -1L;
                this.f9456g = null;
                synchronized (obj2) {
                    q4 q4Var = this.h;
                    if (q4Var != null) {
                        this.d.removeCallbacks(q4Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f9451i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.e;
                    e("clearing request " + j3, i10, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
