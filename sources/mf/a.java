package mf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.w0;
import w7.u;
public final class a {
    public final SharedPreferences f13056a;
    public long f13057b;
    public long f13058c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = w0.f19025b.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f13056a = sharedPreferences;
        this.f13057b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f13058c == 0) {
            return;
        }
        this.f13057b = (((SystemClock.uptimeMillis() - this.f13058c) * (10 - b10)) / 10) + ((this.f13057b * u.b(this.d, 0, 9)) / 10);
        this.f13058c = 0L;
        this.d++;
        this.f13056a.edit().putLong("estimated", this.f13057b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f13057b > 0) {
            return u.a(((float) (SystemClock.uptimeMillis() - this.f13058c)) / ((float) this.f13057b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
