package c8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z {
    public static SharedPreferences f4805a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f4805a == null) {
                    f4805a = (SharedPreferences) ac.a(new a2.b(context, 4));
                }
                sharedPreferences = f4805a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
