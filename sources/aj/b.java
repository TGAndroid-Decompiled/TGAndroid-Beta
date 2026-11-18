package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1642a;
    public final Enum f1643b;
    public volatile boolean f1644c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1642a = str;
        this.f1643b = r22;
    }

    public final Enum a() {
        if (!this.f1644c) {
            synchronized (this) {
                try {
                    if (!this.f1644c) {
                        SharedPreferences sharedPreferences = d.f1647a;
                        String str = this.f1642a;
                        Enum r22 = this.f1643b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1644c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1644c = true;
        d.f1647a.edit().putString(this.f1642a, r32.name()).apply();
    }
}
