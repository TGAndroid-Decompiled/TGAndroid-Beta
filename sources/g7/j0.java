package g7;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class j0 {
    public static SharedPreferences f7251a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f7251a == null) {
                    f7251a = (SharedPreferences) r8.a(new d7.p(context, 9));
                }
                sharedPreferences = f7251a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
