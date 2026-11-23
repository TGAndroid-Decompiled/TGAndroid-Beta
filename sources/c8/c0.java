package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class c0 {
    public static SharedPreferences f4499a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f4499a == null) {
                    f4499a = (SharedPreferences) ec.a(new a2.b(context, 4));
                }
                sharedPreferences = f4499a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
