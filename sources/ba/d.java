package ba;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import z9.j;

public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);

    public static final long f2063e = TimeUnit.MINUTES.toMillis(30);

    public final j f2064a;

    public long f2065b;

    public int f2066c;

    public d() {
        if (xa.a.f49381b == null) {
            Pattern pattern = j.f50276c;
            xa.a.f49381b = new xa.a(3);
        }
        xa.a aVar = xa.a.f49381b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f2064a = j.d;
    }

    public final synchronized long a(int i10) {
        try {
            if (!(i10 == 429 || (i10 >= 500 && i10 < 600))) {
                return d;
            }
            double dPow = Math.pow(2.0d, this.f2066c);
            this.f2064a.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f2063e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f2066c != 0) {
            this.f2064a.f50277a.getClass();
            if (System.currentTimeMillis() > this.f2065b) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void c() {
        this.f2066c = 0;
    }

    public final synchronized void d(int i10) {
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                c();
                return;
            }
            this.f2066c++;
            long jA = a(i10);
            this.f2064a.f50277a.getClass();
            this.f2065b = System.currentTimeMillis() + jA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
