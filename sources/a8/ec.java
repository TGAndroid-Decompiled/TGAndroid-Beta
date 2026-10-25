package a8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class ec {
    public static SharedPreferences f436a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f436a == null) {
                    f436a = (SharedPreferences) jf.a(new gg(context, 2));
                }
                sharedPreferences = f436a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
