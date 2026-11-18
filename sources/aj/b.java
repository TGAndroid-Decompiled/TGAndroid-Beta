package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1643a;
    public final Enum f1644b;
    public volatile boolean f1645c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1643a = str;
        this.f1644b = r22;
    }

    public final Enum a() {
        if (!this.f1645c) {
            synchronized (this) {
                try {
                    if (!this.f1645c) {
                        SharedPreferences sharedPreferences = d.f1648a;
                        String str = this.f1643a;
                        Enum r22 = this.f1644b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1645c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1645c = true;
        d.f1648a.edit().putString(this.f1643a, r32.name()).apply();
    }
}
