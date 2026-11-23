package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1613a;
    public final Enum f1614b;
    public volatile boolean f1615c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1613a = str;
        this.f1614b = r22;
    }

    public final Enum a() {
        if (!this.f1615c) {
            synchronized (this) {
                try {
                    if (!this.f1615c) {
                        SharedPreferences sharedPreferences = d.f1618a;
                        String str = this.f1613a;
                        Enum r22 = this.f1614b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1615c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1615c = true;
        d.f1618a.edit().putString(this.f1613a, r32.name()).apply();
    }
}
