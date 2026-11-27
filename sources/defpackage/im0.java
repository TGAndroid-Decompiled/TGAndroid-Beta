package defpackage;

import android.content.SharedPreferences;
public final class im0 {
    public final String a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;

    public im0(String str) {
        this.a = str;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                SharedPreferences sharedPreferences = aca.a;
                this.c = sharedPreferences.contains(this.a);
                this.d = sharedPreferences.getBoolean(this.a, true);
                this.b = true;
            }
        }
    }
}
