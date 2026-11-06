package j6;

import a8.ra;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.Locale;
public final class o {
    public static final Object f16531i = new Object();
    public final b f16532a;
    public final long f16533b;
    public final String f16534c;
    public n f16537g;
    public ra h;
    public long f16535e = -1;
    public long f16536f = 0;
    public final y d = new y(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f16533b = j3;
        this.f16534c = str;
        this.f16532a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f16531i;
        synchronized (obj) {
            nVar2 = this.f16537g;
            j10 = this.f16535e;
            j11 = this.f16536f;
            this.f16535e = j3;
            this.f16537g = nVar;
            this.f16536f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.v(this.f16534c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                ra raVar = this.h;
                if (raVar != null) {
                    this.d.removeCallbacks(raVar);
                }
                ra raVar2 = new ra(this, 27);
                this.h = raVar2;
                this.d.postDelayed(raVar2, this.f16533b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f16531i) {
            try {
                if (c(j3)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j3 + " completed", i7, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j3) {
        boolean z9;
        synchronized (f16531i) {
            long j10 = this.f16535e;
            z9 = false;
            if (j10 != -1 && j10 == j3) {
                z9 = true;
            }
        }
        return z9;
    }

    public final boolean d() {
        boolean z9;
        synchronized (f16531i) {
            if (this.f16535e != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void e(String str, int i7, Object obj) {
        this.f16532a.b(str, new Object[0]);
        Object obj2 = f16531i;
        synchronized (obj2) {
            try {
                if (this.f16537g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f16537g;
                    q6.m.g(nVar);
                    nVar.H(this.f16534c, this.f16535e, i7, obj, this.f16536f, currentTimeMillis);
                }
                this.f16535e = -1L;
                this.f16537g = null;
                synchronized (obj2) {
                    ra raVar = this.h;
                    if (raVar != null) {
                        this.d.removeCallbacks(raVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i7) {
        synchronized (f16531i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f16535e;
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
