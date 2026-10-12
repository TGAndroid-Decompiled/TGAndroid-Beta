package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.Locale;
public final class o {
    public static final Object f9958i = new Object();
    public final b f9959a;
    public final long f9960b;
    public final String f9961c;
    public n f9963g;
    public androidx.activity.i h;
    public long e = -1;
    public long f9962f = 0;
    public final a0 d = new a0(Looper.getMainLooper(), 0);

    public o(long j10, String str) {
        this.f9960b = j10;
        this.f9961c = str;
        this.f9959a = new b("RequestTracker", str);
    }

    public final void a(long j10, n nVar) {
        n nVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f9958i;
        synchronized (obj) {
            nVar2 = this.f9963g;
            j11 = this.e;
            j12 = this.f9962f;
            this.e = j10;
            this.f9963g = nVar;
            this.f9962f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.j(this.f9961c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 20);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.f9960b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, l lVar) {
        synchronized (f9958i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i10, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f9958i) {
            long j11 = this.e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f9958i) {
            if (this.e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f9959a.b(str, new Object[0]);
        Object obj2 = f9958i;
        synchronized (obj2) {
            try {
                if (this.f9963g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f9963g;
                    n6.l.h(nVar);
                    nVar.v(this.f9961c, this.e, i10, obj, this.f9962f, currentTimeMillis);
                }
                this.e = -1L;
                this.f9963g = null;
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
        synchronized (f9958i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.e;
                    e("clearing request " + j10, i10, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
