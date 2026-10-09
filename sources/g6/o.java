package g6;

import ai.r4;
import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.Locale;
public final class o {
    public static final Object f10349i = new Object();
    public final b f10350a;
    public final long f10351b;
    public final String f10352c;
    public n f10355g;
    public r4 h;
    public long f10353e = -1;
    public long f10354f = 0;
    public final a0 d = new a0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f10351b = j3;
        this.f10352c = str;
        this.f10350a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10349i;
        synchronized (obj) {
            nVar2 = this.f10355g;
            j10 = this.f10353e;
            j11 = this.f10354f;
            this.f10353e = j3;
            this.f10355g = nVar;
            this.f10354f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.n(this.f10352c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                r4 r4Var = this.h;
                if (r4Var != null) {
                    this.d.removeCallbacks(r4Var);
                }
                r4 r4Var2 = new r4(this, 20);
                this.h = r4Var2;
                this.d.postDelayed(r4Var2, this.f10351b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f10349i) {
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
        synchronized (f10349i) {
            long j10 = this.f10353e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f10349i) {
            if (this.f10353e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10350a.b(str, new Object[0]);
        Object obj2 = f10349i;
        synchronized (obj2) {
            try {
                if (this.f10355g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10355g;
                    n6.l.h(nVar);
                    nVar.w(this.f10352c, this.f10353e, i10, obj, this.f10354f, currentTimeMillis);
                }
                this.f10353e = -1L;
                this.f10355g = null;
                synchronized (obj2) {
                    r4 r4Var = this.h;
                    if (r4Var != null) {
                        this.d.removeCallbacks(r4Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f10349i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f10353e;
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
