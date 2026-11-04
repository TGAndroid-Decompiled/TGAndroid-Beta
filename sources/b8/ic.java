package b8;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class ic {
    public static SharedPreferences f2678a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f2678a == null) {
                    f2678a = (SharedPreferences) lb.a.a(new dg(context, 2));
                }
                sharedPreferences = f2678a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
