package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class b0 {
    public static SharedPreferences f4517a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f4517a == null) {
                    f4517a = (SharedPreferences) dc.a(new a2.b(context, 4));
                }
                sharedPreferences = f4517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
