package ea;

import ca.j;
import h7.u;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f5017e = TimeUnit.MINUTES.toMillis(30);
    public final j f5018a;
    public long f5019b;
    public int f5020c;

    public d() {
        if (u.f7349c == null) {
            Pattern pattern = j.f2398c;
            u.f7349c = new u(6);
        }
        u uVar = u.f7349c;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        this.f5018a = j.d;
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
        double pow = Math.pow(2.0d, this.f5020c);
        this.f5018a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f5017e);
    }

    public final synchronized boolean b() {
        boolean z4;
        if (this.f5020c != 0) {
            this.f5018a.f2399a.getClass();
            if (System.currentTimeMillis() <= this.f5019b) {
                z4 = false;
            }
        }
        z4 = true;
        return z4;
    }

    public final synchronized void c() {
        this.f5020c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f5020c++;
            long a2 = a(i10);
            this.f5018a.f2399a.getClass();
            this.f5019b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
