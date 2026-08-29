package ca;

import aa.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f3024e = TimeUnit.MINUTES.toMillis(30);
    public final j f3025a;
    public long f3026b;
    public int f3027c;

    public d() {
        if (bb.a.f2041b == null) {
            Pattern pattern = j.f298c;
            bb.a.f2041b = new bb.a(5);
        }
        bb.a aVar = bb.a.f2041b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f3025a = j.d;
    }

    public final synchronized long a(int i10) {
        boolean z10;
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f3027c);
        this.f3025a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f3024e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f3027c != 0) {
            this.f3025a.f299a.getClass();
            if (System.currentTimeMillis() <= this.f3026b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f3027c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f3027c++;
            long a2 = a(i10);
            this.f3025a.f299a.getClass();
            this.f3026b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
