package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import java.util.Locale;
public final class o {
    public static final Object f10412i = new Object();
    public final b f10413a;
    public final long f10414b;
    public final String f10415c;
    public n f10418g;
    public androidx.activity.i h;
    public long f10416e = -1;
    public long f10417f = 0;
    public final c0 d = new c0(Looper.getMainLooper(), 0);

    public o(long j3, String str) {
        this.f10414b = j3;
        this.f10415c = str;
        this.f10413a = new b("RequestTracker", str);
    }

    public final void a(long j3, n nVar) {
        n nVar2;
        long j10;
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10412i;
        synchronized (obj) {
            nVar2 = this.f10418g;
            j10 = this.f10416e;
            j11 = this.f10417f;
            this.f10416e = j3;
            this.f10418g = nVar;
            this.f10417f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.m(this.f10415c, j10, j11, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 20);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.f10414b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j3, int i10, l lVar) {
        synchronized (f10412i) {
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
        synchronized (f10412i) {
            long j10 = this.f10416e;
            z10 = false;
            if (j10 != -1 && j10 == j3) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f10412i) {
            if (this.f10416e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10413a.b(str, new Object[0]);
        Object obj2 = f10412i;
        synchronized (obj2) {
            try {
                if (this.f10418g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10418g;
                    n6.l.h(nVar);
                    nVar.s(this.f10415c, this.f10416e, i10, obj, this.f10417f, currentTimeMillis);
                }
                this.f10416e = -1L;
                this.f10418g = null;
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
        synchronized (f10412i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j3 = this.f10416e;
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
