package j7;

import android.util.Log;
public abstract class e0 {
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
