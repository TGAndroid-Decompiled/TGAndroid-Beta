package mi;

import android.content.SharedPreferences;
public final class b {
    public final String f13379a;
    public final Enum f13380b;
    public volatile boolean f13381c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f13379a = str;
        this.f13380b = r22;
    }

    public final Enum a() {
        if (!this.f13381c) {
            synchronized (this) {
                try {
                    if (!this.f13381c) {
                        SharedPreferences sharedPreferences = d.f13384a;
                        String str = this.f13379a;
                        Enum r22 = this.f13380b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f13381c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f13381c = true;
        d.f13384a.edit().putString(this.f13379a, r32.name()).apply();
    }
}
