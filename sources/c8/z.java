package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z {
    public static SharedPreferences f5986a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f5986a == null) {
                    f5986a = (SharedPreferences) zb.a(new a2.b(context, 4));
                }
                sharedPreferences = f5986a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
