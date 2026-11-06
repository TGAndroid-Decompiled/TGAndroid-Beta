package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z {
    public static SharedPreferences f5983a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f5983a == null) {
                    f5983a = (SharedPreferences) zb.a(new a2.b(context, 4));
                }
                sharedPreferences = f5983a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
