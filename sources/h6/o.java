package h6;

import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import java.util.Locale;
public final class o {
    public static final Object f12645i = new Object();
    public final b f12646a;
    public final long f12647b;
    public final String f12648c;
    public n f12650g;
    public a5.d h;
    public long e = -1;
    public long f12649f = 0;
    public final y d = new y(Looper.getMainLooper(), 0);

    public o(long j10, String str) {
        this.f12647b = j10;
        this.f12648c = str;
        this.f12646a = new b("RequestTracker", str);
    }

    public final void a(long j10, n nVar) {
        n nVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f12645i;
        synchronized (obj) {
            nVar2 = this.f12650g;
            j11 = this.e;
            j12 = this.f12649f;
            this.e = j10;
            this.f12650g = nVar;
            this.f12649f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.h(this.f12648c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                a5.d dVar = this.h;
                if (dVar != null) {
                    this.d.removeCallbacks(dVar);
                }
                a5.d dVar2 = new a5.d(this, 24);
                this.h = dVar2;
                this.d.postDelayed(dVar2, this.f12647b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, l lVar) {
        synchronized (f12645i) {
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
        synchronized (f12645i) {
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
        synchronized (f12645i) {
            if (this.e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f12646a.b(str, new Object[0]);
        Object obj2 = f12645i;
        synchronized (obj2) {
            try {
                if (this.f12650g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f12650g;
                    o6.l.h(nVar);
                    nVar.t(this.f12648c, this.e, i10, obj, this.f12649f, currentTimeMillis);
                }
                this.e = -1L;
                this.f12650g = null;
                synchronized (obj2) {
                    a5.d dVar = this.h;
                    if (dVar != null) {
                        this.d.removeCallbacks(dVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f12645i) {
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
