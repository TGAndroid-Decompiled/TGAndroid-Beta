package ea;

import ca.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f5182a;
    public long f5183b;
    public int f5184c;

    public d() {
        if (db.a.f4295b == null) {
            Pattern pattern = j.f2231c;
            db.a.f4295b = new db.a(6);
        }
        db.a aVar = db.a.f4295b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f5182a = j.d;
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
        double pow = Math.pow(2.0d, this.f5184c);
        this.f5182a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z4;
        if (this.f5184c != 0) {
            this.f5182a.f2232a.getClass();
            if (System.currentTimeMillis() <= this.f5183b) {
                z4 = false;
            }
        }
        z4 = true;
        return z4;
    }

    public final synchronized void c() {
        this.f5184c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f5184c++;
            long a2 = a(i10);
            this.f5182a.f2232a.getClass();
            this.f5183b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
