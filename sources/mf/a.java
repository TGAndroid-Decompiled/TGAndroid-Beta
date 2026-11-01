package mf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.w0;
import w7.u;
public final class a {
    public final SharedPreferences f13057a;
    public long f13058b;
    public long f13059c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f13057a = sharedPreferences;
        this.f13058b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f13059c == 0) {
            return;
        }
        this.f13058b = (((SystemClock.uptimeMillis() - this.f13059c) * (10 - b10)) / 10) + ((this.f13058b * u.b(this.d, 0, 9)) / 10);
        this.f13059c = 0L;
        this.d++;
        this.f13057a.edit().putLong("estimated", this.f13058b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f13058b > 0) {
            return u.a(((float) (SystemClock.uptimeMillis() - this.f13059c)) / ((float) this.f13058b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
