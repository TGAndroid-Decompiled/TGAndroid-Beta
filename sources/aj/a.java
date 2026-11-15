package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1648a;
    public volatile boolean f1649b;
    public volatile boolean f1650c;
    public volatile boolean d;

    public a(String str) {
        this.f1648a = str;
    }

    public final void a() {
        if (this.f1649b) {
            return;
        }
        synchronized (this) {
            if (!this.f1649b) {
                SharedPreferences sharedPreferences = d.f1656a;
                this.f1650c = sharedPreferences.contains(this.f1648a);
                this.d = sharedPreferences.getBoolean(this.f1648a, true);
                this.f1649b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1650c = true;
        this.f1649b = true;
        d.f1656a.edit().putBoolean(this.f1648a, z10).apply();
    }
}
