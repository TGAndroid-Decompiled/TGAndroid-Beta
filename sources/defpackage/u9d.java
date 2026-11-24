package defpackage;

import android.os.Looper;
import java.util.Locale;
public final class u9d {
    public static final Object i = new Object();
    public final dc6 a;
    public final int b;
    public final String c;
    public f9d g;
    public xia h;
    public long e = -1;
    public long f = 0;
    public final o59 d = new o59(Looper.getMainLooper(), (byte) 3);

    public u9d(long j, String str) {
        this.b = (int) j;
        this.c = str;
        this.a = new dc6("RequestTracker", str);
    }

    public final void a(long j, f9d f9dVar) {
        f9d f9dVar2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            f9dVar2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = f9dVar;
            this.f = currentTimeMillis;
        }
        if (f9dVar2 != null) {
            f9dVar2.j0(this.c, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            xia xiaVar = this.h;
            if (xiaVar != null) {
                this.d.removeCallbacks(xiaVar);
            }
            xia xiaVar2 = new xia(this, (byte) 27);
            this.h = xiaVar2;
            this.d.postDelayed(xiaVar2, this.b);
        }
    }

    public final void b(long j, int i2, r8d r8dVar) {
        synchronized (i) {
            if (c(j)) {
                Locale locale = Locale.ROOT;
                e(i2, r8dVar, "request " + j + " completed");
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (i) {
            if (this.e != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void e(int i2, r8d r8dVar, String str) {
        this.a.b(str, new Object[0]);
        Object obj = i;
        synchronized (obj) {
            if (this.g != null) {
                long currentTimeMillis = System.currentTimeMillis();
                f9d f9dVar = this.g;
                fre.h(f9dVar);
                f9dVar.R(this.c, this.e, i2, r8dVar, this.f, currentTimeMillis);
            }
            this.e = -1L;
            this.g = null;
            synchronized (obj) {
                xia xiaVar = this.h;
                if (xiaVar != null) {
                    this.d.removeCallbacks(xiaVar);
                    this.h = null;
                }
            }
        }
    }

    public final boolean f(int i2) {
        synchronized (i) {
            if (d()) {
                Locale locale = Locale.ROOT;
                long j = this.e;
                e(i2, null, "clearing request " + j);
                return true;
            }
            return false;
        }
    }
}
