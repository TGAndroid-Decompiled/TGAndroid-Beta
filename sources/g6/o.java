package g6;

import ai.q4;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;
public final class o {
    public static final Object f10276i = new Object();
    public final b f10277a;
    public final long f10278b;
    public final String f10279c;
    public n f10282g;
    public q4 h;
    public long f10280e = -1;
    public long f10281f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f10278b = j3;
        this.f10279c = str;
        this.f10277a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10276i;
        synchronized (obj) {
            nVar2 = this.f10282g;
            j10 = this.f10280e;
            j11 = this.f10281f;
            this.f10280e = j3;
            this.f10282g = nVar;
            this.f10281f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.q(this.f10279c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                q4 q4Var = this.h;
                if (q4Var != null) {
                    this.d.removeCallbacks(q4Var);
                }
                q4 q4Var2 = new q4(this, 20);
                this.h = q4Var2;
                this.d.postDelayed(q4Var2, this.f10278b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f10276i) {
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
        synchronized (f10276i) {
            long j10 = this.f10280e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f10276i) {
            if (this.f10280e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10277a.b(str, new Object[0]);
        Object obj2 = f10276i;
        synchronized (obj2) {
            try {
                if (this.f10282g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10282g;
                    n6.l.h(nVar);
                    nVar.u(this.f10279c, this.f10280e, i10, obj, this.f10281f, currentTimeMillis);
                }
                this.f10280e = -1L;
                this.f10282g = null;
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
        synchronized (f10276i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f10280e;
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
