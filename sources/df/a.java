package df;

import android.content.SharedPreferences;
import android.os.SystemClock;
import i7.w;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f5541a;
    public long f5542b;
    public long f5543c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f5541a = sharedPreferences;
        this.f5542b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f5543c == 0) {
            return;
        }
        this.f5542b = (((SystemClock.uptimeMillis() - this.f5543c) * (10 - b10)) / 10) + ((this.f5542b * w.b(this.d, 0, 9)) / 10);
        this.f5543c = 0L;
        this.d++;
        this.f5541a.edit().putLong("estimated", this.f5542b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f5542b > 0) {
            return w.a(((float) (SystemClock.uptimeMillis() - this.f5543c)) / ((float) this.f5542b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
