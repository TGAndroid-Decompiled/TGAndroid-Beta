package j6;

import a8.ra;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.Locale;
public final class o {
    public static final Object f16534i = new Object();
    public final b f16535a;
    public final long f16536b;
    public final String f16537c;
    public n f16540g;
    public ra h;
    public long f16538e = -1;
    public long f16539f = 0;
    public final y d = new y(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f16536b = j3;
        this.f16537c = str;
        this.f16535a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f16534i;
        synchronized (obj) {
            nVar2 = this.f16540g;
            j10 = this.f16538e;
            j11 = this.f16539f;
            this.f16538e = j3;
            this.f16540g = nVar;
            this.f16539f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.v(this.f16537c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                ra raVar = this.h;
                if (raVar != null) {
                    this.d.removeCallbacks(raVar);
                }
                ra raVar2 = new ra(this, 27);
                this.h = raVar2;
                this.d.postDelayed(raVar2, this.f16536b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i7, l lVar) {
        synchronized (f16534i) {
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
        synchronized (f16534i) {
            long j10 = this.f16538e;
            z9 = false;
            if (j10 != -1 && j10 == j3) {
                z9 = true;
            }
        }
        return z9;
    }

    public final boolean d() {
        boolean z9;
        synchronized (f16534i) {
            if (this.f16538e != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void e(String str, int i7, Object obj) {
        this.f16535a.b(str, new Object[0]);
        Object obj2 = f16534i;
        synchronized (obj2) {
            try {
                if (this.f16540g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f16540g;
                    q6.m.g(nVar);
                    nVar.H(this.f16537c, this.f16538e, i7, obj, this.f16539f, currentTimeMillis);
                }
                this.f16538e = -1L;
                this.f16540g = null;
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
        synchronized (f16534i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f16538e;
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
