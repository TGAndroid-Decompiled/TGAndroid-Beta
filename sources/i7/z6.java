package i7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class z6 {
    public static SharedPreferences f8557a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f8557a == null) {
                    f8557a = (SharedPreferences) f7.t.b(new f7.p(context, 9));
                }
                sharedPreferences = f8557a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }
}
