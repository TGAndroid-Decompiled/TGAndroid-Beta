package ea;

import ca.j;
import h7.u;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f5176a;
    public long f5177b;
    public int f5178c;

    public d() {
        if (u.f7036c == null) {
            Pattern pattern = j.f2207c;
            u.f7036c = new u(6);
        }
        u uVar = u.f7036c;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        this.f5176a = j.d;
    }

    public final synchronized long a(int i10) {
        boolean z4;
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f5178c);
        this.f5176a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z4;
        if (this.f5178c != 0) {
            this.f5176a.f2208a.getClass();
            if (System.currentTimeMillis() <= this.f5177b) {
                z4 = false;
            }
        }
        z4 = true;
        return z4;
    }

    public final synchronized void c() {
        this.f5178c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f5178c++;
            long a2 = a(i10);
            this.f5176a.f2208a.getClass();
            this.f5177b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
