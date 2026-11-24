package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
public abstract class r1f {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            sharedPreferences = a;
            if (sharedPreferences == null) {
                sharedPreferences = (SharedPreferences) c1f.a(new ke7(context, (byte) 4));
                a = sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
