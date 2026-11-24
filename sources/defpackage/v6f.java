package defpackage;

import android.util.Log;
public abstract class v6f {
    public static void a(String str) {
        boolean isLoggable;
        if (Log.isLoggable("FirebaseAppIndex", 3)) {
            isLoggable = true;
        } else {
            isLoggable = Log.isLoggable("FirebaseAppIndex", 3);
        }
        if (isLoggable) {
            Log.d("FirebaseAppIndex", str);
        }
    }
}
