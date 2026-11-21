package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1655a;
    public final Enum f1656b;
    public volatile boolean f1657c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1655a = str;
        this.f1656b = r22;
    }

    public final Enum a() {
        if (!this.f1657c) {
            synchronized (this) {
                try {
                    if (!this.f1657c) {
                        SharedPreferences sharedPreferences = d.f1660a;
                        String str = this.f1655a;
                        Enum r22 = this.f1656b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1657c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1657c = true;
        d.f1660a.edit().putString(this.f1655a, r32.name()).apply();
    }
}
