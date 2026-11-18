package aj;

import android.content.SharedPreferences;
public final class a {
    public final String f1639a;
    public volatile boolean f1640b;
    public volatile boolean f1641c;
    public volatile boolean d;

    public a(String str) {
        this.f1639a = str;
    }

    public final void a() {
        if (this.f1640b) {
            return;
        }
        synchronized (this) {
            if (!this.f1640b) {
                SharedPreferences sharedPreferences = d.f1647a;
                this.f1641c = sharedPreferences.contains(this.f1639a);
                this.d = sharedPreferences.getBoolean(this.f1639a, true);
                this.f1640b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f1641c = true;
        this.f1640b = true;
        d.f1647a.edit().putBoolean(this.f1639a, z10).apply();
    }
}
