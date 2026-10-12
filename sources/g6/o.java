package g6;

import ai.r4;
import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.Locale;
public final class o {
    public static final Object f10347i = new Object();
    public final b f10348a;
    public final long f10349b;
    public final String f10350c;
    public n f10353g;
    public r4 h;
    public long f10351e = -1;
    public long f10352f = 0;
    public final a0 d = new a0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f10349b = j3;
        this.f10350c = str;
        this.f10348a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10347i;
        synchronized (obj) {
            nVar2 = this.f10353g;
            j10 = this.f10351e;
            j11 = this.f10352f;
            this.f10351e = j3;
            this.f10353g = nVar;
            this.f10352f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.r(this.f10350c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                r4 r4Var = this.h;
                if (r4Var != null) {
                    this.d.removeCallbacks(r4Var);
                }
                r4 r4Var2 = new r4(this, 20);
                this.h = r4Var2;
                this.d.postDelayed(r4Var2, this.f10349b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f10347i) {
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
        synchronized (f10347i) {
            long j10 = this.f10351e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f10347i) {
            if (this.f10351e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10348a.b(str, new Object[0]);
        Object obj2 = f10347i;
        synchronized (obj2) {
            try {
                if (this.f10353g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10353g;
                    n6.m.h(nVar);
                    nVar.B(this.f10350c, this.f10351e, i10, obj, this.f10352f, currentTimeMillis);
                }
                this.f10351e = -1L;
                this.f10353g = null;
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
        synchronized (f10347i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f10351e;
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
