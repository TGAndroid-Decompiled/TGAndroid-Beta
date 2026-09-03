package ef;

import android.content.SharedPreferences;
import android.os.SystemClock;
import k7.n;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f5194a;
    public long f5195b;
    public long f5196c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f5194a = sharedPreferences;
        this.f5195b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f5196c == 0) {
            return;
        }
        this.f5195b = (((SystemClock.uptimeMillis() - this.f5196c) * (10 - b10)) / 10) + ((this.f5195b * n.b(this.d, 0, 9)) / 10);
        this.f5196c = 0L;
        this.d++;
        this.f5194a.edit().putLong("estimated", this.f5195b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f5195b > 0) {
            return n.a(((float) (SystemClock.uptimeMillis() - this.f5196c)) / ((float) this.f5195b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
