package aa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import y9.j;
public final class e {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f135e = TimeUnit.MINUTES.toMillis(30);
    public final j f136a;
    public long f137b;
    public int f138c;

    public e() {
        if (ya.b.f49684b == null) {
            Pattern pattern = j.f49680c;
            ya.b.f49684b = new ya.b(3);
        }
        ya.b bVar = ya.b.f49684b;
        if (j.d == null) {
            j.d = new j(bVar);
        }
        this.f136a = j.d;
    }

    public final synchronized long a(int i9) {
        boolean z10;
        if (i9 != 429 && (i9 < 500 || i9 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f138c);
        this.f136a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f135e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f138c != 0) {
            this.f136a.f49681a.getClass();
            if (System.currentTimeMillis() <= this.f137b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f138c = 0;
    }

    public final synchronized void d(int i9) {
        if ((i9 < 200 || i9 >= 300) && i9 != 401 && i9 != 404) {
            this.f138c++;
            long a2 = a(i9);
            this.f136a.f49681a.getClass();
            this.f137b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
