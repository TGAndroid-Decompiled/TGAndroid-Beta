package i6;

import android.os.Looper;
import com.google.android.gms.internal.cast.z;
import java.util.Locale;
public final class o {
    public static final Object f14646i = new Object();
    public final b f14647a;
    public final long f14648b;
    public final String f14649c;
    public n f14652g;
    public a3.o h;
    public long f14650e = -1;
    public long f14651f = 0;
    public final z d = new z(Looper.getMainLooper(), 0);

    public o(long j10, String str) {
        this.f14648b = j10;
        this.f14649c = str;
        this.f14647a = new b("RequestTracker", str);
    }

    public final void a(long j10, n nVar) {
        n nVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f14646i;
        synchronized (obj) {
            nVar2 = this.f14652g;
            j11 = this.f14650e;
            j12 = this.f14651f;
            this.f14650e = j10;
            this.f14652g = nVar;
            this.f14651f = currentTimeMillis;
        }
        if (nVar2 != null) {
            nVar2.i(this.f14649c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                a3.o oVar = this.h;
                if (oVar != null) {
                    this.d.removeCallbacks(oVar);
                }
                a3.o oVar2 = new a3.o(this, 26);
                this.h = oVar2;
                this.d.postDelayed(oVar2, this.f14648b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i3, l lVar) {
        synchronized (f14646i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i3, lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f14646i) {
            long j11 = this.f14650e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f14646i) {
            if (this.f14650e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i3, Object obj) {
        this.f14647a.b(str, new Object[0]);
        Object obj2 = f14646i;
        synchronized (obj2) {
            try {
                if (this.f14652g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n nVar = this.f14652g;
                    p6.m.g(nVar);
                    nVar.p(this.f14649c, this.f14650e, i3, obj, this.f14651f, currentTimeMillis);
                }
                this.f14650e = -1L;
                this.f14652g = null;
                synchronized (obj2) {
                    a3.o oVar = this.h;
                    if (oVar != null) {
                        this.d.removeCallbacks(oVar);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i3) {
        synchronized (f14646i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.f14650e;
                    e("clearing request " + j10, i3, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
