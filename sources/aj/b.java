package aj;

import android.content.SharedPreferences;
public final class b {
    public final String f1644a;
    public final Enum f1645b;
    public volatile boolean f1646c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f1644a = str;
        this.f1645b = r22;
    }

    public final Enum a() {
        if (!this.f1646c) {
            synchronized (this) {
                try {
                    if (!this.f1646c) {
                        SharedPreferences sharedPreferences = d.f1649a;
                        String str = this.f1644a;
                        Enum r22 = this.f1645b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f1646c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f1646c = true;
        d.f1649a.edit().putString(this.f1644a, r32.name()).apply();
    }
}
