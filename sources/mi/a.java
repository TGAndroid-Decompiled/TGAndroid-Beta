package mi;

import android.content.SharedPreferences;
public final class a {
    public final String f13375a;
    public volatile boolean f13376b;
    public volatile boolean f13377c;
    public volatile boolean d;

    public a(String str) {
        this.f13375a = str;
    }

    public final void a() {
        if (this.f13376b) {
            return;
        }
        synchronized (this) {
            if (!this.f13376b) {
                SharedPreferences sharedPreferences = d.f13383a;
                this.f13377c = sharedPreferences.contains(this.f13375a);
                this.d = sharedPreferences.getBoolean(this.f13375a, true);
                this.f13376b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f13377c = true;
        this.f13376b = true;
        d.f13383a.edit().putBoolean(this.f13375a, z10).apply();
    }
}
