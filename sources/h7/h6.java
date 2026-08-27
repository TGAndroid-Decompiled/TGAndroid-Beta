package h7;

import android.content.Context;
import android.content.SharedPreferences;

public abstract class h6 {

    public static SharedPreferences f8413a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f8413a == null) {
                    f8413a = (SharedPreferences) t8.a(new e7.p(context, 9));
                }
                sharedPreferences = f8413a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
