package af;

import android.content.SharedPreferences;
import android.os.SystemClock;
import g7.n;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f148a;
    public long f149b;
    public long f150c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f148a = sharedPreferences;
        this.f149b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f150c == 0) {
            return;
        }
        this.f149b = (((SystemClock.uptimeMillis() - this.f150c) * (10 - b10)) / 10) + ((this.f149b * n.b(this.d, 0, 9)) / 10);
        this.f150c = 0L;
        this.d++;
        this.f148a.edit().putLong("estimated", this.f149b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f149b > 0) {
            return n.a(((float) (SystemClock.uptimeMillis() - this.f150c)) / ((float) this.f149b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
