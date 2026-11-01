package mi;

import android.content.SharedPreferences;
public final class a {
    public final String f13376a;
    public volatile boolean f13377b;
    public volatile boolean f13378c;
    public volatile boolean d;

    public a(String str) {
        this.f13376a = str;
    }

    public final void a() {
        if (this.f13377b) {
            return;
        }
        synchronized (this) {
            if (!this.f13377b) {
                SharedPreferences sharedPreferences = d.f13384a;
                this.f13378c = sharedPreferences.contains(this.f13376a);
                this.d = sharedPreferences.getBoolean(this.f13376a, true);
                this.f13377b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f13378c = true;
        this.f13377b = true;
        d.f13384a.edit().putBoolean(this.f13376a, z10).apply();
    }
}
