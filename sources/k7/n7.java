package k7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class n7 {
    public static SharedPreferences f10677a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f10677a == null) {
                    f10677a = (SharedPreferences) j7.i5.a(new h2.f(context, 9));
                }
                sharedPreferences = f10677a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
