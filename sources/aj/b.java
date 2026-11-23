package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1662a;
    public final Enum f1663b;
    public volatile boolean f1664c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1662a = str;
        this.f1663b = r22;
    }

    public final Enum a() {
        if (!this.f1664c) {
            synchronized (this) {
                try {
                    if (!this.f1664c) {
                        SharedPreferences sharedPreferences = d.f1667a;
                        String str = this.f1662a;
                        Enum r22 = this.f1663b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1664c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1664c = true;
        d.f1667a.edit().putString(this.f1662a, r32.name()).apply();
    }
}
