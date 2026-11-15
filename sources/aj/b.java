package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1651a;
    public final Enum f1652b;
    public volatile boolean f1653c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1651a = str;
        this.f1652b = r22;
    }

    public final Enum a() {
        if (!this.f1653c) {
            synchronized (this) {
                try {
                    if (!this.f1653c) {
                        SharedPreferences sharedPreferences = d.f1656a;
                        String str = this.f1651a;
                        Enum r22 = this.f1652b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1653c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1653c = true;
        d.f1656a.edit().putString(this.f1651a, r32.name()).apply();
    }
}
