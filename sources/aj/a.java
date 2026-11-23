package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1611a;
    public volatile boolean f1612b;
    public volatile boolean f1613c;
    public volatile boolean d;

    public a(String str) {
        this.f1611a = str;
    }

    public final void a() {
        if (this.f1612b) {
            return;
        }
        synchronized (this) {
            if (!this.f1612b) {
                SharedPreferences sharedPreferences = d.f1619a;
                this.f1613c = sharedPreferences.contains(this.f1611a);
                this.d = sharedPreferences.getBoolean(this.f1611a, true);
                this.f1612b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1613c = true;
        this.f1612b = true;
        d.f1619a.edit().putBoolean(this.f1611a, z10).apply();
    }
}
