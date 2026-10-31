package mi;

import android.content.SharedPreferences;
public final class b {
    public final String f13378a;
    public final Enum f13379b;
    public volatile boolean f13380c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f13378a = str;
        this.f13379b = r22;
    }

    public final Enum a() {
        if (!this.f13380c) {
            synchronized (this) {
                try {
                    if (!this.f13380c) {
                        SharedPreferences sharedPreferences = d.f13383a;
                        String str = this.f13378a;
                        Enum r22 = this.f13379b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f13380c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f13380c = true;
        d.f13383a.edit().putString(this.f13378a, r32.name()).apply();
    }
}
