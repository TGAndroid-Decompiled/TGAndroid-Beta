package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1652a;
    public volatile boolean f1653b;
    public volatile boolean f1654c;
    public volatile boolean d;

    public a(String str) {
        this.f1652a = str;
    }

    public final void a() {
        if (this.f1653b) {
            return;
        }
        synchronized (this) {
            if (!this.f1653b) {
                SharedPreferences sharedPreferences = d.f1660a;
                this.f1654c = sharedPreferences.contains(this.f1652a);
                this.d = sharedPreferences.getBoolean(this.f1652a, true);
                this.f1653b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1654c = true;
        this.f1653b = true;
        d.f1660a.edit().putBoolean(this.f1652a, z10).apply();
    }
}
