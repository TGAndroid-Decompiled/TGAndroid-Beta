package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z {
    public static SharedPreferences f5981a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f5981a == null) {
                    f5981a = (SharedPreferences) zb.a(new a2.b(context, 4));
                }
                sharedPreferences = f5981a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
