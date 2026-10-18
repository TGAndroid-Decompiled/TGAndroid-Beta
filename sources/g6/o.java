package g6;

import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import java.util.Locale;
public final class o {
    public static final Object f10869i = new Object();
    public final b f10870a;
    public final long f10871b;
    public final String f10872c;
    public n f10874g;
    public androidx.activity.i h;
    public long e = -1;
    public long f10873f = 0;
    public final a0 d = new a0(Looper.getMainLooper(), 0);

    public o(long j10, String str) {
        this.f10871b = j10;
        this.f10872c = str;
        this.f10870a = new b("RequestTracker", str);
    }

    public final void a(long j10, n nVar) {
        n nVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f10869i;
        synchronized (obj) {
            nVar2 = this.f10874g;
            j11 = this.e;
            j12 = this.f10873f;
            this.e = j10;
            this.f10874g = nVar;
            this.f10873f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.j(this.f10872c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                androidx.activity.i iVar = this.h;
                if (iVar != null) {
                    this.d.removeCallbacks(iVar);
                }
                androidx.activity.i iVar2 = new androidx.activity.i(this, 20);
                this.h = iVar2;
                this.d.postDelayed(iVar2, this.f10871b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, l lVar) {
        synchronized (f10869i) {
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
        synchronized (f10869i) {
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
        synchronized (f10869i) {
            if (this.e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f10870a.b(str, new Object[0]);
        Object obj2 = f10869i;
        synchronized (obj2) {
            try {
                if (this.f10874g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f10874g;
                    n6.l.h(nVar);
                    nVar.s(this.f10872c, this.e, i10, obj, this.f10873f, currentTimeMillis);
                }
                this.e = -1L;
                this.f10874g = null;
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
        synchronized (f10869i) {
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
