package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1610a;
    public volatile boolean f1611b;
    public volatile boolean f1612c;
    public volatile boolean d;

    public a(String str) {
        this.f1610a = str;
    }

    public final void a() {
        if (this.f1611b) {
            return;
        }
        synchronized (this) {
            if (!this.f1611b) {
                SharedPreferences sharedPreferences = d.f1618a;
                this.f1612c = sharedPreferences.contains(this.f1610a);
                this.d = sharedPreferences.getBoolean(this.f1610a, true);
                this.f1611b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1612c = true;
        this.f1611b = true;
        d.f1618a.edit().putBoolean(this.f1610a, z10).apply();
    }
}
