package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class b0 {
    public static SharedPreferences f4520a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f4520a == null) {
                    f4520a = (SharedPreferences) dc.a(new a2.b(context, 4));
                }
                sharedPreferences = f4520a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
