package defpackage;

import android.content.SharedPreferences;
public final class z44 {
    public final String a;
    public final Enum b;
    public volatile boolean c;
    public volatile Enum d;

    public z44(String str, Enum r2) {
        this.a = str;
        this.b = r2;
    }

    public final Enum a() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    SharedPreferences sharedPreferences = jaa.a;
                    String str = this.a;
                    Enum r2 = this.b;
                    String string = sharedPreferences.getString(str, r2.name());
                    if (string != null) {
                        try {
                            r2 = Enum.valueOf(r2.getDeclaringClass(), string);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    this.d = r2;
                    this.c = true;
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r3) {
        this.d = r3;
        this.c = true;
        jaa.a.edit().putString(this.a, r3.name()).apply();
    }
}
