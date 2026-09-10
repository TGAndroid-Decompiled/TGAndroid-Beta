package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;
public final class o {
    public static final Object f8582i = new Object();
    public final b f8583a;
    public final long f8584b;
    public final String f8585c;
    public n f8587g;
    public androidx.activity.i h;
    public long e = -1;
    public long f8586f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f8584b = j3;
        this.f8585c = str;
        this.f8583a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f8582i;
        synchronized (obj) {
            nVar2 = this.f8587g;
            j10 = this.e;
            j11 = this.f8586f;
            this.e = j3;
            this.f8587g = nVar;
            this.f8586f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.m(this.f8585c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 17);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.f8584b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f8582i) {
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
        synchronized (f8582i) {
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
        synchronized (f8582i) {
            if (this.e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f8583a.b(str, new Object[0]);
        Object obj2 = f8582i;
        synchronized (obj2) {
            try {
                if (this.f8587g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f8587g;
                    n6.l.h(nVar);
                    nVar.y(this.f8585c, this.e, i10, obj, this.f8586f, currentTimeMillis);
                }
                this.e = -1L;
                this.f8587g = null;
                synchronized (obj2) {
                    androidx.activity.i iVar = this.h;
                    if (iVar != null) {
                        this.d.removeCallbacks(iVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f8582i) {
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
