package bf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import h7.n;
import org.telegram.messenger.ApplicationLoader;

public final class a {

    public final SharedPreferences f2076a;

    public long f2077b;

    public long f2078c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f2076a = sharedPreferences;
        this.f2077b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        if (this.f2078c == 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f2078c;
        int iB = n.b(this.d, 0, 9);
        this.f2077b = ((jUptimeMillis * ((long) (10 - iB))) / 10) + ((this.f2077b * ((long) iB)) / 10);
        this.f2078c = 0L;
        this.d++;
        this.f2076a.edit().putLong("estimated", this.f2077b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f2077b > 0) {
            return n.a((SystemClock.uptimeMillis() - this.f2078c) / this.f2077b, 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
