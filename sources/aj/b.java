package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1614a;
    public final Enum f1615b;
    public volatile boolean f1616c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1614a = str;
        this.f1615b = r22;
    }

    public final Enum a() {
        if (!this.f1616c) {
            synchronized (this) {
                try {
                    if (!this.f1616c) {
                        SharedPreferences sharedPreferences = d.f1619a;
                        String str = this.f1614a;
                        Enum r22 = this.f1615b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1616c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1616c = true;
        d.f1619a.edit().putString(this.f1614a, r32.name()).apply();
    }
}
