package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1659a;
    public volatile boolean f1660b;
    public volatile boolean f1661c;
    public volatile boolean d;

    public a(String str) {
        this.f1659a = str;
    }

    public final void a() {
        if (this.f1660b) {
            return;
        }
        synchronized (this) {
            if (!this.f1660b) {
                SharedPreferences sharedPreferences = d.f1667a;
                this.f1661c = sharedPreferences.contains(this.f1659a);
                this.d = sharedPreferences.getBoolean(this.f1659a, true);
                this.f1660b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1661c = true;
        this.f1660b = true;
        d.f1667a.edit().putBoolean(this.f1659a, z10).apply();
    }
}
