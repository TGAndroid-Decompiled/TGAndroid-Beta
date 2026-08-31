package ff;

import android.content.SharedPreferences;
import android.os.SystemClock;
import k7.o;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f6228a;
    public long f6229b;
    public long f6230c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f6228a = sharedPreferences;
        this.f6229b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f6230c == 0) {
            return;
        }
        this.f6229b = (((SystemClock.uptimeMillis() - this.f6230c) * (10 - b10)) / 10) + ((this.f6229b * o.b(this.d, 0, 9)) / 10);
        this.f6230c = 0L;
        this.d++;
        this.f6228a.edit().putLong("estimated", this.f6229b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f6229b > 0) {
            return o.a(((float) (SystemClock.uptimeMillis() - this.f6230c)) / ((float) this.f6229b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
