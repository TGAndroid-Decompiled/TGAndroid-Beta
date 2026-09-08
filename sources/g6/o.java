package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;
public final class o {
    public static final Object f10440i = new Object();
    public final b f10441a;
    public final long f10442b;
    public final String f10443c;
    public n f10446g;
    public androidx.activity.i h;
    public long f10444e = -1;
    public long f10445f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f10442b = j3;
        this.f10443c = str;
        this.f10441a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10440i;
        synchronized (obj) {
            nVar2 = this.f10446g;
            j10 = this.f10444e;
            j11 = this.f10445f;
            this.f10444e = j3;
            this.f10446g = nVar;
            this.f10445f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.m(this.f10443c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 20);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.f10442b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f10440i) {
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
        synchronized (f10440i) {
            long j10 = this.f10444e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f10440i) {
            if (this.f10444e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10441a.b(str, new Object[0]);
        Object obj2 = f10440i;
        synchronized (obj2) {
            try {
                if (this.f10446g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10446g;
                    n6.l.h(nVar);
                    nVar.s(this.f10443c, this.f10444e, i10, obj, this.f10445f, currentTimeMillis);
                }
                this.f10444e = -1L;
                this.f10446g = null;
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
        synchronized (f10440i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f10444e;
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
