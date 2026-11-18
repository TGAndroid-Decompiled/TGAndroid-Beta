package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1640a;
    public volatile boolean f1641b;
    public volatile boolean f1642c;
    public volatile boolean d;

    public a(String str) {
        this.f1640a = str;
    }

    public final void a() {
        if (this.f1641b) {
            return;
        }
        synchronized (this) {
            if (!this.f1641b) {
                SharedPreferences sharedPreferences = d.f1648a;
                this.f1642c = sharedPreferences.contains(this.f1640a);
                this.d = sharedPreferences.getBoolean(this.f1640a, true);
                this.f1641b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1642c = true;
        this.f1641b = true;
        d.f1648a.edit().putBoolean(this.f1640a, z10).apply();
    }
}
