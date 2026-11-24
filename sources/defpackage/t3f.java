package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class t3f {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            sharedPreferences = a;
            if (sharedPreferences == null) {
                sharedPreferences = (SharedPreferences) e3f.a(new mg7(context, (byte) 4));
                a = sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
