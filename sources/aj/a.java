package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1641a;
    public volatile boolean f1642b;
    public volatile boolean f1643c;
    public volatile boolean d;

    public a(String str) {
        this.f1641a = str;
    }

    public final void a() {
        if (this.f1642b) {
            return;
        }
        synchronized (this) {
            if (!this.f1642b) {
                SharedPreferences sharedPreferences = d.f1649a;
                this.f1643c = sharedPreferences.contains(this.f1641a);
                this.d = sharedPreferences.getBoolean(this.f1641a, true);
                this.f1642b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1643c = true;
        this.f1642b = true;
        d.f1649a.edit().putBoolean(this.f1641a, z10).apply();
    }
}
