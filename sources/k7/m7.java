package k7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class m7 {
    public static SharedPreferences f9938a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f9938a == null) {
                    f9938a = (SharedPreferences) j7.h5.a(new h2.f(context, 9));
                }
                sharedPreferences = f9938a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
