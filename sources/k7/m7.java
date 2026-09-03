package k7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class m7 {
    public static SharedPreferences f9918a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f9918a == null) {
                    f9918a = (SharedPreferences) j7.h5.a(new h2.f(context, 9));
                }
                sharedPreferences = f9918a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
